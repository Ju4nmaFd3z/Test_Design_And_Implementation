package tarea4.Clases;

// ====================================================================
// EJERCICIO 7: Herencia - Perro
// ====================================================================
public class Perro extends Animal {
    // Constructor
    public Perro(String nombre) {
        super(nombre);
    }
    
    // Método ladrar
    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡WOOF WOOF!");
    }
    
    public static void main(String[] args) {
        Perro perro = new Perro("Rex");
        perro.comer();
        perro.ladrar();
    }
}