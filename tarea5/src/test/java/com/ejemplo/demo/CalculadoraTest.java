package com.ejemplo.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSumar() {
        int resultado = Calculadora.sumar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testRestar() {
        int resultado = Calculadora.restar(10, 4);
        assertEquals(6, resultado);
    }

    @Test
    void testMultiplicar() {
        int resultado = Calculadora.multiplicar(6, 7);
        assertEquals(42, resultado);
    }

    @Test
    void testDividir() {
        int resultado = Calculadora.dividir(20, 4);
        assertEquals(5, resultado);
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(10, 0);
        });
    }
}