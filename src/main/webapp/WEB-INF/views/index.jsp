<%--
  Created by IntelliJ IDEA.
  User: bfeinstein
  Date: 11/27/2020
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>MCU checklist</title>
</head>
<body>
    <h1>MCU checklist</h1>
    <c:forEach items="${movieList}" var="movie">
        <hr/>
        <h2>${movie.title} (${movie.releaseYear})</h2>
        <img src="${movie.iconURL}" alt="Theatrical Poster for ${movie.title}" height="326px"/>
        <h3>Runtime: ${movie.runtime} minutes</h3>
        <p>${movie.description}</p>
        <c:choose>
            <c:when test="${movie.watched}">
                <input type="checkbox" id="checkbox_${movie.id}" checked>
            </c:when>
            <c:otherwise>
                <input type="checkbox" id="checkbox_${movie.id}">
            </c:otherwise>
        </c:choose>
        I have watched this movie
    </c:forEach>
</body>
</html>
