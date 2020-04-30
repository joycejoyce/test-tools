function modifyText() {
    document.getElementById("myText").innerHTML = "456";
}

//Use "export" will show error while testing: TypeError: window.modifyText is not a function
/*export {
    modifyText
};*/