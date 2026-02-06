/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo principal main
        Scanner entrada = new Scanner(System.in); //creo el Scanner
        int numero1; //declaro las variables
        int numero2;
        int resultado;
        System.out.println("Introduzca un numero"); //imprimo por pantalla
        numero1 = entrada.nextInt(); //recojo el numero que le pido al usuario 
        System.out.println("Ahora introduzca otro numero"); //imprimo por pantalla
        numero2 = entrada.nextInt(); //recojo el numero que le pido al usuario
        if(numero1>10){ 
                        //condicional si el numero es mayor que 0
            resultado = numero1 + numero2;
            System.out.println("si"+numero1+">10 :"+numero1*numero2+"="+resultado); //imprimo por pantalla la operación
        }else if (numero1<10){ //condicional si el numero es menor que 0
            System.out.println("si"+numero1+"<10 :"+numero1+numero2+"="+resultado); //imprimo por pantalla la operación
        }        
                
    }
    
}
