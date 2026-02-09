package daw.cotarelo.fpc.principal;

// Clase principal que representa un Coche
public class Coche {
    // Atributos (propiedades del coche)
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean encendido;
    private double combustible;
    private final double capacidadTanque;
    
    // Constructor - método especial para crear objetos
    public Coche(String marca, String modelo, String color, double capacidadTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capacidadTanque = capacidadTanque;
        this.velocidad = 0;
        this.encendido = false;
        this.combustible = 0;
    }
    
    // Métodos (comportamientos del coche)
    
    // Encender el coche
    public void encender() {
        if (!encendido) {
            if (combustible > 0) {
                encendido = true;
                System.out.println("El coche " + marca + " " + modelo + " se ha encendido.");
            } else {
                System.out.println("No se puede encender, no hay combustible.");
            }
        } else {
            System.out.println("El coche ya está encendido.");
        }
    }
    
    // Apagar el coche
    public void apagar() {
        if (encendido) {
            if (velocidad == 0) {
                encendido = false;
                System.out.println("El coche " + marca + " " + modelo + " se ha apagado.");
            } else {
                System.out.println("No se puede apagar, el coche está en movimiento.");
            }
        } else {
            System.out.println("El coche ya está apagado.");
        }
    }
    
    // Acelerar el coche
    public void acelerar(int incremento) {
        if (encendido) {
            if (combustible > 0) {
                velocidad += incremento;
                combustible -= 0.1 * incremento; // Consumo de combustible
                if (combustible < 0) combustible = 0;
                System.out.println("Acelerando a " + velocidad + " km/h.");
            } else {
                System.out.println("No hay suficiente combustible para acelerar.");
                encendido = false;
            }
        } else {
            System.out.println("No se puede acelerar, el coche está apagado.");
        }
    }
    
    // Frenar el coche
    public void frenar(int decremento) {
        if (velocidad > 0) {
            velocidad -= decremento;
            if (velocidad < 0) velocidad = 0;
            System.out.println("Frenando a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }
    
    // Repostar combustible
    public void repostar(double litros) {
        double espacioDisponible = capacidadTanque - combustible;
        if (litros <= espacioDisponible) {
            combustible += litros;
            System.out.println("Se han repostado " + litros + " litros. Combustible actual: " + combustible + " litros.");
        } else {
            combustible = capacidadTanque;
            System.out.println("Tanque lleno. Se han repostado " + espacioDisponible + " litros.");
        }
    }
    
    // Mostrar información del coche
    public void mostrarInformacion() {
        System.out.println("=== Información del Coche ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
        System.out.println("Combustible: " + combustible + "/" + capacidadTanque + " litros");
        System.out.println("=============================");
    }
    
    // Métodos getters para acceder a los atributos privados
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public boolean isEncendido() {
        return encendido;
    }
    
    public double getCombustible() {
        return combustible;
    }
    
    // Métodos setters para modificar algunos atributos
    public void setColor(String nuevoColor) {
        color = nuevoColor;
        System.out.println("El coche ahora es de color " + nuevoColor);
    }
}