/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Angel 
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo principal main
        Scanner entrada = new Scanner(System.in); //Creo el scanner 
        int numero; //declaro las variables
        int par;
        int impar;
    
        System.out.println("Introduce un numero por teclado"); //imprimo por pantalla
        numero = entrada.nextInt(); //recojo el valor que introduce el usuario
        if(numero%2==0){ //condicional si el resto de la division es 2 o igual a 0
            par=numero; //el numero lo guardo en la variable par 
            System.out.println("El numero es par"); //imprimo el valor de par 
        }else{ //condicional si no se cumple la anterior condicion 
            impar=numero; //el numero lo guardo en la variable impar
            System.out.println("El numero es impar"); //imprimo el valor de impar
        }
    }
    
}
