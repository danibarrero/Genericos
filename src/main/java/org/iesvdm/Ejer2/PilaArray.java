package org.iesvdm.Ejer2;

public class PilaArray<T> {
    private T[] numeros;
    private int elementos;

    @SuppressWarnings("unchecked")
    public PilaArray(int capacidad) {
        this.numeros = (T[]) new Object[capacidad];
        this.elementos = 0;
    }

    public boolean estaVacia() {
        return elementos == 0;
    }

    public T extraer(int indice) {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        if (indice < 0 || indice >= elementos) {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }

        T elemento = numeros[indice];

        for (int i = indice; i < elementos - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        numeros[--elementos] = null;
        return elemento;
    }

    public T primero() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        return numeros[elementos - 1];
    }

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
        PilaArray<Integer> pila = new PilaArray<>(5);
        pila.añadir(1);
        pila.añadir(2);
        pila.añadir(3);

        System.out.println("Pila: " + pila);
        System.out.println("Primer numero: " + pila.primero());
        System.out.println("Extraer: " + pila.extraer(1));
        System.out.println("Pila después de extraer: " + pila);
        System.out.println("¿La pila está vacía? " + pila.estaVacia());
    }
}
