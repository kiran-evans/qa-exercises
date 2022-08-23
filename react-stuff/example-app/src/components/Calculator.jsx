import { useState } from 'react';

const Calculator = () => {

    const [calculatorInput, setCalculatorInput] = useState(0);

    const calculate = (num) => {
        const newHist = document.createElement('div');
        
        const deleteButton = document.createElement('button');
        deleteButton.innerText = 'X';
        deleteButton.addEventListener('click', () => newHist.remove());

        document.querySelector('#history').prepend(newHist);

        if (num === 'Reset') {
            setCalculatorInput(0);
            newHist.innerText = 'You reset the counter ';
        } else {
            const newValue = calculatorInput + parseInt(num);
            newHist.innerText = `${calculatorInput} ${(num < 0) ? '-' : '+'} ${Math.abs(parseInt(num))} = ${newValue} `;
            setCalculatorInput(newValue);
        }

        newHist.appendChild(deleteButton);
    };

    return (

        <>
            <input type="number" id="calculatorInput" value={calculatorInput} onChange={(e) => setCalculatorInput(e.target.value)} />
            <br />
            <button type="button" onClick={(e) => calculate(e.target.innerText)}>-5</button>
            <button type="button" onClick={(e) => calculate(e.target.innerText)}>-1</button>
            <button type="button" onClick={(e) => calculate(e.target.innerText)}>Reset</button>
            <button type="button" onClick={(e) => calculate(e.target.innerText)}>+1</button>
            <button type="button" onClick={(e) => calculate(e.target.innerText)}>+5</button>

            <h2>History</h2>
            <div id="history" />
        </>

    );

};

export default Calculator;