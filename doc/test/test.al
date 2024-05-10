------------------------------------------------------------------------
--  3enraya.al
------------------------------------------------------------------------
procedure tres_en_raya is
	i,j: integer;
	c: character;
	bool: integer;
	tablero: array(-4..4) of integer;

--------------------------------------------------------------------
procedure inicializarTablero (t: ref array(-4..4) of integer) is
--------------------------------------------------------------------
	i,j: integer;
begin
	null;
end;

--------------------------------------------------------------------
procedure inicializarTablero2 is
--------------------------------------------------------------------
	i,j, p: integer;
begin
	c:='p';
	get(bool);
	get(i);
	skip_line;
	null;
end;

-----------------------------------------------------------
begin
		i:=tablero(-2);
		c:=int2char(i);
		c:=int2char(tablero(-1));
		get(i, c);
		put_line("Hola me llamo "" Andrei ", int2char(237));
end;
