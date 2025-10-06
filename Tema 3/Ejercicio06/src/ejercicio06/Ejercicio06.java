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
        
            nota=entrada.nextInt(); //Recoje el numero de la variable
        System.out.println("la nota del alumno esta entre 0 y 10"); //Impresion de la condicional principal esta ENTRE 0 y 10
                
       
        if ( nota <0 || nota >10 ){ //Condicional si la nota es menor que 0 o la nota es mayor que diez entonces no se cumple la condicion if y pasamos a las demas condiciones esta condicional usa el operador lógico OR representado ||
            
        }else if (nota >=0 && nota <=4){ //Condicional else if que al cumplirseque dice que si la nota es igual o mayor a 0 y la nota es menor o igual a 4 se da esta condicion que es suspenso por lo tanto las otras else if no se dan, esta condicional esta utilizando el operador lógico AND representado &&
            System.out.println("el alumno ha obtenido entre 0 y 4 suspenso");   //Impresión de la condicional anterior que expresa que el resultado es suspenso
        }else if (nota >=5 && nota <=6){ //Condicional que dice que si la nota es igual o mayor a 5 y la nota es igual o menor a 6 se da esta condicion que es bien esta condicional esta utilizando el operador lógico AND representado &&
            System.out.println("el alumno ha obtenido entre 5 y 6 = bien"); //Impresion de la condicional anterior que expresa que el resultado es bien
        }else if (nota >=7 && nota <=8){ //Condicional  que dice que si la nota es igual o mayor a 7 y la nota es igual o menor a 8 se da esta condicion que es notable esta condicional esta utilizando el operador lógico AND representado &&
            System.out.println("el alumno ha obtenido entre 7 y 8 = notable"); //Impresion de la condicional anterior que expresa que el resultado es notable
        }else { // Condicional que se da al no cumplirse las condicionales else if y if y que sin poner nada esta expresando eso que si no se cumplen las condiciones anteriores el alumno ha obtenido una nota de entre 9 y 10 y es sobresaliente
            System.out.println("el alumno ha obtenido entre 9 y 10 = sobresaliente"); //Impresion de la condional anterior que expresa que el resultado es sobresaliente
        
        
    }
            
            }
    
}
