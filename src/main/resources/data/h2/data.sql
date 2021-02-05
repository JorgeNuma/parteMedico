INSERT INTO SECUENCIAS VALUES ('REPORTE_SEQ', 1);	

INSERT INTO USUARIOS(DNI,NOMBRE,APELLIDO1,APELLIDO2,SEXO,FECHA_NACIMIENTO,ALTURA,OBSERVACIONES) VALUES ('11111111A','Luis','Jimenez','Ruiz','HOMBRE','1989-01-10',180,'Se encuentra estable');
INSERT INTO USUARIOS(DNI,NOMBRE,APELLIDO1,APELLIDO2,SEXO,FECHA_NACIMIENTO,ALTURA,OBSERVACIONES) VALUES ('22222222B','Maria','Cancho','Estepa','MUJER','1959-09-01',166,'Se encuentra estable');
INSERT INTO USUARIOS(DNI,NOMBRE,APELLIDO1,APELLIDO2,SEXO,FECHA_NACIMIENTO,ALTURA,OBSERVACIONES) VALUES ('33333333C','Encarna','Pulido','Romero','MUJER','1995-10-20',170,'Necesita revision');
INSERT INTO USUARIOS(DNI,NOMBRE,APELLIDO1,APELLIDO2,SEXO,FECHA_NACIMIENTO,ALTURA,OBSERVACIONES) VALUES ('44444444D','Antonio','Martin','Bermejo','HOMBRE','1975-11-14',179,'Necesita pastillas para la tension');
INSERT INTO USUARIOS(DNI,NOMBRE,APELLIDO1,APELLIDO2,SEXO,FECHA_NACIMIENTO,ALTURA,OBSERVACIONES) VALUES ('55555555E','Pepe','Robledo','Antunez','HOMBRE','1989-05-19',175,'Se dará de alta pronto');

INSERT INTO REPORTES (CODIGO,DNI_USUARIO,HORA_REPORTE,LONGITUD,LATITUD,SISTOLICA,DIASTOLICA,PESO,NUMERO_PASOS) VALUES (1,'22222222B',CURRENT_TIMESTAMP,'299901º','2992º',120,80,70.2,1976);
INSERT INTO REPORTES(CODIGO,DNI_USUARIO,HORA_REPORTE,LONGITUD,LATITUD,SISTOLICA,DIASTOLICA,PESO,NUMERO_PASOS) VALUES (2,'44444444D',CURRENT_TIMESTAMP,'2901º','295592º',110,100,80.2,500);