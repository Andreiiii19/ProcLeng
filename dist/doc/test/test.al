------------------------------------------------------------------------
--  3enraya.al
------------------------------------------------------------------------
procedure tres_en_raya is
	i,j: integer;
	c: character;
	tablero: array(-4..4) of integer;

--------------------------------------------------------------------
procedure inicializarTablero (t: ref array(-4..4) of integer) is
--------------------------------------------------------------------
	i,j: integer;
begin
	null;
end;

--------------------------------------------------------------------
procedure inicializarTablero2 () is
--------------------------------------------------------------------
	i,j: integer;
begin
	null;
end;

-----------------------------------------------------------
begin
		i:=tablero(-2);
		c:=int2char(i);
		c:=int2char(tablero(-1));
		get(i);
		get(c);
		get(inicializarTablero2);
end;
