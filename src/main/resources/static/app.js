const base = 'http://localhost:8080';
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
    const header = $("<tr></tr>");
    
    header.append("<th>ID</th>");
    header.append("<th>Full Name</th>");
    if (position === "mayors") header.append("<th>City</th>");
    header.append("<th>State</th>");
    if (position === "congress") header.append("<th>Government Seat</th>");
    header.append("<th>Year Began</th>");
    header.append("<th>Year Ended</th>");
    header.append("<th>Ethnicity</th>");
    header.append("<th>Gender</th>");
    header.append("<th>Birth Year</th>");
    header.append("<th>Appointment Age</th>");
    if (position === "mayors" || position === "governors") {
        header.append("<th>Alive</th>");
        header.append("<th>Income</th>");
        header.append("<th>Religion</th>");
        header.append("<th>Previous Occupation</th>");
    }
    if (position === "congress") header.append("<th>Total Terms</th>");
    header.append("<th>Photo Url</th>");
    table.append(header);

    for (let member of members) {
        let row = $("<tr></tr>");
        row.append(`<td>${member.id}</td>`);
        row.append(`<td>${member.fullName}</td>`);
        if (position === "mayors") row.append(`<td>${member.city}</td>`);
        row.append(`<td>${member.state}</td>`);
        if (position === "congress") row.append(`<td>${member.governmentSeat}</td>`);
        row.append(`<td>${member.yearBegan}</td>`);
        row.append(`<td>${member.yearEnded}</td>`);
        row.append(`<td>${member.ethnicity}</td>`);
        row.append(`<td>${member.gender}</td>`);
        row.append(`<td>${member.birthYear}</td>`);
        row.append(`<td>${member.appointmentAge}</td>`);
        if (position === "mayors" || position === "governors") {
            row.append(`<td>${member.isAlive}</td>`);
            row.append(`<td>${member.income}</td>`);
            row.append(`<td>${member.religion}</td>`);
            row.append(`<td>${member.previousOccupation}</td>`);
        }
        if (position === "congress") row.append(`<td>${member.totalTerms}</td>`);
        row.append(`<td>${member.photoUrl}</td>`);
        table.append(row);
    }

};