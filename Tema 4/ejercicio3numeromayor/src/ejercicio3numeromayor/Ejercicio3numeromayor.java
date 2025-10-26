/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3numeromayor;
import java.util.Scanner; // importación de la libreria java util desde scanner
import comparacion.comparacion; //importamos la clase comparacion al estar en un paquete diferente dentro del mismo ejercicio siempre
/**
 *
 * @author Ángel //Etiqueta nombre
 * @since 26/10/2025
 */
public class Ejercicio3numeromayor {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) { //Método main
        int numero1, numero2, numero3; // Declaramos las variables 
        Scanner entrada = new Scanner(System.in); // Creo objeto escaner para capturar lo que me pida el usuario 

        System.out.println("Introduce el primer número:  "); // Imprimimos para que introduzca el primer numero
        numero1 = entrada.nextInt(); // Guardamos el valor del primer numero

        System.out.println("Introduce el segundo número: "); // Imprimimos para que introduzca el segundo numero
        numero2 = entrada.nextInt(); // Guardamos el valor del segundo numero

        System.out.println("Introduce el tercer número: "); // Imprimimos para que introduzca el tercer numero
        numero3 = entrada.nextInt(); // Guardamos el valor del tercer numero
        
        int mayor; //Declaro la variable 
        mayor = comparacion.comparacionNumero(numero1, numero2, numero3); //declaro la variable con la llamada al metodo comparacionNumero para que me devuelva el valor guardado en la variable mayor
    }
    
}
