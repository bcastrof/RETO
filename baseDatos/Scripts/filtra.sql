create or replace PROCEDURE PRUEBA
(NAME IN CENTROS.NOMBRE%TYPE, C OUT SYS_REFCURSOR)
AS 
BEGIN
 open c for
SELECT ID, NOMBRE, CALLE, NUMERO, CIUDAD, CODIGOPOSTAL, PROVINCIA, TELEFONO 
FROM centros 
WHERE UPPER(NOMBRE)=NAME OR LOWER(NOMBRE)=NAME
order by ID ;
EXCEPTION 
    WHEN NO_DATA_FOUND THEN 
      RAISE_APPLICATION_ERROR(-20004,'No se ha encontrado el centro');
    WHEN TOO_MANY_ROWS THEN 
      RAISE_APPLICATION_ERROR(-20002,'Ha ocurrido un error'); 
    WHEN OTHERS THEN 
      RAISE_APPLICATION_ERROR(-20002,'Ha ocurrido un error'); 
END PRUEBA;