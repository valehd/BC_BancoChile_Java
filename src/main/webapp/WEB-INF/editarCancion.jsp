<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Canción</title>
    <style>.error { color: red; }</style>
</head>
<body>
    <h1>Editar Canción</h1>

    <form:form action="/canciones/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
        <div>
            <form:label path="titulo">Título:</form:label>
            <form:input path="titulo" />
            <form:errors path="titulo" cssClass="error" />
        </div>
     
        <select name="artistaId">
    <c:forEach var="artista" items="${listaArtistas}">
        <option value="${artista.id}"
            <c:if test="${artista.id == cancion.artista.id}">
                selected
            </c:if>>
            ${artista.nombre} ${artista.apellido}
        </option>
    </c:forEach>
</select>       



        <div>
            <form:label path="album">Álbum:</form:label>
            <form:input path="album" />
            <form:errors path="album" cssClass="error" />
        </div>
        <div>
            <form:label path="genero">Género:</form:label>
            <form:input path="genero" />
            <form:errors path="genero" cssClass="error" />
        </div>
        <div>
            <form:label path="idioma">Idioma:</form:label>
            <form:input path="idioma" />
            <form:errors path="idioma" cssClass="error" />
        </div>
        <br>
        <button type="submit">Guardar Cambios</button>
    </form:form>

    <br>
    <a href="/canciones">Volver a lista de canciones</a>
</body>
</html>
