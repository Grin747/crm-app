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
    <title>New deal</title>
</head>
<body class="text-left">
<nav class="navbar fixed-top">
    <a href="cabinet" class="btn btn-outline-success btn-sm">Back</a>
</nav>
<div class="container">
    <h1>New deal</h1>
    <form method="post" action='<c:url value="/add-deal" />'>
        <div class="row mb-3">
            <div class="col">
                <label for="realty">Realty</label>
                <select class="custom-select" id="realty" name="realty">
                    <%--@elvariable id="realties" type="java.util.List"--%>
                    <c:forEach var="item" items="${realties}">
                        <option value="${item.id}">${item.address} ${item.title} ${item.price}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="client">Client</label>
                <select class="custom-select" id="client" name="client">
                    <%--@elvariable id="clients" type="java.util.List"--%>
                    <c:forEach var="item" items="${clients}">
                        <option value="${item.client_id}">${item.name} ${item.surname} ${item.phone}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="date">Deal date</label>
                <input class="form-control" id="date" name="date">
            </div>
            <div class="col">
                <label for="profit">Commission</label>
                <input class="form-control" id="profit" name="profit">
            </div>
        </div>
        <button type="submit" class="btn btn-success">Create</button>
    </form>
</div>
</body>
</html>
