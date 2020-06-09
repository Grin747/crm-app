<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <link href="../styles.css" rel="stylesheet">
    <title>Dictionary</title>
</head>
<body>
<nav class="navbar fixed-top">
    <a href="admin" class="btn btn-outline-success btn-sm">Back</a>
</nav>
<main class="container" role="main">
    <div class="card-deck mt-4">
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="owners" type="java.util.List"--%>
            <div class="card-header"><h3>Owners:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${owners}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="owner">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="owner">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="streets" type="java.util.List"--%>
            <div class="card-header"><h3>Streets:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${streets}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="street">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="street">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="res_complexes" type="java.util.List"--%>
            <div class="card-header"><h3>Complexes:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${res_complexes}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="res_complex">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="res_complex">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="districts" type="java.util.List"--%>
            <div class="card-header"><h3>Districts:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${districts}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="district">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
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
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="cities" type="java.util.List"--%>
            <div class="card-header"><h3>Cities:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${cities}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="city">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="city">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="own_types" type="java.util.List"--%>
            <div class="card-header"><h3>Own types:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${own_types}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="own_type">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="own_type">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="docs_types" type="java.util.List"--%>
            <div class="card-header"><h3>Docs types:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${docs_types}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="docs_type">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="docs_type">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="obj_types" type="java.util.List"--%>
            <div class="card-header"><h3>Object types:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${obj_types}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="obj_type">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="obj_type">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
        <div class="card mb-4 shadow-sm">
            <%--@elvariable id="square_units" type="java.util.List"--%>
            <div class="card-header"><h3>Units:</h3></div>
            <ul class="list-group list-group-flush">
                <c:forEach var="item" items="${square_units}">
                    <li class="list-group-item pl-3">
                        <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                            <input type="hidden" name="id" value="${item.id}">
                            <input type="hidden" name="table" value="square_unit">
                            <button type="submit" class="btn btn-outline-danger btn-sm py-0 mr-1">X</button>
                        </form>
                            ${item.name}
                    </li>
                </c:forEach>
                <li class="list-group-item pl-3">
                    <form class="form-inline" method="post" action='<c:url value="/create-attrib" />'
                          style="display:inline">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name">
                            <input type="hidden" name="table" value="square_unit">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-outline-success">+</button>
                            </div>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
    </div>
</main>
</body>
</html>