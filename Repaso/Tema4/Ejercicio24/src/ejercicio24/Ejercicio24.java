/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *Ejercicio 24.- Escribe un programa que contenga un
método donde le pidamos al usuario su nombre, otro
método donde le pidamos su edad y otro método
llamado mayorDeEdad, que reciba la edad como entero
por parámetro y muestre un mensaje por pantalla de si el
usuario llamado XXX es mayor de edad o no.
 * @author Angel
 */
public class Ejercicio24 {

  
    public static void main(String[] args) { //creo metodo principal main ejecutable
        String nombre = pedirNombre(); //llamo al metodo y lo guardo el nombre en la variable String
        int edad = pedirEdad(); //llamo al metodo y guardo la edad la variable edad

        mayorDeEdad(nombre, edad); //llamo al metodo mayor de edad para que me muestre el resultado en las variables
    }

    public static String pedirNombre() { //metodo para pedir el nombre 
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        System.out.print("Introduce tu nombre: "); //imprimo por pantalla
        return entrada.nextLine(); //devuelvo el valor que le pido al usuario
    }


    public static int pedirEdad() { //metodo para pedir la edad
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        System.out.print("Introduce tu edad: "); //imprimo por pantalla
        return entrada.nextInt(); //devuelvo el valor que le pido al usuario
    }

    
    public static void mayorDeEdad(String nombre, int edad) { //metodo para comprobar si es mayor de edad con parametros
        if (edad >= 18) { //condicional si la edad es mayor o igual a 18
            System.out.println(nombre + " es mayor de edad."); //imprimo por pantalla si es mayor de edad
        } else { //condicional si no es mayor de edad 
            System.out.println(nombre + " no es mayor de edad."); //imprimo por pantalla que no lo es
        }
    }
    
}
