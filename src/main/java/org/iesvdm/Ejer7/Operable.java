package org.iesvdm.Ejer7;

public interface Operable<T> {
    T sumar(T otro);
    T restar(T otro);
    T multiplicar(T otro);
    T dividir(T otro);
}