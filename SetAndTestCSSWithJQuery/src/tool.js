const { JSDOM } = require("jsdom");
const jsdom = new JSDOM("<!doctype html><html><body></body></html>");
const { window } = jsdom;
const $ = global.jQuery = require("jquery")(window);

const CSS_NAME_ROW_GAP = "row-gap";
const CSS_VALUE_10PX = "10px";

export {
    CSS_NAME_ROW_GAP,
    CSS_VALUE_10PX,
    JSDOM,
    jsdom,
    window,
    $
};