<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Explorador de Recetas</title>
<link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>Explorador de Recetas</h1>
        <p class="subtitle">Selecciona una receta para ver sus ingredientes:</p>
        
        <ul class="recipe-list">
            <c:forEach var="receta" items="${listaRecetas}">
                <li>
                    <a href="/recetas/${receta}" class="recipe-link">${receta}</a>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
