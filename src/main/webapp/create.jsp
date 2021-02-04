<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 04.02.2021
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>добавление квартир</title>
</head>
<body>
<h3>Новая квартира</h3>
<form method="post" action="AddApartServlet">
    <label>Район</label><br>
    <input name="distr"/><br><br>
    <label>Адрес</label><br>
    <input name="adrs"/><br><br>
    <label>Площадь</label><br>
    <input name="area" type="number" /><br><br>
    <label>к-в комнат</label><br>
    <input name="rooms" type="number" /><br><br>
    <label>Цена</label><br>
    <input name="price" type="number"  /><br><br>
    <input type="submit" value="добавить" />
</form>
</body>
</html>
