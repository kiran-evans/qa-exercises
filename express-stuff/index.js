const express = require("express");
const app = express();

app.get("/", (req, res) => {
    res.send("Hello my name is !").status(200);
});

app.get("/error", (req, res, next) => {
    next(Error("This is an error"));
});

app.use((err, req, res, next) => {
    console.log(err.stack);
    next(err);
});

app.use((err, req, res, next) => {
    res.status(500).send(err.message);
})


const server = app.listen(12499, () => {
    console.log(`Started server on port ${server.address().port}`);
});