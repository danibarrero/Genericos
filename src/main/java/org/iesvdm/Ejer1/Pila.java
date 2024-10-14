package org.iesvdm.Ejer1;

import java.util.LinkedList;

public class Pila<T> {
    private LinkedList<T> lista;

    public Pila() {
        lista = new LinkedList<>();
    }

    public boolean estaVacia() {
        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public T extraer(int indice) {
        if (!estaVacia() && indice >= 0 && indice < lista.size()) {
            return lista.remove(indice);
        }
        return null;
    }

    public T primero() {
        if (!estaVacia()) {
            return lista.get(lista.size() - 1);
        }
        return null;
    }


    public void añadir(T elemento) {
        lista.add(elemento);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
            if (i < lista.size() - 1) {
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
        System.out.println("Pila: " + pila);
        System.out.println("¿La Pila esta vacia? " + pila.estaVacia());
    }
}
