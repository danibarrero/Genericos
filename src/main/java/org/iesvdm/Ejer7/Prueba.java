package org.iesvdm.Ejer7;

public class Prueba implements Operable<Integer> {
    private Integer valor;

    public Prueba(int valor) {
        this.valor = valor;
    }

    @Override
    public Integer sumar(Integer otro) {
        return valor + otro;
    }

    @Override
    public Integer restar(Integer otro) {
        return valor - otro;
    }

    @Override
    public Integer multiplicar(Integer otro) {
        return valor * otro;
    }

    @Override
    public Integer dividir(Integer otro) {
        if (otro == 0) {
            return  0;
        }
        return valor / otro;
    }

    public static void main(String[] args) {
        Operable<Integer> operable = new Prueba(10);

        System.out.println("Suma: " + operable.sumar(1));
        System.out.println("Resta: " + operable.restar(5));
        System.out.println("Multiplicación: " + operable.multiplicar(3));
        System.out.println("División: " + operable.dividir(2));
    }
}
