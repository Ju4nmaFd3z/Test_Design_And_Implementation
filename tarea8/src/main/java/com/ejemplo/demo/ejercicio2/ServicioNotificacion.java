package com.ejemplo.demo.ejercicio2;

public class ServicioNotificacion {
    private ProveedorNotificaciones proveedor;
    
    public ServicioNotificacion(ProveedorNotificaciones proveedor) {
        this.proveedor = proveedor;
    }
    
    public void enviarNotificacion(String email, String mensaje) {
        proveedor.enviarMensaje(email, mensaje);
    }
}