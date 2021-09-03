CREATE TABLE cliente(
	cli_tag CHAR(20) NOT NULL UNIQUE,
    cli_nombre CHAR(20) NOT NULL,
    cli_email CHAR(30) NOT NULL UNIQUE,
    cli_celular BIGINT NULL,
    cli_clave CHAR(20) NULL,
    cli_fecha_nto DATE NOT NULL,
    PRIMARY KEY(cli_tag)
);

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('hoodoo', 'Samary Cardona', 'samaryCardona@gmail.com', 3123198502, 'EstaEsMiClave', "2000-8-27");

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('andre09', 'Andrea Cardona', 'AndreaCardona@gmail.com', 3156192042, 'SoyLaMejor123', "2001-2-27");

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('holy', 'Carlos Alonso', 'HolyCarlos@gmail.com', 3166395323, 'HolyWaterBro', "1999-5-10");

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('jquispe', 'Julian Quispoe', 'QuispoeJulian@gmail.com', 3182243255, 'StressedOut', "1965-2-27");

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('cgallardo', 'Camilo Gallardo', 'CamiGalla2001@gmail.com', 3184293381, 'BestProgrammerEverXD', "2001-9-20");

INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) 
VALUES ('jk2929', 'Juana Camila', 'JuanitaCamilita@gmail.com', 3133426932, '0920Birth', "2000-9-20");