
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 05/10/2022
  Time: 2:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>

</head>
<h2>Customer List</h2>
<a href="/customer?action=create" class="btn btn-primary">Add To List </a>
<body style="background: #62FCBD">
<div class="container-fluid">
    <!--    hàng 1-->
    <div style="background-image: url(https://anhdepfree.com/wp-content/uploads/2020/11/hinh-nen-ve-nuoc.jpeg)" class="row">
        <div class="col-sm-3 col-lg-3 col-md-3 head">
            <img src="https://furamavietnam.com/wp-content/uploads/2018/10/logo.png" width="90px" height="100px"
                 style="margin-top: 15px;margin-left: 100px">
        </div>
        <div class="col-sm-3 col-lg-3 col-md-3 head">
            <img src="https://bazantravel.com/cdn/medias/uploads/53/53114-furama-resort-da-nang-11.jpg" width="140px" height="80px" style="margin-top: 20px;margin-left: -50px">
            <img src="https://q-cf.bstatic.com/images/hotel/max1024x768/623/62371531.jpg" width="160px" height="80px" style="margin-top: 20px;margin-left: 80px">
        </div>
        <div class="col-sm-3 col-lg-3 col-md-3 head ">
            <p style="margin-top: 20px"><i class="fa-solid fa-location-dot"></i>
                103 - 105 Vo Nguyen Giap Street,<br>
                Khue My Ward, Ngu Hanh Son District,<br>
                Danang City, Vietnam<br>
                7,0 km from Danang Airport
            </p>
        </div>
        <div class="col-sm-3 col-lg-3 col-md-3 head ">
            <p style="margin-top: 20px"><i class="fa-solid fa-phone"></i>84-236-3847 333/888</p>
            <p><i class="fa-solid fa-envelope-circle-check"></i>reservation@furamavietnam.com</p>
        </div>
    </div>
    <%--    hàng 2--%>
    <div class="row" style="background-color: #58E0D0">
        <nav class="navbar navbar-expand-lg ">
            <div class="container-fluid mx-5">
                <a class="navbar-brand" href="/">Home</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item dropdown ms-3">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false">Employee</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="/employee">Employee list</a></li>
                                <li><a class="dropdown-item" href="/employee?action=create">Add new Employee</a></li>
                            </ul>
                        </li>

                        <li class="nav-item dropdown ms-3">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false">Customer</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="/customer">Customer list</a></li>
                                <li><a class="dropdown-item" href="/customer?action=create">Add new Customer</a></li>
                            </ul>
                        </li>

                        <li class="nav-item dropdown ms-3">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false">Service</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="/facility">Facility list</a></li>
                                <li><a class="dropdown-item" href="/facility?action=create">Add new Facility</a></li>
                            </ul>
                        </li>

                        <li class="nav-item dropdown ms-3">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                               aria-expanded="false">Contract</a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Contract list</a></li>
                                <li><a class="dropdown-item" href="#">Add new Contract</a></li>
                            </ul>
                        </li>
                    </ul>

                    <form class="d-flex my-2" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">
                            <i class="fa-solid fa-magnifying-glass"></i></button>
                    </form>
                </div>
            </div>
        </nav>
    </div>
</div>
<table class="table table-dark">
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Birth Day</th>
        <th>Gender</th>
        <th>Id Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>TypeId</th>
        <th></th>
        <th></th>
    </tr>

    <c:forEach var="customer" items="${list}" varStatus="cus">
        <tr>
            <td>${cus.count}</td>
            <td>${customer.getCustomerName()}</td>
            <td>${customer.getCustomerBirthDay()}</td>
            <td>${customer.getCustomerGender()}</td>
            <td>${customer.getCustomerIdCard()}</td>
            <td>${customer.getCustomerPhone()}</td>
            <td>${customer.getCustomerEmail()}</td>
            <td>${customer.getCustomerAddress()}</td>
            <td>${customer.getCustomerTypeId()}</td>
            <td>
                <button type="button" onclick="showInfo('${customer.getCustomerId()}','${customer.getCustomerName()}')" class="btn btn-danger"  data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete
                </button>
            </td>
            <td>
                <a href="/customer?action=edit&id=${customer.getCustomerId()}" class="btn btn-primary">Edit</a>
            </td>
<%--            <td><a href="/customer?action=delete&id=${customer.getCustomerId()}" class="btn btn-danger">Delete</a></td>--%>
        </tr>
    </c:forEach>

</table>
<!-- Button trigger modal -->
<%--<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
<%--    Launch demo modal--%>
<%--</button>--%>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/customer">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="text" id="deleteId" name="deleteId" hidden>
                    <input type="text" value="delete" name="action" hidden>
                    <span>Bạn có muốn xóa sinh viên</span><span id="deleteName"></span>
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
</body>
</html>
