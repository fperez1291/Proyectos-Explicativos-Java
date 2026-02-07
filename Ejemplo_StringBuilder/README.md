# Uso de [StringBuilder](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/StringBuilder.html)

## ¿Qué es StringBuilder?
La clase StringBuilder se corresponde con lo que llamamos "_constructor de cadenas 
de caracteres_". Se puede usar en lugar de la clase String en aquellos casos en 
los que deseamos construir un String para mostrar por pantalla (en la salida del 
programa) o bien para cuando se modificará frecuentemente una cadena de caracteres.

## StringBuilder vs String
A diferencia de los objetos de la clase String, que son **inmutables** (no se 
puede modificar el objeto sin asignarle un nuevo valor/referencia con el operador 
de asignación **=**), los objetos de la clase StringBuilder son **mutables**. 
Esto quiere decir que no necesitas asignarle un nuevo valor o crear otro objeto 
de la misma clase para asignárselo, sino que puedes operar y modificar la cadena 
almacenada en el interior del objeto de la clase StringBuilder solo utilizando 
sus métodos.

En resumen, StringBuilder es esencial para:
* Optimización de rendimiento en manipulaciones de texto
* Reducción de overhead de memoria
* Operaciones complejas de construcción de cadenas

**Regla práctica:** Usa StringBuilder cuando necesites más de 3-4 concatenaciones 
o modifiques texto en bucles.

En el siguiente [chat con Deepseek](https://chat.deepseek.com/share/g1mnb920ir4oiz2lrf)
encontrarás más información.

## Constructores de la clase StringBuilder

La clase StringBuilder cuenta con cuatro constructores, de los cuáles, actualmente, 
solo nos interesan tres. Estos constructores son: 

```java
/**
 * Constructor vacío: construye un objeto de la clase StringBuilder sin caracteres 
 * y con una capacidad inicial de 16 caracteres. <br>
 * [SINTAXIS] StringBuilder nameObject = new StringBuilder();
 */
StringBuilder str1 = new StringBuilder();

/**
 * Constructor con capacidad inicial: construye un StringBuilder sin caracteres 
 * y con una capacidad inicial especificada en el arguemnto capacidad. <br>
 * [SINTAXIS] StringBuilder nameObject = new StringBuilder(capacidad); <br> 
 * capacidad: puede ser o un literal de tipo int o el nombre de una variable de 
 * tipo int
 */
StringBuilder str2 = new StringBuilder(10);

int capacidad = 20;
StringBuilder str3 = new StringBuilder(capacidad);

/**
 * Constructor con String inicial: construye un StringBuilder inicializado con el 
 * contenido de la cadena pasada por parámetro. La capacidad inicial del 
 * StringBuilder es de 16 más la longitud de la cadena pasada por parámetro. <br>
 * [SINTAXIS] StringBuilder nombreObjeto = new StringBuilder(cadena); <br>
 * cadena: puede ser una cadena de texto entre comillas o el nombre de un objeto
 * de la clase String
 */
StringBuilder str4 = new StringBuilder("Hola Mundo");

String cadena = "Programacion en Java";
StringBuilder str5 = new StringBuilder(cadena);
```

## Métodos que debe conocer

