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
    <title>New realtor</title>
</head>
<body class="text-left">
<div class="container">
    <nav class="navbar fixed-top">
        <a href="admin" class="btn btn-outline-success btn-sm">Back</a>
    </nav>
    <h1>New Realtor</h1>
    <form method="post" action='<c:url value="/add-realtor"/>'>
        <div class="row mb-3">
            <div class="col">
                <label for="name">Name</label>
                <input type="text" name="name" id="name" class="form-control" required>
            </div>
            <div class="col">
                <label for="surname">Surname</label>
                <input type="text" name="surname" id="surname" class="form-control" required>
            </div>
            <div class="col">
                <label for="patronymic">Patronymic</label>
                <input type="text" name="patronymic" id="patronymic" class="form-control">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="email">Email</label>
                <input type="email" name="email" class="form-control" id="email" required>
            </div>
            <div class="col">
                <label for="password">Password</label>
                <input type="password" name="password" class="form-control" id="password" required>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label for="phone">Phone:</label>
                <input type="text" name="phone" id="phone" class="form-control" required>
            </div>
            <div class="col">
                <label for="salary">Salary:</label>
                <input type="text" name="salary" id="salary" class="form-control" required>
            </div>
        </div>

        <button class="btn btn-success" type="submit">Sign up realtor</button>
    </form>
</div>
</body>
</html>