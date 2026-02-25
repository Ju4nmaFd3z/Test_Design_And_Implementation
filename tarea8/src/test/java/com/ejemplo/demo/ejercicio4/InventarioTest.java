package com.ejemplo.demo.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InventarioTest {
    
    @Mock
    RepositoriInventario repositorio;
    
    @InjectMocks
    Inventario inventario;
    
    @Test
    void testEliminarProductoExistente() {
        // Configurar el mock
        when(repositorio.existeProducto("PROD001")).thenReturn(true);
        
        // Ejecutar
        boolean resultado = inventario.eliminarProducto("PROD001");
        
        // Verificar
        assertTrue(resultado);
        verify(repositorio, times(1)).existeProducto("PROD001");
        verify(repositorio, times(1)).eliminarProducto("PROD001");
    }
    
    @Test
    void testEliminarProductoNoExistente() {
        // Configurar el mock
        when(repositorio.existeProducto("PROD999")).thenReturn(false);
        
        // Ejecutar
        boolean resultado = inventario.eliminarProducto("PROD999");
        
        // Verificar
        assertFalse(resultado);
        verify(repositorio, times(1)).existeProducto("PROD999");
        verify(repositorio, never()).eliminarProducto("PROD999");
    }
    
    @Test
    void testContineProductoExistente() {
        // Configurar el mock
        when(repositorio.existeProducto("PROD001")).thenReturn(true);
        
        // Ejecutar
        boolean resultado = inventario.contineProducto("PROD001");
        
        // Verificar
        assertTrue(resultado);
    }
    
    @Test
    void testContineProductoNoExistente() {
        // Configurar el mock
        when(repositorio.existeProducto("PROD999")).thenReturn(false);
        
        // Ejecutar
        boolean resultado = inventario.contineProducto("PROD999");
        
        // Verificar
        assertFalse(resultado);
    }
}