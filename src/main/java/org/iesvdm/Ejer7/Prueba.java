package org.iesvdm.Ejer7;

import java.util.Scanner;

public class Prueba implements Operable<Integer> {
    private Integer numero; // Número por el cual realiza la operación

    // Constructor
    public Prueba(int valor) {
        this.numero = valor;
    }

    // Suma un valor al número que hemos introducido
    @Override
    public Integer sumar(Integer otro) {
        return numero + otro;
    }

    // Resta un valor al número que hemos introducido
    @Override
    public Integer restar(Integer otro) {
        return numero - otro;
    }

    // Multiplica un valor al número que hemos introducido
    @Override
    public Integer multiplicar(Integer otro) {
        return numero * otro;
    }

    // Divide un valor al número que hemos introducido
    @Override
    public Integer dividir(Integer otro) {
        if (otro == 0) {
            return 0;  // Si lo divide entre 0 devuelve 0
        }
        return numero / otro;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int valorInicial = scanner.nextInt();

        // Crea una instancia de Prueba usando el valor que hemos introducido
        Operable<Integer> operable = new Prueba(valorInicial);

        // Operaciones
        System.out.println("Suma: " + operable.sumar(1));
        System.out.println("Resta: " + operable.restar(5));
        System.out.println("Multiplicación: " + operable.multiplicar(3));
        System.out.println("División: " + operable.dividir(2));

        scanner.close();
    }
}
