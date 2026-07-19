# core_reserva_hotel

Se adjunta imagen de ERD

La relacion entre habitaciones y reservas es de 1 a muchas
La relacion entre clientes y reservas es de 1 a muchas

Claves Primarias (PK)
Tabla clientes: id_cliente
Tabla habitaciones: num_habitacion
Tabla reservas: id_reserva

Claves Foráneas (FK)
En la tabla reservas:
1- id_cliente (Conecta con la tabla clientes), es la que crea la relación de 1 a muchos entre Clientes y Reservas
2- num_habitacion (Conecta con la tabla habitaciones), es la que crea la relación de 1 a muchos entre Habitaciones y Reservas.

  
<img width="980" height="469" alt="Screen Shot 2026-06-13 at 16 56 57" src="https://github.com/user-attachments/assets/a0d02399-d077-4c73-94d8-87bc3e0675ff" />

<img width="548" height="723" alt="Screen Shot 2026-06-13 at 22 03 46" src="https://github.com/user-attachments/assets/000defe8-a0a5-465d-9f91-3ab07dd2800a" />

