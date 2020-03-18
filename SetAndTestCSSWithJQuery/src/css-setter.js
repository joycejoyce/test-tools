Object.entries(require("./tool.js")).forEach(([name, imported]) => global[name] = imported);

function setCSSForDOM(dom, cssName, cssValue) {
    $(dom).css(
        {
            [cssName]: cssValue
        }
    );
}

export {
    setCSSForDOM
};