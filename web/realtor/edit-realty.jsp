<%--@elvariable id="realty" type="entities.Realty"--%>
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
    <title>New realty</title>
</head>
<body class="text-left">
<nav class="navbar fixed-top">
    <a href="cabinet" class="btn btn-outline-success btn-sm">Back</a>
</nav>
<div class="container">
    <h1>Edit Realty</h1>
    <form method="post" action='<c:url value="/edit-realty" />'>
        <div class="row mb-3">
            <div class="col">
                <label for="in-price">In price</label>
                <input name="in_price" type="text" id="in-price" class="form-control" value="${realty.in_price}" required>
            </div>
            <div class="col">
                <label for="cash-price">Cash price</label>
                <input name="cash_price" type="text" id="cash-price" class="form-control" value="${realty.cash_price}" required>
            </div>
            <div class="col">
                <label for="mort-price">Mortgage price</label>
                <input name="mort_price" type="text" id="mort-price" class="form-control" value="${realty.mort_price}" required>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="city">City</label>
                <select class="custom-select" name="city" id="city">
                    <%--@elvariable id="cities" type="java.util.List"--%>
                    <c:forEach var="item" items="${cities}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="street">Street</label>
                <select class="custom-select" name="street" id="street">
                    <%--@elvariable id="streets" type="java.util.List"--%>
                    <c:forEach var="item" items="${streets}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="district">District</label>
                <select class="custom-select" name="district" id="district">
                    <%--@elvariable id="districts" type="java.util.List"--%>
                    <c:forEach var="item" items="${districts}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="res_complex">Complex</label>
                <select class="custom-select" name="res_complex" id="res_complex">
                    <%--@elvariable id="res_complexes" type="java.util.List"--%>
                    <c:forEach var="item" items="${res_complexes}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="building">Building</label>
                <input type="text" name="building" class="form-control" id="building" value="${realty.building}">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="square">Square</label>
                <div class="input-group">
                    <input class="form-control" name="square" type="text" id="square" value="${realty.square}" required>
                    <select class="custom-select" aria-label="unit" name="square_unit" id="units">
                        <%--@elvariable id="units" type="java.util.List"--%>
                        <c:forEach var="item" items="${units}">
                            <option value="${item.id}">${item.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="col">
                <label for="floor">Floor</label>
                <input class="form-control" name="floor" value="${realty.floor}" id="floor">
            </div>
            <div class="col">
                <label for="room_count">Room count</label>
                <input class="form-control" name="room_count" id="room_count" value="${realty.room_count}">
            </div>
            <div class="col">
                <label for="docs_type">Docs type</label>
                <select class="custom-select" name="docs_type" id="docs_type">
                    <%--@elvariable id="docs_types" type="java.util.List"--%>
                    <c:forEach var="item" items="${docs_types}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="obj_type">Object type</label>
                <select class="custom-select" name="obj_type" id="obj_type">
                    <%--@elvariable id="obj_types" type="java.util.List"--%>
                    <c:forEach var="item" items="${obj_types}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="owner">Owner</label>
                <select class="custom-select" name="owner" id="owner">
                    <%--@elvariable id="owners" type="java.util.List"--%>
                    <c:forEach var="item" items="${owners}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="own_type">Own type</label>
                <select class="custom-select" name="own_type" id="own_type">
                    <%--@elvariable id="own_types" type="java.util.List"--%>
                    <c:forEach var="item" items="${own_types}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col">
                <label for="delivery_date">Delivery date</label>
                <input name="delivery_date" type="text" id="delivery_date" class="form-control" value="${realty.delivery_date}">
            </div>
        </div>

        <div class="form-group">
            <label for="comment">Comment</label>
            <textarea class="form-control" name="comment" id="comment" rows="5">${realty.comment}</textarea>
        </div>

        <button class="btn btn-success" type="submit">Create</button>
    </form>
</div>
</body>
</html>