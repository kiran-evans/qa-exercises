/* eslint-disable linebreak-style */
/* eslint-disable no-console */
/* eslint-disable comma-dangle */
/* eslint-disable space-in-parens */
/* eslint-disable eol-last */
/* eslint-disable no-multiple-empty-lines */
/* eslint-disable no-unused-vars */
/* eslint-disable radix */
/* eslint-disable padded-blocks */
/* eslint-disable no-trailing-spaces */
/* eslint-disable quotes */
/* eslint-disable prefer-const */
/* eslint-disable indent */
/* eslint-disable import/no-extraneous-dependencies */
// Dep
const express = require('express');

const app = express();

const parser = require('body-parser');

app.use(parser.json());

// Main

let biscuits = [ 
    {
        name: "Chocolate",
        count: 3,
        cost: 20.0
    }
];

app.get("/getAll", (req, res) => {
    
    if (biscuits.length === 0) {
        return res.status(200).json("Got nothing because biscuits is empty");
    }

    return res.status(200).send(biscuits);
});

app.get("/get/:id", (req, res, next) => {
    
    if (!req.params) {
        return next( { status: 400, message: "Couldn't get biscuit becase id not specified" } );
    }

    return res.status(200).send(biscuits.at(req.params));
});

app.post("/createBiscuit", (req, res, next) => {

    if (!req.body || Object.keys(req.body).length === 0) {
        return next( { status: 400, message: "Couldn't create biscuit because req body is empty" });
    }

    biscuits.push(req.body);
    return res.status(201).send(biscuits.at(biscuits.length - 1));
});

app.put("/update/:id", (req, res) => {
    const { name, count, cost } = req.query;
    const { id } = req.params;

    if (name) biscuits.at(id).name = name;
    if (count) biscuits.at(id).count = parseInt(count);
    if (cost) biscuits.at(id).cost = parseFloat(cost);

    return res.status(200).json(biscuits.at(id));
});

app.delete("/delete/:id", (req, res, next) => {
    if (biscuits.length === 0) {
        return next( { status: 400, message: "Nothing can be deleted because biscuits is empty" } );
    }

    biscuits.splice(req.params);
    return res.status(200).send(biscuits);
});

// Errors

app.get("/error", (req, res, next) => {
    next(Error("This is an error"));
});

app.use((err, req, res, next) => {
    console.log(err.stack);
    next(err);
});

app.use((err, req, res, next) => {
    res.status(500).send(err.message);
});


const server = app.listen(12499, () => {
    console.log(`Started server on port ${server.address().port}`);
});