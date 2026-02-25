/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *• Ejercicio 22.- Crea un programa que calcule sume dos
números que introduzca el usuario.
• En caso de que el usuario introduzca una letra en vez de un
número, debemos capturar la excepción y mostrarle un
mensaje de error
* 
 * @author Ángel
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int num2;
        int resultado;

        System.out.println("Porfavor introduce un número");
        num = entrada.nextInt();
        System.out.println("Por favor introduce otro número");
        num2 = entrada.nextInt ();
       try{
        resultado = num + num2;
        System.out.println("El resultado de la suma es"+resultado);
       }catch(InputMismatchException e){
           System.out.println("Error introduciste una letra");
       }
        
    }
    
}
