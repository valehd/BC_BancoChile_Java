<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Libros</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
    <h1>Todos los Libros Disponibles</h1>
    
    <ul>
        <c:forEach var="libro" items="${libros}">
            <li>
                <strong>Título:</strong> ${libro.key} | 
                <strong>Autor:</strong> ${libro.value} |
                <a href="/libros/${libro.key}">Ver detalle</a>
            </li>
        </c:forEach>
    </ul>

    <br>
    <a href="/libros/formulario">Agregar un nuevo libro</a>
</body>
</html>
