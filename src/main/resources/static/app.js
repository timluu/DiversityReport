const base = 'http://govt-diversity.herokuapp.com';
const method = "GET";

const load = (position) => {
    
    const url = base + `/api/${position}`;
    const success = (response) => {
        displayTable(position, response);
    };

    $.ajax({ url, method, success });

};

const displayTable = (position, members) => {
    
    const table = $(`#${position}Table`);
    table.append(`<caption>${position.toUpperCase()}</caption>`);
    const header = $('<div class="header"></div>');
    
    header.append("<div>ID</div>");
    header.append("<div>Full Name</div>");
    if (position === "mayors") header.append("<div>City</div>");
    header.append("<div>State</div>");
    header.append("<div>Year Began</div>");
    header.append("<div>Year Ended</div>");
    header.append("<div>Ethnicity</div>");
    header.append("<div>Gender</div>");
    header.append("<div>Birth Year</div>");
    header.append("<div>Appointment Age</div>");
    header.append("<div>Religion</div>");
    if (position === "mayors" || position === "governors") {
        header.append("<div>Alive</div>");
        header.append("<div>Income</div>");
        header.append("<div>Previous Occupation</div>");
    }
    if (position === "senators" || position === "representatives") header.append("<div>Total Terms</div>");
    header.append("<div>Photo Url</div>");
    table.append(header);

    for (let member of members) {
        let row = $('<div class="row"></div>');
        row.append(`<div>${member.id}</div>`);
        row.append(`<div>${member.fullName}</div>`);
        if (position === "mayors") row.append(`<div>${member.city}</div>`);
        row.append(`<div>${member.state}</div>`);
        row.append(`<div>${member.yearBegan}</div>`);
        row.append(`<div>${member.yearEnded}</div>`);
        row.append(`<div>${member.ethnicity}</div>`);
        row.append(`<div>${member.gender}</div>`);
        row.append(`<div>${member.birthYear}</div>`);
        row.append(`<div>${member.appointmentAge}</div>`);
        row.append(`<div>${member.religion}</div>`);
        if (position === "mayors" || position === "governors") {
            row.append(`<div>${member.isAlive}</div>`);
            row.append(`<div>${member.income}</div>`);
            row.append(`<div>${member.previousOccupation}</div>`);
        }
        if (position === "senators" || position === "representatives") row.append(`<div>${member.totalTerms}</div>`);
        row.append(`<div>${member.photoUrl}</div>`);
        table.append(row);
    }

};