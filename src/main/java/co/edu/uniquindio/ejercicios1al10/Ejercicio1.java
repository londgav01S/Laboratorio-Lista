package co.edu.uniquindio.ejercicios1al10;

public class Ejercicio1 {

    public static void main(String []args ) {
        SimpleList<Integer> lista= new SimpleList<Integer>();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);
        SimpleList <Integer> listaResult= obtenerNumerosPosImpares(lista);
        imprimirLista(listaResult);
    }
    /**
     * Se busca retornar los numeros que esten en una posicion impar de la lista simple
     * @param lista
     * @return
     */
    public static SimpleList<Integer> obtenerNumerosPosImpares(SimpleList<Integer> lista) {
        SimpleList<Integer> listaRetorno = new SimpleList<Integer>();
        Nodo<Integer> referencia = lista.cabeza;
        int cont = 0;
        while (referencia!= null) {
            if (cont % 2 != 0) {
                listaRetorno.agregar(referencia.getElemento());

            }
            referencia = referencia.getSiguiente();
            cont++;
        }
        return listaRetorno;
    }

    public static void imprimirLista(SimpleList<Integer>lista) {
        Nodo<Integer> nodoRef= lista.cabeza;
        while(nodoRef!=null) {
            System.out.println(nodoRef.getElemento());
            nodoRef= nodoRef.getSiguiente();
        }
    }

}