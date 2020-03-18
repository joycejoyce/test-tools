Object.entries(require("../src/tool.js")).forEach(([name, imported]) => global[name] = imported);
Object.entries(require("../src/css-setter.js")).forEach(([name, imported]) => global[name] = imported);

const chai = require("chai");
const expect = chai.expect;
const assert = chai.assert;

beforeEach(loadHTML);

describe(`setCSSForDOM(dom, cssName, cssValue)`, function() {
    it(`set cssName to cssValue for dom"`, function() {
        let dom = document.createElement("div");
        setCSSForDOM(dom, CSS_NAME_ROW_GAP, CSS_VALUE_10PX);
        checkCSSForDOM(dom, CSS_NAME_ROW_GAP, CSS_VALUE_10PX);
    })
});

function checkCSSForDOM(dom, cssName, cssValue) {
    expect($(dom).css(cssName)).to.eql(cssValue);
}

function loadHTML() {
    return JSDOM.fromFile("./index.html")
        .then((dom) => {
        global.window = dom.window;
        global.document = window.document;
    });
};