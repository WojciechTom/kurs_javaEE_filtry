
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Witaj w Admin Panel</title>
</head>
<body>
    <h2> Witaj w Admin Panel</h2>
    <h3> Twoje IP <%= request.getRemoteAddr() %></h3>
    <a href="LogoutServlet">Logout</a>
</body>
</html>
