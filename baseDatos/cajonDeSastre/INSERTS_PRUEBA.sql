
  
 INSERT INTO CENTROS VALUES ('prueba1','prueba1',1,'prueba1',1,'prueba1',1);
    INSERT INTO CENTROS VALUES ('prueba2','prueba2',2,'prueba2',2,'prueba2',2);
	  INSERT INTO CENTROS VALUES ('prueba3','prueba3',3,'prueba3',3,'prueba3',3);
	    INSERT INTO CENTROS VALUES ('prueba4','prueba4',4,'prueba4',4,'prueba1',4);
		  INSERT INTO CENTROS VALUES ('prueba5','prueba5',5,'prueba5',5,'prueba5',5);

	
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000a','trabajador1','trabajador1','logistica','prueba1',1,'prueba1',1,'prueba1',1,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000b','trabajador2','trabajador2','logistica','prueba2',2,'prueba2',2,'prueba2',2,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000c','trabajador3','trabajador3','logistica','prueba3',3,'prueba3',3,'prueba3',3,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000d','trabajador4','trabajador4','logistica','prueba4',4,'prueba4',4,'prueba4',4,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000e','trabajador5','trabajador5','logistica','prueba5',5,'prueba5',5,'prueba5',5,1);
	
	
	
	insert into vehiculos values ('prueba1','prueba1',1);
	insert into vehiculos values ('prueba2','prueba2',2);
	insert into vehiculos values ('prueba3','prueba3',3);
	insert into vehiculos values ('prueba4','prueba4',4);
	insert into vehiculos values ('prueba5','prueba5',5);
	
	INSERT INTO CENTROS VALUES ('prueba1','prueba1',1,'prueba1',1,'prueba1',1);
    INSERT INTO CENTROS VALUES ('prueba2','prueba2',2,'prueba2',2,'prueba2',2);
	  INSERT INTO CENTROS VALUES ('prueba3','prueba3',3,'prueba3',3,'prueba3',3);
	    INSERT INTO CENTROS VALUES ('prueba4','prueba4',4,'prueba4',4,'prueba1',4);
		  INSERT INTO CENTROS VALUES ('prueba5','prueba5',5,'prueba5',5,'prueba5',5);

	
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000a','trabajador1','trabajador1','logistica','prueba1',1,'prueba1',1,'prueba1',1,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000b','trabajador2','trabajador2','logistica','prueba2',2,'prueba2',2,'prueba2',2,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000c','trabajador3','trabajador3','logistica','prueba3',3,'prueba3',3,'prueba3',3,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000d','trabajador4','trabajador4','logistica','prueba4',4,'prueba4',4,'prueba4',4,1);
	INSERT INTO TRABAJADORES (ID,dni,nombre,primerApellido,categoria,calle,numero,ciudad,codigoPostal,provincia,movilEmpresa,CENTROS_ID) values
	('00000000e','trabajador5','trabajador5','logistica','prueba5',5,'prueba5',5,'prueba5',5,1);
	
	
	
	insert into vehiculos values ('prueba1','prueba1',1);
	insert into vehiculos values ('prueba2','prueba2',2);
	insert into vehiculos values ('prueba3','prueba3',3);
	insert into vehiculos values ('prueba4','prueba4',4);
	insert into vehiculos values ('prueba5','prueba5',5);
	

	
	CREATE OR REPLACE PROCEDURE seleccionarTrabajadores (c OUT SYS_REFCURSOR)
IS 
BEGIN
 open c for
SELECT ID, DNI, Nombre, PrimerApellido, SegundoApellido, Categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, CENTROS_IDCent FROM TRABAJADORES;
 
END; 

CREATE OR REPLACE PACKAGE CONSULTACENTROS
AS 
PROCEDURE CENTROS (C OUT SYS_REFCURSOR);
END CONSULTACENTROS;

CREATE OR REPLACE PACKAGE BODY CONSULTACENTROS AS 
 PROCEDURE CENTROS(C OUT SYS_REFCURSOR) AS
 BEGIN 
  open c for
SELECT ID, DNI, Nombre, PrimerApellido, SegundoApellido, Categoria, Calle, Numero, Piso, Mano, Ciudad, CodigoPostal, Provincia, MovilEmpresa, MovilPersonal, Salario, FechaNacimiento, CENTROS_IDCent FROM TRABAJADORES;
 END CENTROS;
END CONSULTACENTROS;