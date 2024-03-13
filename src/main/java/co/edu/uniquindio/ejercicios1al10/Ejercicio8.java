package co.edu.uniquindio.ejercicios1al10;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {

    //Obtener la lista de personas tengan cédula con cantidad de elementos
    // par de una listaenlazada doble de personas


    public static void main(String []args ) {
        ListaDoble<String> lista= new ListaDoble<>();
        lista.agregarInicio("1234");
        lista.agregarInicio("123");
        lista.agregarInicio("123456");
        List <String> listaResult= obtenerListaCedulas(lista);
        System.out.println(listaResult);
    }
    public static List<String > obtenerListaCedulas (ListaDoble <String > lista){
        List <String > listaCedulas = new ArrayList<>();
        NodoDoble<String > referencia= lista.nodoPrimero;
        while (referencia != null){
            if(cantidadPar(referencia.getValorNodo())){
                listaCedulas.add(referencia.getValorNodo());
            }
            referencia = referencia.getSiguienteNodo();
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
}
