$('#loadUsers').click(() => {
    reloadUsers()
});

function reloadUsers() {
    $("#authors-container").empty();

    fetch("http://localhost:8080/users-info").
    then(response => response.json()).
    then(json => json.forEach(user => {
        let tableRow = '<tr>' +
            '<td>' + user.username + '</td>' +
            '<td>' + user.firstName + '</td>' +
            '<td>' + user.lastName + '</td>' +
            '<td>' + user.email + '</td>' +
            '<td>' + user.phoneNumber + '</td>' +
            '<td>' + user.money + '</td>' +
            '</tr>'
        $("#authors-container").append(tableRow)
    }))
}