/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Ejercicio32 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creo objeto Scanner 
        int numeroSecreto; //declaro variables
        int numeroUsuario;
        int contador;
        numeroUsuario = 0; 
        contador = 0; //inicializo variables
        numeroSecreto = (int)(Math.random()*100)+1; //creo un numero aleatorio con la clase math random entre 1 y 100
        
        System.out.println("Adivina el número entre 1 y 100"); //imprimo por pantalla el juego
        do{ //bucle para buscar al menos una vez
            System.out.println("Introduce el numero"); //imprimo por pantalla el número 
            contador++; // utilizo contador para ver las iteracciones
            try{ //utilizo control de excepciones
            numeroUsuario = entrada.nextInt(); //guardo en la variable el numero que le pido al usuario
            
            }catch(Exception e){ //excepcion al introducir una letra en vez de un número
                System.out.println("Error no es un número"); //imprimo por pantalla el numero
                entrada.nextLine(); //limpio buffer 
            }

                if (numeroUsuario < numeroSecreto) { //condicional si es mayor el numero introducido al aleatorio
                    System.out.println("El numero es mayor"); //imprimo por pantalla
                } else if(numeroUsuario > numeroSecreto) { //condicional si es menor el numero introducido al aleatorio
                    System.out.println("EL numero es menor"); //imprimo por pantalla
                }else{ //condicional si es igual un numero al otro
                    System.out.println("el numero es igual has adivinado el número"); //imprimo por pantalla el resultado
                    System.out.println("intentos realizados :"+contador); //imprimo por pantalla la cantidad de numeros del contador
                } 
            
            
        }while(numeroUsuario!= numeroSecreto); //mientras el numero sea distinto uno de otro el bucle seguira repitendose
        
    }

}
    
    

