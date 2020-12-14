const base = 'http://localhost:8080';
const method = "GET";


const loadMayors = () => {
    reset();
    const url = base + "/api/mayors";
    const success = (response) => {
        displayMayorTable(response);
    };

    $.ajax({ url, method, success });
    
};

const loadGovernors = () => {
    reset();
    const url = base + "/api/governors";
    const success = (response) => {
        displayGovernorTable(response);
    };

    $.ajax({ url, method, success });
};

const loadCongress = () => {
    reset();
    const url = base + "/api/congress";
    const success = (response) => {
        $("#dataDisplay").append("<tr><td>ITS THE CONGRESS PEOPLE</td></tr>");
    };

    $.ajax({ url, method, success });
};

const displayMayorTable = (mayors) => {
    let header = $("<tr></tr>");
    header.append("<th>ID</th>");
    header.append("<th>Full Name</th>");
    header.append("<th>City</th>");
    header.append("<th>State</th>");
    header.append("<th>Year Began</th>");
    header.append("<th>Year Ended</th>");
    header.append("<th>Ethnicity</th>");
    header.append("<th>Gender</th>");
    header.append("<th>Birth Year</th>");
    header.append("<th>Appointment Age</th>");
    header.append("<th>Alive</th>");
    header.append("<th>Income</th>");
    header.append("<th>Religion</th>");
    header.append("<th>Previous Occupation</th>");
    header.append("<th>Photo Url</th>");
    $("#dataDisplay").append(header);

    for (let mayor of mayors) {
        let row = $("<tr></tr>");
        row.append(`<td>${mayor.id}</td>`);
        row.append(`<td>${mayor.fullName}</td>`);
        row.append(`<td>${mayor.city}</td>`);
        row.append(`<td>${mayor.state}</td>`);
        row.append(`<td>${mayor.yearBegan}</td>`);
        row.append(`<td>${mayor.yearEnded}</td>`);
        row.append(`<td>${mayor.ethnicity}</td>`);
        row.append(`<td>${mayor.gender}</td>`);
        row.append(`<td>${mayor.birthYear}</td>`);
        row.append(`<td>${mayor.appointmentAge}</td>`);
        row.append(`<td>${mayor.isAlive}</td>`);
        row.append(`<td>${mayor.income}</td>`);
        row.append(`<td>${mayor.religion}</td>`);
        row.append(`<td>${mayor.previousOccupation}</td>`);
        row.append(`<td>${mayor.photoUrl}</td>`);
        $("#dataDisplay").append(row);
    }
};

const displayGovernorTable = (governors) => {
    let header = $("<tr></tr>");
    header.append("<th>ID</th>");
    header.append("<th>Full Name</th>");
    header.append("<th>State</th>");
    header.append("<th>Year Began</th>");
    header.append("<th>Year Ended</th>");
    header.append("<th>Ethnicity</th>");
    header.append("<th>Gender</th>");
    header.append("<th>Birth Year</th>");
    header.append("<th>Appointment Age</th>");
    header.append("<th>Alive</th>");
    header.append("<th>Income</th>");
    header.append("<th>Religion</th>");
    header.append("<th>Previous Occupation</th>");
    header.append("<th>Photo Url</th>");
    $("#dataDisplay").append(header);

    for (let governor of governors) {
        let row = $("<tr></tr>");
        row.append(`<td>${governor.id}</td>`);
        row.append(`<td>${governor.fullName}</td>`);
        row.append(`<td>${governor.state}</td>`);
        row.append(`<td>${governor.yearBegan}</td>`);
        row.append(`<td>${governor.yearEnded}</td>`);
        row.append(`<td>${governor.ethnicity}</td>`);
        row.append(`<td>${governor.gender}</td>`);
        row.append(`<td>${governor.birthYear}</td>`);
        row.append(`<td>${governor.appointmentAge}</td>`);
        row.append(`<td>${governor.isAlive}</td>`);
        row.append(`<td>${governor.income}</td>`);
        row.append(`<td>${governor.religion}</td>`);
        row.append(`<td>${governor.previousOccupation}</td>`);
        row.append(`<td>${governor.photoUrl}</td>`);
        $("#dataDisplay").append(row);
    }
};

const reset = () => {
    $("#dataDisplay").empty();
};