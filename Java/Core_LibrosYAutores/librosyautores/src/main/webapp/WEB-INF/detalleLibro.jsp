<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detalle del Libro</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1>Información de la Obra</h1>

    <c:choose>
        <c:when test="${not empty error}">
            <p class="error-msg">${error}</p>
        </c:when>
        
        <c:otherwise>
            <p><strong>Título:</strong> ${nombre}</p>
            <p><strong>Autor:</strong> ${autor}</p>
        </c:otherwise>
    </c:choose>

    <br>
    <a href="/libros">Volver a la lista</a>
</body>
</html>
