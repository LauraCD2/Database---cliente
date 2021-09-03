UPDATE contenido
SET con_titulo = "Spotify"
WHERE con_id = 7;

UPDATE cliente
SET cli_email = "andre@outloook.com"
WHERE cli_tag LIKE "andre09";

DELETE FROM biblioteca 
WHERE bib_tag LIKE "holy" 
and bib_contenido = 1;

UPDATE distribuidora
SET dis_pais = "Estados Unidos"
WHERE dis_pais LIKE "USA";