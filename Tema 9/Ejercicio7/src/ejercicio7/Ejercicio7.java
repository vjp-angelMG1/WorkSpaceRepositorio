/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner; //Importo la clase java util scanner

/**
 * Realiza un programa en JAVA que contenga un método que reciba una frase y que
 * muestre por pantalla la frase invertida palabra a palabra.
 * @author Ángel
 */
public class Ejercicio7 {

    public static void main(String[] args) { //creo metodo principal main
        Scanner entrada = new Scanner(System.in); //Creo objeto entrada para introducir la cadena al usuario

        System.out.println("Poner aquí una frase: "); //Imprimo por pantalla la frase 
        String fraseIntroducida = entrada.nextLine(); //guardo en la variable la frase que le introduzco

        fraseDelReves(fraseIntroducida); //llamo al método

    }

    public static void fraseDelReves(String fraseIntroducida) { //creo el metodo estatico parametrizando la variable fraseIntroducida
        int l;
        String[] palabras = fraseIntroducida.split(" "); //para guardar en una posicion del Array cada palabra utilizo split que rompe la frase en los espacios

        System.out.println("Frase Del Reves"); //imprimo por pantalla 

        for (l = palabras.length - 1; l >= 0; l--) { //bucle for para recorre el array al reves comenzando por la ultima letra de la frase y llendo hacia atras
            System.out.print(palabras[l] + " "); //imprimo por pantalla con los espacios
        }
        System.out.println(); //imprimo un salto de linea
    }

}
