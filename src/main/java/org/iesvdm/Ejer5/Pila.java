package org.iesvdm.Ejer5;

import java.util.LinkedList;

public class Pila<T> implements ColeccionSimpleGenerica<T> {
    private LinkedList<T> numero;

    public Pila() {
        numero = new LinkedList<>();
    }

    @Override
    public boolean estaVacia() {
        return numero.isEmpty();
    }

    @Override
    public T extraer(int indice) {
        if (estaVacia()) {
            throw new IllegalStateException("La colección está vacía");
        }
        if (indice < 0 || indice >= numero.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return numero.remove(indice);
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La colección está vacía");
        }
        return numero.getFirst();
    }

    @Override
    public void añadir(T elemento) {
        numero.addFirst(elemento);
    }
}