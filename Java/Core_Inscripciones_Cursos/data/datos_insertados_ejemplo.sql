-- Insercion 6 estudiantes en tabla estudiantes

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (1,'Matias Jara', 22);

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (2,'Nicolas Armijo', 20);

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (3,'Tomas Perez', 21);

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (4,'Alonso Diaz', 19);

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (5,'Carlos Rojas', 22);

INSERT INTO  estudiantes (id_estudiante, nombre_estudiante, edad)
VALUES (6,'Patricio Olivas', 20);
-- Revision insercion correcta
SELECT * FROM estudiantes;

-- Insercion 4 cursos en tabla cursos (duracion = horas)

INSERT INTO cursos(id_curso, nombre_curso, duracion)
VALUES(1,'Algebra', 20);

INSERT INTO cursos(id_curso, nombre_curso, duracion)
VALUES(2,'Lectura', 40);

INSERT INTO cursos(id_curso, nombre_curso, duracion)
VALUES(3,'Laboratorio', 20);

INSERT INTO cursos(id_curso, nombre_curso, duracion)
VALUES(4,'Politica', 30);

-- Revision insercion correcta 
SELECT * FROM cursos;


-- Insercion en tabla inscripciones

-- ID ESTUDIANTE 2
INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(1,2,3);

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(2,2,4);

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(3,2,1);

-- ID ESTUDIANTE 1
INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(4,1,3);

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(5,1,4);

-- ID ESTUDIANTE 3
INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(6,3,2);

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(7,3,4);

-- ID ESTUDIANTE 4

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(9,4,3);

-- ID ESTUDIANTE 5

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(10,5,4);

INSERT INTO inscripciones(id_inscripcion, id_estudiante, id_curso)
VALUES(11, 5, 3);

-- Revisamos insercion tabla inscripciones
SELECT * FROM inscripciones;


