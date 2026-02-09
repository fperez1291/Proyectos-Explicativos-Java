# Introducción a la Programación Orientada a Objetos
Llamamos **Programación Orienta a Objetos** a un paradigma de programación que
nos permite crear programas modelando el mundo mediante la creación y uso de 
objetos. 

> La **Programación Orientada a Objetos** es un paradigma o una forma de 
implementar el código organizando el código en _clases_ instanciables. Esas 
_instancias_ u _objetos_ representan entidades del mundo real. 

## Conceptos de *clase* y *objeto*
Tenemos dos conceptos muy básicos en este paradigma, que son _clase_ y _objeto_. 
Es fácil que al principio no relacionemos directamente estos conceptos con un 
lenguaje en específico, pero no son dos conceptos difíciles de entender. 

Una **clase** es una abstracción de una categoría de objetos, es decir, sirve 
para describir de forma abstracta los objetos de un tipo determinado. Normalmente,
este concepto se entiende bien con la analogía de _plantilla_ o _molde_ a partir 
del cual se crean los objetos. 

Por otra parte, un **objeto** o **instancia** se crea a partir de una clase, y 
representa un caso individual de la clase. 

Para ejemplificar esto mejor, pensemos en un coche. Cuando pensamos en un coche, 
pensamos en un vehículo de 4 ruedas similar a la siguiente imagen: 

<div align="center">
    <img src="./img/coche.jpg" align="center" style="width:50%">
</div>

Sin embargo, los coches pueden ser de distinta marca, de distinto modleo, tener
colores distintos, etc. Si tratamos de modelar todos los coches del mundo, 
podemos llegar a diferentes conclusiones sobre las características de un coche. 
En este ejemplo nos centraremos en el ejemplo generado por Deepseek en el 
siguiente [chat](https://chat.deepseek.com/share/3or81u783zrml45w3n). 

Seguiremos hablando de este ejemplo relacionandolo con diferentes contextos a lo
largo de este documento, pero por ahora quisiera mostrar cómo se especifican las
clases en Java y cómo se crean los objetos. 

Por un lado, la sintaxis que deben seguir nuestras clases es la siguiente: 

```java
public class NombreClase {
    // contenido de la clase NombreClase
}
```

Cabe destacar que: 
- ```public``` es uana palabra reservada. Es uno de los modificadores de 
visibilidad existentes en Java e indica que la clase es pública, es decir, es
visible por todas las clases del proyecto. 
- ```class``` es una palabra reservada que inidica que se está especificando / 
creando una clase. 
- ```NombreClase``` es el nombre que el programador especifica para la clase. 
Esta debe empezar siempre por mayúscula. 

Un ejemplo más claro sería el de la clase Coche, la cuál especificaríamos de la 
siguiente forma al crearla: 

```java
public class Coche {
    // contenido de la clase
}
```

***¿Cómo instanciamos un objeto?*** Fácil. Simplemente debemos usar el operador
```new``` seguido de un constructor de la clase: 

```java 
// Sintaxis
NombreClase nombreObjeto = new NombreClase(lista_argumentos);
```

Si lo trasladamos al caso de la clase ```Coche```, en caso de que no existiera 
un constructor, crear un objeto ```coche``` de la clase ```Coche``` se haría como
sigue: 

```java 
Coche coche = new Coche();
```

Sin embargo, la clase ```Coche``` cuenta con un constructor que recibe una lista
de parámetros, por lo que al sobreescribir el constructor por defecto, solo 
podemos usar el constructor especificado, lo que nos obliga a instanciar un 
objeto con dicho constructor. 

```
Constructor de Coche: Coche(marca, modelo, color, capacidadTanque)
- marca, modelo y color: cadenas de texto (String)
- capacidadTanque: n.º en coma flotante de doble precisión (double)
```

```java
// Se instancian 2 objetos de la clase Coche: coche1 y coche2
Coche coche1 = new Coche("Toyota", "Corolla", "Rojo", 50.0);
Coche coche2 = new Coche("Ford", "Focus", "Azul", 45.0);
// Resumen -> Coche es la clase, coche1 y coche2 son los objetos
```

## 

Para más información, consulte los siguientes enlaces: 
- [Qué es la Programación Orientada a Objetos - GenBeta](https://www.genbeta.com/a-fondo/que-programacion-orientada-a-objetos-principales-conceptos-explicados-para-todos-publicos)
- [Introducción a POO en Java - OpenWebinars](https://openwebinars.net/blog/introduccion-a-poo-en-java-objetos-y-clases/)
