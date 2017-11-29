<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table</title>
</head>
<body>
<br>
<table style="border: 1px solid #ccc; padding: 10px;">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>LONGITUDE</td>
        <td>LATITUDE</td>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.longitude}</td>
            <td>${list.latitude}</td>
        </tr>
    </c:forEach>
</table>

<br>
<br>
<br>

<form name="deleteMarker" action="deleteMarker" method="POST" style="border: 1px solid #ccc; padding: 10px; width: 250px;">
    ID : <input type="number" name="delete"> <br>
    <input type="submit" value="DELETE">
</form>

<br>
<br>
<br>

<form name="createMarker" action="createMarker" method="POST" style="border: 1px solid #ccc; padding: 10px; width: 250px;">
    NAME      : <input type="text" name="name"> <br>
    LONGITUDE : <input type="number" step="any" name="longitude"> <br>
    LATITUDE  : <input type="number" step="any" name="latitude"> <br>
    <input type="submit" value="CREATE">
</form>

<br>
<br>
<br>

<form name="updateMarker" action="updateMarker" method="POST" style="border: 1px solid #ccc; padding: 10px; width: 250px;">
    ID : <input type="number" name="id"> <br>
    NAME      : <input type="text" name="name"> <br>
    LONGITUDE : <input type="number" step="any" name="longitude"> <br>
    LATITUDE  : <input type="number" step="any" name="latitude"> <br>
    <input type="submit" value="UPDATE">
</form>

</body>
</html>
