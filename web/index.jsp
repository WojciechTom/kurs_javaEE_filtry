<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
  </head>
  <body>
    <h1>Witaj, twój adres IP: <%= request.getRemoteAddr() %> </h1>
    <a href="admin.jsp"> Admin Panel </a>
  </body>
</html>
