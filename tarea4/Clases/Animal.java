package tarea4.Clases;

// ====================================================================
// EJERCICIO 7: Herencia - Animal
// ====================================================================
public class Animal {
    // Atributo
    protected String nombre;
    
    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    // Método comer
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}