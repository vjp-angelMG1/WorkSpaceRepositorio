/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07cuatronumeros;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class cuatronumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,numero3,numero4; // Declaramos las variables de los 4 numeros y la auxiliar para poder intercambiarlos
        Scanner entrada = new Scanner (System.in); // Creo un objeto llamado scanner para capturar lo que escriba el usuario
        System.out.println("Introduce 4 numeros: "); // Imprimo la introducion de los cuatro numeros
        System.out.println("Escribe un numero"); //Imprimos que escriba un numero
        numero1 = entrada.nextInt(); //Recojo la entrada del valor del primer numero
        System.out.println("Escribe otro numero"); //Imprimos que escriba otro numero
        numero2 = entrada.nextInt(); //Recojo la entrada del valor del segundo numero
        System.out.println("Escribe otro numero"); //Imprimos que escriba otro numero
        numero3 = entrada.nextInt(); //Recojo la entrada del valor del tercer numero
        System.out.println("Escribe otro numero"); //Imprimimos que escriba otro numero
        numero4 = entrada.nextInt(); //Recojo la entrada del valor del cuarto numero
        
        burbuja.ordenarburbuja(numero1, numero2, numero3, numero4); //llamo a la clase burbuja para que me de el orden de los numeros
    }
    
}
