/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16bucleimpares;

/**
 *
 * @author Ángel
 * @since 17/10/2025
 */
public class Ejercicio16bucleimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int i = 0; //Declaro variable empezando en 12 el primer numero par despues del 11
          int j = i;
          
         System.out.println("Numeros impares entre 21 y 160: " ); //imprimir los numeros que son impares entre 21 y 160
        
        do{ //Bucle 
            if (i>20 && i % 2 == 1) { //si el resto de la division de numero 2 entre 2 es igual 2 o 1 se cumple la condicional por lo que se repite el bucle
                    System.out.print(i+ " - "); //imprimo el valor del numero
                     j++;//incremento en 1 el valor del j contando apartir de 20
               }
               i++; //Incrementar el numero 1 para contar los numeros desde 0 da 20 vueltas al bucle
           
        }while (i < 160); // mientras que sea el numero menor o igual a 133 para obtener los numeros pares del 11 a el 133
               System.out.println("cantidad de numero impares : " +i); //imprimo el valor del numero de vueltas impares
    
    }
    
}
