package org.iesvdm.Ejer4;

import java.util.Arrays;

public class Matriz<T> {
    private T[][] matriz; // Matriz bidireccional de tipo genérico
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Integer[filas][columnas];
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
        Matriz<Integer> matriz = new Matriz<>(4, 2); // Se crea la matriz con el número de filas y columnas

        int contador = 1;

        // Bucle para llenar la matriz
        for (int i = 0; i < matriz.filas(); i++) {
            for (int j = 0; j < matriz.columnas(); j++) {
                matriz.set(i, j, contador++);
            }
        }

        System.out.println(matriz.toString());

        System.out.println("Fila 3, Columna 0: " + matriz.get(3, 0));
    }
}
