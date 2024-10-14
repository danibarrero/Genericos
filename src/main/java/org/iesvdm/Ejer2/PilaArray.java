package org.iesvdm.Ejer2;

public class PilaArray<T> {
    private T[] numeros; // Almacena los elementos de la pila
    private int elementos;

    public PilaArray(int capacidad) {
        this.numeros = (T[]) new Object[capacidad];
        this.elementos = 0;
    }

    // Comprueba si la pila esta vacía
    public boolean estaVacia() {
        if (this.elementos == this.numeros.length) {
            return true;
        } else {
            return false;
        }
    }

    // Extrae el elemento que pide en el índice
    public T extraer(int indice) {
        if (estaVacia() || indice < 0 || indice >= elementos) {
            return null;
        }

        T elemento = numeros[indice];

        for (int i = indice; i < elementos - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[--elementos] = null;
        return elemento;
    }

    // Devuelve el primer elemento de la pila
    public T primero() {
        if (!estaVacia()) {
            return numeros[elementos - 1];
        }
        return null;
    }

    // Añade un elemento a la pila
    public void añadir(T elemento) {
        if (elementos >= numeros.length) {
            throw new IllegalStateException("La pila esta llena");
        }
        numeros[elementos++] = elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elementos; i++) {
            sb.append(numeros[i]);
            if (i < elementos - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        PilaArray<Integer> pila = new PilaArray<>(5); // Crea una pila de enteros con capacidad de 5

        pila.añadir(1);
        pila.añadir(2);
        pila.añadir(3);

        System.out.println("Pila: " + pila);
        System.out.println("Primer numero: " + pila.primero());
        System.out.println("Extraer: " + pila.extraer(1));
        System.out.println("Pila: " + pila);
        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}
