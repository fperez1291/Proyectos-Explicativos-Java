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

<img src="./img/coche.jpg" align="center" style="width:50%">

. Sin embargo, las mesas pueden ser altas, bajas, redondas, cuadradas, tener
una o varias patas o ser de plástico, madera o incluso metálicas. Por tanto, si 
tratamos de modelar todas las mesas del mundo, tenemos que la abstracción de mesa
cuenta con las siguientes características: 

- Material de la que está hecha
- N.º de patas
- Dimensiones

Estas características serán los atributos de nuestra clase ```Mesa```. Este 
concepto se explica un poco más adelante. 