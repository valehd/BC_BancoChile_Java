<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>



<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar / Editar Artista</title>
    <style>
        .error { color: red; font-style: italic; }
        .campo { margin-bottom: 15px; }
    </style>
</head>
<body>
    <h1>Formulario de Artista</h1>

    <form:form action="/artistas/procesa/agregar" method="POST" modelAttribute="artista">
        
        <form:hidden path="id" />

        <div class="campo">
            <label>Nombre:</label><br>
            <form:input path="nombre" />
            <form:errors path="nombre" cssClass="error" />
        </div>

        <div class="campo">
            <label>Apellido:</label><br>
            <form:input path="apellido" />
            <form:errors path="apellido" cssClass="error" />
        </div>

        <div class="campo">
            <label>Biografía:</label><br>
            <form:textarea path="biografia" rows="5" cols="30" />
            <form:errors path="biografia" cssClass="error" />
        </div>

        <button type="submit">Guardar Artista</button>
    </form:form>

    <br>
    <a href="/artistas">Cancelar y volver a la lista</a>
</body>
</html>