<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 30/09/2022
  Time: 3:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<h1>Trang Thêm Mới Sản Phẩm</h1>
<c:if test="${mess!=null}">
    <span>${mess}</span>
</c:if>
<a href="/product">Quay Lai trang List</a>
<form action="/product?action=create" method="post">
<%--    <div class="mb-3">--%>
<%--        <label for="exampleInputEmail1" class="form-label">Thêm ID</label>--%>
<%--        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id">--%>
<%--    </div>--%>
    <div class="mb-3">
        <label  class="form-label">Tên</label>
        <input type="text" class="form-control"  name="name">
    </div>
    <div class="mb-3">
        <label class="form-label">Giá</label>
        <input type="text" class="form-control"  name="price">
    </div>
    <div class="mb-3">
        <label  class="form-label">Đánh Giá</label>
        <input type="text" class="form-control" name="rate">
    </div>
    <div class="mb-3">
        <label  class="form-label">Màu Sắc</label>
        <input type="text" class="form-control" name="color">
    </div>

<%--    <div class="mb-3 form-check">--%>
<%--        <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
<%--        <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
<%--    </div>--%>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>


</body>
</html>
