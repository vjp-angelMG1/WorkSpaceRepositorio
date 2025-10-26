/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08billetesymonedas;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio08billetesymonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main 
        Scanner entrada = new Scanner(System.in); // Creo objeto escaner para capturar lo que me pida el usuario 
        System.out.println("Por favor introduce una cantidad de dinero"); //Imprimo la cantidad de dinero
        int dinero = entrada.nextInt(); // inicializo la variable entrada del dinero
        
        repartimiento.descomponer(dinero); //llama al metodo estatico de la clase Repartimiento
        
    }
    
}