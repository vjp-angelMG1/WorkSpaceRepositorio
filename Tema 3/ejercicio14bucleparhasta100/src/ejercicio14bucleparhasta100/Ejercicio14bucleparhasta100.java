/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14bucleparhasta100;

/**
 *
 * @author Ángel
 * @since 13/10/2025
 */
public class Ejercicio14bucleparhasta100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numero = 0; //Declaro variable empezando en 12 el primer numero par despues del 11
         int contador = numero; //Declaro variable para saber cuantos numero pares hay
         System.out.println("Numeros pares hasta el 100: " );
        
        do{ //Bucle 
            if (numero % 2 == 0) { //si el resto de la division de numero 2 entre 2 es igual 2 o 0 se cumple la condicional por lo que se repite el bucle
                System.out.println(numero); //imprimo el valor del numero
                contador++;//incremento en 1 el valor del numero2
               }
            numero++; //Incrementar el numero 1
           
        }while (contador < 100); // mientras que sea el numero menor o igual a 133 para obtener los numeros pares del 11 a el 133
               System.out.println("numero de vueltas : " +contador); //imprimo el valor del numero de vueltas
    }
    
}
