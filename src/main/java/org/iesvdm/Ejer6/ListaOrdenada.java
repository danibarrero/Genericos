package org.iesvdm.Ejer6;

import java.util.ArrayList;
import java.util.Collections;

public class ListaOrdenada <E extends Comparable<E>> {
    private ArrayList<E> lista; // ArrayList que almacena los elementos de una lista


    public ListaOrdenada() {
        this.lista = new ArrayList<>();
    }

    // Añade el elemento a la lista y lo ordena
    public void add(E o) {
        lista.add(o);
        Collections.sort(lista);
    }

    // Obtiene un elemento
    public E get(int index) {
        return lista.get(index);
    }

    // Obtiene el tamaño
    public int size() {
        return lista.size();
    }

    // Comprueba si la lista esta vacía
    public boolean isEmpty() {
        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Elimina un elemento de la lista y devuelve true si lo elimina
     public boolean remove(E o) {
        if (lista.remove(o)) {
            return true;
        } else {
            return false;
        }
     }

     // Comprueba si un elemento existe en la lista
     public boolean indexOf(E o) {
        return lista.indexOf(o) != -1;
     }

    @Override
    public String toString() {
        return "ListaOrdenada: " + lista;
    }

    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(3);

        System.out.println(lista);
        System.out.println("Elemento en indice 2: " + lista.get(2));
        System.out.println("Tamaño: " + lista.size());
        System.out.println("Está vacía: " + lista.isEmpty());
        System.out.println("Índice de 8: " + lista.indexOf(8));
        System.out.println("Eliminado 3: " + lista.remove(3));
        System.out.println(lista);
    }
}
