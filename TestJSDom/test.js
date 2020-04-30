require("regenerator-runtime/runtime");

const expect = require("chai").expect;


describe(`test`, () => {
    let window, document, $;
    let jsdom;
    
    beforeEach(async () => {
        const { JSDOM } = require("jsdom");
        jsdom = await JSDOM.fromFile("./TestJSDom/index.html", {
            resources: "usable",
            runScripts: "dangerously"
        })
        .then((dom) => {
            window = dom.window;
            document = window.document;
            $ = require("jquery")(window);
        });
        await new Promise(resolve => window.addEventListener("load", resolve));
    });
    
    it(`Call function of script1`, () => {
        const elem = document.getElementById("myText");
        expect(elem.innerHTML).to.eql("123");
        window.modifyText();
        expect(elem.innerHTML).to.eql("456");
    });
    
    it(`jQuery works`, () => {
        const elem = document.getElementById("myText");
        expect($(elem).prop("innerHTML")).to.eql("123");
        window.modifyText();
        expect($(elem).prop("innerHTML")).to.eql("456");
    });
});