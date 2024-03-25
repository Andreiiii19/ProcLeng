AUTORES:
*************************************************************
-------------------------------------------------------------

- Andrei Dumbrava Luca NIP: 844417
- Saúl Caballero Luca NIP: 848431

-------------------------------------------------------------
*************************************************************

Compilador alike.jar (V1.0)
------------------------------
Análisis léxico y sintáctico


Invocar como:

-------------------------------------------------------------
java -jar alike.jar <fichero_fuente_clike>
-------------------------------------------------------------

Si se invoca sin parámetros, lee desde la entrada estándar.


Características generales:
Compilador del lenguaje alike, que es similar a Ada. Puede compilar 
cualquier programa escrito con la notación explicada en el fichero
de explicación del lenguaje. El compilador realiza un análisis léxico
y sintáctico del programa, y muestra los errores que encuentre en el 
código fuente. Si no encuentra errores, muestra un mensaje de éxito.
Para probar el programa se puede usar el fichero de prueba "test.sh", que
ejecuta el compilador con varios programas de prueba. ESte fichero incluye
la compilación de los ficheros del compilador con la herramienta ant.

Para invocar las pruebas, ejecutar el script "test.sh" con el comando:

-------------------------------------------------------------
./test.sh
-------------------------------------------------------------
