package co.edu.uniquindio.ejercicios1al10;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String []args ) {
        SimpleList<String> lista= new SimpleList<String>();
        lista.agregar("1234");
        lista.agregar("123");
        lista.agregar("123456");
        List <String> listaResult= obtenerListaCedulas(lista);
        System.out.println(listaResult);
    }

    public static List <String > obtenerListaCedulas (SimpleList <String > lista){
        List <String > listaCedulas = new ArrayList<>();
        Nodo<String > referencia= lista.cabeza;
        while (referencia != null){
            if(cantidadPar(referencia.getElemento())){
                listaCedulas.add(referencia.getElemento());
            }
            referencia = referencia.getSiguiente();
        }
        return listaCedulas;
    }

    private static boolean cantidadPar(String elemento) {
        int cont = 0;
        for(int i = 0; i< elemento.length(); i++){
            cont ++;
        }
        if(cont%2 ==0){
            return true;

        }
        return false;
    }

    public static void imprimirLista(SimpleList<String>lista) {
        Nodo<String> nodoRef= lista.cabeza;
        while(nodoRef!=null) {
            System.out.println(nodoRef.getElemento());
            nodoRef= nodoRef.getSiguiente();
        }
    }
}
