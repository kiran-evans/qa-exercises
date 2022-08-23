import { useState } from 'react';

const Car = () => {
    const [brand, setBrand] = useState('Vauxhall');
    const [model, setModel] = useState('Corsa');
    const [colour, setColour] = useState('Grey');
    const [year, setYear] = useState(2013);

    return (
        <>
            <h1>Your Car</h1>
            <h2>Brand: {brand}</h2>
            <h2>Model: {model}</h2>
            <h2>Colour: {colour}</h2>
            <h2>Year: {year}</h2>

            <input type="text" placeholder="Brand" value={brand} onChange={(e) => setBrand(e.target.value)} />
            <br />
            <input type="text" placeholder="Model" value={model} onChange={(e) => setModel(e.target.value)} />
            <br />
            <input type="text" placeholder="Colour" value={colour} onChange={(e) => setColour(e.target.value)} />
            <br />
            <input type="text" placeholder="Year" value={year} onChange={(e) => setYear(e.target.value)} />
        </>
    );

};

export default Car;