
// Dep

const router = require('express').Router();
const Biscuit = require('../db');

// Main

// CRUD

router.get('/getAll', async (req, res, next) => {

    try {
        const response = await Biscuit.find();
    
        if (response.length === 0) {
            return res.status(200).json('Got nothing because biscuits is empty');
        }

        return res.status(200).json(response);
    } catch (err) {
        return next(err);
    }
});

router.get('/get/:id', async (req, res, next) => {
    
    if (!req.params) {
        return next( { status: 400, message: "Couldn't get biscuit becase id not specified" } );
    }

    try {
        const response = await Biscuit.findById(req.params.id);

        if (!response) {
            return next( { status: 400, message: 'No biscuit found with that id' } );
        }

        return res.status(200).json(response);
    } catch (err) {
        return next(err);
    }
});

router.post('/create', async (req, res, next) => {

    if (!req.body || Object.keys(req.body).length === 0) {
        return next( { status: 400, message: "Couldn't create biscuit because req body is empty" });
    }

    try {
        const result = await Biscuit.create(req.body);
        return res.status(201).json(result);
    } catch (err) {
        return next(err);
    }
});

router.put('/update/:id', async (req, res, next) => {

    try {
        const result = await Biscuit.findByIdAndUpdate(req.params.id, req.query);
        return res.status(200).json(result);
    } catch (err) {
        return next(err);
    }
});

router.delete('/delete/:id', async (req, res, next) => {

    try {
        const result = await Biscuit.findByIdAndDelete(req.params.id);
        return res.status(204).json(result);
    } catch (err) {
        return next(err);
    }
});

module.exports = router;