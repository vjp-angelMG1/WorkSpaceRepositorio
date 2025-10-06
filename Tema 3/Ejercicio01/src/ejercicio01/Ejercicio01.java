/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01; // Implementa un algorítmo en Java que le pida a un usuario un número por teclado.
                     //Posteriormente el programa le dirá al usuario si el número introducido es positivo o negativo. 
import java.util.Scanner; //darle importación java util desde Scanner
/**
 *
 * @author Ángel //nombrar autor 
 * @since 06/10/2025 //nombrar fecha
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  //método main programa que crea una clave de acceso
            int numero;
        Scanner entrada = new Scanner(System.in);// entrada scanner nueva para darle valor a un objeto
        
        System.out.println("Porfavor introduzca un numero"); //Impresion de numero de entrada
        numero=entrada.nextInt(); //Recoje el numero 
        
        
        if (numero<=0){ //Condicional con el if para ver si es menor o igual 
            
            
            System.out.println("El numero introducido es negativo" ); //Impresion de la primera Condicional
       
      } else { 
                System.out.println("El numero introducido es positivo" );// Impresion de la segunda Condicional
            }       
        
        
        
    }
    
}
