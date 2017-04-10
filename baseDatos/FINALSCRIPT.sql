--borrado de tablas
DROP
  TABLE AVISOS CASCADE CONSTRAINTS ;

DROP
  TABLE CENTROS CASCADE CONSTRAINTS ;

DROP
  TABLE CONDUCEN CASCADE CONSTRAINTS ;

DROP
  TABLE PARTES CASCADE CONSTRAINTS ;

DROP
  TABLE TRABAJADORES CASCADE CONSTRAINTS ;

DROP
  TABLE USUARIOS CASCADE CONSTRAINTS ;

DROP
  TABLE VEHICULOS CASCADE CONSTRAINTS ;

DROP
  TABLE VIAJES CASCADE CONSTRAINTS ;


 --creacion y restricción de tablas 
  CREATE
  TABLE AVISOS
  (
    ID        NUMBER (7) AVISOS_PK PRIMARY KEY,
    aviso     VARCHAR2 (1000) NOT NULL ,
    TRABAJADORES_ID NUMBER (7),
	FECHA_ID DATE
  ) ;
--ALTER TABLE AVISOS ADD CONSTRAINT AVISOS_PK PRIMARY KEY ( ID ) ;


CREATE
  TABLE CENTROS
  (
    ID           NUMBER (7) CONSTRAINT CENTROS_PK PRIMARY KEY,
    nombre       VARCHAR2 (50) NOT NULL ,
    calle        VARCHAR2 (200) NOT NULL ,
    numero       NUMBER (7) NOT NULL ,
    ciudad       VARCHAR2 (50) NOT NULL ,
    codigoPostal NUMBER (7) NOT NULL ,
    provincia    VARCHAR2 (50) NOT NULL ,
    telefono     NUMBER (15) NOT NULL
  ) ;
--ALTER TABLE CENTROS ADD CONSTRAINT CENTROS_PK PRIMARY KEY ( ID ) ;


CREATE
  TABLE CONDUCEN
  (
    TRABAJADORES_ID NUMBER (7) NOT NULL ,
    VEHICULOS_ID    NUMBER (7) NOT NULL ,
    fecha           DATE NOT NULL,
     CONSTRAINT CONDUCEN_PK PRIMARY KEY ( TRABAJADORES_ID, FECHA )     
  ) ;
--ALTER TABLE CONDUCEN ADD CONSTRAINT CONDUCEN_PK PRIMARY KEY ( TRABAJADORES_ID, VEHICULOS_ID ) ;

  CREATE
  TABLE PARTES
  (
   
  --  ID                NUMBER GENERATED AS IDENTITY,
    fecha             DATE DEFAULT SYSDATE ,
    kmInicial         NUMBER (7) DEFAULT 0 NOT NULL,
    kmFinal           NUMBER (7) DEFAULT 0 NOT NULL,
    gastosPeaje       NUMBER (7,2) DEFAULT 0, 
    gastosDietas      NUMBER (7,2) DEFAULT 0, 
    gastosCombustible NUMBER (7,2) DEFAULT 0,
    otrosGastos       NUMBER (7,2) DEFAULT 0,
    incidencias       VARCHAR2 (1000) ,
    estado            VARCHAR2 (7) DEFAULT 'ABIERTO' CONSTRAINT PRT_STD_CHK CHECK (estado IN('ABIERTO','CERRADO')),
    validado          VARCHAR2 (2) DEFAULT 'NO' CONSTRAINT PRT_VLD_CHK CHECK (validado IN('NO','SI')),
    TRABAJADORES_ID   NUMBER (7) NOT NULL,
   
    CONSTRAINT PARTES_PK PRIMARY KEY (TRABAJADORES_ID, fecha),
	CONSTRAINT PRT_KMF_CHK CHECK (kmFinal> kmInicial),
	CONSTRAINT PRT_KMI_CHK CHECK (kmInicial < kmFinal),
	CONSTRAINT PRT_KMII_CHK CHECK (kmInicial>=0),
	CONSTRAINT PRT_GSP_CHK CHECK (gastosPeaje>=0),
	CONSTRAINT PRT_GSC_CHK CHECK (gastosCombustible>=0),
	CONSTRAINT PRT_OTG_CHK CHECK (otrosGastos>=0)
	
  ) ;
