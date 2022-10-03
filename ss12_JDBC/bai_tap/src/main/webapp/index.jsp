<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 03/10/2022
  Time: 1:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Trang Chủ</h1>
<form action="/dreamer">
    <input type="text" name="country" placeholder="nhập quốc gia">
    <button type="submit" name="action" value="search" >tìm kiếm</button>
</form>
<form action="/dreamer">
    <table class="table table-dark">
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Age</th>
            <th>Country</th>
            <th>Address</th>
            <th></th>
            <th></th>
        </tr>
        <c:forEach items="${list}" var="dreamer" varStatus="dre">
            <tr>
                <td>${dre.count}</td>
                <td>${dreamer.getName()}</td>
                <td>${dreamer.getAge()}</td>
                <td>${dreamer.getCountry()}</td>
                <td>${dreamer.getAddress()}</td>
                <td>
                    <a href="/dreamer?action=delete&id=${dreamer.getId()}" class="btn btn-primary">Delete
                </a>
                </td>

            </tr>
        </c:forEach>

    </table>
</form>

</body>
</html>
