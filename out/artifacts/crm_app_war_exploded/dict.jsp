<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <title>Dictionary</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-3">
            <%--@elvariable id="districts" type="java.util.List"--%>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><h3>Districts</h3></li>
                <c:forEach var="item" items="${districts}">
                    <li class="list-group-item">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="district">
                            <button type="submit" class="btn btn-outline-danger btn-sm">Delete</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="district">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="col-3">
            <%--@elvariable id="objTypes" type="java.util.List"--%>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><h3>Districts</h3></li>
                <c:forEach var="item" items="${objTypes}">
                    <li class="list-group-item">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="objType">
                            <button type="submit" class="btn btn-outline-danger btn-sm">Delete</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="objType">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>