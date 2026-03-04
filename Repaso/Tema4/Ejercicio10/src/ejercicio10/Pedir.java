/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Pedir {
    
    public static int PedirNumero(){ //creo metodo pedir numero
        Scanner entrada = new Scanner(System.in); //creo objeto scanner que es un buffer
        System.out.println("Introducir un número para calcular la tabla de multiplicar: "); //imprimo por pantalla la orden
        int numero; //declaro la variable 
        numero = entrada.nextInt(); //guardo en la variable el numero que le pido al usuario
        entrada.nextLine(); //limpio el buffer para que funcione correctamente
        return numero; //devuelvo el numero al ser un metodo estatico con tipo de variable
    }
}
