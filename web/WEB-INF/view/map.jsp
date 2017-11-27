<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
        html, body{
            height:100%;
            margin: 0;
            padding: 20px;
        }
        #map_canvas {
            height: 700px;
            width: 1000px;
        }
    </style>
    <script src="https://maps.googleapis.com/maps/api/js?libraries=places&key=AIzaSyCZtLeNqx2C3qT6PUT3soS42nmW-I4EKqw"></script>
    <script type="text/javascript">

        var markers = [];
        <c:forEach var="markers" items="${list}">
            markers.push({
                name: "${fn:escapeXml(markers.name)}",
                latitude: <c:out value="${markers.latitude}"/>,
                longitude: <c:out value="${markers.longitude}"/>
            });
        </c:forEach>

        function initialize(){
            var mapOptions={
                zoom: 7,
                center: new google.maps.LatLng(51,31), // centre de la carte
                mapTypeId: google.maps.MapTypeId.ROADMAP, // ROADMAP, SATELLITE, HYBRID, TERRAIN
            };

            var map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);

            for (i = 0; i < markers.length; i++) {
                var marker = new google.maps.Marker({
                    position: new google.maps.LatLng(markers[i].latitude, markers[i].longitude),
                    map: map
                });

                var infowindow = new google.maps.InfoWindow();
                infowindow.setContent(markers[i].name);
                infowindow.open(map, marker);

            }
        }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script>
</head>
<body onload="initialize()">
<div id="map_canvas"></div>
</body>
</html>