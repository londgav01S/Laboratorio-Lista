package co.edu.uniquindio.ejercicios1al10;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {



    public static void main(String[] args) {
        SimpleList<Integer> lista1 = new SimpleList<>();
        lista1.agregar(1);
        lista1.agregar(2);
        lista1.agregar(3);

        SimpleList<Integer> lista2 = new SimpleList<>();
        lista2.agregar(4);
        lista2.agregar(5);
        lista2.agregar(6);

        List<Integer> listaConcatenada = concatenarListas(lista1, lista2);
        System.out.println("Lista concatenada: " + listaConcatenada);
    }
    public static <T> List<T> concatenarListas(SimpleList<T> lista1, SimpleList<T> lista2) {
        List<T> listaConcatenada = new ArrayList<>();

        Nodo<T> nodoActual = lista1.cabeza;
        while (nodoActual != null) {
            listaConcatenada.add(nodoActual.getElemento());
            nodoActual = nodoActual.getSiguiente();
            if (nodoActual == lista1.cabeza) {
                break; // Salir si se ha recorrido toda la lista1
            }
        }

        nodoActual = lista2.cabeza;
        while (nodoActual != null) {
            listaConcatenada.add(nodoActual.getElemento());
            nodoActual = nodoActual.getSiguiente();
            if (nodoActual == lista2.cabeza) {
                break; // Salir si se ha recorrido toda la lista2
            }
        }

        return listaConcatenada;
    }
}
