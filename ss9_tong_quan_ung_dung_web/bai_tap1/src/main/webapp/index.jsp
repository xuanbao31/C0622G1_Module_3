<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26/09/2022
  Time: 1:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

</head>
<body>
<form action="/discount" method="post">
    <input type="text" placeholder="Nhập tên sản phẩm">
    <br>
    <input type="text" name="price" placeholder="Giá Niêm Yết " value="${price}">
    <br>
    <input type="text" name="percent" placeholder="Tỷ Lệ Chiết Khấu(phần trăm)" value="${percent}">
    <br>
    <input type="submit" value="Submit">

</form>
<h2>Kết quả là : ${amount}</h2>
</body>
</html>
