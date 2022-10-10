<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 06/10/2022
  Time: 4:05 CH
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
<body style="background: #62FCBD">
<h1>Trang Cập Nhật</h1>
<a href="/customer" class="btn btn-primary">Back To List</a>
<form action="/customer?action=edit" method="post">
    <table class="table table-dark">
        <tr>
            <td>
                <input value="${idEdit}" name="idEdit" hidden>
            </td>
            <td>
                Nhập Tên :
                <input type="text" name="name">
            </td>
            <td>
                Nhập Ngày Sinh :
                <input type="date" name="birthDay">
            </td>
            <td>
                <input type="radio" value="1" name="gender" checked> Male
                <input type="radio" value="0" name="gender" checked> Female
            </td>
            <td>
                Nhập IdCard :
                <input type="text" name="idCard">
            </td>
            <td>
                Nhập Phone :
                <input type="text" name="phone">
            </td>
            <td>
                Nhập Email :
                <input type="text" name="email">
            </td>
            <td>
                Nhập Địa Chỉ :
                <input type="text" name="address">
            </td>
            <td>
                Nhập TypeId :
                <input type="text" name="typeId">
            </td>
        </tr>
        <button type="submit" class="btn btn-danger" value="Edit">Save</button>
    </table>
</form>


</body>
</html>
