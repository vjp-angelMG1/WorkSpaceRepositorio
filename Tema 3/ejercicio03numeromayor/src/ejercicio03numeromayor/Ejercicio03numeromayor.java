/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03numeromayor;
import java.util.Scanner; //importación de la libreria java util desde scanner
/**
 *
 * @author Ángel //Etiqueta descriptiva del autor
 * @since 07/10/2025 //Etiqueta descriptiva de la fecha
 */
public class Ejercicio03numeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        Scanner entrada = new Scanner (System.in); //creo un objeto llamado escaner para capturar lo que escriba el usuario
        int numero1; //declaro la variable int
        int numero2; //devlaro la variable int
        int numero3; //declaro la variable int
        
        System.out.println("Porfavor introduzca el primer numero"); //Impresión del numero que voy a introducir
        numero1=entrada.nextInt(); //valor que le voy a dar al numero1
        
        System.out.println("Ahora introduzca el segundo numero"); //Impresión del segundo numero que voy a introducir 
        numero2=entrada.nextInt(); //valor que le voy a dar al numero2
        
        System.out.println("Por último, introduzca un tercer numero");
        numero3=entrada.nextInt(); //valor que le voy a dar al numero3
        
        int mayor = numero1; //declaro la variable int del numero mayor igualandola a 1 para que despues pueda comparar con otras variables su numero y ver cual de las tres cantidades es mayor
        
        if (numero2 > mayor){ //condicional que dice que si el numero2 es mayor que el mayor
            mayor=numero2;  // le estoy dando valor al numero mayor
        }
        if (numero3 > mayor){ //condicional que dice que si el numero3 es mayor que el mayor
            mayor=numero3; // le estoy dando valor al numero mayor
        }    
        System.out.println("El mayor de los introducidos es el " +mayor); //Impresión de el resultado de cual numero de los tres es mayor
        
    }
    
}
