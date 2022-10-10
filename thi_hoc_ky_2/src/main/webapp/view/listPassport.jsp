<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/10/2022
  Time: 4:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<table class="table table-striped table-bordered table-dark" style="width: 100%;">
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>City</th>
        <th>NickName</th>
    </tr>
    <c:forEach var="passport" items="${list}" varStatus="p">
        <tr>
            <td>${p.count}</td>
            <td>${passport.getName()}</td>
            <td>${passport.getAge()}</td>
            <td>${passport.getAddress()}</td>
            <td>${passport.getCity()}</td>
            <td>${passport.getNickName()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
