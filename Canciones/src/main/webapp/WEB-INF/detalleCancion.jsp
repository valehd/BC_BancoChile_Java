<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle de la Canción</title>
</head>
<body>
    <h1>Detalles de la Canción</h1>
    
    <c:if test="${cancion != null}">
        <ul>
            <li><strong>ID:</strong> <c:out value="${cancion.id}"/></li>
            <li><strong>Título:</strong> <c:out value="${cancion.titulo}"/></li>
            <li><strong>Artista:</strong> <c:out value="${cancion.artista}"/></li>
            <li><strong>Álbum:</strong> <c:out value="${cancion.album}"/></li>
            <li><strong>Género:</strong> <c:out value="${cancion.genero}"/></li>
            <li><strong>Idioma:</strong> <c:out value="${cancion.idioma}"/></li>
            <li><strong>Fecha de Creación:</strong> <c:out value="${cancion.fechaCreacion}"/></li>
            <li><strong>Última Actualización:</strong> <c:out value="${cancion.fechaActualizacion}"/></li>
        </ul>
    </c:if>
    
    <c:if test="${cancion == null}">
        <p>La canción solicitada no existe o no se pudo cargar.</p>
    </c:if>

       <c:if test="${cancion == null}">
        <p>La canción solicitada no existe o no se pudo cargar.</p>
    </c:if>

    <br>
    <a href="/canciones/formulario/editar/${cancion.id}">
        <button>Actualizar Canción</button>
    </a>

        <a href="/canciones/eliminar/${cancion.id}">
        <button style="background-color: #ff4d4d; color: white; border: none; padding: 6px 12px; cursor: pointer;">
            Eliminar Canción
        </button>
    </a>

    <br><br>
    <a href="/canciones">Volver a lista de canciones</a>
</body>
</html>
