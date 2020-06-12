<%--@elvariable id="realtor" type="entities.Realtor"--%>
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
    <title>Cabinet</title>
</head>
<body class="text-left">
<nav class="navbar fixed-top">
    <form method="post" action='<c:url value="/cabinet"/>'>
        <button class="btn btn-outline-secondary btn-sm" type="submit">Sign out</button>
    </form>
    <a href="list" class="btn btn-outline-primary btn-sm">List</a>
</nav>
<div class="container">
    <h2>${realtor.surname} ${realtor.name} ${realtor.patronymic}</h2>
    <ul class="list-group list-group-flush mt-4">
        <%--@elvariable id="deals" type="java.util.HashMap"--%>
        <c:forEach var="item" items="${deals}">
            <li class="list-group-item">
                <p>${item.value}</p>
                <a href="details?id=${item.key}" class="btn btn-outline-secondary btn-sm">Realty</a>
                <form class="form-inline" method="post" action='<c:url value="deal-delete"/>'>
                    <input name="realty_id" type="hidden" value="${item.key}">
                    <button class="btn btn-outline-danger btn-sm" type="submit">Delete</button>
                </form>
            </li>
        </c:forEach>
        <li class="list-group-item">
            <a href="add-deal" class="btn btn-outline-primary">New deal</a>
            <a href="add-client" class="btn btn-outline-primary">New client</a>
        </li>
    </ul>
    <ul class="list-group list-group-flush mt-4">
        <%--@elvariable id="realties" type="java.util.ArrayList"--%>
        <c:forEach var="item" items="${realties}">
            <li class="list-group-item">

            </li>
        </c:forEach>
        <li class="list-group-item">
            <a href="add-realty" class="btn btn-outline-primary">New realty</a>
        </li>
    </ul>
</div>
</body>
</html>
