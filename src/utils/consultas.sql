SELECT con_titulo as "Consulta 1" FROM contenido ORDER BY con_titulo DESC;

SELECT con_titulo, jug_clasificacion as "Consulta 2" 
FROM contenido C
JOIN juego J
ON C.con_id = J.jug_id WHERE jug_clasificacion LIKE "%+%";

SELECT con_titulo, jug_clasificacion, jug_categoria as "Consulta 3"
FROM contenido C
JOIN juego J
ON C.con_id = J.jug_id WHERE jug_distribuidor = 3;

SELECT con_titulo as "Consulta 4"
FROM biblioteca B
JOIN contenido c
ON B.bib_contenido = c.con_id
WHERE bib_tag LIKE "hoodoo"; 

SELECT cli_nombre
FROM cliente C
JOIN biblioteca B
ON C.cli_tag LIKE B.bib_tag 
WHERE bib_contenido = 4 ORDER BY cli_nombre ASC;

SELECT COUNT(app_tipo) as "Consulta 6"
FROM contenido C
JOIN aplicacion A
ON C.con_id = A.app_id 
WHERE app_tipo LIKE "Música";

SELECT cli_email FROM cliente WHERE cli_tag LIKE "andre09";

 SELECT User, Host FROM mysql.user; 