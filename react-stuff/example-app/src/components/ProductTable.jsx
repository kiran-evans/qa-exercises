import { useState } from 'react';
import Product from './Product';

const ProductTable = () => {

    const defaultProductList = [
        { id: 0, name: 'Chocolate', cost: 2 },
        { id: 1, name: 'Cake', cost: 3 },
        { id: 2, name: 'Biscuits', cost: 9 },
        { id: 3, name: 'Sweets', cost: 7 },
        { id: 4, name: 'Cereal', cost: 21 },
        { id: 5, name: 'Milk', cost: 14 },
        { id: 6, name: 'Juice', cost: 6 },
    ];

    const [search, setSearch] = useState('');

    return (
        <>
            <input type="text" id="searchInput" placeholder="Filter" value={search} onChange={(e) => setSearch(e.target.value)} />
            <br />
            {defaultProductList.filter(product => product.name.includes(search)).map(product => (
                <Product key={product.id} name={product.name} cost={product.cost} />
            ))}
        </>
    );

};

export default ProductTable;