/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 * • Ejercicio 27.- Escribe un programa que simule el lanzamiento de una moneda.
 * Le pediremos al usuario que pida “cara” o “cruz” y generaremos aleatoriamente
 * un resultado. Luego le mostraremos al usuario el resultado y le daremos la
 * Enhorabuena si ha acertado o le diremos que ha perdido y otra vez le
 * pediremos que elija “cara” o “cruz” y tiraremos la moneda de nuevo, así hasta
 * que acierte.
 *
 * @author Ángel
 */
public class Ejercicio27 {

    public static void main(String[] args) { //metodo principal main para ejecutar el codigo
        
        int respuesta; //declaro variables
        int moneda; 

        do { //creo bucle para pedirle al usuario al menos una vez
            moneda = lanzarMoneda(); //guardo en variable moneda la opcion que le pido al metodo llamandolo
            System.out.println("Moneda: " + moneda); //imprimo por pantalla 
            respuesta = pedirCaraOCruz(); //guardo en la variable la llamada del metodo para pedirle cara o cruz

            if (moneda != respuesta) { //condicional si la moneda es distinta a la respuesta
                System.out.println("Error, has fallado."); //imprimo por pantalla
            } else { //condicional si es la misma la moneda enhorabuena has acertado
                System.out.println("has acertado el resultado es correcto"); //imprimo por pantalla 
            }

        } while (moneda != respuesta); //mientras la moneda sea distinta a la respuesta el bucle se repite
    }

    public static int pedirCaraOCruz() { //metodo para pedirle cara o cruz
        Scanner teclado = new Scanner(System.in); //creo objeto escanner
        String caraOCruz; //declaro variable String 

        System.out.print("Escriba cara o cruz: "); //imprimir por pantalla cara o cruz
        caraOCruz = teclado.nextLine(); //guardo en la variable cara o cruz

        if (caraOCruz.equalsIgnoreCase("Cara")) { //condicional para que se ignore mayusculas y minusculas 
            return 0;  //devuelvo 0 si es cara 
        } else {
            return 1;  //devuelvo 1 si es cruz 
        }
    }

    public static int lanzarMoneda() { //metodo que lanza la moneda 
        int caraOCruz = (int) Math.floor(Math.random() * 2);  //guardo en la variable utilizo la clase Math.floor para truncar los decimales y math random para el numero aleatorio
        return caraOCruz;//devuelvo el resultado de la moneda
    }

}
