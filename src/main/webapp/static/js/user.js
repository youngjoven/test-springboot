$(document).ready(function() {
    $.ajax({
        url: "/users",
        method: "GET",
        success: function(data) {
            var userTable = $("#userTable tbody");
            userTable.empty();
            $.each(data, function(index, user) {
                var row = "<tr><td>" + user.id + "</td><td>" + user.name + "</td><td>" + user.email + "</td></tr>";
                userTable.append(row);
            });
        },
        error: function(error) {
            console.log("Error:", error);
        }
    });
});
