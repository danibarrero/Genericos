package org.iesvdm.Ejer5;

import java.util.LinkedList;

public class Coleccion<T> implements ColeccionSimpleGenerica<T> {
    private LinkedList<T> numero;

    public Coleccion() {
        numero = new LinkedList<>();
    }

    @Override
    public boolean estaVacia() {
        if(numero.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T extraer(int indice) {
        if (!estaVacia() && indice >= 0 && indice < numero.size()) {
            return numero.remove(indice);
        }
        return null;
    }

    @Override
    public T primero() {
        if (!estaVacia()) {
            return numero.getFirst();
        }
        return null;
    }

    @Override
    public void añadir(T elemento) {
        numero.addFirst(elemento);
    }
}