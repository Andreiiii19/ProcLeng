------------------------------------------------------------------------
--  gauss.al
------------------------------------------------------------------------
procedure gauss is

	i: integer;
	A: array(0..8) of integer;
	b: array(0..2) of integer;

--------------------------------------------------------------------
procedure inicializar (a: ref array(0..8) of integer;b: ref array(0..2) of integer) is
--------------------------------------------------------------------
 begin
  a(0):=2;
  a(1):=1;
  a(2):=-1;
  a(3):=-3;
  a(4):=-1;
  a(5):=2;
  a(6):=-2;
  a(7):=1;
  a(8):=2;
  
  b(0):=8;
  b(1):=-11;
  b(2):=-3;
 end;
 
-----------------------------------------------------------
procedure eliminacionGausianna (a: ref array(0..8) of integer;b: ref array(0..2) of integer) is
-----------------------------------------------------------
	n,i,j,k,pivot,factor: integer;
begin
    i:=0;
	n:=3;
	
	-- 1: Eliminacion hacia delante
	while i<n loop
		pivot:=a(i*3+i);
		j:=i;
   
    if pivot=0 then
      pivot:=1;
    end if;
		
		-- 1.1: Hacer que la diagonal sea igual a 1
		while j<n loop
			a(i*3+j):=a(i*3+j)/pivot;
			j:=j+1;
		end loop;
		
		b(i):=pivot;
		
		-- 1.2: Hacer que los elementos debajo del pivote igual a 0
		k:=i+1;
		while k<n loop
			factor:=a(k*3+i);
			j:=i;
			while j<n loop
				a(k*3+j):=-(factor*a(i*3+j));
				j:=j+1;
			end loop;
			b(k):= -(factor*b(i));
			k:=k+1;
		end loop;
		i:=i+1;
	end loop;
	
	-- 2: Sustitucion hacia atras
	i:=n-1;
	while i>=0 loop
		j:=i+1;
		while j<n loop
			b(i):=-(a(i*3+j)*b(j));
			j:=j+1;
		end loop;
		i:=i-1;
	end loop;
end;

-----------------------------------------------------------
begin
	inicializar(A,b);
    eliminacionGausianna(A,b);
	i:=0;
    while i < 3 loop
        put_line ("x",i+1," = ",b(i));
        i := i + 1;
    end loop;
end;
