CREATE TABLE `biblioteca` (
  `bib_id` INT NOT NULL,
  `bib_tag` CHAR(40) NOT NULL,
  `bib_contenido` INT NOT NULL,
  `bib_fecha` DATETIME NOT NULL,
  PRIMARY KEY (`bib_id`),
  INDEX `fk_biblioteca_contenido_idx` (`bib_tag` ASC) VISIBLE,
  INDEX `fk_biblioteca_cliente1_idx` (`bib_contenido` ASC) VISIBLE,
  CONSTRAINT `fk_biblioteca_contenido`
    FOREIGN KEY (`bib_tag`)
    REFERENCES `cliente` (`cli_tag`)
,
  CONSTRAINT `fk_biblioteca_cliente1`
    FOREIGN KEY (`bib_contenido`)
    REFERENCES `contenido` (`con_id`)
);

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (1,'hoodoo', 999, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (2,'hoodoo', 333, "2020-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (3,'hoodoo', 666, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (4,'andre09', 666, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (5,'holy', 666, "2018-12-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (6,'holy', 555, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (7,'holy', 999, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (8,'holy', 444, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (9,'jquispe', 111, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (10,'jk2929', 333, "2018-10-25 20:00:00");

INSERT INTO biblioteca(bib_id, bib_tag, bib_contenido, bib_fecha)
VALUES (11,'cgallardo', 999, "2021-10-25 20:00:00");
