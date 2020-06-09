<%--@elvariable id="realty" type="entities.Realty"--%>
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
    <title>Details</title>
</head>
<body>
<div class="container text-left">
    <nav class="navbar fixed-top">
        <a href="list" class="btn btn-outline-primary btn-sm">Back to list</a>
        <a href="signin" class="btn btn-outline-success btn-sm">Sign in</a>
    </nav>
</div>
<p>Price for cash: $${realty.cash_price}</p>
</body>
</html>
