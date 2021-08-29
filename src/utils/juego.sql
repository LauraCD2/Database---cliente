CREATE TABLE `juego` (
  `jug_id` INT NOT NULL,
  `jug_clasificacion` CHAR(45) NOT NULL,
  `jug_categoria` CHAR(45) NULL,
  `jug_distribuidor` INT NOT NULL,
  PRIMARY KEY (`jug_id`),
  INDEX `fk_juego_distribuidora1_idx` (`jug_distribuidor` ASC) VISIBLE,
  CONSTRAINT `fk_table1_contenido2`
    FOREIGN KEY (`jug_id`)
    REFERENCES `contenido` (`con_id`)
,
  CONSTRAINT `fk_juego_distribuidora1`
    FOREIGN KEY (`jug_distribuidor`)
    REFERENCES `distribuidora` (`dis_id`)
    );
    
    INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(999, 1234, 'Todos', 'Puzles y curiosidades');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(888, 1235, 'Todos', 'Deportes');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(777, 1236, 'Todos +10', 'Carreras y vuelo');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(666, 1236, 'Todos +10', 'Acción y aventura');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(555, 1237, 'Maduro 17+', 'Acción y aventura');