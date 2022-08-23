import { useState } from 'react';

const Products = (filter) => {
    const productList = ['Chocolate', 'Cake', 'Biscuits', 'Sweets', 'Cereal', 'Milk', 'Juice'];

    let outputTable;

    productList.forEach((i) => {
        if (i.includes(filter)) {
            outputTable.push(i);
        }
    });

    return (
        <div>{outputTable}</div>
    );
};

const ProductTable = () => {

    const [search, setSearch] = useState(0);

    return (
        <>
            <input type="text" id="searchInput" value={search} onChange={(e) => setSearch(e.target.value)} />
            <br />
            <Products filter={search} />
        </>
    );

};

export default ProductTable;