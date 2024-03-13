package co.edu.uniquindio.ejercicios1al10;

import java.util.Iterator;

public class SimpleList<T> implements Iterable<T>{
    public Nodo<T> cabeza;
    private Nodo<T> nodoUltimo;

    private int longitud;

    public SimpleList() {
        this.cabeza = null;
        this.nodoUltimo = null;
        this.longitud = 0;
    }

    public void agregar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (this.cabeza == null) {
            this.cabeza = nuevo;
        } else {
            Nodo<T> actual = this.cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        this.longitud++;
    }

    public void mostrar() {
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            System.out.println(actual.getElemento());
            actual = actual.getSiguiente();
        }
    }

    public boolean contiene(T elemento) {
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            if (actual.getElemento().equals(elemento)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int getLongitud() {
        return this.longitud;
    }

    public void eliminar(T elemento) {
        if (this.cabeza != null) {
            if (this.cabeza.getElemento().equals(elemento)) {
                this.cabeza = this.cabeza.getSiguiente();
                this.longitud--;
            } else {
                Nodo<T> actual = this.cabeza;
                while (actual.getSiguiente() != null) {
                    if (actual.getSiguiente().getElemento().equals(elemento)) {
                        actual.setSiguiente(actual.getSiguiente());
                        this.longitud--;
                        break;
                    }
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    public boolean contieneLista(SimpleList<T> otra) {
        Nodo<T> actual = otra.cabeza;
        while (actual != null) {
            if (!this.contiene(actual.getElemento())) {
                return false;
            }
            actual = actual.getSiguiente();
        }
        return true;
    }



    //Agregar al inicio de la lista
    public void agregarInicio(T valorNodo) {
        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);
        if(estaVacia())	{
            cabeza = nuevoNodo;
            nodoUltimo = nuevoNodo;
        }
        else{
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
        longitud++;
    }


    //Agregar al final de la lista


    //Obtener Nodo el valor de un Nodo
    public T obtenerValorNodo(int indice) {
        Nodo<T> nodoTemporal = null;
        int contador = 0;
        if(indexValido(indice)){
            nodoTemporal = cabeza;
            while (contador < indice) {
                nodoTemporal = nodoTemporal.getSiguiente();
                contador++;
            }
        }if(nodoTemporal != null)
            return nodoTemporal.getElemento();
        else
            return null;
    }

    public void insertarDespues (T elemento, T referencia){
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (this.cabeza != null) {
            Nodo<T> actual = this.cabeza;
            while (actual != null) {
                if (actual.getElemento().equals(referencia)) {
                    nuevo.setSiguiente(actual.getSiguiente());
                    actual.setSiguiente(nuevo);
                    this.longitud++;
                    break;
                }
                actual = actual.getSiguiente();
            }
        }
    }

    public T obtenerValorNodo (Nodo < T > nuevo) {
        return nuevo.getElemento();
    }

    public Nodo<T> obtenerNodo ( int index){
        if (index >= 0 && index < this.longitud) {
            Nodo<T> actual = this.cabeza;
            int contador = 0;
            while (contador < index) {
                actual = actual.getSiguiente();
                contador++;
            }
            return actual;
        }
        return null;
    }

    public T obtenerValor ( int index){
        if (indexValido(index)) {
            Nodo<T> actual = this.cabeza;
            int contador = 0;
            while (contador < index) {
                actual = actual.getSiguiente();
                contador++;
            }
            return actual.getElemento();
        }
        return null;
    }

    public int obtenerIndice (T elemento){
        Nodo<T> actual = this.cabeza;
        int contador = 0;
        while (actual != null) {
            if (actual.getElemento().equals(elemento)) {
                return contador;
            }
            actual = actual.getSiguiente();
            contador++;
        }
        return -1;
    }

    public boolean indexValido ( int index){
        if(index >= 0 && index < this.longitud){
            return true;
        }
        throw new IndexOutOfBoundsException("Index invalido");
    }

    public boolean isEmpty () {
        return this.longitud == 0;
    }

    public void eliminarInicio () {
        if (this.cabeza != null) {
            this.cabeza = this.cabeza.getSiguiente();
            this.longitud--;
        }
    }

    //Verificar si la lista esta vacia
    public boolean estaVacia() {
        return(cabeza == null)?true:false;
    }

    //Elimina el primer nodo de la lista
    public T eliminarPrimero() {

        if( !estaVacia() ) {
            Nodo<T> n = cabeza;
            T valor = n.getElemento();
            cabeza = n.getSiguiente();

            if(cabeza==null) {
//				nodoUltimo = null;
            }

            longitud--;
            return valor;
        }

        throw new RuntimeException("Lista vac�a");
    }


    public void modificarNodo (T elemento){
        Nodo<T> actual = this.cabeza;
        while (actual != null) {
            if (actual.getElemento().equals(elemento)) {
                actual.setElemento(elemento);
            }
            actual = actual.getSiguiente();
        }

    }

    public void eliminarLista () {
        this.cabeza = null;
        this.longitud = 0;
    }




    //EJERCICIO 7

    @Override
    public Iterator<T> iterator() {

        return new IteradorListaSimple (cabeza);
    }

    public class IteradorListaSimple implements Iterator<T>{
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
            nodo = nodo.getSiguiente();// i++;
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

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo<T> getNodoUltimo() {
        return nodoUltimo;
    }

    public void setNodoUltimo(Nodo<T> nodoUltimo) {
        this.nodoUltimo = nodoUltimo;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}