/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Ángel 
 * @since 27/09/2025
 * 
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //antes del intercambio
        int numero1=1;
        int numero2=2;
        int aux= numero1;
        System.out.println("Antes del intercambio:");
        System.out.println("la variable numero1 = " + numero1);
        System.out.println("la variable numero2 = " + numero2);
        
        
        numero1 = numero2;        
        numero2 = aux;
        
        
        
       
        System.out.println(" Ahora la variable numero1 contiene el valor " + numero1 + " y la variable numero2 contiene el valor " + numero2);
        
    }
    
}
