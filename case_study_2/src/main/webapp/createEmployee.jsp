<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 09/10/2022
  Time: 12:48 CH
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
<a href="/employee" class="btn btn-danger">Back List</a>
<form action="/employee?action=add" method="post">
    <%--      private String name;
        private String birthDay;
        private String cardId;
        private double salary;
        private String phone;
        private String email;
      --%>
    <table class="table table-dark">
        <tr>

            <td>
                Nhập Tên :
                <input type="text" name="name">
            </td>

        <tr>
            <td> Nhập Ngày Sinh :
                <input type="date" name="birthDay"></td>
        </tr>
        <tr>
            <td> Nhập CardID :
                <input type="text" name="cardId"></td>
        </tr>
        <tr>
            <td>
                Nhập Salary:
                <input type="text" name="salary">
            </td>
        </tr>
        <tr>
            <td>
                Nhập Phone:
                <input type="text" name="phone">
            </td>
        </tr>
        <tr>
            <td>
                Nhập Email:
                <input type="text" name="email">
            </td>

        </tr>


        <tr>
            <td>
                Nhập Address:
                <input type="text" name="address">
            </td>
        </tr>
        <tr>
            <td>
                Nhập PositionId:
                <input type="text" name="positionId">
            </td>
        </tr>


        <tr>
            <td>
                Nhập EducationId:
                <input type="text" name="educationId">
            </td>
        </tr>
        <tr>
            <td>
                Nhập DivisionId:
                <input type="text" name="divisionId">
            </td>
        </tr>


        </tr>

    </table>
    <button class="btn btn-danger" value="add">Save</button>
</form>

</body>
</html>
