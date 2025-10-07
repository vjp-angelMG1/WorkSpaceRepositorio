/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02numeros;

import java.util.Scanner; //importación de la libreria java util desde scanner
/**
 *
 * @author alumno
 */
public class Ejercicio02numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        Scanner entrada = new Scanner (System.in); //creo un objeto llamado escaner para capturar lo que escriba el usuario
        int numero1; //declaro la variable int
        int numero2; //declaro la variable int
        
        System.out.println("Por favor introduzca un numero"); //Impresión del numero que voy a introducir
        numero1 = entrada.nextInt(); //valor que le voy a dar al numero1
        
        System.out.println("Ahora, introduzca un segundo numero"); //Impresión del numero que voy a introducir 
        numero2 = entrada.nextInt(); //valor que le voy a dar al numero2
        
        if(numero1>10){ //Condicional si el numero1 es mayor al 10 se cumple la condición
            int resultadoMulti = numero1 * numero2; //Variable con el calculo de la multiplicacion de los dos numeros en caso de que se cumpla la condicion
            System.out.println("La operacion que se realizo es multiplicacion y el resultado es "+resultadoMulti); //Impresión del resultado de la multiplicación
        }else{
            int resultadoSuma = numero1 + numero2; //Variable con el calculo de la suma de los dos numeros en caso de que se cumpla la condicion
            System.out.println("La operacion que se realizo es suma y el resultado es " +resultadoSuma); //Impresión del resultado de la suma
                    
               }
            
            
        }
        
    }
    
    