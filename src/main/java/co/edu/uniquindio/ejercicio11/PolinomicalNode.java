package co.edu.uniquindio.ejercicio11;

public class PolinomicalNode {

    private Double coeficiente;
    private Double exponente;

    private PolinomicalNode next;

    public PolinomicalNode(Double coeficiente, Double exponente, PolinomicalNode next) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.next = next;
    }

    public PolinomicalNode(Double coeficiente, Double exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Double getExponente() {
        return exponente;
    }

    public void setExponente(Double exponente) {
        this.exponente = exponente;
    }

    public PolinomicalNode getNext() {
        return next;
    }

    public void setNext(PolinomicalNode next) {
        this.next = next;
    }
}
