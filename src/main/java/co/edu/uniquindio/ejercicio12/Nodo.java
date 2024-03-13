package co.edu.uniquindio.ejercicio12;

public class Nodo {

    private double numero;

    private Nodo next;

    public Nodo(double numero, Nodo next) {
        this.numero = numero;
        this.next = next;
    }

    public Nodo(double numero) {
        this.numero = numero;
    }


    public double getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
