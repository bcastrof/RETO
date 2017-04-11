--visualizacion de todos los centros paquetes
create or replace PACKAGE CONSULTACENTROS
AS 
PROCEDURE CENTROS (C OUT SYS_REFCURSOR);
END CONSULTACENTROS;

create or replace PACKAGE BODY CONSULTACENTROS AS 
 PROCEDURE CENTROS(C OUT SYS_REFCURSOR) AS
 BEGIN 
  open c for
SELECT ID, NOMBRE,  Calle, Numero, Ciudad, CodigoPostal, Provincia, TELEFONO FROM CENTROS;
 END CENTROS;
END CONSULTACENTROS;


--visualizacion de todos los centros y de un centro en concreto
DROP PACKAGE COMPLEJOS;

create or replace PACKAGE COMPLEJOS
AS 
PROCEDURE CONSULTACENTROS (C OUT SYS_REFCURSOR);
PROCEDURE CONSULTACENTRO (C OUT SYS_REFCURSOR, buscar IN varchar2);
END COMPLEJOS;

create or replace PACKAGE BODY COMPLEJOS AS 
 PROCEDURE CONSULTACENTROS(C OUT SYS_REFCURSOR) 
 AS
 BEGIN 
  open c for
SELECT ID, NOMBRE,  Calle, Numero, Ciudad, CodigoPostal, Provincia, TELEFONO FROM CENTROS;
   close c;
  END CONSULTACENTROS;

  PROCEDURE CONSULTACENTRO (C OUT SYS_REFCURSOR, buscar IN varchar2)
AS
 BEGIN 
open c for
SELECT ID, NOMBRE,  Calle, Numero, Ciudad, CodigoPostal, Provincia, TELEFONO FROM CENTROS;
CLOSE c;
END CONSULTACENTRO;
END COMPLEJOS;

--visualizacion de empleados procedimentos

    ID              NUMBER (7)  CONSTRAINT TRABAJADORES_PK PRIMARY KEY ,
    dni             VARCHAR2 (9) NOT NULL ,
    nombre          VARCHAR2 (50) NOT NULL ,
    primerApellido  VARCHAR2 (20) NOT NULL ,
    segundoApellido VARCHAR2 (20) ,
    categoria       VARCHAR2 (25) NOT NULL ,
    calle           VARCHAR2 (200) NOT NULL ,
    numero          NUMBER (4) NOT NULL ,
    piso            NUMBER (2) ,
    mano            VARCHAR2 (20) ,
    ciudad          VARCHAR2 (50) NOT NULL ,
    codigoPostal    NUMBER (5) NOT NULL ,
    provincia       VARCHAR2 (50) NOT NULL ,
    movilEmpresa    NUMBER (15) NOT NULL ,
    movilPersonal   NUMBER (15) ,
    salario         NUMBER (9,2) ,
    fechaNacimiento DATE ,
    CENTROS_ID      NUMBER (7) NOT NULL

DROP PROCEDURE LISTADOEMPLEADOS;	
	
create or replace procedure LISTADOEMPLEADOS
(IDN in VARCHAR2, C OUT SYS_REFCURSOR)
AS
BEGIN
OPEN C FOR
SELECT * FROM TRABAJADORES WHERE CENTROS_ID=IDN;
CLOSE C;
END LISTADOEMPLEADOS;

DROP PROCEDURE EMPLEADO;

CREATE OR REPLACE PROCEDURE EMPLEADO
(IDN IN VARCHAR 2, C OUT SYS_REFCURSOR)
AS 
BEGIN
OPEN C FOR
SELECT * FROM TRABAJADORES WHERE ID=IDN;
CLOSE C;
END EMPLEADO;