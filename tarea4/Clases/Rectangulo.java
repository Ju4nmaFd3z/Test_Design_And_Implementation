package tarea4.Clases;

// ====================================================================
// EJERCICIO 2: Clase Rectangulo con métodos
// ====================================================================
public class Rectangulo {
    // Atributos
    public double base;
    public double altura;
    
    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Método para calcular área
    public double calcularArea() {
        return base * altura;
    }
    
    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(5, 3);
        System.out.println("Área: " + rect.calcularArea());
        System.out.println("Perímetro: " + rect.calcularPerimetro());
    }
}