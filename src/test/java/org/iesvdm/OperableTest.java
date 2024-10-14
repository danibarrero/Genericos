package org.iesvdm;

import org.iesvdm.Ejer7.Prueba;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperableTest {
    @Test
    public void testSumar() {
        Prueba prueba = new Prueba(10);
        assertEquals(Integer.valueOf(15), prueba.sumar(5));
    }

    @Test
    public void testRestar() {
        Prueba prueba = new Prueba(10);
        assertEquals(Integer.valueOf(7), prueba.restar(3));
    }

    @Test
    public void testMultiplicar() {
        Prueba prueba = new Prueba(10);
        assertEquals(Integer.valueOf(40), prueba.multiplicar(4));
    }

    @Test
    public void testDividir() {
        Prueba prueba = new Prueba(10);
        assertEquals(Integer.valueOf(5), prueba.dividir(2));
    }

    @Test
    public void testDividirPorCero() {
        Prueba prueba = new Prueba(10);
        prueba.dividir(0);
    }
}
