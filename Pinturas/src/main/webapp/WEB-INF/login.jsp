<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
        <h2>Login</h2>

        <form:form action="/login" method="POST" modelAttribute="usuarioLogin">
            <form:label path="correo">Correo:</form:label>
            <form:input path="correo" type="text" />
            <form:errors path="correo" cssClass="error" />

            <form:label path="password">Contraseña:</form:label>
            <form:input path="password" type="text" />
            <form:errors path="password" cssClass="error" />

            <input type="submit" value="Login" />
        </form:form>
    </div>
</body>
</html>