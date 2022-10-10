<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 06/10/2022
  Time: 8:59 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Bạn có muốn xóa : <span><c:out value="${customer.getCustomerName()}"></c:out></span></h3>
<a href="/customer?action=deleteCustomer&id=${customer.customerId}" class="btn btn-danger">Có</a>
<a href="/customer?" class="btn btn-danger">Không</a>
</body>
</html>
