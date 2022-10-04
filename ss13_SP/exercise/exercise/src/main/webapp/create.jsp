<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04/10/2022
  Time: 9:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<form action="/dreamer?action=create" method="post">
    <div class="mb-3">
        <label  class="form-label">Tên</label>
        <input type="text" class="form-control"  name="name">
    </div>
    <div class="mb-3">
        <label class="form-label">Tuổi</label>
        <input type="text" class="form-control"  name="age">
    </div>
    <div class="mb-3">
        <label  class="form-label">Quốc Gia</label>
        <input type="text" class="form-control" name="country">
    </div>
    <div class="mb-3">
        <label  class="form-label">Địa Chỉ</label>
        <input type="text" class="form-control" name="address">
    </div>
    <button type="submit" class="btn btn-primary" value="create">Submit</button>

</form>
</body>
</html>
