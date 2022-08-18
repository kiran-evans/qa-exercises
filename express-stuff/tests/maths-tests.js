// Dep

const { describe, it } = require('mocha');
const { expect } = require('chai');

// Main

// Calculate the reverse factorial of bigNum
const factorial = (bigNum) => {
    let divider = 2;
    let result = bigNum;

    if (result % divider !== 0) {
        return `${bigNum} is not a factorial.`;
    }
    
    while (result % divider === 0) {
        result /= divider;
        divider++;
    }

    return divider - 1;

};

// Calculate the ordinal positions of all numbers up to and including maxNum
const calcPlaces = (maxNum) => {

    let places = [];

    for (let i = 1; i <= maxNum; i++) {
        const lastDigit = String(i).slice(-1);
        const lastTwo = String(i).slice(-2);
        
        if (lastDigit === '1' && lastTwo !== '11') {
            places.push(`${i}st`);
            continue;
        }

        if (lastDigit === '2' && lastTwo !== '12') {
            places.push(`${i}nd`);
            continue;
        }

        if (lastDigit === '3' && lastTwo !== '13') {
            places.push(`${i}rd`);
            continue;
        }

        places.push(`${i}th`);

    }

    // console.log(places);
    return places;
};

// Tests

describe('Factorial Tests', () => {
    
    it('Should equal 4', () => {
        expect(factorial(24)).to.equal(4);
    });

    it('Should return a warning', () => {
        expect(factorial(9)).to.equal('9 is not a factorial.');
    });

});

describe('Places Tests', () => {

    it('Should have a length of 100', () => {
        expect(calcPlaces(100).length).to.equal(100);
    });

});