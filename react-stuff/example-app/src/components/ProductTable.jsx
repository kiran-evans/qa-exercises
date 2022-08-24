import { useState } from 'react';
import Product from './Product';
import BasketItem from './BasketItem';
import productData from '../data/productData.json';

const ProductTable = () => {
    const [search, setSearch] = useState('');
    const [basket, setBasket] = useState([]);

    const addToBasket = (item) => {
        setBasket(b => [item, ...b]);
    
        console.log(item);
        console.log(basket);
    };

    const removeFromBasket = (id) => {
        let newBasket = basket;
        newBasket.splice(id, 1);
        setBasket(() => [newBasket]);
        
        console.log(basket);
    };

    return (
        <>
            <h1>Products</h1>
            <input type="text" id="searchInput" placeholder="Filter" value={search} onChange={(e) => setSearch(e.target.value)} />
            <br />
            {productData.filter(product => product.name.toLowerCase().includes(search.toLowerCase())).map(product => (
                <Product key={product.id} name={product.name} cost={product.cost} addToBasket={addToBasket} />
            ))}
            <br />
            <h2>Your basket</h2>
            {basket.map((basketItem, i) => (
                <BasketItem key={basketItem.name + i} id={i} name={basketItem.name} cost={basketItem.cost} removeFromBasket={removeFromBasket} />
            ))}
        </>
    );

};

export default ProductTable;