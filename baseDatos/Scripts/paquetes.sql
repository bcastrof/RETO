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



create or replace PACKAGE CONSULTACENTROS
AS 
PROCEDURE CENTROS (C OUT SYS_REFCURSOR);
PROCEDURE CENTRO (parametro varchar2);
END CONSULTACENTROS;

create or replace PACKAGE BODY CONSULTACENTROS AS 
 PROCEDURE CENTROS(C OUT SYS_REFCURSOR) 
 AS
 BEGIN 
  open c for
SELECT ID, NOMBRE,  Calle, Numero, Ciudad, CodigoPostal, Provincia, TELEFONO FROM CENTROS;
  END CENTROS;
PROCEDURE CENTRO (buscar varchar2)
AS
IDO CENTROS.ID%TYPE;
NOM CENTROS.NOMBRE%TYPE;
CAL CENTROS.CALLE%TYPE;
NUMO CENTROS.NUMERO%TYPE;
CIU CENTROS.CIUDAD%TYPE;
CPO CENTROS.CODIGOPOSTAL%TYPE;
PRO CENTROS.PROVINCIA%TYPE;
TLF CENTROS.TELEFONO%TYPE;
 BEGIN 
 SELECT ID, NOMBRE,  Calle, Numero, Ciudad, CodigoPostal, Provincia, TELEFONO 
 INTO IDO, NOM, CAL, NUMO, CIU, CPO, PRO, TLF
 FROM CENTROS WHERE ID=parametro;
 DBMS_OUTPUT.PUT_LINE('SE HAN MODIFICADO '||NOM|| ' FILAS');
END CENTRO;
END CONSULTACENTROS;

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


create or replace procedure LISTADOEMPLEADOS
(IDN VARCHAR2)
AS
CURSOR C1 IS
SELECT *
FROM TRABAJADORES WHERE CENTROS_ID=IDN;
BEGIN
FOR REG IN C1
LOOP
DBMS_OUTPUT.PUT_LINE(REG.NOMBRE);
END LOOP;
END LISTADOEMPLEADOS;