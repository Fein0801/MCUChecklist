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
    <hr/>
    <c:forEach items="${movieList}" var="movie">
        <h2>${movie.title} (${movie.releaseYear})</h2>
        <img src="${movie.iconURL}" alt="Theatrical Poster for ${movie.title}" height="326px"/>
        <h3>Runtime: ${movie.runtime} minutes</h3>
        <p>${movie.description}</p>
        <c:choose>
            <c:when test="${movie.watched}">
                <input type="checkbox" id="checkbox_${movie.id}" class="movieCheckBox" checked>
            </c:when>
            <c:otherwise>
                <input type="checkbox" id="checkbox_${movie.id}" class="movieCheckBox">
            </c:otherwise>
        </c:choose>
        I have watched this movie
        <hr/>
    </c:forEach>
    <p>All poster images were pulled from the Wikipedia pages for the respective movies. All images belong to Marvel Entertainment. I do not claim ownership of the images, I am using them solely for aesthetic purposes.</p>

<%--    <script type="text/javascript">--%>
<%--        document.onload = function () {--%>
<%--            document.querySelectorAll('.movieCheckBox').forEach(item => {--%>
<%--                console.log(item.id);--%>
<%--                // item.addEventListener('click', event => {--%>
<%--                //    let id = event.target.id;--%>
<%--                //    console.log(id);--%>
<%--                // })--%>
<%--            })--%>
<%--        }--%>
<%--    </script>--%>
</body>
</html>
