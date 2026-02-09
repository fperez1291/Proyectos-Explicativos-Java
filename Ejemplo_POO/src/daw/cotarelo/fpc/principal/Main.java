package daw.cotarelo.fpc.principal;

// Clase principal para probar nuestro objeto Coche
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE PROGRAMACIÓN ORIENTADA A OBJETOS ===\n");
        
        // Crear objetos Coche (instancias de la clase Coche)
        System.out.println("1. Creando objetos Coche:");
        Coche coche1 = new Coche("Toyota", "Corolla", "Rojo", 50.0);
        Coche coche2 = new Coche("Ford", "Focus", "Azul", 45.0);
        
        // Mostrar información inicial
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        
        System.out.println("\n2. Probando métodos del coche 1:");
        
        // Intentar encender sin combustible
        coche1.encender();
        
        // Repostar combustible
        coche1.repostar(30.0);
        
        // Encender el coche
        coche1.encender();
        
        // Acelerar
        coche1.acelerar(50);
        coche1.acelerar(30);
        
        // Mostrar información actualizada
        coche1.mostrarInformacion();
        
        // Frenar
        coche1.frenar(40);
        
        // Apagar
        coche1.apagar();
        
        System.out.println("\n3. Probando métodos del coche 2:");
        
        // Operaciones con el segundo coche
        coche2.repostar(45.0); // Llenar el tanque
        coche2.encender();
        coche2.acelerar(80);
        coche2.setColor("Verde"); // Cambiar color
        coche2.mostrarInformacion();
        
        System.out.println("\n4. Accediendo a propiedades individuales:");
        System.out.println("La marca del coche 1 es: " + coche1.getMarca());
        System.out.println("El color del coche 2 es: " + coche2.getColor());
        System.out.println("Velocidad del coche 2: " + coche2.getVelocidad() + " km/h");
        
        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}