/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner; //Importo la clase scanner para poder leer los datos del teclado
//Ejercicio 23.- Realiza un algoritmo que imprima todos los
//números existentes entre el número 1 y otro introducido
//por el usuario.
//• Controla que el usuario te meta un número mayor que 1 y,
//sino, avísale del error y vuélveselo a pedir las veces que
//hagan falta. (hasta que introduzca un número mayor que 1)
/**
 *
 * @author Ángel 
 */
public class Ejercicio23 {

    public static void main(String[] args) { //método principal main
        int numero=1; //declaro variables 
        int numero2;
        Scanner entrada = new Scanner(System.in); //Creo Objeto Scanner para leer desde el teclado
        
        do{ //bucle que se ejecuta al menos una vez
            System.out.println("Introduzca un numero mayor a : "+numero); //Imprimo por pantalla para pedirle al usuario un numero mayor que numero=1
            numero2 = entrada.nextInt(); //entrada del numero que le pido al usuario guardandolo en la variable numero2
            if(numero2<=numero){ //condicional si numero2 es menor
                System.out.println("Error. El numero 2 debe ser mayor que numero=1 "); //imprimo por pantalla el mensaje del error
            }
                
            
        }while (numero2 <=numero); //mientras que el numero2 sea menor e igual al valor del numero el bucle se seguira repitiendo
        for(numero=1;numero<numero2;numero++){ //bucle para comprobar los numero que se encuentran entre el numero=1 y el numero que le pido al usuario se va incrementando si hay mas de un numero entre ambos
            System.out.println(numero); //imprimo por pantalla los numeros entre numero y numero2
        
        }
        entrada.nextInt(); //buffer
    }
    
}
