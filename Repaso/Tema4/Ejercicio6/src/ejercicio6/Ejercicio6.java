/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *• Ejercicio 06.- Crea un programa en JAVA en donde el usuario
introduzca la nota de un alumno (número entero entre 0 y 10) en el
main, y se le pasará a un método que escribirá su calificación según
el valor de la nota ingresada:
• 0 a 4 = Suspenso.
• 5 a 6 = Bien.
• 7 a 8 = Notable.
• 9 a 10 = Sobresaliente.
• Nota: Se le avisará al usuario de un error en caso de que la nota que
nos introduzca no esté entre 0 y 10.
* 
 * @author Ángel
 */
public class Ejercicio6 {


    public static void main(String[] args) { //creo método principal main
        int nota; //declaro variables 
        Scanner entrada = new Scanner (System.in); //creo objeto Scanner para pedir numeros a usuarios
        System.out.println("Introduzca la nota entre 1 y 10"); //imprimo mensaje 
        nota = entrada.nextInt(); //guardo en variable
        calificacion(nota); //llamo al método con el parametro de la variable de este metodo en la que me trae el valor obtenido en el parametro que utilizo como caja
    }
    
    public static void calificacion(int calificacion){ //creo metodo estatico con parametro calificacion
       
        
            switch(calificacion){ //realizo condicional switch para eleguir la calificación
                case 0: 
                case 1:
                case 2:
                case 3:
                case 4: System.out.println("Suspenso"); //imprimo por pantalla
                    break; //en caso de que se termine la opcion para que no salte a otro 
                case 5:
                case 6: System.out.println("Suficiente");
                    break;
                case 7:
                case 8: System.out.println("Notable");
                    break;
                case 9:
                case 10: System.out.println("Sobresaliente");
                    break;
                default: //si no es ninguno de los casos saltara este error
                    System.out.println("Error la opcion no es correcta tiene que ser entre 0 y 10");
            }
            
    }
    
}
