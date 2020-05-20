<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Realties</title>
</head>
<body>
<h2>Realties</h2>
<p><a href='<c:url value="/create" />'>Create new</a></p>
<table>
    <tr><th>Id</th><th>Floor</th><th></th></tr>
    <%--@elvariable id="realties" type="java.util.List"--%>
    <c:forEach var="realty" items="${realties}">
        <tr><td>${realty.id}</td>
            <td>${realty.floor}</td>
            <td>
                <a href='<c:url value="/edit?id=${realty.id}" />'>Edit</a> |
                <form method="post" action='<c:url value="/delete" />' style="display:inline;">
                    <input type="hidden" name="id" value="${realty.id}">
                    <input type="submit" value="Delete">
                </form>
            </td></tr>
    </c:forEach>
</table>
</body>
</html>