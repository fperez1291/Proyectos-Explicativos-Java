package daw.cotarelo.fpc.principal;

/**
 * En esta clase se explica de la forma más exhaustiva y didáctica posible la
 * clase StringBuilder: constructores de StringBuilder y métodos que debe
 * conocer.
 *
 * @author fperez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * Constructor vacío: construye un objeto de la clase StringBuilder sin
         * caracteres y con una capacidad inicial de 16 caracteres. <br>
         * [SINTAXIS] StringBuilder nameObject = new StringBuilder();
         */
        StringBuilder str1 = new StringBuilder();

        // Método append() -> puede recibir diferentes tipos de datos
        str1.append("Hola Mundo");          // String
        str1.append(123);               // int
        str1.append(45.67);             // double
        str1.append('!');               // char
        str1.append(true);              // boolean
        str1.append(new Object());      // Object (toString())
        // Resultado: "Hola Mundo12345.67!truejava.lang.Object@..."
        System.out.println(str1.toString());
        
        // Método lenght() -> tamaño de la cadena
        int size = str1.length();
        
        // Método delete(posIni,posFin) -> borra la cadena que va desde posIni hasta posFin-1
        str1.delete(0, str1.length()); // en este caso, borra la cadena entera
        // str1.delete(0,size); haría lo mismo
        
        // Método insert(posIni,cadena) -> inserta cadena en posIni, desplazando lo que hubiera a la derecha
        str1.append("Java es genial");
        str1.insert(0, "La ");                  // "La Java es genial"
        str1.insert(2, " programacion en ");    // "La programacion en Java es genial"
        str1.insert(str1.length(), "!");        // "La programacion en Java es genial!"
        
        System.out.println(str1.toString());
        
        /**
         * Constructor con capacidad inicial: construye un StringBuilder sin
         * caracteres y con una capacidad inicial especificada en el arguemnto
         * capacidad. <br>
         * [SINTAXIS] StringBuilder nameObject = new StringBuilder(capacidad);
         * <br>
         * capacidad: puede ser o un literal de tipo int, el nombre de una
         * variable de tipo int o el valor devuelto por un método (debe devolver
         * un int)
         */
        StringBuilder str2 = new StringBuilder(10);

        int capacidad = 20;
        StringBuilder str3 = new StringBuilder(capacidad);
        
        /**
         * Constructor con String inicial: construye un StringBuilder
         * inicializado con el contenido de la cadena pasada por parámetro. La
         * capacidad inicial del StringBuilder es de 16 más la longitud de la
         * cadena pasada por parámetro. <br>
         * [SINTAXIS] StringBuilder nombreObjeto = new StringBuilder(cadena);
         * <br>
         * cadena: puede ser una cadena de texto entre comillas o el nombre de
         * un objeto de la clase String
         */
        StringBuilder str4 = new StringBuilder("Hola Mundo");

        String cadena = "Programacion en Java";
        StringBuilder str5 = new StringBuilder(cadena);

        /**
         * ======================== Métodos a conocer ========================
         *
         *
         */
    }

}
