
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