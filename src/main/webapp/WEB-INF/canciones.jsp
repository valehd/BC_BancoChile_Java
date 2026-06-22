<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Canciones</title>
</head>
<body>
    <h1>Lista de Canciones Disponibles</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Título</th>
                <th>Autor</th>
                <th>Detalle</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="cancion" items="${listaCanciones}">
                <tr>
                    <td><c:out value="${cancion.titulo}"/></td>
                    <td><c:out value="${cancion.artista}"/></td>
                    <td>
                        <a href="/canciones/detalle/${cancion.id}">Detalle</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
