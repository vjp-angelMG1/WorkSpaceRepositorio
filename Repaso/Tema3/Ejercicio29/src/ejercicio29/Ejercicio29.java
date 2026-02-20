/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.Scanner;

// Ejercicio 29.- Escribe un programa que juegue con el usuario a adivinar un número. El ordenador debe generar un número
//entero aleatorio entre 1 y 100, y el usuario tiene que intentar
//adivinarlo.
//• Para ello, cada vez que el usuario introduce un valor el ordenador
//debe decirle al usuario si el número que tiene que adivinar es
//mayor o menor que el que ha introducido.
//• Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla
//el número de veces que el usuario ha intentado adivinar el
//número.
/**
 *
 * @author Angel
 */
public class Ejercicio29 {

    public static void main(String[] args) { //método main
// primer reemplantamiento 
//        int num;
//        int numero;
//        int contador = 0;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Introduce un numero aleatorio entre 1 y 100");
//       
//        for (num = 1; num <= 100; num++) {
//            num = (int) (Math.random() * 101);
//             numero = entrada.nextInt();
//            if (num > numero) {
//                System.out.println("El numero es menor");
//            } else if(num < numero) {
//                System.out.println("EL numero es mayor");
//            }else{
//                System.out.println("el numero es igual");
//            }
//            contador++;
//        }
//            System.out.println("Numero de veces que el usuario ha intentado adivinar el número"+contador);
        Scanner entrada = new Scanner(System.in); //creo objeto Scanner 
        int numeroSecreto; //declaro variables
        int numeroUsuario;
        int contador;
        contador = 0; //inicializo variable
        numeroSecreto = (int)(Math.random()*100)+1; //creo un numero aleatorio con la clase math random entre 1 y 100
        
        System.out.println("Adivina el número entre 1 y 100"); //imprimo por pantalla el juego
        do{ //bucle para buscar al menos una vez
            System.out.println("Introduce el numero"); //imprimo por pantalla el número 
            numeroUsuario = entrada.nextInt(); //guardo en la variable el numero que le pido al usuario
            contador++; //utilizo contador para guardar los intentos 
            
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
