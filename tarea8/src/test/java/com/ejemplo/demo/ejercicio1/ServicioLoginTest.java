package com.ejemplo.demo.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ServicioLoginTest {
    
    @Mock
    RepositoriUsuarios repositorio;
    
    @InjectMocks
    ServicioLogin servicioLogin;
    
    @Test
    void testLoginUsuarioExiste() {
        // Configurar el mock
        when(repositorio.existeUsuario("usuario@email.com")).thenReturn(true);
        
        // Ejecutar
        boolean resultado = servicioLogin.login("usuario@email.com");
        
        // Verificar
        assertTrue(resultado);
        verify(repositorio, times(1)).existeUsuario("usuario@email.com");
    }
    
    @Test
    void testLoginUsuarioNoExiste() {
        // Configurar el mock
        when(repositorio.existeUsuario("noexiste@email.com")).thenReturn(false);
        
        // Ejecutar
        boolean resultado = servicioLogin.login("noexiste@email.com");
        
        // Verificar
        assertFalse(resultado);
        verify(repositorio, times(1)).existeUsuario("noexiste@email.com");
    }
}