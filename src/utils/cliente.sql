CREATE TABLE `cliente` (
  `cli_tag` CHAR(20) NOT NULL,
  `cli_nombre` CHAR(20) NOT NULL,
  `cli_email` CHAR(30) NOT NULL,
  `cli_celular` BIGINT NULL,
  `cli_clave` CHAR(20) NULL,
  `cli_fecha_nto` DATE NOT NULL,
  PRIMARY KEY (`cli_tag`));
  #ALTER TABLE cliente CHANGE `cli_fecha_n to` cli_fecha_nto DATE NOT NULL;
INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "hoodoo" , "Samary Cardona" , "samarycardona@gmail.com" , 3243658734 , "qwerty" , "2000-10-25" );
 INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "andre09" , "Andrea Cardona" , "andre1234@gmail.com" , 39876543 , "asdfg" , "2000-08-25" );
 INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "holy" , "Carlos Alonso" , "carlos@gmail.com" , 39876541 , "asdfh" , "2002-08-25" );
 INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "jquispe" , "	Julian Quispoe" , "juli2@gmail.com" , 39886541 , "asdfa" , "1998-08-25" );
 INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "cgallardo" , "Camilo Gallardo" , "camilo12@gmail.com" , 31886541 , "asasd" , "2004-08-25" );
 INSERT  INTO  cliente  ( cli_tag , cli_nombre , cli_email , cli_celular , cli_clave , cli_fecha_nto ) 
 VALUES ( "jk2929" , "Juana Camila" , "juanita2@gmail.com" , 31883541 , "ajaus" , "2000-08-25" );
 