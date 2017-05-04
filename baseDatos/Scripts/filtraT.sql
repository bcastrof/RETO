create or replace PROCEDURE ifTrabajadorid
(idi in TRABAJADORES.ID%type,
ido out TRABAJADORES.ID%type,
do out TRABAJADORES.DNI%type,
nou out TRABAJADORES.NOMBRE%type,
pa out TRABAJADORES.PRIMERAPELLIDO%type,
sa out TRABAJADORES.SEGUNDOAPELLIDO%type,
ca out TRABAJADORES.CATEGORIA%type,
cal out TRABAJADORES.CALLE%type,
nu out TRABAJADORES.NUMERO%type,
pi out TRABAJADORES.PISO%type,
ma out TRABAJADORES.MANO%type,
ci out TRABAJADORES.CIUDAD%type,
co out TRABAJADORES.CODIGOPOSTAL%type,
pro out TRABAJADORES.PROVINCIA%type,
mve out TRABAJADORES.MOVILEMPRESA%TYPE,
mvp out TRABAJADORES.MOVILPERSONAL%type,
sal out TRABAJADORES.SALARIO%type,
fe out TRABAJADORES.FECHANACIMIENTO%type,
cei out TRABAJADORES.CENTROS_ID%type
)
as
begin

select id, dni, nombre, PRIMERAPELLIDO, SEGUNDOAPELLIDO, CATEGORIA,
calle, numero, piso, mano, ciudad, CODIGOPOSTAL, PROVINCIA, MOVILEMPRESA,
MOVILPERSONAL, SALARIO, FECHANACIMIENTO, CENTROS_ID 
into ido, do ,nou, pa, sa, ca, cal, nu, pi, ma, ci, co, pro, mve, mvp, sal, fe, cei 
from trabajadores
where ID=idi;

end ifTrabajadorid;

create or replace PROCEDURE ifTrabajador 
(doc in TRABAJADORES.DNI%type,
ido out TRABAJADORES.ID%type,
do out TRABAJADORES.DNI%type,
nou out TRABAJADORES.NOMBRE%type,
pa out TRABAJADORES.PRIMERAPELLIDO%type,
sa out TRABAJADORES.SEGUNDOAPELLIDO%type,
ca out TRABAJADORES.CATEGORIA%type,
cal out TRABAJADORES.CALLE%type,
nu out TRABAJADORES.NUMERO%type,
pi out TRABAJADORES.PISO%type,
ma out TRABAJADORES.MANO%type,
ci out TRABAJADORES.CIUDAD%type,
co out TRABAJADORES.CODIGOPOSTAL%type,
pro out TRABAJADORES.PROVINCIA%type,
mve out TRABAJADORES.MOVILEMPRESA%TYPE,
mvp out TRABAJADORES.MOVILPERSONAL%type,
sal out TRABAJADORES.SALARIO%type,
fe out TRABAJADORES.FECHANACIMIENTO%type,
cei out TRABAJADORES.CENTROS_ID%type
)
as
begin

select id, dni, nombre, PRIMERAPELLIDO, SEGUNDOAPELLIDO, CATEGORIA,
calle, numero, piso, mano, ciudad, CODIGOPOSTAL, PROVINCIA, MOVILEMPRESA,
MOVILPERSONAL, SALARIO, FECHANACIMIENTO, CENTROS_ID 
into ido, do ,nou, pa, sa, ca, cal, nu, pi, ma, ci, co, pro, mve, mvp, sal, fe, cei 
from trabajadores
where DNI=doc;

end ifTrabajador;


create or replace procedure centrosFi
(idu in CENTROS.ID%type,
ido out CENTROS.ID%type,
nom out CENTROS.NOMBRE%type,
cal out CENTROS.CALLE%type,
nu out CENTROS.NUMERO%type,
ci out CENTROS.CIUDAD%type,
co out CENTROS.CODIGOPOSTAL%type,
pro out CENTROS.PROVINCIA%type,
tel out CENTROS.TELEFONO%type
)
as
begin

select id, nombre, calle, numero, ciudad, codigoPostal, provincia, telefono into ido, nom, cal, nu, ci, co, pro, tel
from centros 
where id = idu;

end centrosFi;