package tarea4.Clases;

// ====================================================================
// EJERCICIO 5: Clase Circulo
// ====================================================================
public class Circulo {
    // Atributo
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Método getArea
    public double getArea() {
        return Math.PI * radio * radio;
    }
    
    public static void main(String[] args) {
        Circulo circ = new Circulo(5);
        System.out.println("Área del círculo: " + circ.getArea());
    }
}