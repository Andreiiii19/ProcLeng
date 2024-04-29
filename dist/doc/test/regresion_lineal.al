------------------------------------------------------------------------
--  regresion_lineal.al
------------------------------------------------------------------------
procedure regresion_lineal is

	pendiente,interseccion: integer;
	puntosX: array(0..9) of integer;
	puntosY: array(0..9) of integer;

--------------------------------------------------------------------
procedure pedirPuntos (pX: ref array(0..9) of integer;pY: ref array(0..9) of integer) is
--------------------------------------------------------------------
	i,aux: integer;
begin
	i:=0;
	while i < 10 loop
		put_line("Punto ",i+1);
	
		put ("Escribe un la coordenada x: ");
		get (aux);
		pX(i):=aux;
		
		put ("Escribe un la coordenada y: ");
		get (aux);
		pY(i):=aux;
		
		i:=i+1;
	end loop;
end;

--------------------------------------------------------------------
function calcularPendiente (pX: ref array(0..9) of integer;pY: ref array(0..9) of integer) return integer is
--------------------------------------------------------------------
	i,sumaX,sumaY,sumaXY,sumaX2:integer;
begin
	sumaX:=0;
	sumaY:=0;
	sumaXY:=0;
	sumaX2:=0;
	i:=0;
	
	while i<10 loop
		sumaX:=sumaX+pX(i);
		sumaY:=sumaY+pY(i);
		sumaXY:=sumaXY+pX(i)*pY(i);
		sumaX2:=sumaX2+pX(i)*pX(i);
		
		i:=i+1;
	end loop;
	
	return (sumaXY-(sumaX*sumaY)/10)/(sumaX2-(sumaX*sumaX)/10);
end;

--------------------------------------------------------------------
function calcularInterseccion (pX: ref array(0..9) of integer;pY: ref array(0..9) of integer;m: integer) return integer is
--------------------------------------------------------------------
	i,sumaX,sumaY:integer;
begin
	sumaX:=0;
	sumaY:=0;
	i:=0;
	
	while i<10 loop
		sumaX:=sumaX+pX(i);
		sumaY:=sumaY+pY(i);
		
		i:=i+1;
	end loop;
	
	return (sumaY/10)-m*(sumaX/10);
end;

-----------------------------------------------------------
begin
	pedirPuntos(puntosX,puntosY);
	
	pendiente := calcularPendiente(puntosX,puntosY);
	interseccion := calcularInterseccion(puntosX,puntosY,pendiente);

	put_line("La ecuacion de regresion lineal es: y = ",pendiente,"x + ",interseccion);
end;
