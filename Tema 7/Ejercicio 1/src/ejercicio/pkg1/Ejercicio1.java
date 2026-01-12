/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[10]; //Declaro e inicializo el array con valor de 10 numeros enteros
        PedirNumero(num);
        MostrarPar(num); //muestro el resultado del metodo  llamandolo
    }
    public static void PedirNumero(int [] num) { //Creo metrodo pedir numero 
        Scanner entrada = new Scanner(System.in); //Escanear numero 
        for (int i=0; i<num.length; i++){ //bucle for con length para ver la longuitud 
            System.out.println("Indroduzca el número entero"); //imprimir por pantalla
            num[i] = entrada.nextInt(); //dar entrada a los valores del array
        }
    }
    
    public static void MostrarPar(int [] num) { //método para mostrar el valor par 
        for (int i=0; i<num.length; i++){ //Bucle para leer el array completo 
            if (num[i]%2==0){ //condicional si para saber si el array es par 
                System.out.println("el contenido del arrays" + i + "es:" + num[i]); //imprimir el valor del array
            }
        }
    }
}    
    
