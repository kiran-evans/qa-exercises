
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