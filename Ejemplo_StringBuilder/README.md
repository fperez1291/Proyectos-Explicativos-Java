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

