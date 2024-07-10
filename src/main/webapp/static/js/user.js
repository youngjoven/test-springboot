$(document).ready(function() {
    $.ajax({
        url: "/users",
        method: "GET",
        success: function(data) {
            console.log("Data received:", data);  // 데이터 수신 디버깅
            var userTable = $("#userTable tbody");
            userTable.empty();
            $.each(data, function(index, user) {
                var row = "<tr><td>" + user.id + "</td><td>" + user.name + "</td><td>" + user.email + "</td></tr>";
                userTable.append(row);
            });
        },
        error: function(error) {
            console.log("Error:", error);  // 오류 디버깅
        }
    });
});
