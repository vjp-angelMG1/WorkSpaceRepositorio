/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Arrays;
/**
 *
 * @author Angel
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        int arrayAleatorio; //declaro las variables;
        int i;
        int j;
        int aux;
        // Creo el array con 10 numeros enteros
        int[] arrayEnterosAleatorios = new int[10];

        // Rellenamos con números aleatorios del 50 al 150
        for (i = 0; i < arrayEnterosAleatorios.length; i++) {//bucle for que me permite darle un valor a la variable,recorer los números y incrementar el valor a uno en cada vuelta
            arrayEnterosAleatorios[i] = (int) (Math.random() * 101)+50; //relleno el array con esta variable guardandola en la que con la clase math random hago el calculo para que los numeros salgan hasta el 150

        }

        // To string con el valor del array al principio
        System.out.println("Array principal(no ordenado)"); //imprimo el array principal
        System.out.println(Arrays.toString(arrayEnterosAleatorios)); //imprimo los numeros aleatorios con el método to string

        // Realizo el método burbuja para ordenarlos
        for ( i = 0; i < arrayEnterosAleatorios.length - 1; i++) { //recorro con un bucle for primero las filas 
            for ( j = 0; j < arrayEnterosAleatorios.length - 1; j++) { //recorro con un bucle for segundo las columnas
                 arrayAleatorio = arrayEnterosAleatorios[j]; //guardo el valor del array en otra variable
                // Condicional si arrayEnterosAleatorios[j] es menor que arrayEnterosAleatorios[j + 1] voy a la burbuja
                if (arrayEnterosAleatorios[j] < arrayEnterosAleatorios[j + 1]) {
                    // Realizo el metodo burbuja ordenando los numeros
                    aux = arrayEnterosAleatorios[j];
                    arrayEnterosAleatorios[j] = arrayEnterosAleatorios[j + 1];
                    arrayEnterosAleatorios[j + 1] = aux;
                }
            }

        }

        // Imprimo por pantalla el resultado con el metodo Tostring
        System.out.println("Array en orden de manera descendente (de mayor a menor)"); 
        System.out.println(Arrays.toString(arrayEnterosAleatorios));

    }

}
