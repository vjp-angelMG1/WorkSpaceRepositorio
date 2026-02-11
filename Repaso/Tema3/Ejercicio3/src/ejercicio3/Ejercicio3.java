/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner; //importo la clase java con el paquete util de Scanner

/**
 *
 * @author USUARIO
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creo el escaner 
        float numero1; //declaro las variables
        float numero2;
        float numero3;
        float mayor; 
        System.out.println("Por favor,introduzca el primer numero"); //imprimo el mensaje para pedirle al usuario
        numero1 = entrada.nextFloat(); //recojo el valor del usuario 
        System.out.println("Ahora,introduzca un segundo numero");
        numero2 = entrada.nextFloat();
        System.out.println("Por último,introduzca un tercer numero");
        numero3 = entrada.nextFloat();
        if((numero1>numero2) && (numero1>numero3)){ //condicional si el numero1 es mayor que el numero2 y el numero3 es mayor que el numero3 se cumple la condicion
            mayor = numero1; //si se da la condicion de que numero1 sea mayor lo guardo en la variable mayor
        }else if((numero2>numero1) && (numero2>numero3)){ //condicional si no se cumple la anterior condicion se da esta si el numero2 es mayor que el numero1 y numero3 se cumple la condicion
            mayor = numero2; //si se da la condicion de que numero2 sea mayor lo guardo en la variable mayor
        }else{ //si no se cumplen ninguna de las dos condiciones anteriores entonces se da esta que quiere decir que el numero3 es mayor que los demas numeros
            mayor = numero3; //si se da la condicion de que numero3 sea mayor lo guardo en la variable mayor
        }
        System.out.println("El numero mayor de los introducidos es :"+mayor); //imprimo el mayor de los tres
        
    }
    
}
