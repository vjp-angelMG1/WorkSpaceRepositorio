/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * • Ejercicio 02.- Crea un programa que calcule el mayor, el menor y la suma de
 * todos los elementos de una lista que contenga números enteros positivos. • El
 * programa permitirá, mediante un método, que el usuario introduzca valores
 * hasta que introduzca un valor negativo. • Otro método visualizará los
 * elementos de la lista • Por último, se mostrará el mayor, el menor y la suma
 * de los elementos (implementado en 3 métodos independientes)
 *
 *
 * @author Ángel
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();//Creo la lista de array
        System.out.println("rellenar lista :"); //imprimo por pantalla y llamo a los métodos
        rellenarLista(numero);
        System.out.println("mostrar lista :");
        mostrarLista(numero);
        System.out.println("mostrar mayor");
        mostrarMayor(numero);
        System.out.println("mostrar menor");
        mostrarMenor(numero);
        System.out.println("mostrar la suma de los numeros");
        mostrarSuma(numero);
    }

   
    public static void rellenarLista(ArrayList<Integer> numero) { //metodo que rellena la lista si no se introducen numeros negativos
        
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        
        
        do { //bucle que se repite
            System.out.println("Introducir un numero");
            numero.add(entrada.nextInt());

        } while (numero.getLast() >= 0); //mientras el numero introducido sea men
    }

    /**
     * Método que muestra la lista entera
     *
     * @param num
     */
    public static void mostrarLista(ArrayList<Integer> num) {
        for (int i = 0; i < numero.size(); i++) {
            System.out.println("El número correspondiente a la posición " + (i + 1) + " es: " + num.get(i));
        }
    }
    
    /**
     * Método que muestra el mayor número de la lista
     * 
     * @param num 
     */
    public static void mostrarMayor(ArrayList<Integer> num) {
        int mayor = num.get(0);
        
        for (int i = 0; i < num.size(); i++){
            if (mayor < num.get(i)) {
                mayor = num.get(i);
            }
        }
        
        System.out.println("El mayor número de la lista es: "+ mayor);
    }
    
    /**
     * Método que muestra el menor número de la lista
     * 
     * @param num 
     */
    public static void mostrarMenor(ArrayList<Integer> num) {
        int menor = num.get(0);
        
        for (int i = 0; i < num.size(); i++){
            if (menor > num.get(i)) {
                menor = num.get(i);
            }
        }
        
        System.out.println("El menor número de la lista es: "+ menor);
    }
    
    /**
     * Método que muestra la suma de los números de la lista
     * 
     * @param num 
     */
    public static void mostrarSuma(ArrayList<Integer> num) {
        int suma = 0;
        
        for (int i = 0; i < num.size(); i++){
            suma += num.get(i);
        }
        
        System.out.println("La suma de los números de la lista es: "+ suma);
    }
}
