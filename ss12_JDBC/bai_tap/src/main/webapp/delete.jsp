<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 03/10/2022
  Time: 4:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    Bạn có muốn xóa <c:out value="${dreamer.name}"></c:out>
</p>
<a href="/dreamer?action=delete&id=${dreamer.id}">Có</a>
<a href="/dreamer">Không</a>
</body>
</html>
