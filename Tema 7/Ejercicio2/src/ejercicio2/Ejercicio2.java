/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Creo un array para 7 números
        int[] numeros = new int[7];
        
        // Meto los datos
        introducirDatos(numeros);
        
        // Muestro el array original
        System.out.println("\nArray original:");
        mostrarDatos(numeros);
        
        // Intercambio 2ª y 4ª posición
        intercambiarPosiciones(numeros);
        
        // Muestro el array modificado
        System.out.println("\nArray después del intercambio:");
        mostrarDatos(numeros);
    }
    
    // Método para meter los datos
    public static void introducirDatos(int[] array) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa 7 números enteros:");
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
    }
    
    // Método para mostrar los datos
    public static void mostrarDatos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
    
    // Método para intercambiar 2ª y 4ª posición
    public static void intercambiarPosiciones(int[] array) {
        // Guardo el valor de la posición 2 (índice 1)
        int temporal = array[1];
        
        // Asigno el valor de la posición 4 (índice 3) a la posición 2
        array[1] = array[3];
        
        // Asigno el valor temporal (original de posición 2) a la posición 4
        array[3] = temporal;
    }
}
   
    

