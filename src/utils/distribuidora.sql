CREATE TABLE distribuidora(
	dis_id INT NOT NULL,
    dis_nombre CHAR(20) NOT NULL,
    dis_pais CHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY(dis_id) 
);

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1,'Enhance','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (2,'Electronic Arts','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (3,'Activision','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (4,'Rockstar Games','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (5,'Bethesda','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (6,'Konami','Japón');