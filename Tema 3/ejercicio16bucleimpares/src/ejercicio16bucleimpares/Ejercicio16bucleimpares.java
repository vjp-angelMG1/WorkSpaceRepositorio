/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16bucleimpares;

/**
 *
 * @author Ángel //Etiqueta nombre 
 * @since 17/10/2025 //Etiqueta fecha
 */
public class Ejercicio16bucleimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int i = 0; //Declaro variable i
          int contador = i; //Declaro variable j
          
         System.out.println("Numeros impares entre 21 y 160: " ); //imprimir los numeros que son impares entre 21 y 160
        
        do{ //Bucle 
            if (i>20 && i % 2 == 1) { //si el resto de la division de i entre 2 es igual 2 o 1 se cumple la condicional por lo que se repite el bucle
                    System.out.print(i+ " - "); //imprimo el valor del numero
                     contador++;//incremento en 1 el valor del contador contando apartir de 20
               }
               i++; //Incrementar i para contar los numeros desde 0 da 20 vueltas al bucle
           
        }while (i < 160); // mientras que sea i menor o igual a 133 para obtener los numeros pares del 11 a el 133
               System.out.println("cantidad de numero impares : " +i); //imprimo el valor del numero de vueltas impares
    
    }
    
}
