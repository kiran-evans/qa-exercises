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
const mongoose = require('mongoose');
const { Schema } = mongoose;

mongoose.connect('mongodb://localhost:27017/local', { useNewUrlParser: true }, (err) => {
    if (err) return console.error(err);
    return console.log('Connection successful');
});


// Main

const biscuitSchema = new Schema({
    name: {
        type: String,
        required: true,
        min: 2,
        max: 255
    },
    count: {
        type: Number,
        required: true,
        min: 1
    },
    cost: {
        type: Number,
        required: true,
        min: 0
    }
});

const Biscuit = mongoose.model('biscuit', biscuitSchema);

module.exports = Biscuit;