package co.edu.uniquindio.ejercicios1al10;
import java.util.Iterator;

public class ListaSimpleCircular <T> implements Iterable<T>{
    public Nodo<T> nodoPrimero;
    public Nodo<T> nodoUltimo;
    public int tamanio;


    public ListaSimpleCircular() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }



    //Metodos basicos

    private boolean indiceValido(int indice) {
        if (indice >= 0 && indice < tamanio) {
            return true;
        }
        throw new RuntimeException("�ndice no v�lido");
    }
    private Nodo<T> obtenerNodo(int indice) {

        if (indice >= 0 && indice < tamanio) {

            Nodo<T> nodo = nodoPrimero;

            for (int i = 0; i < indice; i++) {
                nodo = nodo.getSiguiente();
            }

            return nodo;
        }

        return null;
    }
    public void insertar(T dato, int indice) {

        if (indiceValido(indice)) {

            if (indice == 0) {
                agregarInicio(dato);
            } else {
                Nodo<T> nuevo = new Nodo<>(dato);
                Nodo<T> aux = nodoUltimo.getSiguiente();
                nodoUltimo.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
                nodoUltimo = nuevo;


            }
            tamanio++;
        }
    }

    public void insertarEnIndice(int indice, T valorNodo) {
        if (indice < 0 || indice > tamanio) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }

        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

        if (indice == 0) {
            agregarInicio(valorNodo); // Si el índice es 0, simplemente agregamos al principio
            return;
        }

        Nodo<T> nodoActual = nodoPrimero;
        for (int i = 0; i < indice - 1; i++) {
            nodoActual = nodoActual.getSiguiente();
        }

        Nodo<T> siguienteNodo = nodoActual.getSiguiente();
        nodoActual.setSiguiente(nuevoNodo);
        nuevoNodo.setSiguiente(siguienteNodo);

        if (indice == tamanio) {
            nodoUltimo = nuevoNodo; // Si el índice es el último, actualizamos nodoUltimo
        }

        tamanio++;
    }

    //Agregar al inicio de la lista
    public void agregarInicio(T valorNodo) {

        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

        if (estaVacia()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo; // Actualiza nodoUltimo cuando la lista está vacía
        } else {
            Nodo<T> aux = nodoPrimero;
            nodoPrimero = nuevoNodo;
            nuevoNodo.setSiguiente(aux);
            nodoUltimo.setSiguiente(nodoPrimero); // Actualiza el enlace del último nodo
        }
        tamanio++;
    }


    //Agregar al final de la lista
    public void agregarfinal(T valorNodo) {

        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

        if(estaVacia())
        {
            nodoPrimero = nodoUltimo = nuevoNodo;
        }
        else
        {
            Nodo<T> aux = nodoUltimo.getSiguiente();
            nodoUltimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(aux);
            nodoUltimo = nuevoNodo;
        }
        tamanio++;
    }

    //Verificar si la lista esta vacia
    public boolean estaVacia() {
        return(nodoPrimero == null)?true:false;
    }


    @Override
    public Iterator<T> iterator() {

        return new IteradorListaSimple (nodoPrimero);
    }

    protected class IteradorListaSimple implements Iterator<T>{

        private Nodo<T> nodo;
        private int posicion;

        /**
         * Constructor de la clase Iterador
         * @param
         */
        public IteradorListaSimple(Nodo<T> nodo) {
            this.nodo = nodo;
            this.posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return nodo!=null;
        }

        @Override
        public T next() {
            T valor = nodo.getElemento();
            nodo = nodo.getSiguiente();
            posicion++;
            return valor;
        }

        /**
         * Posici�n actual de la lista
         * @return posici�n
         */
        public int getPosicion() {
            return posicion;
        }

    }



    //Metodos get y set de la clase ListaSimple


    public Nodo getNodoPrimero() {
        return nodoPrimero;
    }


    public void setNodoPrimero(Nodo nodoPrimero) {
        this.nodoPrimero = nodoPrimero;
    }


    public int getTamanio() {
        return tamanio;
    }


    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }





}
