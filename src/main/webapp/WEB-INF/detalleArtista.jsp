<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle del Artista</title>
</head>
<body>
    <h1>Detalle del Artista</h1>

    <dl>
        <dt><strong>Nombre:</strong></dt>
        <dd><c:out value="${artista.nombre}"/></dd>

        <dt><strong>Apellido:</strong></dt>
        <dd><c:out value="${artista.apellido}"/></dd>

        <dt><strong>Biografía:</strong></dt>
        <dd><c:out value="${artista.biografia}"/></dd>
    </dl>

    <h3>Canciones escritas por este artista:</h3>
    <ul>
        <c:forEach var="cancion" items="${artista.canciones}">
            <li>
                <c:out value="${cancion.titulo}"/> — Álbum: <c:out value="${cancion.album}"/> (<c:out value="${cancion.genero}"/>)
            </li>
        </c:forEach>
        <c:if test="${empty artista.canciones}">
            <li>Este artista aún no tiene canciones registradas.</li>
        </c:if>
    </ul>

    <br>
    <a href="/artistas">Volver a lista de artistas</a>
</body>
</html>
