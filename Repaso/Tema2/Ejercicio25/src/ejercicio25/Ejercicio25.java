/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Angel
 * @date 03/02/2026
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //clase principal main
        
        Scanner entrada = new Scanner(System.in); //creo scanner para que me escane los valores que le voy a pedir al usuario
        int numero1; //declaro e inicializo las variables 
        int numero2;
        int numero3;
        int suma;
        int producto;
        System.out.println("Por favor, introduzca el primer número:"); //imprimo por pantalla
        numero1 = entrada.nextInt(); //pido el numero al usuario
        System.out.println("Por favor, introduzca el segundo número:");
        numero2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer número:");
        numero3 = entrada.nextInt();
        
        suma = (numero1+numero2+numero3); //hago el calculo primero y luego imprimo resultado *nunca al revés
        System.out.println("La suma de los números es igual : "+suma);
       
        producto= (numero1*numero2*numero3);
        System.out.println("La múltiplicación es igual : "+producto);
        
    }
    
}
