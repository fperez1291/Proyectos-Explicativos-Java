package daw.cotarelo.fpc.principal;

/**
 * En esta clase se explica de la forma más exhaustiva y didáctica posible la
 * clase StringBuilder. Se explica qué es un StringBuilder, la diferencia con la
 * clase String, los constructores para StringBuilder y los métodos que debe
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

        /**
         * Constructor con capacidad inicial: construye un StringBuilder sin
         * caracteres y con una capacidad inicial especificada en el arguemnto
         * capacidad. <br>
         * [SINTAXIS] StringBuilder nameObject = new StringBuilder(capacidad);
         * <br>
         * capacidad: puede ser o un literal de tipo int o el nombre de una
         * variable de tipo int
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
