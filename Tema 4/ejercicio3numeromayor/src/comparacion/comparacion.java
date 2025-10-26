/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparacion;

/**
 *
 * @author Ángel
 * @since 26/10/2025
 */
public class comparacion {
    
   

    public static int comparacionNumero(int numero1, int numero2, int numero3) { //metodo comparacionNumero en el que declaro las variables que afectan al mtéodo
        int mayor;
        if (numero1 >= numero2 && numero1 >= numero3) { // Condicional en la que comparamos los numeros: el 1 con el 2 y el 1 con el 3
            mayor = numero1; //si es mayor el numero 1 a los demas el mayor es el primero
            System.out.println("El mayor es: " + numero1); // Imprimos que el 1 es el mayor si se cumple la condicion
        } else if (numero2 >= numero1 && numero2 >= numero3) { // Condicional en la que comparamos los numeros: el 2 con el y el 2 con el 3
            mayor = numero2; //si es mayor el numero 2 a los demas el mayor es el segundo 
            System.out.println("El mayor es: " + numero2); // Imprimimos que el 2 es el mayor en el caso de que se cumpla 
        } else { //Condicional en la que comparamos la condicion que falta que es que el numero3 sea mayor que numero 2 y numero 1
            mayor = numero3; //si es mayor el numero 3 a los demas el mayor es el tercero
            System.out.println("El mayor es: " + numero3); // Si no se cumple ninguna de las condiciones anteriores será el tercer número el mayor de todos
        }
        return mayor; //devuelve el valor al numero al ser nombrado por el metodo main
    }
}
