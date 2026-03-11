/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *Ejercicio 19.- Escribe un programa que lea un día de la
semana que introduzca el usuario (Lunes, Martes,
Miércoles, Jueves, Viernes, Sábado o Domingo) y, según
sea su valor, escriba en pantalla su posición en la
semana.
• Ejemplo de ejecución:
Por favor, introduzca un día de la semana: Miércoles
El Miércoles es el tercer día de la semana

 * @author Ángel
 */
public class Ejercicio19 {


 public static void main(String[] args) { //creo metodo principal para ejecutar codigo
        Scanner entrada = new Scanner(System.in); //creo scanner

        System.out.print("Por favor, introduzca un día de la semana: "); //imprimo por pantalla
        String dia = entrada.nextLine(); //guardo en la variable el numero que le pido al usuario

        String posicion =""; //inicializo en vacio la posicion

        if (dia.equalsIgnoreCase("lunes")) { //condicional ignorando mayusculas y minusculas si se cumple el nombre
            posicion = "primer"; //guardo en esta variable su posicion y asi con todas 
        } else if (dia.equalsIgnoreCase("martes")) {
            posicion = "segundo";
        } else if (dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("miercoles")) {
            posicion = "tercer";
        } else if (dia.equalsIgnoreCase("jueves")) {
            posicion = "cuarto";
        } else if (dia.equalsIgnoreCase("viernes")) {
            posicion = "quinto";
        } else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
            posicion = "sexto";
        } else if (dia.equalsIgnoreCase("domingo")) {
            posicion = "séptimo";
        } else { //si no se cumple el dia no es valido y lo imprimo 
            System.out.println("Día no válido.");
        }

        System.out.println("El " + dia + " es el " + posicion + " día de la semana"); //imprimo la posicion de cada dia
    }
}

