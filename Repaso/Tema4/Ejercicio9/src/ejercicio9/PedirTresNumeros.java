/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class PedirTresNumeros {

    public static int PedirNumeros() { //creo metodo estatico para pedir los numeros y devolverlos 
        int num1; //Declaro variables 

        Scanner entrada = new Scanner(System.in); //creo el objeto Scanner
        System.out.println("Introduce un numero : "); //imprimo por pantalla el primer numero
        num1 = entrada.nextInt(); //guardo en la variable num1

        return num1; //devuelvo el valor
    }

}

