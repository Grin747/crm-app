<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
          crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="styles.css" rel="stylesheet">
    <title>Sign in</title>
</head>
<body class="text-center">
<form class="form-signin">
    <img class="mb-4" src="assets/logo.png" alt width="256" height="256">
    <label class="sr-only">Email
        <input name="login" type="email" class="form-control" placeholder="Login" required>
    </label>
    <label class="sr-only">Password
        <input name="password" type="password" class="form-control" placeholder="Password" required>
    </label>
    <button class="btn btn-success" type="submit">Sign in</button>
    <p class="mt-5 mb-4 text-muted"></p>
</form>
</body>
</html>
