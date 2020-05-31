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
    <title>Realtors</title>
</head>
<body>
<div class="container">
    <form method="post" action='<c:url value="/master-detail" />'>
        <div class="input-group">
            <label>Realtors
                <select class="custom-select" name="realtor">
                    <%--@elvariable id="realtors" type="java.util.List"--%>
                    <c:forEach var="item" items="${realtors}">
                        <option value="${item.id}">${item.name}</option>
                    </c:forEach>
                </select>
            </label>
            <div class="input-group-append">
                <button class="btn btn-outline-secondary" type="submit">View</button>
            </div>
        </div>
    </form>

    <table>
        ${deals}
    </table>
</div>

</body>
</html>
