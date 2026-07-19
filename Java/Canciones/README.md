Base de datos de la actividad[canciones_db.sql]

(https://github.com/user-attachments/files/29227485/canciones_db.sql)
CREATE DATABASE canciones_db;

USE canciones_db;

INSERT INTO canciones (titulo, artista, album, genero, idioma, fecha_creacion) VALUES 
('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', 'Inglés', NOW()),
('De Música Ligera', 'Soda Stereo', 'Canción Animal', 'Rock en Español', 'Español', NOW()),
('Blinding Lights', 'The Weeknd', 'After Hours', 'Pop', 'Inglés', NOW()),
('Garota de Ipanema', 'Antônio Carlos Jobim', 'The Girl from Ipanema', 'Jazz / Bossa Nova', 'Portugués', NOW());

SELECT * FROM canciones;
