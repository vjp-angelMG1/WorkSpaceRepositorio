/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09numeromenor;

/**
 *
 * @author alumno
 */
public class operacion {
     public static void comparacionNumero(int numero1, int numero2, int numero3) {

        if (numero1 < numero2 && numero1 < numero3) { // Condicional en la que comparamos los numeros: el 1 con el 2 y el 1 con el 3
            
            System.out.println("El  menor es " + numero1); // Imprimos que el 1 es el menor si se cumple la condicion
        } else if (numero2 < numero1 && numero2 < numero3) { // Condicional en la que comparamos los numeros: el 2 con el y el 2 con el 3
            
            System.out.println("El menor es: " + numero2); // Imprimimos que el 2 es el menor en el caso de que se cumpla 
        } else { //Condicional en la que comparamos la condicion que falta que es que el numero3 sea menor que numero 2 y numero 1
     
            System.out.println("El menor es: " + numero3); // Si no se cumple ninguna de las condiciones anteriores será el tercer número el menor de todos
        }
     }
}
