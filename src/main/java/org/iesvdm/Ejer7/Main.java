package org.iesvdm.Ejer7;

public class Main {
    public static void main(String[] args) {
        Operable<Double> operable = new Prueba(10.0);

        System.out.println("Suma: " + operable.sumar(5.0));
        System.out.println("Resta: " + operable.restar(3.0));
        System.out.println("Multiplicación: " + operable.multiplicar(2.0));
        System.out.println("División: " + operable.dividir(4.0));
    }
}
