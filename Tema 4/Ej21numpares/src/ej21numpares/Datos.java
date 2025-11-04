/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej21numpares;

import java.util.Scanner; //importar la carpeta java util desde scanner

/**
 *
 * @author Angel
 */
public class Datos {

        
        public static void datosSinValidar() { //metodo para pedir datos sin validar
            int num1; //declaro las variables
            int num2;
            int resultado;
            Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para recojer el valor que le de el usuario
            System.out.println("Introduce el primer número: "); //imprimo en pantalla el valor introducido del primer numero
            num1 = entrada.nextInt(); // inicializo la varible recojiendo su valor
            System.out.println("Introduce el segundo número: "); //imprimo en pantalla el valor introducido del primer numero
            num2 = entrada.nextInt(); // inicializo la variable recojiendo su valor

            resultado = Operaciones.calcularSumaPares(num1, num2); //inicializo la variable recojiendo su valor
            System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + resultado); //imprimo en pantalla los que son pares entre los dos numeros
        }

        
        public static void datosConValidacion() { //metodo para pedir datos con validación
            int num1; //Declaro las variables 
            int num2;
            int resultado;
            Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para recojer el valor que le de el usuario
            

            System.out.print("Introduce el primer número: "); //Imprimo el valor de la entrada del primer numero
            num1 = entrada.nextInt(); //Inicializo la variable 

            do { //bucle que se repite con la condicion de que numero 2 sea menor o igual a numero uno
                System.out.print("Introduce el segundo número (debe ser mayor que el primero): "); //imprime la introducion del segundo numero
                num2 = entrada.nextInt(); //Inicializo el valor de la entrada del segundo numero
                if (num2 <= num1) { 
                    System.out.println("Error: El segundo número debe ser mayor que el primero."); //Imprimo en caso de que no se cumpla
                }
            } while (num2 <= num1); //mientras se cumpla se realiza el bucle

            resultado = Operaciones.calcularSumaPares(num1, num2); //inicializo el resultado llamando a la clase operaciones y el metodo para que me realice la operación
            System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + resultado); //Imprimo el resultado de la suma de los numeros pares

        }
} 