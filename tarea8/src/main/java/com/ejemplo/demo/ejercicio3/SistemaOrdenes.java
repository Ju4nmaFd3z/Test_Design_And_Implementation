package com.ejemplo.demo.ejercicio3;

public class SistemaOrdenes {
    private ProveedorDescuentos proveedor;
    
    public SistemaOrdenes(ProveedorDescuentos proveedor) {
        this.proveedor = proveedor;
    }
    
    public double calcularTotal(double totalBase, int cantidad) {
        double descuento = proveedor.obtenerDescuento(cantidad);
        return totalBase - (totalBase * descuento);
    }
}