const cowsay = require("cowsay");

module.exports.speak = (phrase) => cowsay.say({'text': phrase});