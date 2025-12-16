/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.repaso.rac1.pkg2.y.pkg3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio3 {


    public static void main (String[]args){
        int numero = pedirNumero(); //Declaro variable y pido el número al usuario
        mostrarNumero(numero); //Mostramos el número
    }
    
    //Método que pide un numero y lo devuelve (int)
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in); //Creo el escaner
        boolean correcto = false; //Declaro e inicializo la variable para comprobar si es cierto que se cumple la condición
        int numero = 0;
        while(!correcto) { //Bucle que utilizamos en una única búsqueda para comprobar si se cumple la condición si es distinto a correcto es falso por lo que repetira el bucle mientras sea distinto de correcto
            //Control de excepciones
            try{  
                System.out.println("Introduce el número entero");
                numero = entrada.nextInt(); //Introducimos el numero entero para comprobar si lo es
                correcto = true; //Si es correcto es un numero entero
            
            
            }catch (InputMismatchException e){
            // sí el usuario introduce una letra o numero no entero
                System.out.println("Error: debes introducir un número entero.");
                entrada.nextInt(); //para limpiar buffer de la entrada del numero
        
            }  
        }
        return numero;//devolvemos el número válido
    }
    //Método que muestra el número recibido por párametros
    public static void mostrarNumero(int numero){
        System.out.println("el número introducido es: " + numero); //imprimir por pantalla el mensaje y el numero escrito
    }
}




    
