<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02/10/2022
  Time: 12:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <b>Bạn có muốn xóa ${product.getId()}</b>
<a href="/product?action=delete&id=${product.getId()}">Có</a>
<a href="/product">không</a>

</body>
</html>
