/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg25;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        
        System.out.println("Por favor introduzca el primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Por favor introduzca el segundo numero: ");
        int numero2 = entrada.nextInt();
        System.out.println("Por favor introduzca el tercer numero: ");
        int numero3 = entrada.nextInt();
        
        
        int suma = numero1 + numero2 + numero3;
        int producto = numero1 * numero2 * numero3;
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("El producto de los numeros introducidos es " +producto);
        
    }
    
}
