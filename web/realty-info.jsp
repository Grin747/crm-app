<%@ page import="cruds.AttribCrud" %>
<%@ page import="entities.Realty" %>
<%@ page import="cruds.RealtorCrud" %>
<%@ page import="entities.Realtor" %><%--@elvariable id="realty" type="entities.Realty"--%>
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
<% Realtor realtor = RealtorCrud.get(realty.getRealtor()); %>
<div class="container text-left">
    <h3 class="mb-3"><%= AttribCrud.selectOne(realty.getObj_type(), "obj_type").getName() %> ${realty.square}
        <%= AttribCrud.selectOne(realty.getSquare_unit(), "square_unit").getName() %>
    </h3>
    <dl class="row">
        <dt class="col-2">Address</dt>
        <dd class="col-10">
            <div><%= AttribCrud.selectOne(realty.getCity(), "city").getName() %> <%= AttribCrud.selectOne(realty.getDistrict(), "district").getName() %></div>
            <div><%= AttribCrud.selectOne(realty.getStreet(), "street").getName() %> <%= AttribCrud.selectOne(realty.getRes_complex(), "res_complex").getName() %></div>
            <div>${realty.floor} floor, building ${realty.building}</div>
        </dd>

        <dt class="col-2">Price for cash</dt>
        <dd class="col-10">$${realty.cash_price}</dd>

        <dt class="col-2">Price for mortgage</dt>
        <dd class="col-10">$${realty.mort_price}</dd>

        <dt class="col-2">Delivery date</dt>
        <dd class="col-10">${realty.delivery_date}</dd>

        <dt class="col-2">Room count</dt>
        <dd class="col-10">${realty.room_count}</dd>

        <dt class="col-2">Description</dt>
        <dd class="col-10">${realty.comment}</dd>

        <dt class="col-2">Contact us</dt>
        <dd class="col-10">
            <div><%= realtor.getEmail() %></div>
            <div><%= realtor.getPhone() %></div>
            <div><%= realtor.getSurname() %> <%= realtor.getName() %> <%= realtor.getPatronymic() %></div>
        </dd>
    </dl>
</div>
</body>
</html>
