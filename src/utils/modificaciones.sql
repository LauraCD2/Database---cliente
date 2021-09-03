update contenido
SET con_titulo="Spotify"
WHERE con_id=333;
 
UPDATE cliente
SET cli_email="andre@outloook.com"
WHERE cli_tag like "andre09";

DELETE FROM biblioteca
WHERE bib_tag like "holy" AND  bib_contenido=999;

UPDATE distribuidora
SET dis_pais="Estados Unidos"
WHERE dis_pais like "USA";
