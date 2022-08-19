// Dep
const { describe, it, beforeEach } = require('mocha');
const chai = require('chai');
const chaitHttp = require('chai-http');
chai.use(chaitHttp);
const { expect } = chai;
const Biscuit = require('../db');
const server = require('../index');

// Main

describe('CRUD Tests', () => {
    let testBiscuit;

    // Clear biscuits and create testBiscuit before each test
    beforeEach(async () => {
        try {
            await Biscuit.deleteMany({});
            testBiscuit = await Biscuit.create({
                name: 'Digestive',
                count: 2,
                cost: 15.0,
            });
            testBiscuit = JSON.parse(JSON.stringify(testBiscuit)); // Stringify data from Mongo object then convert to JSON
        } catch (err) {
            console.log(err);
        }
    });

    // Create
    it('Should create biscuit', (done) => {
        const newBiscuit = {
            name: 'Oreo',
            count: 17,
            cost: 2,
        };

        chai.request(server).post('/biscuits/create').send(newBiscuit)
            .end((err, res) => {
                expect(err).to.be.null;
                expect(res.status).to.equal(201);
                expect(res.body).to.include(newBiscuit);
                expect(res.body._id).to.not.be.null;

                return done();
            });
    });

    // Read
    it('Should get biscuit', (done) => {
        chai.request(server).get(`/biscuits/get/${testBiscuit._id}`)
            .end((err, res) => {
                expect(err).to.be.null;
                expect(res.status).to.equal(200);
                expect(res.body).to.include(testBiscuit);

                return done();
            });
    });

    // Update 
    it('Should update biscuit', (done) => {
        chai.request(server).patch(`/biscuits/update/${testBiscuit._id}`).query({ name: 'Jim' })
            .end((err, res) => {
                expect(err).to.be.null;
                expect(res.status).to.equal(200);
                expect(res.body).to.include(testBiscuit);

                return done();
            });
    });

    // Delete
    it('Should delete biscuit', (done) => {
        chai.request(server).delete(`/biscuits/delete/${testBiscuit._id}`)
            .end((err, res) => {
                expect(err).to.be.null;
                expect(res.status).to.equal(204);
                
                return done();
            });
    });
});