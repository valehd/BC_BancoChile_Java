-- CONSULTAS
-- Proyecta a todos los estudiantes y sus respectivos cursos.

SELECT 
e.id_estudiante,
e.nombre_estudiante,
c.nombre_curso,
c.duracion
FROM estudiantes e
INNER JOIN inscripciones i ON e.id_estudiante=i.id_estudiante
INNER JOIN cursos c ON i.id_curso=c.id_curso
ORDER BY nombre_estudiante ASC;


-- Proyecta todos los estudiantes que están inscritos en un curso específico, utilizando el nombre del curso como criterio de búsqueda.
SELECT 
e.id_estudiante,
e.nombre_estudiante,
c.nombre_curso
FROM estudiantes e
INNER JOIN inscripciones i ON e.id_estudiante=i.id_estudiante
INNER JOIN cursos c ON i.id_curso=c.id_curso
WHERE c.nombre_curso = 'Politica';


-- Proyecta todos los cursos en los que está inscrito un estudiante específico, utilizando su nombre como criterio de búsqueda.
SELECT 
e.id_estudiante,
e.nombre_estudiante,
c.nombre_curso
FROM cursos c
INNER JOIN inscripciones i ON c.id_curso=i.id_curso
INNER JOIN estudiantes e ON i.id_estudiante=e.id_estudiante
WHERE e.nombre_estudiante = 'Matias jara';


-- Cuenta el número de estudiantes inscritos en cada curso y muestra el nombre del curso junto con el número de estudiantes inscritos.


SELECT 
c.nombre_curso,
COUNT(i.id_estudiante) AS estudiantes_inscritos
FROM cursos c
LEFT JOIN inscripciones i ON c.id_curso = i.id_curso
GROUP BY c.id_curso, c.nombre_curso;

-- Encuentra los estudiantes que no están inscritos en ningún curso.

SELECT 
e.id_estudiante,
e.nombre_estudiante
FROM estudiantes e
LEFT JOIN inscripciones i ON e.id_estudiante = i.id_estudiante
WHERE i.id_estudiante IS NULL;
