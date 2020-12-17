const base = 'http://govt-diversity.herokuapp.com';
const method = "GET";

const load = (position) => {
    
    const url = base + `/api/${position}`;
    const success = (response) => {
        displayTable(position, response);
    };

    $.ajax({ url, method, success });

};

const loadDiversity = (position) => {

    const url = base + `/api/${position}Diversity`;
    const success = (response) => {
        displayTableDiversity(position, response);
    };

    $.ajax({ url, method, success });

};

const displayTableDiversity = (position, members) => {
    const table = $(`#${position}DiversityTable`);
    table.append(`<caption>${position.toUpperCase()} DIVERSITY</caption>`);
    const header = $('<tr class="header"></tr>');

    header.append("<th>ID</th>");
    header.append("<th>Category</th>");
    header.append("<th>1971</th>");
    header.append("<th>1973</th>");
    header.append("<th>1975</th>");
    header.append("<th>1977</th>");
    header.append("<th>1979</th>");
    header.append("<th>1981</th>");
    header.append("<th>1983</th>");
    header.append("<th>1985</th>");
    header.append("<th>1987</th>");
    header.append("<th>1989</th>");
    header.append("<th>1991</th>");
    header.append("<th>1993</th>");
    header.append("<th>1995</th>");
    header.append("<th>1997</th>");
    header.append("<th>1999</th>");
    header.append("<th>2001</th>");
    header.append("<th>2003</th>");
    header.append("<th>2005</th>");
    header.append("<th>2007</th>");
    header.append("<th>2009</th>");
    header.append("<th>2011</th>");
    header.append("<th>2013</th>");
    header.append("<th>2015</th>");
    header.append("<th>2017</th>");
    header.append("<th>Type</th>");
    table.append(header);

    for(let member of members){
        let row = $('<tr class="row"></tr>');
        row.append(`<td>${member.id}</td>`);
        row.append(`<td>${member.category}</td>`);
        row.append(`<td>${member.year1971}</td>`);
        row.append(`<td>${member.year1973}</td>`);
        row.append(`<td>${member.year1975}</td>`);
        row.append(`<td>${member.year1977}</td>`);
        row.append(`<td>${member.year1979}</td>`);
        row.append(`<td>${member.year1981}</td>`);
        row.append(`<td>${member.year1983}</td>`);
        row.append(`<td>${member.year1985}</td>`);
        row.append(`<td>${member.year1987}</td>`);
        row.append(`<td>${member.year1989}</td>`);
        row.append(`<td>${member.year1991}</td>`);
        row.append(`<td>${member.year1993}</td>`);
        row.append(`<td>${member.year1995}</td>`);
        row.append(`<td>${member.year1997}</td>`);
        row.append(`<td>${member.year1999}</td>`);
        row.append(`<td>${member.year2001}</td>`);
        row.append(`<td>${member.year2003}</td>`);
        row.append(`<td>${member.year2005}</td>`);
        row.append(`<td>${member.year2007}</td>`);
        row.append(`<td>${member.year2009}</td>`);
        row.append(`<td>${member.year2011}</td>`);
        row.append(`<td>${member.year2013}</td>`);
        row.append(`<td>${member.year2015}</td>`);
        row.append(`<td>${member.year2017}</td>`);
        row.append(`<td>${member.type}</td>`);
        table.append(row);
    }
};

const displayTable = (position, members) => {
    
    const table = $(`#${position}Table`);
    table.append(`<caption>${position.toUpperCase()}</caption>`);
    const header = $('<tr class="header"></tr>');
    
    header.append("<th>ID</th>");
    header.append("<th>Full Name</th>");
    if (position === "mayors") header.append("<th>City</th>");
    header.append("<th>State</th>");
    header.append("<th>Year Began</th>");
    header.append("<th>Year Ended</th>");
    header.append("<th>Ethnicity</th>");
    header.append("<th>Gender</th>");
    header.append("<th>Birth Year</th>");
    header.append("<th>Appointment Age</th>");
    header.append("<th>Religion</th>");
    if (position === "mayors" || position === "governors") {
        header.append("<th>Alive</th>");
        header.append("<th>Income</th>");
        header.append("<th>Previous Occupation</th>");
    }
    if (position === "senators" || position === "representatives") header.append("<th>Total Terms</th>");
    header.append("<th>Photo Url</th>");
    table.append(header);

    for (let member of members) {
        let row = $('<tr class="row"></tr>');
        row.append(`<td>${member.id}</td>`);
        row.append(`<td>${member.fullName}</td>`);
        if (position === "mayors") row.append(`<td>${member.city}</td>`);
        row.append(`<td>${member.state}</td>`);
        row.append(`<td>${member.yearBegan}</td>`);
        row.append(`<td>${member.yearEnded}</td>`);
        row.append(`<td>${member.ethnicity}</td>`);
        row.append(`<td>${member.gender}</td>`);
        row.append(`<td>${member.birthYear}</td>`);
        row.append(`<td>${member.appointmentAge}</td>`);
        row.append(`<td>${member.religion}</td>`);
        if (position === "mayors" || position === "governors") {
            row.append(`<td>${member.isAlive}</td>`);
            row.append(`<td>${member.income}</td>`);
            row.append(`<td>${member.previousOccupation}</td>`);
        }
        if (position === "senators" || position === "representatives") row.append(`<td>${member.totalTerms}</td>`);
        row.append(`<td>${member.photoUrl}</td>`);
        table.append(row);
    }

};