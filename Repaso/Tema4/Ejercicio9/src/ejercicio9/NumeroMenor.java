/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Ángel
 */
public class NumeroMenor {
    
    public static void numeroMenor(int num1,int num2, int num3){ //creo metodo estatico para comprobar el numero menor con parametros
        int menor; //Inicializo varible
                
        menor = num1; //guardo variable 
        
            if (menor > num2) { //condicional si menor es menor que numero 2
                menor = num2; //actualizo la variable menor
            }
            if(menor > num3) { //condicional si menor es menor que numero 3
                menor = num3; //actualizo la variable menor
            }
            
            System.out.println("El menor número es: "+ menor); //imprimo por pantalla el numero menor
            
        }
    
}
