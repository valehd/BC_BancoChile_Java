<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo Libro</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
    <h1>Registrar Nuevo Libro</h1>

    <form action="/procesa/libro" method="POST">
        <label for="nombreLibro">Título del Libro:</label><br>
        <input type="text" id="nombreLibro" name="nombreLibro" required><br><br>

        <label for="nombreAutor">Nombre del Autor:</label><br>
        <input type="text" id="nombreAutor" name="nombreAutor" required><br><br>

        <button type="submit">Guardar Libro</button>
    </form>

    <br>
    <a href="/libros">Cancelar y volver</a>
</body>
</html>
