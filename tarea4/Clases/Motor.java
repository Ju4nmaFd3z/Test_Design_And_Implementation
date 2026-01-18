package tarea4.Clases;

// ====================================================================
// EJERCICIO 10: Composición de Clases
// ====================================================================
public class Motor {
    // Atributos
    private String tipo;
    private int potencia;
    
    // Constructor
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void encender() {
        System.out.println("Motor " + tipo + " encendido. Potencia: " + potencia + " Caballos");
    }
}