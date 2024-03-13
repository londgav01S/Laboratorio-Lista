package co.edu.uniquindio.ejercicio13;

public class ListaEnlazada {

    private Nodo head;
    private int size;

    public ListaEnlazada(Nodo head){
        this.head = head;
        if(head != null) size++;
    }

    public ListaEnlazada(){
    }

    public void insertarFinal (double elemento){
        Nodo nuevo = new Nodo(elemento);
        if (this.head == null) {
            this.head = nuevo;
        } else {
            Nodo actual = this.head;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
        this.size++;
    }

    public static int obtenerMaxDistancia(ListaEnlazada lista, int valor) {
        return obtenerMaxDistancia(valor, obtenerCoincidencia(valor, lista.head), 0, 0);
    }

    private static Nodo obtenerCoincidencia(int valor, Nodo nodo) {
        if (nodo.getNumero() == valor)
            return nodo;
        return obtenerCoincidencia(valor, nodo.getNext());
    }

    private static int obtenerMaxDistancia(int valor, Nodo nodoRecorrido, int contador, int max) {
        if (nodoRecorrido == null)
            return max;
        if (valor == nodoRecorrido.getNumero())
            return obtenerMaxDistancia(valor, nodoRecorrido.getNext(), 1, Math.max(contador, max));
        return obtenerMaxDistancia(valor, nodoRecorrido.getNext(), contador+1,max);
    }

}
