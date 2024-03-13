package co.edu.uniquindio.ejercicio13;

import co.edu.uniquindio.ejercicio13.ListaEnlazada;

import static co.edu.uniquindio.ejercicio13.ListaEnlazada.obtenerMaxDistancia;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertarFinal(9);
        lista.insertarFinal(4);
        lista.insertarFinal(6);
        lista.insertarFinal(8);
        lista.insertarFinal(5);
        lista.insertarFinal(5);
        lista.insertarFinal(7);
        lista.insertarFinal(5);

        System.out.println(obtenerMaxDistancia(lista, 4));
    }

}
