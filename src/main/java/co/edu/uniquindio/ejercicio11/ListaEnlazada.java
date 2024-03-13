package co.edu.uniquindio.ejercicio11;

public class ListaEnlazada {

    private PolinomicalNode head;
    private int size;

    public ListaEnlazada(PolinomicalNode head){
        this.head = head;
        if(head != null) size++;
    }

    public Double obtenerValor(Double x){
        double resultado = 0;
        PolinomicalNode actual = head;
        while(actual != null){
            resultado += (actual.getCoeficiente() * Math.pow(x, actual.getExponente()));
            actual = actual.getNext();
        }
        return  resultado;
    }
}
