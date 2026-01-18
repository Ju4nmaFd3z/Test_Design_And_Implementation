package tarea4.Clases;

// ====================================================================
// EJERCICIO 3: Clase Estudiante con constructor
// ====================================================================
public class Estudiante {
    // Atributos
    private String nombre;
    private double nota;
    
    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getNota() {
        return nota;
    }
    
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Juan", 8.5);
        System.out.println("Estudiante: " + est1.getNombre());
        System.out.println("Nota: " + est1.getNota());
    }
}