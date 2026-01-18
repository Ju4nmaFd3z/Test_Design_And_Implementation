package tarea4.Clases;

// ====================================================================
// EJERCICIO 8: Herencia con Sobrescritura - Figura
// ====================================================================
public class Triangulo extends Figura {
    // Sobrescribir método dibujar
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }
    
    public static void main(String[] args) {
        Figura fig = new Figura();
        fig.dibujar();
        
        Triangulo tri = new Triangulo();
        tri.dibujar();
    }
}