CREATE TABLE `distribuidora` (
  `dis_id` INT NOT NULL,
  `dis_nombre` CHAR(20) NOT NULL,
  `dis_pais` CHAR(40) NULL,
  PRIMARY KEY (`dis_id`));
  
  INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1234,'Enhance','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1235,'Electronic Arts','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1236,'Activision','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1237,'Rockstar Games','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1238,'Bethesda','USA');

INSERT INTO distribuidora (dis_id,dis_nombre,dis_pais) 
VALUES (1239,'Konami','Japón');
