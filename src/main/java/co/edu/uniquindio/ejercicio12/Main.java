package co.edu.uniquindio.ejercicio12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listica = leerNumerostxt("src/main/java/co/edu/uniquindio/ejercicio12/numerosReales.txt");
        System.out.println(listica.obtenerMedia());
        System.out.println(listica.obtenerDesviacionEstandar());
    }

    public static ListaEnlazada leerNumerostxt(String ruta) {
        ListaEnlazada listaEnlazada = new ListaEnlazada(null);
        try {
            File file = new File(ruta);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                listaEnlazada.insertarFinal(Double.parseDouble(data));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return listaEnlazada;
        }
        return listaEnlazada;
    }
}
