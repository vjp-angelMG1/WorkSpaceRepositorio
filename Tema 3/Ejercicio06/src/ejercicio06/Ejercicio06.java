/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *///- Crea un programa en JAVA en donde el usuario introduzca la nota de un alumno (número entero entre 0 y 10) y se escribirá su calificación según el valor de la nota ingresada
package ejercicio06;
import java.util.Scanner; //darle importación a java util desde la carperta scanner 
/**
 *
 * @author USUARIO
 */
public class Ejercicio06 {

    /**@autor Ángel
     * @since 06/10/2025
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creo un objeto llamado entrada para capturar lo que escriba el usuario por el teclado 
            
        int nota; //Declara la variable
        
        System.out.println("Escribe tu nota entre 0 y 10"); //Impresion de la condicional principal esta ENTRE 0 y 10
        nota=entrada.nextInt(); //Recoje el numero de la variable
       
      
            
            
    switch (nota){ //Condicional que busca a que variable darle valor en caso de que ponga el usuario por ejemplo caso 0 valor 0 
        case 0: //valor de 0
        case 1: //valor de 1
        case 2: //valor de 2
        case 3: 
        case 4:
            System.out.println("tu nota es suspenso");
            break;
        case 5:
        case 6:
            System.out.println("tu nota es bien");
            break;
        case 7:
        case 8:
            System.out.println("tu nota es notable");
            break;
        case 9:
        case 10:
            System.out.println("tu nota es sobresaliente");           
            break;
        default:
            System.out.println("Este numero es invalido");
        } 
           
    }
}
