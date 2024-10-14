package org.iesvdm.Ejer5;

public interface ColeccionSimpleGenerica<T> {
    boolean estaVacia();

    T extraer(int indice);

    T primero();

    void añadir(T elemento);
}