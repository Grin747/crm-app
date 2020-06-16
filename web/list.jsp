<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <link href="styles.css" rel="stylesheet">
    <title>Realties list</title>
</head>
<body>
<div class="container text-left">
    <nav class="navbar fixed-top">
        <a href="cabinet" class="btn btn-outline-success btn-sm">Sign in</a>
    </nav>
    <div class="card-deck">
        <%--@elvariable id="cards" type="java.util.List"--%>
        <c:forEach items="${cards}" var="card">
            <div class="card m-3">
                <div class="card-body">
                    <h5 class="card-title">${card.title}</h5>
                    <p class="card-subtitle text-muted">${card.address}</p>
                    <p class="card-text">${card.price}</p>
                    <a href="details?id=${card.id}" class="btn btn-primary btn-sm">Details</a>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
