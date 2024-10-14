package org.iesvdm.Ejer1;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T extraer(int indice) {
        if (estaVacia()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }

        T elemento = elementos.remove(indice);
        return elemento;
    }

    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        return elementos.get(elementos.size() - 1);
    }

    public void añadir(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elementos.size(); i++) {
            sb.append(elementos.get(i));
            if (i < elementos.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.añadir(1);
        pila.añadir(2);
        pila.añadir(3);

        System.out.println("Pila: " + pila);
        System.out.println("Primer numero: " + pila.primero());
        System.out.println("Extraer: " + pila.extraer(0));
        System.out.println("Pila despues de extraer: " + pila);
        System.out.println("¿La Pila esta vacia? " + pila.estaVacia());
    }
}
