/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14multiplosdetres;
import java.util.Scanner;
/**
 *
 * @author Ángel
 * @since 30/10/2025
 */
public class condicionesmultiplos {

        public static int pedirNumero() { //metodo pedirNumero
        int numero; // Declaro la variable numero
        Scanner entrada = new Scanner(System.in); // Creo un objeto llamada entrada para capturar lo que escriba el usuario
        do { //bucle 
            System.out.println("Introduce un número: "); // Imprimimos el valor del numero que le solicitamos al usuario
            numero = entrada.nextInt(); // Inicializamos el numero de entrada guardandolo en la variable numero

            if (numero < 1) { // Condicional si el numero es menor a 1
                System.out.println("El numero introducido no puede ser menor de 1."); // Imprimos el valor si se cumple la condición
            }
        } while (numero < 1); // Bucle que se produce mientras que el numero sea menor que 1
        return numero; // devuelve el valor del numero al ser nombrado por otro método
    }

    public static boolean validar(int numero) { // método boolean validar 
        return numero > 0; //devuelve el valor del numero al ser nombrado por el metodo, siempre que sea mayor que 0
    }

    public static void mostrarMultiplos(int numero) { // //metodo para mostrar los multiplos de 3
        int contador = 0; //Declaro la variable contador 
        System.out.println("Multiplos de 3 entre 1 y " + numero + " :"); //Imprimo los multiplos de 3 entre el y el numero que le solicite
        for (int j = 1;  j < numero; j++) { // Bucle en el que que declaro la variable a y si es menor que el numero se suma uno incrementado su valor
            if ( j % 3 == 0) { // Condicional para ver si el numero es divisible entre 3
                System.out.println(j); //Imprimimos el resultado en caso de que se cumpla la condición 
                contador++; //añado el contador para que se me incremente a uno con cada vuelta que da el bucle
            }
        }
        System.out.println("Total de múltiplos de 3: " + contador);  // Imprimo el resultado total de los multiplos de 3
        
   }
}