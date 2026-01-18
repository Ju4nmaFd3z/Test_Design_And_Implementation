package tarea4.Clases;

// ====================================================================
// EJERCICIO 10: Composición de Clases
// ====================================================================
public class Coche {
    // Atributos
    private String marca;
    private String modelo;
    private Motor motor;  // Contiene un objeto de tipo Motor
    
    // Constructor
    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void arrancar() {
        System.out.println("Coche " + marca + " " + modelo + " arrancando...");
        motor.encender();
    }
    
    public static void main(String[] args) {
        // Crear un motor
        Motor motorV8 = new Motor("V8", 350);
        
        // Crear un coche con ese motor específico
        Coche coche = new Coche("Ferrari", "F8 Tributo", motorV8);
        coche.arrancar();
    }
}