<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Pinturas</title>
<link rel="stylesheet" href="/css/styles.css">
</head>

<body>

<header>
    <nav>
        <ul>
            <li><a href="/mis-compras">Mis compras</a></li> 
            <li><a href="/pinturas">Pinturas</a></li>
            <li><a href="/form/add">Agregar pintura</a></li>
            <li><a href="/logout">Logout</a></li>
        </ul>
    </nav>
</header>

<main>
    <div class="contenedor">
    <h1>Pinturas</h1>
    <h2>Bienvenido de vuelta ${nombreCompletoUsuario}</h2>
    

    <c:if test="${empty pinturas}">
        <p>Aún no hay pinturas registradas.</p>
    </c:if>

    <section>

        <c:forEach var="pintura" items="${pinturas}">

            <article>

                <figure>
                    <img src="${pintura.urlImagen}" alt="${pintura.titulo}">
                </figure>

                <section>

                    <h3>${pintura.titulo}</h3>

                    <p>Autor: ${pintura.creador.nombreCompleto}</p>
                    <p>Año: ${pintura.anio}</p>
                    <p>Precio: $${pintura.precio}</p>

                    <a href="/detail/${pintura.id}">Ver</a>

                    <c:if test="${idUsuario eq pintura.creador.id}">
                        <a href="/form/edit/${pintura.id}"> &#9998;Editar</a>
                    </c:if>

                </section>

            </article>

        </c:forEach>

    </section>

</main>

</body>
</html>