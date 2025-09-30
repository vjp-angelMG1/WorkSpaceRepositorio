/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio26;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejericicio26 {
    
    
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        

    System.out.print("Introduce un número de 4 cifras (XYZW): ");
     String numero = entrada.nextLine();  // Capturamos la entrada del usuario
    
    // Mostramos las cifras sin hacer validación
        System.out.println("La descomposicion del numero es:");
        System.out.println("X: " + numero.charAt(0));
        System.out.println("Y: " + numero.charAt(1));
        System.out.println("Z: " + numero.charAt(2));
        System.out.println("W: " + numero.charAt(3));
    
    //Validar que el imput sea numérico y tenga 4 cifras
    }
    
}
