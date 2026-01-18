package tarea4.Clases;

// ====================================================================
// EJERCICIO 4: Clase CuentaBancaria
// ====================================================================
public class CuentaBancaria {
    // Atributos
    private double saldo;
    
    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    // Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado.");
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("Error: La cantidad debe ser positiva.");
        }
    }
    
    // Método retirar (no permite saldo negativo)
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado.");
            System.out.println("Saldo actual: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente. Saldo: " + saldo);
        } else {
            System.out.println("Error: La cantidad debe ser positiva.");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000);
    }
}