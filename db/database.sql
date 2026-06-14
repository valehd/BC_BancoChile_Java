CREATE DATABASE clientes_pedidos;

USE clientes_pedidos;

CREATE TABLE clientes (
    id_cliente INT NOT NULL,
    nombre     VARCHAR(50) NOT NULL,
    direccion  VARCHAR(100) NOT NULL,
    telefono   INT
);

ALTER TABLE clientes ADD CONSTRAINT clientes_pk PRIMARY KEY ( id_cliente );

CREATE TABLE pedidos (
    id_pedido           INT NOT NULL,
    fecha_pedido        DATE,
    total               DECIMAL(10,2),
    clientes_id_cliente INT NOT NULL
);

ALTER TABLE pedidos ADD CONSTRAINT pedidos_pk PRIMARY KEY ( id_pedido );

ALTER TABLE pedidos
    ADD CONSTRAINT pedidos_clientes_fk FOREIGN KEY ( clientes_id_cliente )
        REFERENCES clientes ( id_cliente );
        
