package org.iesvdm.Ejer3;

import java.util.Arrays;

public class Matriz<T> {
    private T[][] matriz; // Matriz bidireccional de tipo genérico
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Object[filas][columnas];
    }

    // Coloca un elemento en una posición específica
    public void set(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            matriz[fila][columna] = elemento;
        }
    }

    // Obtiene el elemento de una posición en concreto
    public T get(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return matriz[fila][columna];
        }
        return null;
    }

    // Devuelve el número de columnas
    public int columnas() {
        return columnas;
    }

    // Devuelve el número de filas
    public int filas() {
        return filas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T[] row : matriz) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Matriz<Object> matriz = new Matriz<>(3, 4); // Se crea la matriz con el número de filas y columnas

        matriz.set(2, 0, 1);
        matriz.set(0, 0, "Hola");
        matriz.set(0, 1, "AA");
        matriz.set(1, 1, 0);

        System.out.println(matriz.toString());

        System.out.println("Elemento en (0, 0): " + matriz.get(0, 1));
        System.out.println("Filas: " + matriz.filas());
        System.out.println("Columnas: " + matriz.columnas());
    }
}
