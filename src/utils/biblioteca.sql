CREATE TABLE biblioteca(
	 bib_id INT NOT NULL AUTO_INCREMENT,
     bib_tag CHAR(40) NOT NULL,
     bib_contenido INT NOT NULL,
     bib_fecha DATETIME NULL,
     PRIMARY KEY(bib_id),
     FOREIGN KEY(bib_tag) REFERENCES cliente(cli_tag) ON DELETE CASCADE,
     FOREIGN KEY(bib_contenido) REFERENCES contenido(con_id)
);

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('hoodoo', 1, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('hoodoo', 7, "2020-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('hoodoo', 4, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('andre09', 4, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('holy', 4, "2018-12-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('holy', 5, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('holy', 1, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('holy', 6, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('jquispe', 9, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('jk2929', 7, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_tag, bib_contenido, bib_fecha)
VALUES ('cgallardo', 1, "2021-10-25 20:00:00");