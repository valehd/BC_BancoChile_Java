<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detalle</title>
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
        <h2>${pintura.titulo}</h2>

        
        <div class="detalle-card">
            <img src="${pintura.urlImagen}" alt="${pintura.titulo}">
            <div class="detalle-info">
                <span class="campo">Autor</span>
                <span class="valor">${pintura.creador.nombreCompleto}</span>

                <span class="campo">Descripción</span>
                <span class="valor">${pintura.descripcion}</span>

                <span class="campo">Precio</span>
                <span class="valor">$${pintura.precio}</span>

                <div class="fila-cantidad">
                    <div>
                        <span class="campo">Cantidad en inventario</span>
                        <span class="valor">${pintura.cantidad}</span>
                    </div>

                    <c:choose>
                        <c:when test="${pintura.cantidad > 0}">
                            <form action="/comprar/${pintura.id}" method="POST">
                                <input type="submit" value="Comprar" class="btn-comprar" />
                            </form>
                        </c:when>
                        <c:otherwise>
                            <p class="agotado">Agotado!</p>
                        </c:otherwise>
                    </c:choose>
                </div>

            </div>
        </div>

        <div class="compradores">
            <p class="titulo-compradores">Usuarios que han comprado esta pintura</p>
            <ul>
                <c:forEach var="comprador" items="${compradores}">
                    <li>${comprador.nombreCompleto}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</body>
</html>