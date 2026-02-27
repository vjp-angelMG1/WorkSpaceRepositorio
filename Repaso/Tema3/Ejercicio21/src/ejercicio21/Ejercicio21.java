/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner; //Importo la clase java util del paquete Scanner

/**
 *
 * @author Ángel 
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        int resultado; //Declaro las variables 
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in); //creo objeto con el buffer Scanner


            try{ //control de excepciones aqui atrapo el objeto 
                System.out.println("Introduce un número"); //imprimo por pantalla el primer número
                num1 = entrada.nextInt(); //guardo en la variable el valor que le pido al usuario
                System.out.println("Introduce otro número"); //impimo por pantalla el segundo número
                num2 = entrada.nextInt(); //guardo en la variable el valor que le pido al usuario

                resultado = num1 / num2; //Resultado donde puede ocurrir la excepción
            System.out.println("El resultado de la division"+resultado); //imprimo por pantalla el resultado
            }catch(ArithmeticException e){ //control de excepciones si el objeto que atrapo es una letra 
            System.out.println("Error no se puede divir por cero"); //imprimo por pantalla que se introduce una letra y muestro el error
                resultado=0;//actualizar el resultado
            }
            System.out.println("Resultado de la operación "+resultado); //imprimo el valor del resultado
    }
    
}
