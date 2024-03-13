package co.edu.uniquindio.ejercicios1al10;

public class Ejercicio6 {

    public static void main(String []args ) {
        ListaDoble <String> lista= new ListaDoble<>();
        lista.agregarInicio("Hola");
        lista.agregarfinal("Mi nombre");
        lista.agregarfinal("Es Royer");
        imprimirAtras(lista);
    }

    public static <T> void imprimirAtras(ListaDoble<T>lista) {
        NodoDoble<T> nodoRef= lista.nodoPrimero;
        while(nodoRef!=null) {
            System.out.println(nodoRef.getValorNodo());
            nodoRef= nodoRef.getSiguienteNodo();
        }
    }


}
