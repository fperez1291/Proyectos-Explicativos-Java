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

        System.out.printf("Longitud de str1: %s%n", size);
        
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
        
        str2.append("Java");
        str2.setCharAt(0, 'Y');     // "Yava"
        str2.setCharAt(2, 'y');     // "Yaya"
        
        System.out.println(str2.toString());

        str2.deleteCharAt(2);       // "Yaa"
        str2.deleteCharAt(2);       // "Ya"
        
        System.out.println(str2.toString());
        
        int capacidad = 20;
        StringBuilder str3 = new StringBuilder(capacidad);
        
        str3.append("Me gusta el cafe");
        str3.replace(12, 16, "te");     // "Me gusta el te"
        // en este caso, str3.replace(12, str3.length(), "te"); surtiría el mismo efecto
        
        System.out.println(str3.toString());
        
        String substr = str3.substring(3, 8);   // "gusta"
        
        System.out.println(substr);
        
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
        char c = str4.charAt(7);     // 'n'
        System.out.println(c);
        
        str4.reverse();             // "odnuM laloH"
        System.out.println(str4.toString());
        
        str4.delete(0, str4.length());
        
        String cadena = "Programacion en Java";
        StringBuilder str5 = new StringBuilder(cadena);

        int[] indices = {0,0,0,0};
        
        indices[0] = str5.indexOf("r");     // 1
        indices[1] = str5.indexOf("n");     // 11
        indices[2] = str5.indexOf(" ");     // 12
        indices[3] = str5.indexOf("Java");  // 16
        
        for (int indice : indices) {
            str4.append(indice).append(" ");
        }
        
        System.out.println(str4.toString());
        
    }

}
