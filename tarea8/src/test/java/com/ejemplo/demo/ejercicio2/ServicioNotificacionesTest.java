package com.ejemplo.demo.ejercicio2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServicioNotificacionTest {
    
    @Mock
    ProveedorNotificaciones proveedor;
    
    @InjectMocks
    ServicioNotificacion servicioNotificacion;
    
    @Test
    void testEnviarNotificacionCorrectamente() {
        // Ejecutar
        servicioNotificacion.enviarNotificacion("usuario@email.com", "Bienvenido");
        
        // Verificar que el método fue llamado correctamente
        verify(proveedor, times(1)).enviarMensaje("usuario@email.com", "Bienvenido");
    }
    
    @Test
    void testEnviarMultiplesNotificaciones() {
        // Ejecutar
        servicioNotificacion.enviarNotificacion("usuario1@email.com", "Mensaje 1");
        servicioNotificacion.enviarNotificacion("usuario2@email.com", "Mensaje 2");
        
        // Verificar que el método fue llamado dos veces
        verify(proveedor, times(2)).enviarMensaje(anyString(), anyString());
    }
}