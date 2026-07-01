<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Pintura</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <nav>
        <ul>
             <li><a href="/mis-compras">Mis compras</a></li> 
            <li><a href="/pinturas">Pinturas</a></li>
            <li><a href="/form/add">Agregar pintura</a></li>
            <li><a href="/logout">Logout</a></li>
        </ul>
    </nav>

    <div class="contenedor">
        <h1>Pinturas</h1>
        <h2>Editar pintura</h2>

        <form:form action="/edit" method="POST" modelAttribute="pintura">
            <form:hidden path="id" />
            <input type="hidden" name="_method" value="put" />

            <form:label path="titulo">Título</form:label>
            <form:input path="titulo" type="text" />
            <form:errors path="titulo" cssClass="error" />

            <form:label path="anio">Año</form:label>
            <form:input path="anio" type="number" />
            <form:errors path="anio" cssClass="error" />

            <form:label path="descripcion">Descripción</form:label>
            <form:textarea path="descripcion" />
            <form:errors path="descripcion" cssClass="error" />

            <form:label path="urlImagen">URL a imagen</form:label>
            <form:input path="urlImagen" type="text" />
            <form:errors path="urlImagen" cssClass="error" />

            <form:label path="cantidad">Cantidad</form:label>
            <form:input path="cantidad" type="number" />
            <form:errors path="cantidad" cssClass="error" />

            <form:label path="precio">Precio</form:label>
            <form:input path="precio" type="number" step="0.01" />
            <form:errors path="precio" cssClass="error" />

            <div class="acciones-form">
                <input type="submit" value="Editar" />
         </div>
        </form:form>
           

            <form action="/delete/${pintura.id}" method="POST" class="form-eliminar">
            <input type="hidden" name="_method" value="delete" />
            <input type="submit" value="Eliminar" class="btn-danger" />
        </form>
    </div>
</body>
</html>