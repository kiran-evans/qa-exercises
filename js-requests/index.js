'use strict';

let id = 0;

document.querySelector("form#createForm").addEventListener("submit", function (e) {
    e.preventDefault();

    const createBody = {
        id: id,
        age: e.target.createAge.value,
        name: e.target.createName.value,
        habitat: e.target.createHabitat.value,
        gender: e.target.createGender.value
    };
    console.log(createBody);
    axios.post(`http://localhost:8080/duck/create`, createBody)
        .then(res => {
            console.log(res);
            id++;
        })
        .catch(err => console.error(err));
});

document.querySelector("form#getForm").addEventListener("submit", function (e) {
    e.preventDefault();

    axios.get(`http://localhost:8080/duck/readById/${e.target.getIdInput.value}`)
    .then(res => {
        console.log(res);
    })
    .catch(err => console.error(err));
});

document.querySelector("button#getAllButton").addEventListener("click", function (e) {
    e.preventDefault();

    axios.get(`http://localhost:8080/duck/readAll`)
    .then(res => {
        console.log(res);
    })
    .catch(err => console.error(err));
});

document.querySelector("form#deleteForm").addEventListener("submit", function (e) {
    e.preventDefault();

    axios.delete(`http://localhost:8080/duck/delete/${e.target.delIdInput.value}`)
    .then(res => {
        console.log(res);
    })
    .catch(err => console.error(err));
});