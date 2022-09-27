<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26/09/2022
  Time: 9:47 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8" %>
<html>
  <head>
    <title>Từ Điển </title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

  </head>
  <body>
 <h2>Translate</h2>
  <form action="/translateServlet" method="post">
    <input type="text" name="txtSearch" placeholder="Nhập từ b muốn tra">
    <input type="submit" value="Search">
  </form>
  </body>
</html>
