/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15bucletabladel8;
import java.util.Scanner; // importación de el metodo escaner en la carpeta java
/**
 *
 * @author alumno
 */
public class Ejercicio15bucletabladel8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main 
        
        int i; //declaración de variables
        int numero; //declaracion de variables
        int resultado; //declaración de variables
        Scanner entrada = new Scanner(System.in); // crear el escaner
        System.out.println("Escribe un numero : ");
        numero=entrada.nextInt(); //recoje el valor que le da el usuario y lo guarda en la variante número
        for (i=0; i<=10; i++){ //bucle for que se utiliza para que se repita un numero de veces exacto 
         resultado = numero * i; //calculo dentro del for para calcular la multiplicación
            System.out.println(numero+" x "+ i+ " = "+ resultado); //impresión del resultado de la multiplicación
        }
        
        
    }
    
}
