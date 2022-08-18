/* eslint-disable linebreak-style */
/* eslint-disable import/newline-after-import */
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
const biscuitRoutes = require('./routes/biscuits');
app.use('/biscuits', biscuitRoutes);

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
    console.log(`Started Express server on port ${server.address().port}`);
});