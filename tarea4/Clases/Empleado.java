package tarea4.Clases;

// ====================================================================
// EJERCICIO 9: Herencia - Empleado
// ====================================================================
public class Empleado {
    // Atributos
    protected String nombre;
    protected double salario;
    
    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    // Método para obtener salario
    public double obtenerSalario() {
        return salario;
    }
    
    public String getNombre() {
        return nombre;
    }
}