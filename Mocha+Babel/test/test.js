import { printX, x } from '../src/a.js';

const chai = require('chai');
const expect = chai.expect;
const assert = chai.assert;

describe(`printX()`, function() {
    it(`should print ${x}`, function() {
        printX();
    })
})