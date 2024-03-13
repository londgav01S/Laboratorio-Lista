package co.edu.uniquindio.ejercicios1al10;

import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        SimpleList<Integer> lista = new SimpleList<Integer>();
        for (int i = 0; i <20; i++) lista.agregar(i);
    Nodo cabeza = lista.getCabeza();
    eliminarPares(cabeza,lista);
    imprimirLista(lista);


}

    private static void eliminarPares(Nodo nodo, SimpleList<Integer> lista) {
        int longitud = lista.getLongitud();
        for (int i = 0; i < longitud; i++) {
            int num= (int) nodo.getElemento();
            if (isPar(num)) {
                eliminar(num, lista);
            }
            nodo = nodo.getSiguiente();
        }
    }


    public static void eliminar(int elemento, SimpleList<Integer> lista) {
        Nodo cabeza = lista.getCabeza();
        int longitud = lista.getLongitud();
        if (cabeza != null) {
            if (cabeza.getElemento().equals(elemento)) {
                cabeza = cabeza.getSiguiente();
                longitud--;
            } else {
                Nodo actual = cabeza;
                while (actual.getSiguiente() != null) {
                    if (actual.getSiguiente().getElemento().equals(elemento)) {
                        actual.setSiguiente(actual.getSiguiente().getSiguiente());
                        longitud--;
                        break;
                    }
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    public static boolean isPar(int elemento){
        if(elemento%2==0){
            return true;
        }
        return false;
    }

    public static void imprimirLista(SimpleList<Integer> lista) {
        Nodo<Integer> nodoRef = lista.getCabeza();
        while (nodoRef != null) {
            System.out.println(nodoRef.getElemento());
            nodoRef = nodoRef.getSiguiente();
        }
    }
}

