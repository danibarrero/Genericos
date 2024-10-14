package org.iesvdm.Ejer5;

import java.util.LinkedList;

public class Coleccion<T> implements ColeccionSimpleGenerica<T> {
    private LinkedList<T> elemneto; // Lista que almacena elementos de tipo genérico

    public Coleccion() {
        elemneto = new LinkedList<>();
    }

    // Comprueba si la colección esta vacía
    @Override
    public boolean estaVacia() {
        if(elemneto.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Extrae el elemento que pide en el índice
    @Override
    public T extraer(int indice) {
        if (!estaVacia() && indice >= 0 && indice < elemneto.size()) {
            return elemneto.remove(indice);
        }
        return null;
    }

    // Devuelve el primer elemento de la colección
    @Override
    public T primero() {
        if (!estaVacia()) {
            return elemneto.getFirst();
        }
        return null;
    }

    // Añade un elemento a la colección
    @Override
    public void añadir(T elemento) {
        elemneto.addFirst(elemento);
    }
}