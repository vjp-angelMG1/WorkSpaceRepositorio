/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2sumaomultiplicacion;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio2sumaomultiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        int numero1; //Declaro las variables
        int numero2; 
        int resultado;
        Scanner entrada = new Scanner (System.in); //Creo un objeto llamado entrada para capturar lo que escriba el usuario
        System.out.println("Introduce el primer numero: "); //imprimo el valor del primer numero
        numero1 = entrada.nextInt(); //inicializo la entrada recojiendo el valor del numero1
        System.out.println("Introduce el segundo numero: "); //imprimo el valor del segundo numero
        numero2 = entrada.nextInt(); //inicializo la entrada recojiendo el valor del numero2
        resultado = 0; //inicialilo el valor de la variable resultado
        if (numero1 > 10 ){ //condicional si numero1 es mayor que 10 se suman 
            System.out.println("La operación realizada es "+calculos.suma(numero1, numero2)+" y el resultado es: "+ resultado); //imprimo el valor de la primera condicional con el calculo y el resultado
        }else { //Condional de si el numero es menor que 10 se restan
            System.out.println("La operación realizada es "+calculos.producto(numero1, numero2)+" y el resultado es "+ resultado); //imprimo el valor de la segunda condicional con el calculo y el resultado
        }
    }
    
}
