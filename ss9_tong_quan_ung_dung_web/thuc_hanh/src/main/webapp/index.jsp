<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26/09/2022
  Time: 8:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Trang Chuyển Đổi Tiền Tệ</title>
  </head>
  <body>
  <h2>Curency conversion</h2>
  <form action="/tienServlet" method="get">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
  </form>
  </body>
</html>
