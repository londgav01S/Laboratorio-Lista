package co.edu.uniquindio.ejercicio11;


public class Main {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada(
                new PolinomicalNode(3.0, 4.0,
                        new PolinomicalNode(-4.0, 2.0,
                                new PolinomicalNode(11.0, 0.0))));

        String tabla = "";
        for(double i = 0; i <= 5; i+=0.5){
            double resultado = lista.obtenerValor(i);
            tabla += String.format("|x: %.3f |y: %.3f|%n", i, resultado);
        }
        System.out.println(tabla);
    }
}
