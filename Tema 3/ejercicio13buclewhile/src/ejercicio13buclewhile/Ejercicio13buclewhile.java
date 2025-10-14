/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13buclewhile;

/**
 *
 * @author Ángel Etiqueta nombre
 * @since 13/10/2025 Etiqueta fecha
 */
public class Ejercicio13buclewhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método mainç
       
        int numero = 11; // Declaro el primer número par después de 11

        System.out.println("Números pares entre 11 y 133:"); //Imprime la entrada del texto
        
        while (numero <= 133) { //bucle while si el número es menor o igual que 133
           if (numero % 2 == 0){ //Utilizo un condicional para verifica si es par            
               System.out.println(numero); // Imprime el numero par
           }
            numero++; // Aumenta el numero de 1 en 1
      }
    }
}
