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
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css">
<%--    // neu trong list thi ../../--%>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css">
</head>
<body style="background: seagreen">
<h1>Trang Chủ</h1>
<a href="/dreamer?&action=create" class="btn btn-dark">Add To List</a>
<form action="/dreamer">
    <input type="text" name="country" placeholder="nhập quốc gia">
    <button type="submit" name="action" value="search">tìm kiếm</button>
</form>
<a href="/dreamer" class="btn btn-dark">Back To List </a>
<form action="/dreamer">
    <table id="tableStudent" class="table table-striped table-bordered table-dark" style="width: 100%;">
        <thead>
            <tr>
                <th>STT</th>
                <th>Name</th>
                <th>Age</th>
                <th>Country</th>
                <th>Address</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="dreamer" varStatus="dre">
            <tr>
                <td>${dre.count}</td>
                <td>${dreamer.getName()}</td>
                <td>${dreamer.getAge()}</td>
                <td>${dreamer.getCountry()}</td>
                <td>${dreamer.getAddress()}</td>
                <td>
                    <a href="/dreamer?action=delete&id=${dreamer.getId()}" class="btn btn-danger">Delete
                    </a>
                </td>
                <td></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrip',
            "lengthChange": false,
            "pageLength": 1
        });
    });
</script>
</body>
</html>
