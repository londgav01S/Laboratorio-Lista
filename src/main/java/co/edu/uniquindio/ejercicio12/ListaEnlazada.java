package co.edu.uniquindio.ejercicio12;

public class ListaEnlazada {

    private Nodo head;
    private int size;

    public ListaEnlazada(Nodo head){
        this.head = head;
        if(head != null) size++;
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

    public double obtenerMedia(){
        double resultado =0;
        Nodo nodo = head;
        double valor = nodo.getNumero();
        while(nodo.getNext() != null){
            resultado+=valor;
            nodo = nodo.getNext();
            valor = nodo.getNumero();
        }
        resultado += valor;
        return resultado/size;
    }

    public double obtenerDesviacionEstandar(){
        double resultado = 0;
        double media = obtenerMedia();
        Nodo nodo = head;
        double valor = nodo.getNumero();
        while(nodo.getNext() != null){
            resultado+=Math.pow(valor-media,2);
            nodo = nodo.getNext();
            valor = nodo.getNumero();
        }
        resultado += Math.pow(valor-media,2);
        return Math.sqrt(resultado/(size-1));
    }

    public void mostrar() {
        Nodo actual = this.head;
        while (actual != null) {
            System.out.println(actual.getNumero());
            actual = actual.getNext();
        }
    }


}
