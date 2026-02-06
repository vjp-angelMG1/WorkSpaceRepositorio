/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
 
import java.util.Scanner; //importación de la clase java util el paquete scanner

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main principal 
        Scanner entrada = new Scanner(System.in); //creo el scanner
        int numero1; //Declaro la variable 
        System.out.println("Introduce un numero"); //imprimo mensaje para introducir numero
        numero1 = entrada.nextInt(); //guardo el numero recibido por pantalla del usuario
        if (numero1>0){ //condicional si el numero es mayor que cero
            System.out.println("el numero es positivo"); //imprimo que el numero es positivo
        }else if (numero1<0){ //condicional si el numero es menor que cero es negativo
            System.out.println("el numero es negativo"); //imprimo por pantalla el resultado al darse la condicion
        }
        
    }
    
}
