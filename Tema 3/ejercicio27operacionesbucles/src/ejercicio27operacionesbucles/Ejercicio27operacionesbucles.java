/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27operacionesbucles;
import java.util.Scanner;
/**
 *
 * @author Ángel //Etiqueta nombre
 * @since 18/10/2025 //Etiqueta fecha
 */
public class Ejercicio27operacionesbucles {
   /**
    * @param args the command line arguments
    */
    public static void main(String[] args) { //método main
        Scanner entrada= new Scanner(System.in); //Entrada del scanner para darle valor al objeto
        
        int numero1,numero2; //Declaración de variables
        int opcion=0;
        
        System.out.println("Entrada numero1"); //imprimo entrada numero1
        numero1 = entrada.nextInt(); //Inicializo la entrada numero1 para que se guarde
        
        System.out.println("Entrada numero2"); //imprimo entrada numero2
        numero2 = entrada.nextInt(); //Inicializo la entrada numero2 para que se guarde 
        
        do{ // Inicializo bucle
            System.out.println("Menu de Operaciones "); //imprimo menu de operaciones 
            System.out.println("1.Sumar los numeros "); //imprimo opcion 1
            System.out.println("2.Resta los numeros "); //imprimo opcion 2
            System.out.println("3.Multiplica los numeros "); //imprimo opcion 3
            System.out.println("4.Divide los numeros "); //imprimo opcion 4
            System.out.println("5.Salir"); //imprimo opción 5
            System.out.println("Elige una opción"); //imprimo la elección de opción
            
            opcion = entrada.nextInt();// Inicializo la opcion que le voy a dar para que se guarda recojo ese valor
            switch (opcion) { //introduczco condicional multiple switch dependiendo del valor se ejecutara uno de los case
                case 1: // en caso de itntroducion 1 la primera sentencia
                    System.out.println("La suma es: " + (numero1 + numero2)); //imprimo el resultado de la operación de la primera sentencia en caso de ser introducido la opcion 1
                    break; //hace que el programa salga del switch para que no sigan ejecutando los s0iguientes case
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (numero1 * numero2));
                    break;
                case 4:
                    try { // Control de excepciones se intenta ejecutar la división 
                        System.out.println("La division es: " + (numero1 / numero2)); //Imprimo el resultado de la operacion de la división
                    } catch(ArithmeticException e){ //la excepcion de que si el numero2 es igual a 0 no se puede realizar la division
                         System.out.println("No se puede dividir por cero"); //imprimo el resultado de la excepcion de dividir por 0
                    }
                    break;
                case 5: //en caso de introducción de la 5 sentencia 
                    System.out.println("Salir"); //imprimo el resultado
                    break;
                default: //al introducir un resultado que no este entre el caso 1-5 da error 
                    System.out.println("Opción no válida. Intenta de nuevo."); //Impresion de introducir el error de un caso que no este entre 1-5
            }
        }while (opcion != 5); // condición para repetir el menú mientras que en el caso no sea cinco y ya se termine el bucle 

        
    }
    
}
