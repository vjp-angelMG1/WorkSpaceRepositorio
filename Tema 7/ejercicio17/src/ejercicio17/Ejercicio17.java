/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author Angel
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        int[] numeroAleatorio = new int[10];
        for (int i = 0; i < numeroAleatorio.length; i++) {
            numeroAleatorio[i] = (int) (Math.random() * 10);
        }

        mostrarPantalla(numeroAleatorio);
        ordenarMayor(numeroAleatorio);
        visualizarArrayOrdenado(numeroAleatorio);

    }

    public static void mostrarPantalla(int numeroAleatorio[]) {
        System.out.println("Mostrar los numeros aleatorios");
        for (int i = 0; i < numeroAleatorio.length; i++) {
            System.out.println("Posicion" + i + "es :" + numeroAleatorio[i] + ":");
        }

    }

    public static void ordenarMayor(int numeroAleatorio[]) {
        int aux;

        for (int i = 0; i < numeroAleatorio.length; i++) {
            for (int j = 0; j < numeroAleatorio.length - 1; j++) {
                if (numeroAleatorio[j] < numeroAleatorio[j + 1]) {
                    aux = numeroAleatorio[j];
                    numeroAleatorio[j] = numeroAleatorio[j + 1];
                    numeroAleatorio[j + 1] = aux;
                }

            }

        }
    }

    public static void visualizarArrayOrdenado(int numeroAleatorio[]) {
        System.out.println("Visualizar los número aleatorios");
        for (int i = 0; i < numeroAleatorio.length; i++) {
            System.out.println("Posicion" + i + "es :" + numeroAleatorio[i] + ":");
        }
    }
}
