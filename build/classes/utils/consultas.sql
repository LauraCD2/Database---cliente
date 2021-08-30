Select 'Consulta 1';
 Select con_titulo 
 FROM contenido
 ORDER BY con_titulo desc;
 
 Select 'Consulta 2';
 Select con_titulo 
 FROM contenido c
 join juego j
 ON c.con_id = j.jug_id
 WHERE jug_clasificacion like "%+%";
 
 Select 'Consulta 3';
 Select con_titulo , jug_clasificacion , jug_categoria
 FROM contenido c
 join juego j
 ON c.con_id = j.jug_id
 WHERE jug_distribuidor = 1236;
 
 Select 'Consulta 4';
 Select con_titulo
 FROM biblioteca b
 join contenido c
 ON b.bib_contenido = c.con_id
 WHERE bib_tag like "hoodoo";
 
 Select 'Consulta 5';
  Select cli_nombre
 FROM biblioteca b 
 join cliente cl
 ON cl.cli_tag = b.bib_tag
  WHERE bib_contenido = 666
 ORDER BY cli_nombre asc;
 
 Select 'Consulta 6';
  Select COUNT(app_tipo)
 FROM contenido c
 join aplicacion a
 ON a.app_id = c.con_id
  WHERE app_tipo like "Música";
  
Select 'Consulta 7';
  Select cli_email
  FROM cliente
  WHERE cli_tag like "andre09";
 
 