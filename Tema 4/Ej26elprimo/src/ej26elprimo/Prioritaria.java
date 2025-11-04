/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej26elprimo;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Prioritaria {

    public static void main(String[] args) { //metodo main 
        int numero; //Declaro la variable
        Scanner entrada = new Scanner(System.in); //Creo objeto llamado escaner para saber lo que me pide el usuario
        System.out.println("Introduce un numero: "); //Imprimo el numero 
         numero = entrada.nextInt(); //Inicializo la variable 
      
        if (Utilitaria.esPrimo(numero)) { //Condicional llamo a la clase esPrimo para saber si se cumplen las condiciones
            System.out.println(numero + " es un numero primo."); //Imprimo si la condicion de primo se cumple
        } else { //Condicional si no se cumple la condicion primera pues no es primo
            System.out.println(numero + " no es un numero primo."); //Imprimo si la condicion no es la de primo
        }
    }
    
}
