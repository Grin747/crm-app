<%@ page import="cruds.AttribCrud" %>
<%@ page import="entities.Realty" %><%--@elvariable id="realty" type="entities.Realty"--%>
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
<nav class="navbar fixed-top">
    <a href="list" class="btn btn-outline-primary btn-sm">Back to list</a>
</nav>
<% Realty realty = (Realty) request.getAttribute("realty"); %>
<div class="container text-left">
    <h3><%= AttribCrud.selectOne(realty.getObj_type(), "obj_type").getName() %> ${realty.square}
        <%= AttribCrud.selectOne(realty.getSquare_unit(), "square_unit").getName() %>
    </h3>
    <p>Price for cash: $${realty.cash_price}</p>
    <p>Price for mortgage: $${realty.mort_price}</p>
    <p>Delivery date: ${realty.delivery_date}</p>
    <p>Room count: ${realty.room_count}</p>
    <p>Floor: ${realty.floor}</p>
    <p>Description: ${realty.comment}</p>
</div>
</body>
</html>
