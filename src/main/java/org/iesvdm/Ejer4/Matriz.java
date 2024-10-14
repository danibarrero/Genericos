package org.iesvdm.Ejer4;

import java.util.Arrays;

public class Matriz<T> {
    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Integer[filas][columnas];
    }

    public void set(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            matriz[fila][columna] = elemento;
        } else {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
    }

    public T get(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return matriz[fila][columna];
        } else {
            throw new IndexOutOfBoundsException("Fuera de rango");
        }
    }

    public int columnas() {
        return columnas;
    }

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
        Matriz<Integer> matriz = new Matriz<>(4, 2);

        int contador = 1;
        for (int i = 0; i < matriz.filas(); i++) {
            for (int j = 0; j < matriz.columnas(); j++) {
                matriz.set(i, j, contador++);
            }
        }

        System.out.println("Matriz");
        System.out.println(matriz.toString());

        System.out.println("Fila 3, Columna 0: " + matriz.get(3, 0));
    }
}
