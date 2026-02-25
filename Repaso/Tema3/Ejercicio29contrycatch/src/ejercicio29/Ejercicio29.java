/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.InputMismatchException; //importamos la clase InputMismatchException del paquete java.util
import java.util.Scanner; //importamos la clase Scanner del paquete java.util



//• Ejercicio 29.- Escribe un programa que juegue con el usuario a adivinar un número. 
//El ordenador debe generar un número entero aleatorio entre 1 y 100, y el usuario tiene que intentar adivinarlo.
//• Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle si el número que tiene que adivinar
//es mayor o menor que el que ha introducido.
//• Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número.



/**
 *
 * @author Ángel
 */
public class Ejercicio29 {

    public static void main(String[] args) { //creo el método main
        
        Scanner entrada = new Scanner(System.in); //creo objeto Scanner para leer datos del usuario
        int numeroAleatorioAdivinar; //variable donde guardamos el número aleatorio a adivinar
        int intento = 0; //variable donde guardaremos el intento del usuario
        int contador = 0; //contador de intentos válidos realizados

        //generamos el número aleatorio entre 1 y 100 correctamente
        numeroAleatorioAdivinar = (int)(Math.random() * 101) + 1;

        System.out.println("Comienza el juego de adivinar el número (1-100)");

        //bucle que se repite mientras el intento no sea igual al número aleatorio
        while (intento != numeroAleatorioAdivinar) {

            System.out.print("Introduce un número: "); //pedimos al usuario un número

            boolean valido = true; //bandera para saber si el intento es válido

            //control de excepción para entradas que no sean números
            try {
                intento = entrada.nextInt(); //leemos el número introducido
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes introducir un número entero"); //mensaje de error
                entrada.nextLine(); //limpiar buffer del Scanner
                valido = false; //marcamos intento como inválido
            }

            //validamos que el número esté dentro del rango permitido (1-100)
            if (valido && (intento < 1 || intento > 100)) {
                System.out.println("Número inválido. Debe estar entre 1 y 100"); //mensaje de error
                valido = false; //marcamos intento como inválido
            }

            //solo si el intento es válido contamos el intento y hacemos las comparaciones
            if (valido) {
                contador++; //incrementamos el contador de intentos válidos

                if (intento > numeroAleatorioAdivinar) { //si el intento es mayor
                    System.out.println("El número introducido es mayor que el aleatorio");
                } else if (intento < numeroAleatorioAdivinar) { //si el intento es menor
                    System.out.println("El número introducido es menor que el aleatorio");
                } else { //si acierta
                    System.out.println("¡Has acertado el número!");
                }
            }
        }

        //mostramos el total de intentos válidos realizados
        System.out.println("El total de intentos válidos es: " + contador);
    }
}