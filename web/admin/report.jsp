<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="../styles.css" rel="stylesheet">
    <title>Report</title>
</head>
<body>
<div class="container">
    <nav class="navbar fixed-top">
        <a href="admin" class="btn btn-outline-success btn-sm">Back</a>
    </nav>
    <table class="table table-borderless table-hover">
        <thead class="thead-light">
        <tr>
            <th>Complex</th>
            <th>Sold</th>
            <th>Active</th>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="reps" type="java.util.List"--%>
        <c:forEach items="${reps}" var="item">
            <tr>
                <th scope="row">${item.reg}</th>
                <td>${item.sold}</td>
                <td>${item.active}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
