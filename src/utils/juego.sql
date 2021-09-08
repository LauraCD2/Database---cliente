CREATE TABLE juego(
	jug_id INT NOT NULL,
    jug_distribuidor INT NOT NULL,
    jug_clasificacion CHAR(45) NOT NULL,
    jug_categoria CHAR(45) NULL,
    PRIMARY KEY(jug_id),
    FOREIGN KEY(jug_id) REFERENCES contenido(con_id), 
    FOREIGN KEY(jug_distribuidor) REFERENCES distribuidora(dis_id)
);

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(1, 1, 'Todos', 'Puzles y curiosidades');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(2, 2, 'Todos', 'Deportes');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(3, 3, 'Todos +10', 'Carreras y vuelo');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(4, 3, 'Todos +10', 'Acción y aventura');

INSERT INTO juego(jug_id, jug_distribuidor, jug_clasificacion,  jug_categoria)
VALUES(5, 4, 'Maduro 17+', 'Acción y aventura');