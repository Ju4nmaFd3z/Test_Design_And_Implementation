package tarea4.Clases;

// ====================================================================
// EJERCICIO 9: Herencia - Gerente
// ====================================================================
public class Gerente extends Empleado {
    // Atributo adicional
    private double bono;
    
    // Constructor
    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }
    
    // Sobrescribir método para calcular salario total
    @Override
    public double obtenerSalario() {
        return salario + bono;
    }
    
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 2000);
        System.out.println("Empleado: " + emp.getNombre());
        System.out.println("Salario: " + emp.obtenerSalario());
        
        Gerente ger = new Gerente("Ana", 3000, 500);
        System.out.println("\nGerente: " + ger.getNombre());
        System.out.println("Salario + Bono: " + ger.obtenerSalario());
    }
}