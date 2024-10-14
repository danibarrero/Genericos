package org.iesvdm.Ejer7;

class Prueba implements Operable<Double> {
    private Double valor;

    public Prueba(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double sumar(Double otro) {
        return valor + otro;
    }

    @Override
    public Double restar(Double otro) {
        return valor - otro;
    }

    @Override
    public Double multiplicar(Double otro) {
        return valor * otro;
    }

    @Override
    public Double dividir(Double otro) {
        if (otro == 0) {
            return null;
        }
        return valor / otro;
    }
}