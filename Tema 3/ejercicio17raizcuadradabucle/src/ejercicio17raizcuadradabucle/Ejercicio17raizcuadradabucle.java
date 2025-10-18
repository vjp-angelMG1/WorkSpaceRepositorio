/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17raizcuadradabucle;
import java.util.Scanner;// se importa la libreria de java en Scanner
/**
 *
 * @author Ángel
 * @since 17/10/2025
 */
public class Ejercicio17raizcuadradabucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner raiz = new Scanner(System.in); // Nueva entrada del escanner para darle valor al objeto
        int numero; //Declaro la variable numero
        numero = raiz.nextInt(); // valor que le voy a dar de entrada al numero para recojerlo
        do{ //Empieza el bucle 
            System.out.println("Introduce un numero: " ); // Se imprime el enunciado con el que le vamos a dar valor al numero
            
            if(numero<0){ //Condicional que indica si el numero es menor que cero
                System.out.println("El numero no puede ser negativo"); // Se imprime si el numero es negativo tendrá un error
            }
         }while(numero<0); //Termina el bucle, mientras el numero sea menor que cero permanecera repitiendose
         System.out.println("La raiz de " +numero+ "es" + (float) Math.sqrt(numero));//Se imprime el resultado final de la raíz cuadrada
        }
                
    }
    

