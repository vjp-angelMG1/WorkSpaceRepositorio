/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author Angel
 */
public class Ejercicio14 {

    public static void main(String[] args) { //método main
        int numero; //Declaro variable
        numero = 0; //Inicializo variable
        int contador; //Declaro variable 
        contador = 0; //Inicializo variable
        do { //Bucle 
            if (numero % 2 == 0) { //condicional si es número par
                System.out.println(numero); //Imprimo los números
                contador++; //añado un contador para comprobar la de numeros que se realizan
            }
            numero++; //incremente un numero al bucle cada vez que se cumple la condicion para que lo ejecute justamente despues
        } while (numero <= 100);//hasta que llegue a 100
        System.out.println("Cantidad de números pares"+contador); //Imprimo contatenando el contador
    }
}