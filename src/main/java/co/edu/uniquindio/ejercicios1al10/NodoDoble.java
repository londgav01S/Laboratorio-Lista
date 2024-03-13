package co.edu.uniquindio.ejercicios1al10;


public class NodoDoble<T> {

    public NodoDoble<T> siguienteNodo;
    public NodoDoble<T> anteriorNodo;
    public T valorNodo;



    public NodoDoble(T valorNodo) {
        this.valorNodo = valorNodo;
    }


    /**
     * Constructor de la clase Nodo
     * @param dato Elemento que se guarda en el Nodo
     * @param siguiente Enlace al siguiente Nodo
     */
    public NodoDoble(T dato, NodoDoble<T> siguiente,NodoDoble<T> anterior) {
        super();
        this.valorNodo = dato;
        this.siguienteNodo = siguiente;
        this.anteriorNodo = anterior;
    }


    //Metodos get y set de la clase Nodo

    public NodoDoble<T> getSiguienteNodo() {
        return siguienteNodo;
    }


    public void setSiguienteNodo(NodoDoble<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }


    public T getValorNodo() {
        return valorNodo;
    }


    public void setValorNodo(T valorNodo) {
        this.valorNodo = valorNodo;
    }


    public NodoDoble<T> getAnteriorNodo() {
        return anteriorNodo;
    }


    public void setAnteriorNodo(NodoDoble<T> anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }



}

