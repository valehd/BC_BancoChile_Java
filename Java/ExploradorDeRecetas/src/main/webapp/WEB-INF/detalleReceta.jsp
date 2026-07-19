<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Detalle de la Receta</title>
<link rel="stylesheet" href="/css/styles.css"></head>
<body>
    <div class="container">
        
        <c:choose>
            <%-- Caso 1: mensaje de error en el modelo --%>
            <c:when test="${not empty mensajeError}">
                <div class="error-box">
                    <p class="error-message">${mensajeError}</p>
                </div>
            </c:when>
            
            <%-- Caso 2: receta se encontró con éxito --%>
            <c:otherwise>
                <h1>${nombreReceta}</h1>
                <h3>Ingredientes necesarios:</h3>
                <ul class="ingredient-list">
                    <c:forEach var="ingrediente" items="${ingredientesReceta}">
                        <li>${ingrediente}</li>
                    </c:forEach>
                </ul>
            </c:otherwise>
        </c:choose>
        
        
        <div class="actions">
            <a href="/recetas" class="btn-back">Volver al listado</a>
        </div>
        
    </div>
</body>
</html>
