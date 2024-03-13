package co.edu.uniquindio.ejercicios1al10;

import java.util.List;

public class Ejercicio5 {


    public static void main(String []args ) {
        SimpleList<Integer> lista= new SimpleList<Integer>();
        int elemento = 4;
        lista.agregar(123);
        lista.agregar(123);
        lista.agregar(1);
        lista.agregar(2);
        int i = cantidadRepetidasElemento(elemento, lista);
        System.out.println(i);
    }
    public static <E> int  cantidadRepetidasElemento(E elemento, SimpleList<E> lista){
        Nodo<E> referencia = lista.cabeza;
        int cont =0 ;
        while (referencia != null){
            if(elemento == referencia.getElemento()){
                cont++;
            }
            referencia = referencia.getSiguiente();
        }
        return cont;
    }


}
