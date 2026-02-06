package daw.cotarelo.fpc.principal;

/**
 * En esta clase se explica de la forma más exhaustiva y didáctica posible la
 * clase StringBuilder. Se explica qué es un StringBuilder, la diferencia con la
 * clase String, los constructores para StringBuilder y los métodos que debe
 * conocer.
 *
 *
 * @author fperez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * ====================== ¿Qué es StringBuilder? ======================
         * La clase StringBuilder se corresponde con lo que llamamos
         * "constructor de Strings".
         */
        /**
         * ================== Constructores de StringBuilder ==================
         *
         * Construimos un objeto (str) de la clase StringBuilder. Para ello,
         * contamos con 3 constructores:
         *
         * 1) StringBuilder() 2) StringBuilder(int capacidad) 3)
         * StringBuilder(String str)
         *
         * Tenga en cuenta que los constructores numerados no son la forma
         * concreta de usar el constructor, sino su cabecera (en términos más
         * comprensibles, su sintaxis junto con la lista de parámetros
         * (separados por comas) con su tipo y un nombre generico para que se
         * entienda exactamente qué espera el constructor en ese parámetro).
         */
        // 1) StringBuilder sin caracteres almacenados y con capacidad inicial de 16 caracteres
        StringBuilder str1 = new StringBuilder();
        // 2) StringBuilder sin caracteres almacenados y con capacidad inicial de 16 caracteres
        StringBuilder str2 = new StringBuilder(100);
        // 3) StringBuilder sin caracteres almacenados y con capacidad inicial de 16 caracteres
        StringBuilder str3 = new StringBuilder("Hola Mundo");

        /**
         * ======================== Métodos a conocer ========================
         *
         *
         */
    }

}
