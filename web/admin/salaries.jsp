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
    <title>Salaries</title>
</head>
<body>
<div class="container">
    <nav class="navbar fixed-top">
        <a href="admin" class="btn btn-outline-success btn-sm">Back</a>
    </nav>
    <ul class="list-group list-group-flush mt-4">
        <%--@elvariable id="realtors" type="java.util.ArrayList"--%>
        <c:forEach var="item" items="${realtors}">
            <li class="list-group-item">
                <h3>${item.surname} ${item.name} ${item.patronymic}</h3>
                <form method="post" action='<c:url value="/salaries"/>'>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">$</span>
                        </div>
                        <input name="salary" class="form-control" value="${item.salary}" aria-label="salary">
                        <div class="input-group-append">
                            <button class="btn btn-outline-success" type="submit">Update</button>
                        </div>
                    </div>
                    <input name="id" type="hidden" value="${item.id}">
                </form>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
