/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 * * Crea un programa en JAVA en el que pidas al usuario una cadena de
 * caracteres, y luego la muestres carácter por carácter por pantalla. • Muestra
 * cada carácter en una línea distinta. • Utiliza la clase String y el método
 * charAt
 *
 * @author Ángel
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int l; //declaro la variable 
        Scanner entrada = new Scanner(System.in); //creo wl objeto Scanner para pedirle al usuario una cadena

        System.out.println("Introducir cadena de caracteres: "); //Imprimo por pantalla 
        String conjuntoDeCaracteres = entrada.nextLine(); //creo un objeto para la entrada de los caracteres

        System.out.println("la cadena esta formada por los siguientes caracteres: "); //imprimo por pantalla el conjunto de caracteres
        for (l = 0; l < conjuntoDeCaracteres.length(); l++) { //Creo un bucle for para recorrer los caracteres e incrementar a uno cada vez que vuelva al bucle

            // UsamoCharAt para extraer el carácter de la posición i
            char caracterActualizado = conjuntoDeCaracteres.charAt(l); //Utilizo charAt para obtener el caracter que se encuentra en la posicion l

            // Mostramos el resultado
            System.out.println(caracterActualizado); //muestro el resultado con el CaracterActualizado
        }

    }
}