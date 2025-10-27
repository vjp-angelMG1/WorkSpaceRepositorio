/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4numeromenor;

/**
 *
 * @author Ángel
 * @since 26/10/2025
 */
public class comparacion {
     public static int comparacionNumero(int numero1, int numero2, int numero3) {
        int menor;
        if (numero1 <= numero2 && numero1 <= numero3) { // Condicional en la que comparamos los numeros: el 1 con el 2 y el 1 con el 3
            menor = numero1; //si es menor el numero 1 a los demas el menor es el primero
            System.out.println("El  menor es " + numero1); // Imprimos que el 1 es el menor si se cumple la condicion
        } else if (numero2 <= numero1 && numero2 <= numero3) { // Condicional en la que comparamos los numeros: el 2 con el y el 2 con el 3
            menor = numero2; //si es mayor el numero 2 a los demas el menor es el segundo 
            System.out.println("El menor es: " + numero2); // Imprimimos que el 2 es el menor en el caso de que se cumpla 
        } else { //Condicional en la que comparamos la condicion que falta que es que el numero3 sea menor que numero 2 y numero 1
            menor = numero3; //si es menor el numero 3 a los demas el mayor es el tercero
            System.out.println("El menor es: " + numero3); // Si no se cumple ninguna de las condiciones anteriores será el tercer número el menor de todos
        }
        return menor; //devuelve el valor al numero al ser nombrado por el metodo main
    
   }
}
