------------------------------------------------------------------------
--  3enraya.al
------------------------------------------------------------------------
procedure tres_en_raya is
	i: array(-2..2) of integer;
  ii: integer;
  
procedure x(j: array(-2..2) of integer) is

begin
  null;
end;

function xxx(j: integer) return integer is

begin
  return j+1;
end;
-----------------------------------------------------------
begin
  i(-1):=1;
  i(ii):=xxx(3);
  x(i);
end;