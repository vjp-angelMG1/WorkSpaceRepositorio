/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 * * Crea un programa en JAVA en el que pidas al usuario una cadena de
 * caracteres, y luego la muestres carácter por carácter por pantalla.
 *
 * • Muestra cada carácter en una línea distinta. • Utiliza la clase String y el
 * método toCharArray.
 *
 * @author Ángel
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int l; //declaro la variable 
        Scanner entrada = new Scanner(System.in); //creo wl objeto Scanner para pedirle al usuario una cadena

        System.out.println("Introducir cadena de caracteres: "); //Imprimo por pantalla 
        String cadenaAlUsuario = entrada.nextLine(); //creo un objeto para la entrada de la cadena de los caracteresç

        // Convertimos el String en un array de char
        char[] letras = cadenaAlUsuario.toCharArray(); //transformo a un array de char el String con el toCharArray

        System.out.println("Los caracteres indivividuales son : ");

        for (l = 0; l < letras.length; l++) { //utilizo bucle for para recorrer el array e incrementar a uno en cada vuelta

            System.out.println(letras[l]); //imprimo por pantalla la posicion en la que se encuentra la variable l

        }

    }
}