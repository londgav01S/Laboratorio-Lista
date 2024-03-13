package co.edu.uniquindio.ejercicios1al10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        SimpleList<Integer> resultado = getElementosImpares(lista);
        imprimirLista(resultado);
    }

    // Escribir un método que devuelva una lista enlazada con los valores impares de
    // una lista denúmeros.

    public static SimpleList<Integer> getElementosImpares(List<Integer> listaNumeros){
        SimpleList<Integer> lista = new SimpleList<Integer>();
        Iterator<Integer> iterador = listaNumeros.iterator();

        while(iterador.hasNext()) {
            Integer n = iterador.next();
            if(n % 2 != 0) lista.agregar(n);
        }
        return lista;
    }

    public static void imprimirLista(SimpleList<Integer>lista) {
        Nodo<Integer> nodoRef= lista.cabeza;
        while(nodoRef!=null) {
            System.out.println(nodoRef.getElemento());
            nodoRef= nodoRef.getSiguiente();
        }
    }

}
