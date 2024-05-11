------------------------------------------------------------------------
--  3enraya.al
------------------------------------------------------------------------
procedure tres_en_raya is
	i: integer;
 
function x(j: integer) return integer is

begin
  if j=1 then
    return 1;
  else
    return 2;
  end if;
end;

function xx(j: ref integer) return integer is

begin
  j:=1;
  return 0;
end;

function xxx return integer is

begin
  return 0;
end;
-----------------------------------------------------------
begin

	i:=x(i);
  i:=xx(i);
  i:=xxx;
end;


-- Falta cabezera procedimiento y cabecera funcion