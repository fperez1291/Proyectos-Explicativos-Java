# Uso de *arrays*
Los _arrays_ se utilizan para almacenar múltiples valores en una sola variable, 
en lugar de declarar variables separadas para cada valor. Por ejemplo, si 
quisieramos almacenar las cuotas trimestrales de un club, en lugar de 
almacenarlas como sigue: 

```java
int trimestre1 = 50;
int trimestre2 = 100;
int trimestre3 = 100;
int trimestre4 = 50;
```

se pueden almacenar de la siguiente forma: 

```java
int[] trimestres = {50, 100, 100, 50};
```

lo que facilita enormemente la organización y optimización del código fuente. 

En resumen, se tratan de una colección ordenada de elementos del mismo tipo con 
un tamaño fijo que no puede modificarse tras su creación. 

## Declaración de *arrays*
Para declarar _arrays_ en Java, existen dos formas: 

- ```tipo[] nombre_vble = new tipo[tamaño];```
- ```tipo nombre_vble[] = new tipo[tamaño];```

Independientemente de la forma en que declare los _arrays_, tenemos que: 
- ```tipo``` puede ser un tipo primitivo (```int```, ```boolean```, ```char```, 
etc.) o el nombre de una clase (p.e., ```String```), en cuyo caso el *array* 
almacenará objetos de la clase especificada. 
- ```tamaño``` especifica el número de elementos que contendrá el *array*. 

También puede realizar la declaración del *array* por un lado y posteriormente 
inicializarlo como sigue: 

```
tipo[] nombre_vble;
nombre_vble = new tipo[tamaño];
```

**Recomendación:** use los corchetes detrás del tipo, no detrás de la variable. 

## Inicialización de _arrays_
Hay dos formas de inicializar un _array_: 

- Usando la palabra reservada ```new```, siguiendo la sintaxis previamente 
comentada. 

```java
int[] numeros = new int[5];

String cadenas[];
cadenas = new String[5];
```

- Con una lista de valores encerrada entre llaves ```{ }```. 

```java
boolean[] validez = {true, true, false, true, false};
```

## Acceso a los valores de un *array*
Para acceder a los valores de un _array_, primero debe tener en cuenta que en 
Java las posiciones se "numeran" empezando en 0. Por ejemplo, en un _array_ de 
tamaño 7, las posiciones del mismo irán desde 0 a 6 (tamaño - 1). Sintaxis: 

```
nombre_array[indice]
```

donde ```indice``` puede ser un número entero p una expresión que dé como 
resultado un número entero (incluso si es el valor de retorno de un método). 

```java
String cadenas[];
cadenas = new String[5];
        
cadenas[0] = "Hola,";
cadenas[1] = "estoy";
cadenas[2] = "programando";
cadenas[3] = "en";
cadenas[4] = "Java";
// cadenas[5] = "."; // lanzaría una excepción IndexOutOfBounds (fuera de rango)
```

Tenga en cuenta que se puede asignar un valor de mismo tipo directamente cuando 
se accede a una posición de un _array_ (```nombre_array[pos] = valor_mismo_tipo```), 
así como operar con el valor accedido (recuerde que el valor es del mismo tipo 
que el tipo especificado en su declaración, y nunca se tratará de otro tipo). 

```java
int[] numeros = new int[5];
// asignamos valores al array numeros, del 1 al 5
for (int i = 0; i < numeros.length; i++) {
    numeros[i] = i + 1;
}
// mostramos los valores almacenados en el array
System.out.print("Numeros: {");
for (int i = 0; i < numeros.length; i++) {
    System.out.printf("%d%s", numeros[i], i < numeros.length - 1 ? ", " : "}\n");
}
```

**Nota:** Para consultar cómo funciona el método ```printf()``` consulte los 
siguientes enlaces:
- [Método printf() - W3Schools](https://www.w3schools.com/java/ref_output_printf.asp)
- [Formato de Salida en Java con printf - Coders Free](https://codersfree.com/posts/formato-de-salida-en-java-con-printf)
- [Chat de Deepseek](https://chat.deepseek.com/share/hkatqtqzgafoblvkcz)

## Comentarios finales
Los elementos de un *array* se inicializan automáticamente de la siguiente forma: 
- Valor por defecto de los tipos numéricos: 0
- Valor por defecto de los _arrays_ de ```char```: '\u0000' (carácter nulo)
- Vaor por defecto de los tipos ```boolean```: ```false```
- Valor por defecto para los *arrays* de objetos (como ```String```): ```null```

Para más información, puede consultar el siguiente [chat de Deepseek](https://chat.deepseek.com/share/atqx1pubc2oq2ptrc4) 
y el siguiente [enlace](https://www.w3schools.com/java/java_arrays.asp) al sitio
web de [W3Schools](https://www.w3schools.com/). 
