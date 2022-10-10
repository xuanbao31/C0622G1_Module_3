<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 09/10/2022
  Time: 11:27 SA
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
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css">
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css">
</head>
<body style="background: #62FCBD">
<h2>EmployeeList</h2>
<a href="/employee?action=create" class="btn btn-primary">Add to List</a>
<table id="tableStudent" class="table table-striped table-bordered table-dark" style="width: 100%;">
    <thead>
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>BirthDay</th>
        <th>CardId</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>PositionId</th>
        <th>EducationId</th>
        <th>DivisionId</th>
        <th></th>
    </tr>
    </thead>

        <tbody>
        <c:forEach var="employee" items="${list}" varStatus="em">
        <tr>

            <td>${em.count}</td>
            <td>${employee.getName()}</td>
            <td>${employee.getBirthDay()}</td>
            <td>${employee.getCardId()}</td>
            <td>${employee.getSalary()}</td>
            <td>${employee.getPhone()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getAddress()}</td>
            <td>${employee.getPositionId()}</td>
            <td>${employee.getEducationId()}</td>
            <td>${employee.getDivisionId()}</td>
<td><button type="button" onclick="showInfo('${employee.getId()}','${employee.getName()}')" class="btn btn-danger"  data-bs-toggle="modal" data-bs-target="#exampleModal">
    Delete
</button></td>
        </tr>
        </c:forEach>
        </tbody>


</table>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/employee?action=delete&id">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="text" id="deleteId" name="deleteId" hidden>
                    <input type="text" value="delete" name="action" hidden>
                    <span>Bạn có muốn xóa sinh viên </span><span id="deleteName"></span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">delete</button>
                </div>
            </div>
        </form>

    </div>
</div>
<script>
    function showInfo(id,name){
        document.getElementById("deleteName").innerText=name;
        document.getElementById("deleteId").value=id;
    }
</script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>

<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        });
    });
</script>

</body>
</html>
