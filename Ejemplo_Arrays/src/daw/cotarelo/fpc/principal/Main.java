package daw.cotarelo.fpc.principal;

/**
 *
 * @author fperez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        // asignamos valores al array numeros, del 1 al 5
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        // mostramos los valores almacenados en el array
        System.out.print("Numeros: {");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d%s", numeros[i], 
                    i < numeros.length - 1 ? ", " : "}\n");
        }
        
        String cadenas[];
        cadenas = new String[5];
        
        cadenas[0] = "Hola,";
        cadenas[1] = "estoy";
        cadenas[2] = "programando";
        cadenas[3] = "en";
        cadenas[4] = "Java";
        // cadenas[5] = "."; // lanzaría una excepción IndexOutOfBounds (fuera de rango)
        
        // se le invita a practicar con el array cadenas
        
        boolean[] validez = {true, true, false, true, false};
        
        // se le invita a practicar con el array validez
    }
    
}
