# Uso de *arrays*
Los arrays se utilizan para almacenar múltiples valores en una sola variable, 
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

## Declaración de arrays

Para declarar arrays en Java, existen dos formas: 

- ```tipo[] nombre_vble = new tipo[tamaño];```
- ```tipo nombre_vble[] = new tipo[tamaño];```

Independientemente de la forma en que declare los arrays, tenemos que: 
- ```tipo``` puede ser un tipo primitivo (```int```, ```boolean```, ```char```, 
etc.) o el nombre de una clase (p.e., ```String```), en cuyo caso el array 
almacenará objetos de la clase especificada. 
- ```tamaño``` especifica el número de elementos que contendrá el array. 

También puede realizar la declaración del array por un lado y posteriormente 
inicializarlo como sigue: 

```
tipo[] nombre_vble;
nombre_vble = new tipo[tamaño];
```

## 

Para más información, puede consultar el siguiente [chat de Deepseek](https://chat.deepseek.com/share/atqx1pubc2oq2ptrc4) 
y el siguiente [enlace](https://www.w3schools.com/java/java_arrays.asp) al sitio
web de [W3Schools](https://www.w3schools.com/). 