/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05pareimpar;
import java.util.Scanner;
/**
 *
 * @author Ángel //Etiqueta de quien lo ha echo
 * @since 07/10/2025 //Etiqueta de cuando se ha echo
 */
public class Ejercicio05pareimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        Scanner entrada = new Scanner (System.in);//creo un objeto llamado escaner para capturar lo que escriba el usuario
        int numero; //Declaro variable numero
        
        System.out.println("Porfavor introduzca el numero");//Impresión de la entrada del numero
        numero = entrada.nextInt(); //Valor que le voy a dar al numero
        
        if(numero%2==0){//Condicional si el resto del numero es divisible entre dos o cero es par 
        
           System.out.println("El numero es par"); //Impresión de la condicional anterior
        }
           else { //Condicional si no es par la primera condición salta a la segunda que seria impar
            System.out.println("El numero es impar");//Impresión de la condicional anterior
        }
        // TODO code application logic here
    
    
 }
}