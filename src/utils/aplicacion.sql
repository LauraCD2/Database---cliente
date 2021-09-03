CREATE TABLE aplicacion(
	app_id INT NOT NULL,
    app_tipo CHAR(50) NOT NULL,
    PRIMARY KEY(app_id),
    FOREIGN KEY(app_id) REFERENCES contenido(con_id)
);

INSERT INTO aplicacion(app_id, app_tipo) VALUES (6, 'Entretenimiento');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (7, 'Música');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (8, 'Entretenimiento');

INSERT INTO aplicacion(app_id, app_tipo) VALUES (9, 'Música');