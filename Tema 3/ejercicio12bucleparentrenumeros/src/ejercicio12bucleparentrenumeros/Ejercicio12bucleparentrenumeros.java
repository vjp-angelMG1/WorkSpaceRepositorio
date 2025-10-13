/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bucleparentrenumeros;
/**
 *
 * @author Ángel
 * @since 13/10/2025
 */
public class Ejercicio12bucleparentrenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        
        int numero = 11; //Declaro variable empezando en 12 el primer numero par despues del 11
       
        
        do{ //Bucle 
            if (numero % 2 == 0) { //si el resto de la division de numero 2 entre 2 es igual 2 o 0 se cumple la condicional por lo que se repite el bucle
                System.out.println(numero);
            }
            numero++; //Incrementar el numero 1
        }while (numero <=133); // mientras que sea el numero menor o igual a 133 para obtener los numeros pares del 11 a el 133
        
        
        
        }       
        
        
       
 }
    

