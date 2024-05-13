------------------------------------------------------------------------
--  3enraya.al
------------------------------------------------------------------------
procedure tres_en_raya is

  i1: character;
  i2: array(0..0) of character;

procedure x1(j: ref character) is
begin
  j:='b';
end;

procedure x2(j: ref array(0..0) of character) is
begin
  j(0):='b';
end;

-----------------------------------------------------------
begin
  i1:='a';
  i2(0):='a';
  x1(i1);
  x2(i2);
  put_line(i1);
  put_line(i2(0));
end;