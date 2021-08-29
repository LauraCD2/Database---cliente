CREATE TABLE `aplicacion` (
  `app_id` INT NOT NULL,
  `app_tipo` CHAR(50) NOT NULL,
  PRIMARY KEY (`app_id`),
  CONSTRAINT `fk_table1_contenido1`
    FOREIGN KEY (`app_id`)
    REFERENCES `contenido` (`con_id`)
   );
   
INSERT INTO aplicacion(app_id, app_tipo) VALUES (444, 'Entretenimiento');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (333, 'Música');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (222, 'Entretenimiento');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (111, 'Música');