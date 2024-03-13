package co.edu.uniquindio.ejercicios1al10;

public class Nodo <T>  {
    private T elemento;
    private Nodo<T> siguiente;

    public Nodo(T elemento){
        this.elemento = elemento;
        this.siguiente = null;
    }

    public T getElemento(){
        return this.elemento;
    }

    public Nodo<T> getSiguiente(){
        return this.siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }



    public void setElemento(T elemento){
        this.elemento = elemento;
    }


}
