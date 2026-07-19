
-- CONSULTAS
-- Todos los clientes y sus respectivos pedidos
SELECT 
    c.id_cliente AS 'ID Cliente',
    c.nombre AS 'Nombre Cliente',
    c.telefono AS 'Teléfono',
    p.id_pedido AS 'N° Pedido',
    p.fecha_pedido AS 'Fecha Pedido',
    p.total AS 'Monto Total'
FROM clientes c
LEFT JOIN pedidos p ON c.id_cliente = p.clientes_id_cliente
ORDER BY c.id_cliente ASC, p.total DESC;

-- Todos los pedidos realizados por un cliente específico, utilizando su ID.
SELECT 
    c.id_cliente AS 'ID Cliente',
    c.nombre AS 'Nombre Cliente',
    p.id_pedido AS 'N° Pedido',
    p.fecha_pedido AS 'Fecha Pedido',
    p.total AS 'Monto Total'
FROM clientes c
INNER JOIN pedidos p ON c.id_cliente = p.clientes_id_cliente;


-- Todos los pedidos realizados por un cliente específico, utilizando su ID(cliente id =1).
SELECT 
    c.id_cliente AS 'ID Cliente',
    c.nombre AS 'Nombre Cliente',
    p.id_pedido AS 'N° Pedido',
    p.fecha_pedido AS 'Fecha Pedido',
    p.total AS 'Monto Total'
FROM clientes c
LEFT JOIN pedidos p ON c.id_cliente = p.clientes_id_cliente
WHERE c.id_cliente=1
ORDER BY p.fecha_pedido DESC;

-- Calcula el total de todos los pedidos para cada cliente

SELECT 
    c.id_cliente AS 'ID Cliente',
    c.nombre AS 'Nombre Cliente',
    SUM(p.total) AS 'Total Gastado'
FROM clientes c
INNER JOIN pedidos p ON c.id_cliente = p.clientes_id_cliente
GROUP BY c.id_cliente, c.nombre
ORDER BY  'Total Gastado' DESC;



-- Proyecta tres clientes que han realizado más pedidos, ordenados de forma descendente por el número de pedidos.
SELECT 
    c.id_cliente AS 'ID Cliente',
    c.nombre AS 'Nombre Cliente',
    COUNT(p.id_pedido) AS 'Cantidad de Pedidos'
FROM clientes c
INNER JOIN pedidos p ON c.id_cliente = p.clientes_id_cliente
GROUP BY c.id_cliente, c.nombre
ORDER BY COUNT(p.id_pedido) DESC
LIMIT 3;


-- Elimina un cliente de la tabla «clientes» y todos sus pedidos asociados de la tabla «pedidos».
-- Eliminamos primero el registro de la tabla hija 
DELETE FROM pedidos 
WHERE clientes_id_cliente = 1;
-- eliminamos registro tabla padre
DELETE FROM clientes
WHERE id_cliente = 1;

-- revisamos eliminacion del registro (id=1 
SELECT * FROM clientes;
SELECT * FROM pedidos;
