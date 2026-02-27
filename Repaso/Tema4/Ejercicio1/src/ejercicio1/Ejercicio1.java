/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 * Ejercicio 01.- Realiza un programa en JAVA en el cual se le
pide al usuario (en el main) un número por teclado. Luego se
llamará a un método que pasándole número introducido por
el usuario, nos dirá si el número introducido es positivo o
negativo.
• Muestra por pantalla el resultado de la siguiente forma:
Por favor, introduzca un numero: xxx
El número introducido es positivo o negativo

 * @author Ángel
 */
public class Ejercicio1 {

    public static void main(String[] args) { //metódo principal main en la que se ejecuta
        int numero; //declaro la variable 
        Scanner entrada = new Scanner(System.in); //Creo objeto Scanner 
        System.out.println("Introduce un numero");
        numero = entrada.nextInt(); //Imprimo por pantalla el número
        positivoONegativo(numero); //llamo al metodo con la variable creada en el método main para que me devuelve el valor de la variable introducido en los parametros del metodo al que llamo
    }
    
    public static void positivoONegativo(int numero1){ //creo el metodo para ver si el numero es positivo o negativo
        
        if(numero1>0){ //condicional si es mayor que 0 
            System.out.println("El numero es positivo"); //imprimo por pantalla
            
        }else if(numero1<0){ //condicional si es menor que 0
            System.out.println("El numero es negativo"); //imprimo por pantalla
        }else{ //si no es igual a 0
            System.out.println("El numero es 0");
        }
    }
    
}
