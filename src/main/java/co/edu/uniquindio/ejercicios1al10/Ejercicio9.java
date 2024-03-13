package co.edu.uniquindio.ejercicios1al10;

import java.util.List;

public class Ejercicio9  {


    public static void main(String []args ) {
        ListaSimpleCircular<String> lista= new ListaSimpleCircular<>();
        lista.agregarInicio("1234");
        lista.agregarInicio("123");
        lista.agregarfinal("123456");
        lista.insertarEnIndice(1, "1111");
        imprimirLista(lista);

    }

    public static void imprimirLista(ListaSimpleCircular<String> listaSimpleCircular) {
        Nodo<String> nodoRef = listaSimpleCircular.nodoPrimero;
        if (listaSimpleCircular.nodoPrimero != null) {
            do {
                System.out.println(nodoRef.getElemento());
                nodoRef = nodoRef.getSiguiente();
            } while (nodoRef != listaSimpleCircular.nodoPrimero);
        }
    }

}


