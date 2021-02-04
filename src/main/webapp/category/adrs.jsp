<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.02.2021
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Поиск по адресу</title>
</head>
<body>
<form method="post" action="/AdrsServlet">
    Search:<input type="text" name="Search">
    <input type="submit" value="Go">
</form>

<table>
    <tr><th>Район</th><th>Улица</th><th>Площадь</th><th>Комнаты</th><th>Цена $</th></tr>
    <c:forEach var="aparts" items="${adrsparam}">
        <tr><td>${aparts.district}</td>
            <td>${aparts.address}</td>
            <td>${aparts.area}</td>
            <td>${aparts.rooms}</td>
            <td>${aparts.price}</td></tr>
    </c:forEach>
</table>
</body>
</html>

</body>
</html>
