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
<table class="table table-striped">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Цена</th>
        <th scope="col">Площадь</th>
        <th scope="col">Комнаты</th>
        <th scope="col">Цена</th>
        <th scope="col">Цена</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="realties">
        <tr>

        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
