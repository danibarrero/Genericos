package org.iesvdm;

import org.iesvdm.Ejer7.Prueba;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperableTest {
    @Test
    public void testSumar() {
        Prueba prueba = new Prueba(10); // Crea una prueba con el valor 10
        assertEquals(Integer.valueOf(15), prueba.sumar(5)); // Comprueba que sumar 5 a 10 da 15
    }

    @Test
    public void testRestar() {
        Prueba prueba = new Prueba(10); // Crea una prueba con el valor 10
        assertEquals(Integer.valueOf(7), prueba.restar(3)); // Comprueba que restar 3 a 10 da 7
    }

    @Test
    public void testMultiplicar() {
        Prueba prueba = new Prueba(10); // Crea una prueba con el valor 10
        assertEquals(Integer.valueOf(40), prueba.multiplicar(4)); // Comprueba que multiplicar 4 a 10 da 40
    }

    @Test
    public void testDividir() {
        Prueba prueba = new Prueba(10); // Crea una prueba con el valor 10
        assertEquals(Integer.valueOf(5), prueba.dividir(2)); // Comprueba que dividir 2 a 10 da 5
    }

    @Test
    public void testDividirPorCero() {
        Prueba prueba = new Prueba(10); // Crea una prueba con el valor 10
        prueba.dividir(0); // Compruba al dividir entre 0 duvuelve 0
    }
}
