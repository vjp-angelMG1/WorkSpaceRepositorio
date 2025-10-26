/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5paryimpar;
import java.util.Scanner;
import division.division;
/**
 *
 * @author USUARIO
 */
public class Ejercicio5paryimpar {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) { //metodo main
        int numero; //Declaro las variables
        int resto; 
        Scanner entrada = new Scanner (System.in); //Creo objeto escanner para capturar lo que me pida el usuario
        System.out.println("Introduce un numero: "); // Imprimos el numero que le vamos a dar al usuario
        numero = entrada.nextInt(); // Guardamos su valor leeyendo el numero
        
        numero = division.division(numero); //pedimos el numero de vuelta en clase division dentro del mismo paquete
        
    }
    
}
