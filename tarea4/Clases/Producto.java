package tarea4.Clases;

// ====================================================================
// EJERCICIO 6: Clase Producto
// ====================================================================
public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;
    
    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Método vender
    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta de " + cantidad + " unidades realizada.");
            System.out.println("Stock actual: " + stock);
        } else if (cantidad > stock) {
            System.out.println("Error: stock insuficiente. Stock: " + stock);
        } else {
            System.out.println("Error: cantidad debe ser positiva.");
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    
    public static void main(String[] args) {
        Producto prod = new Producto("Portátil", 999.99, 10);
        System.out.println("Producto: " + prod.getNombre());
        prod.vender(3);
        prod.vender(20);
    }
}