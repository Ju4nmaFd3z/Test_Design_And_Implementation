package tarea4.Clases;

// ====================================================================
// EJERCICIO 1: Clase Libro simple
// ====================================================================
public class Libro {
    // Atributos
    public String titulo;
    public String autor;
    public int paginas;
    
    // Main para probar
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro1 = new Libro();
        
        // Asignar valores a los atributos
        libro1.titulo = "Don Quijote";
        libro1.autor = "Miguel de Cervantes";
        libro1.paginas = 1072;
        
        // Mostrar los valores
        System.out.println("Libro 1:");
        System.out.println("Título: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Páginas: " + libro1.paginas);
    }
}
