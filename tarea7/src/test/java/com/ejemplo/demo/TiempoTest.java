package com.ejemplo.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiempoTest {
    
    private Tiempo tiempo1;
    private Tiempo tiempo2;
    
    @BeforeEach
    void setUp() throws Exception {
        tiempo1 = new Tiempo(10, 30, 45);
        tiempo2 = new Tiempo(14, 20, 15);
    }
    
    @Test
    void testSumaHorasNormal() throws Exception {
        tiempo1.suma(2, 0, 0);
        assertEquals(12, tiempo1.getHoras());
        assertEquals(30, tiempo1.getMinutos());
        assertEquals(45, tiempo1.getSegundos());
    }
    
    @Test
    void testSumaMinutosNormal() throws Exception {
        tiempo1.suma(0, 10, 0);
        assertEquals(10, tiempo1.getHoras());
        assertEquals(40, tiempo1.getMinutos());
        assertEquals(45, tiempo1.getSegundos());
    }
    
    @Test
    void testSumaSegundosNormal() throws Exception {
        tiempo1.suma(0, 0, 10);
        assertEquals(10, tiempo1.getHoras());
        assertEquals(30, tiempo1.getMinutos());
        assertEquals(55, tiempo1.getSegundos());
    }
    
    @Test
    void testSumaConAcarreoCompleto() throws Exception {
        tiempo1.suma(23, 59, 59);
        assertEquals(33, tiempo1.getHoras());
        assertEquals(89, tiempo1.getMinutos());
        assertEquals(104, tiempo1.getSegundos());
    }
    
    @Test
    void testSumaCantidadNegativa() {
        assertThrows(CantidadNegativaException.class, () -> tiempo1.suma(-20, 0, 0));
    }
}