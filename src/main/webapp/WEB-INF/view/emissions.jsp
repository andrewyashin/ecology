<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrew_yashyn
  Date: 12/8/17
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Emissions</title>
    <style>
        table {
            border: 1px solid #ccc;
            padding: 3px;
        }
        td {
            border: 1px solid #ccc;
            padding: 3px;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <td>Компанія</td>
        <td>Забруднювач</td>
        <td>Об'єм викидів(г/год(</td>
        <td>Величина масової витрати (г/год)</td>
        <td>Гранично допустимі викиди (мг/м3)</td>
        <td>Клас речовини</td>
        <td>Відсоток перебільшення</td>
    </tr>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.nameOfPlace}</td>
            <td>${list.nameOfPollutant}</td>
            <td>${list.emissionVolume}</td>
            <td>${list.vmv}</td>
            <td>${list.gdv}</td>
            <td>Class №${list.classOfPollutant}</td>
            <td>${list.percent}%</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
