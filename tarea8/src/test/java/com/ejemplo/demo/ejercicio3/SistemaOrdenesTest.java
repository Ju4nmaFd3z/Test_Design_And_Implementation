package com.ejemplo.demo.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SistemaOrdenesTest {
    
    @Mock
    ProveedorDescuentos proveedor;
    
    @InjectMocks
    SistemaOrdenes sistemaOrdenes;
    
    @Test
    void testCalcularTotalConDescuento() {
        // Configurar el mock: 10% de descuento
        when(proveedor.obtenerDescuento(5)).thenReturn(0.10);
        
        // Ejecutar: total base 100, cantidad 5
        double resultado = sistemaOrdenes.calcularTotal(100, 5);
        
        // Verificar: 100 - (100 * 0.10) = 90
        assertEquals(90, resultado);
    }
    
    @Test
    void testCalcularTotalSinDescuento() {
        // Configurar el mock: 0% de descuento
        when(proveedor.obtenerDescuento(1)).thenReturn(0.0);
        
        // Ejecutar
        double resultado = sistemaOrdenes.calcularTotal(100, 1);
        
        // Verificar: 100 - (100 * 0.0) = 100
        assertEquals(100, resultado);
    }
    
    @Test
    void testCalcularTotalConDescuentoGrande() {
        // Configurar el mock: 20% de descuento
        when(proveedor.obtenerDescuento(20)).thenReturn(0.20);
        
        // Ejecutar
        double resultado = sistemaOrdenes.calcularTotal(500, 20);
        
        // Verificar: 500 - (500 * 0.20) = 400
        assertEquals(400, resultado);
    }
}