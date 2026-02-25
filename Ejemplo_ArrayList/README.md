# Uso de ArrayList

## ¿Qué es un ArrayList?
Antes de entrar a hablar sobre qué es un ```ArrayList```, conviene explicar los 
conceptos de colección de elementos y lista.
- Una __colección__ de elementos no es más que una agrupación de elementos. P.ej.
una colección de sellos, una colección de cromos, etc. 
- Una __lista__ es una colección ordenada de elementos del mismo tipo / clase, 
donde cada elemento tiene una posición y puede contener valores repetidos (no 
es un conjunto). 

La forma más sencilla de entender esta estructura es pensar en que los elementos
se organizan como en una lista de la compra. Con ello en mente, prosiga leyendo
la explicación. 

**¿Qué caracteriza a una lista como estructura de datos?**
- __Orden lineal:__ los elementos se almacenan en orden secuencial, con un 
predecesor y sucesor, salvo el primer elemento (sin predecesor) y el último 
elemento (sin sucesor)
- __Flexibilidad dinámica:__ puede crecer o reducirse durante la ejecución del 
programa sin necesidad de redefinir su tamaño. 
- __Acceso por índice:__ permite acceder a elementos mediante su posición. 

Otra característica destacable es la __posibilidad de implementar esta estructura 
de diferentes formas__, pero para el caso que nos atañe, no nos importa. Lo único
que nos interesa para este caso es saber que ArrayList es una lista implementada
con arrays. 

**Operaciones básicas de las listas**
- Crear una lista
- Insertar un elemento
- Eliminar un elemento
- Verificar si está vacía
- Obtener el tamaño
- Acceder a un elemento
- Recorrer una lista

| **Ventajas**                        | **Desventajas**                                                     |
|-------------------------------------|---------------------------------------------------------------------|
| Inserción y eliminación eficientes  | Acceso aleatorio lento                                              |
| Uso dinámico de memoria             | Mala localidad espacial (los nodos no están contiguos en memoria).  |
| Base para estructuras más complejas | Uso adicional de memoria                                            |

