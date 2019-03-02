<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zaloguj się</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

    <h2> Zaloguj się!</h2>
    <form action="LoginServlet" method="POST">
        User Name: <input type="text" name="username">
        User Password: <input type="text" name="password">
        <input type="submit" value="zaloguj" >
    </form>
</body>
</html>
