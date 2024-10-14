package org.iesvdm.Ejer5;

public class Main {
    public static void main(String[] args) {
        ColeccionSimpleGenerica<Integer> pila = new Coleccion<>();

        pila.añadir(3);
        pila.añadir(2);
        pila.añadir(1);

        System.out.println("Primero: " + pila.primero());
        System.out.println("Extraer: " + pila.extraer(1));
        System.out.println("¿La pila esta vacia? " + pila.estaVacia());
    }
}