--ALTER TABLE PARTES ADD CONSTRAINT PARTES_PK PRIMARY KEY ( ID ) ;


CREATE
  TABLE TRABAJADORES
  (
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
  ) ;
--ALTER TABLE TRABAJADORES ADD CONSTRAINT TRABAJADORES_PK PRIMARY KEY ( ID ) ;


CREATE
  TABLE USUARIOS
  (
    usuario         VARCHAR2 (25) CONSTRAINT USUARIOS_PK PRIMARY KEY ,
    password        VARCHAR2 (30) NOT NULL ,
    TRABAJADORES_ID NUMBER (7) NOT NULL
  ) ;
--ALTER TABLE USUARIOS ADD CONSTRAINT USUARIOS_PK PRIMARY KEY ( usuario ) ;


CREATE
  TABLE VEHICULOS
  (
    ID        NUMBER (7)VEHICULOS_PK PRIMARY KEY ,
    marca     VARCHAR2 (50) NOT NULL,
    modelo    VARCHAR2 (50) NOT NULL,
    matricula VARCHAR2 (15) NOT NULL
  ) ;
--ALTER TABLE VEHICULOS ADD CONSTRAINT VEHICULOS_PK PRIMARY KEY ( ID ) ;


CREATE
  TABLE VIAJES
  (
    ID          NUMBER (7),
    horaInicial NUMBER (4,2) DEFAULT 0 NOT NULL ,
    horaFinal   NUMBER (4,2) DEFAULT 0 NOT NULL,
    TRABAJADORES_ID  NUMBER (7) NOT NULL,
	 FECHA_ID DATE,
    
    CONSTRAINT VJS_HF_CHK CHECK (HORAFINAL > HORAINICIAL),
    CONSTRAINT VJS_HI_CHK CHECK (HORAINICIAL >= 0)
  ) ;
ALTER TABLE VIAJES ADD CONSTRAINT VIAJES_PK PRIMARY KEY ( ID, horaInicial) ;


ALTER TABLE AVISOS ADD CONSTRAINT AVISOS_PARTES_FK FOREIGN KEY ( TRABAJADORES_ID,FECHA_ID ) REFERENCES PARTES ( TRABAJADORES_ID,FECHA ) ;

ALTER TABLE CONDUCEN ADD CONSTRAINT CND_TID_FK FOREIGN KEY ( TRABAJADORES_ID ) REFERENCES TRABAJADORES ( ID ) ;

ALTER TABLE CONDUCEN ADD CONSTRAINT CND_VID_FK FOREIGN KEY ( VEHICULOS_ID ) REFERENCES VEHICULOS ( ID ) ;

ALTER TABLE PARTES ADD CONSTRAINT PARTES_TRABAJADORES_FK FOREIGN KEY (TRABAJADORES_ID ) REFERENCES TRABAJADORES ( ID ) ;

ALTER TABLE TRABAJADORES ADD CONSTRAINT TRABAJADORES_CENTROS_FK FOREIGN KEY (CENTROS_ID ) REFERENCES CENTROS ( ID ) ON DELETE SET NULL;

ALTER TABLE USUARIOS ADD CONSTRAINT USUARIOS_TRABAJADORES_FK FOREIGN KEY (TRABAJADORES_ID ) REFERENCES TRABAJADORES ( ID ) ON DELETE CASCADE ;

ALTER TABLE VIAJES ADD CONSTRAINT VIAJES_PARTES_FK FOREIGN KEY ( TRABAJADORES_ID, FECHA_ID ) REFERENCES PARTES ( TRABAJADORES_ID,FECHA ) ;