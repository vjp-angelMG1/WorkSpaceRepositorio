/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Angel
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    //// Método que rellena el vector con números aleatorios entre 1 y 8
    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 8) + 1;
        }
    }

    //Método que muestra el vector junto con un mensaje previo
    public static void mostrarVector(int[] vector, String mensaje) {
        System.out.print(mensaje);
        //Recorremos el vector imprimiendo cada número separado por un espacio
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    //Método que sustituye por 0 todos los valores que estén repetidos
    public static void sustituirRepetidos(int[] vector) {
        boolean rep = false;
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    vector[j] = 0;
                    rep = true;
                }
            }
            if (rep) {
                vector[i] = 0;
                rep = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[10];//Creamos un vector de 10 posiciones

        rellenarVector(vector);//Lo rellenamos con números aleatorios
        mostrarVector(vector, "Se han generado los siguientes numeros: ");

        sustituirRepetidos(vector);//Eliminamos los repetidos
        mostrarVector(vector, "Sustituimos los elementos repetidos por un 0: ");
    }
}
