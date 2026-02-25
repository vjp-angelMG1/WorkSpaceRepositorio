/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner; //Importo la clase java util del paquete Scanner

/**
 *
 * @author Ángel 
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        int resultado;
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzce un número");
        num1 = entrada.nextInt();

        System.out.println("Introducr otro número");
        num2 = entrada.nextInt();
        
            try{
                resultado = num1 / num2; //Resultado donde puede ocurrir la excepción
            System.out.println("El resultado de la division"+resultado);
            }catch(ArithmeticException e){
            System.out.println("Error no se puede divir por cero");
            }
        
    }
    
}
