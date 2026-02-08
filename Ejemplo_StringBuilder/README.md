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
 * capacidad: puede ser o un literal de tipo int, el nombre de una variable de 
 * tipo int o el valor devuelto por un método (debe devolver un int)
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

Algunas recomendaciones de uso: 
1. Usar el contructor vacío: 
    - Cuando no se conoce el tamaño final de la cadena
    - Con cadenas de texto pequeñas (menos de 50 caracteres)
2. Usar el constructor que establoece la capacidad: 
    - Cuando se conoce el tamaño aproximado de la cadena. 
    - Con cadenas de texto grandes (más de 100 caracteres).
    - Cuando maximizar el rendimiento sea crítico. 
3. Usar el constructor que establece una cadena inicial:
    - Cuando ya se tiene el contenido base.
    - Cuando se va a modificar una cadena existente. 

## Métodos que debe conocer

1. **Método ```append()```:** agrega la información que recibe por parámetro al 
final de la cadena. Para saber tanto el n.º como el tipo de los argumentos que 
puede recibir el método, consulte la página dedicada a la clase StringBuilder 
en la API de Java, puesto que el método está sobrecargado (es decir, existen 
varias versiones del método que o bien reciben el mismo n.º de parámetros, 
pero de distinto tipo, o bien recibe un n.º distinto de parámetros).

```java
// Método append() -> puede recibir diferentes tipos de datos
str1.append("Hola Mundo");      // String
str1.append(123);               // int
str1.append(45.67);             // double
str1.append('!');               // char
str1.append(true);              // boolean
str1.append(new Object());      // Object (toString())
// Resultado: "Hola Mundo12345.67!truejava.lang.Object@..."
```
> Puede comprobar como la secuencia de código anterior funciona igual que si escribiese 
```str1.append("Hola Mundo").append(123).append(45.67).append('!').append(true).append(new Object());```. 

2. **Método ```lentgh()```:** devuelve el tamaño de la cadena contenida en el objeto
StringBuilder. 

```java
int size = str1.length();
```

3. **Método ```delete(posIni,posFin)```:** borra la subcadena que va desde 
```posIni``` hasta ```posFin - 1```. 

```java
str1.delete(0, str1.length()); // en este caso, borra la cadena entera
```

4. **Método ```insert(iniIndex,str)```:** Añade la cadena ```str``` en la posición 
```iniIndex```, desplazando el contenido de la cadena hacia la derecha tantas 
posiciones como caracteres tiene ```str```.

```java
str1.append("Java es genial");
str1.insert(0, "La ");                  // "La Java es genial"
str1.insert(2, " programacion en ");    // "La programacion en Java es genial"
str1.insert(str1.length(), "!");        // "La programacion en Java es genial!"
```

5. **Método ```replace(posIni,posFin,cadena)```:** sustituye la subcadena que va 
de ```posIni``` a ```posFin - 1``` por la secuencia de caracteres ```cadena```. 

```java
int capacidad = 20;
StringBuilder str3 = new StringBuilder(capacidad);

str3.append("Me gusta el cafe");
str3.replace(12, 16, "te");     // "Me gusta el te"
// en este caso, str3.replace(12, str3.length(), "te"); surtiría el mismo efecto
```

6. **Método ```charAt(indice)```:** devuelve el carácter que se ubicada en la 
posición ```indice```. 

```java
StringBuilder str4 = new StringBuilder("Hola Mundo");
char c = str4.charAt(7);     // 'n'
```

7. **Método ```indexOf(cadena)```:** analiza los caracteres de la cadena y 
encuentra el primer índice que coincide con el valor deseado (```cadena```).

```java
String cadena = "Programacion en Java";
StringBuilder str5 = new StringBuilder(cadena);

int[] indices = {0,0,0,0};

indices[0] = str5.indexOf("r");     // 1
indices[1] = str5.indexOf("n");     // 11
indices[2] = str5.indexOf(" ");     // 12
indices[3] = str5.indexOf("Java");  // 16
```

8. **Método ```reverse()```:** le da la vuelta a la cadena, es decir, si la 
cadena es ```StringBuilder str = new StringBuilder("Hola");```, al llamar a este
método (```str5.reverse()```), ```str5``` contendrá la cadena ```"aloH"```. 

```java
StringBuilder str4 = new StringBuilder("Hola Mundo");
str4.reverse();             // "odnuM laloH"
```

9. **Método ```subString(posIni,posFin)```:** devuelve la subcadena que va desde
```posIni``` hasta ```posFin - 1```. 

```java
int capacidad = 20;
StringBuilder str3 = new StringBuilder(capacidad);

str3.append("Me gusta el cafe");
String substr = str3.substring(3, 8);   // "gusta"
```

10. **Método ```setCharAt(index,caracter)```:** sustituye el carácter en la 
posición ```index``` por el carácter ```caracter```. 

```java
StringBuilder str2 = new StringBuilder(10);

str2.append("Java");
str2.setCharAt(0, 'Y');     // "Yava"
str2.setCharAt(2, 'y');     // "Yaya"
```

11. **Método ```deleteChar(index)```:** borra el caracter en la posición 
```index```.

```java
StringBuilder str2 = new StringBuilder(10);
str2.append("Java");

str2.deleteCharAt(2);       // "Yaa"
str2.deleteCharAt(2);       // "Ya"
```

12. **Método ```()```:** 

```java

```