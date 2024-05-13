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
Análisis semántico
Generación de código


Invocar como:

-------------------------------------------------------------
java -jar alike_4.jar <fichero_fuente_clike>
-------------------------------------------------------------

Si se invoca sin parámetros, lee desde la entrada estándar.


Características generales:
Compilador del lenguaje alike, que es similar a Ada. Puede compilar 
cualquier programa escrito con la notación explicada en el fichero
de explicación del lenguaje. El compilador realiza un análisis léxico,
sintáctico y semántico del programa, y para si encuentra algun error, 
mostrando porque ha sucedido ese error. 
Si no encuentra errores, muestra un mensaje de éxito.
Para probar el programa se puede usar el fichero de prueba "test.sh", que
ejecuta el compilador con varios programas de prueba. Este fichero incluye
la compilación de los ficheros del compilador con la herramienta ant.

Para invocar las pruebas, ejecutar el script "test.sh" con el comando:

-------------------------------------------------------------
./test.sh
-------------------------------------------------------------

Nivel 4: El lenguaje permite el uso de parámetros escalares y de vectores, tanto por
valor como por referencia en procedimientos y funciones.

Como se ha escogido el nivel 4 de complejidad, se han implementado todos los usos
que se pedían en el enunciado, por lo que el lenguaje no debería dar errores incorrectos en 
prácticamente nada, salvo por algún detalle que se pueda haber escapado. 

La organización del código es la siguiente:
    -carpeta traductor: contiene el archivo de alike usando javacc y denominado alike_4.jj
    -carpeta jcc_files: contiene los archivos .java generados por javacc
    -carpeta doc: contiene la documentación del proyecto, así como algunos ficheros de prueba realizados y este propio fichero
    -carpeta dist: contiene el archivo alike_4.jar, que es el ejecutable del compilador
    -carpeta build: contiene los archivos generados con la herramienta ant
    -carpeta lib: contiene las librerías necesarias para la ejecución del compilador.
                Dentro de esta carpeta hay algunas clases que se han utilizado para la implementación del compilador.
                -carpeta attributes: contiene la clase Attributes, que se utiliza para almacenar los atributos que se guardan cuando se encuentra una expresión, un identificador,...
                                    En attributes, se ha decidido guardar el tipo, si es constante o no, otro tipo por si es Array o Function, la clase de parámetro, una lista de más atributos, el nivel y su codigo.
                                    La lista de atributos es muy importante, pues se forma un arbol completo con todos los atributos que se encuentran en una expresión, o las dos partes de una asignación,...
                                    Además, se ha implementado un método para imprimir los atributos, que se ha utlizado para depurar el programa.
                -carpeta symbolTable: contiene la clase SymbolTable, que se utiliza para almacenar las variables y funciones que se encuentran en el programa, es decir, la tabla de simbolos.
                                    Además contiene la clase Symbol y sus especificaciones, que se utiliza para almacenar los atributos de las variables y funciones.
                -carpeta errores: contiene la clase ErrorSemantico, que se utiliza para lanzar el Error cuando hay uno y que se imprima el mensaje deseado por pantalla.
                -carpeta tools: contiene la clase SemanticFunctions, empleada para hacer el codigo de alike_4 más limpio, llamando a funciones creadas en esta clase.

Las clases más importantes creadas han sido Attributes y SemanticFunctions, pues la carpeta SymbolTable ya estaba implementada correctamente en la documentación proporcionada.

