<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <nav>
        <ul>
            <li><a href="/">Login</a></li>
            <li><a href="/form/registro">Registro</a></li>
        </ul>
    </nav>

    <div class="contenedor">
        <h1>Pinturas</h1>
        <h2>Registro</h2>

        <form:form action="/registro" method="POST" modelAttribute="usuario">
            <form:label path="nombre">Nombre</form:label>
            <form:input path="nombre" type="text" />
            <form:errors path="nombre" cssClass="error" />

            <form:label path="apellido">Apellido</form:label>
            <form:input path="apellido" type="text" />
            <form:errors path="apellido" cssClass="error" />

            <form:label path="correo">Correo</form:label>
            <form:input path="correo" type="text" />
            <form:errors path="correo" cssClass="error" />

            <form:label path="password">Contraseña</form:label>
            <form:password path="password" />
            <form:errors path="password" cssClass="error" />

            <form:label path="confirmarPassword">Confirmar contraseña</form:label>
            <form:password path="confirmarPassword" />
            <form:errors path="confirmarPassword" cssClass="error" />

            <input type="submit" value="Registrarse" />
        </form:form>
    </div>
</body>
</html>