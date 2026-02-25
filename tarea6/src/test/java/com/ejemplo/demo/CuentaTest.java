package com.ejemplo.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
    
    private Cuenta cuenta1;
    private Cuenta cuenta2;
    
    @BeforeEach
    void setUp() throws Exception {
        cuenta1 = new Cuenta(100);
        cuenta2 = new Cuenta(200);
    }
    
    // Pruebas de INGRESO
    @Test
    void testIngresoPositivo() throws CantidadNegativaException {
        cuenta1.ingreso(50);
        assertEquals(150, cuenta1.getSaldo());
    }
    
    @Test
    void testIngresoNegativo() {
        assertThrows(CantidadNegativaException.class, () -> cuenta1.ingreso(-50));
    }
    
    // Pruebas de REINTEGRO
    @Test
    void testReintegroValido() throws ReintegroException {
        cuenta1.reintegro(50);
        assertEquals(50, cuenta1.getSaldo());
    }
    
    @Test
    void testReintegroSinSaldoSuficiente() {
        assertThrows(ReintegroException.class, () -> cuenta1.reintegro(150));
    }
    
    // Pruebas de TRANSFERENCIA
    @Test
    void testTransferenciaValida() throws TransferenciaException, CantidadNegativaException {
        cuenta1.transferencia(50, cuenta2);
        assertEquals(50, cuenta1.getSaldo());
        assertEquals(250, cuenta2.getSaldo());
    }

    @Test
    void testTransferenciaSinSaldoSuficiente() {
        assertThrows(TransferenciaException.class, () -> cuenta1.transferencia(150, cuenta2));
    }
}