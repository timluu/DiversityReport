const url = 'http://localhost:8080/';


const loadMayors = () => {
    reset();
    $("#dataDisplay").append("<div>mayors<div>");
};

const loadGovernors = () => {
    reset();
    $("#dataDisplay").append("<div>governors<div>");
};

const loadCongress = () => {
    reset();
    $("#dataDisplay").append("<div>congress people<div>");
};

const reset = () => {
    $("#dataDisplay").empty();
};