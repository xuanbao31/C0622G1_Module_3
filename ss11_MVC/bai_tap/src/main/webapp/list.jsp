<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 30/09/2022
  Time: 1:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>

</head>
<body>
<h2 style="text-align: center">Danh Sách Sản Phẩm</h2>
<a href="/product?action=create">Thêm Mới Sản Phẩm</a>
<form class="d-flex justify-content-end" action="/product?action=search">
    <input type="text" name="nameSearch" placeholder="Nhập tên cần tìm kiếm" style="margin-right: 20px;">
    <input type="submit" name="action" value="search" style="margin-right: 20px;">
</form>
<form action="/product">
    <table class="table table-dark">
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Price</th>
            <th>Rate</th>
            <th>Color</th>
            <th></th>
            <th></th>
        </tr>
        <c:forEach items="${list}" var="product" varStatus="status">
            <tr>
                <td>${status.count}</td>
                    <%--                <td>${product.getId()}</td>--%>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getRate()}</td>
                <td>${product.getColor()}</td>
                <td>
                    <a class="btn btn-primary" href="/product?action=delete&id=${product.getId()}">Delete

                    </a>
                </td>
                <td>
                    <button class="btn btn-danger">Edit</button>
                </td>
            </tr>
        </c:forEach>

    </table>
</form>


</body>
</html>
