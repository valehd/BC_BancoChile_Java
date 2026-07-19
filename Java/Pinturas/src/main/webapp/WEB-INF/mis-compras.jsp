<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle</title>
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
            <h2>Tus pinturas compradas</h2>

            <c:if test="${empty pinturas}">
                <p>Aún no has comprado ninguna pintura.</p>
            </c:if>

            <section>
                <c:forEach var="pintura" items="${pinturas}">
                    <article>
                        <figure>
                            <img src="${pintura.urlImagen}" alt="${pintura.titulo}">
                        </figure>
                        <section>
                            <h3>${pintura.titulo}</h3>
                            <p><span class="label">Autor</span><span class="valor">${pintura.creador.nombreCompleto}</span></p>
                            <p><span class="label">Año</span><span class="valor">${pintura.anio}</span></p>
                            <p><span class="label">Precio</span><span class="valor">$${pintura.precio}</span></p>
                        </section>
                    </article>
                </c:forEach>
            </section>
        </div>
    </main>
</body>
</html>