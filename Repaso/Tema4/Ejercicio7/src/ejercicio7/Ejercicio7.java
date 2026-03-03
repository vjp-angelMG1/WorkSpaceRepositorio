/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 * • Ejercicio 07.- Escribe un programa en JAVA en el que el usuario introduzca
 * cuatro números enteros (en el main), y que se los pase a un método que los
 * muestre por pantalla ordenados de forma creciente (de menor a mayor). • En el
 * caso de que veas que hay un conjunto de sentencias que se repiten, UTILIZA
 * BUCLES • Muestra por pantalla el resultado de la siguiente forma: Por favor,
 * introduzca el primer numero: 8 Ahora, introduzca un segundo numero: 5
 * Introduzca el tercer numero: 9 Por último, introduzca un cuarto numero: 1 El
 * orden de los números introducidos es el 1 - 5 - 8 - 9
 *
 * @author Ángel
 */
public class Ejercicio7 {

    public static void main(String[] args) { //clase principal ejecutable

        int numero1, numero2, numero3, numero4; //declaro variables

        Scanner entrada = new Scanner(System.in); //creo objeto
        System.out.println("Porfavor introduce un número : "); //imprimo por pantalla 
        numero1 = entrada.nextInt(); //guardo variable
        System.out.println("Por favor introduce un segundo número : ");
        numero2 = entrada.nextInt();
        System.out.println("Por favor introduce un tercer número : ");
        numero3 = entrada.nextInt();
        System.out.println("Por favor introduce un cuarto número : ");
        numero4 = entrada.nextInt();
        System.out.println("El orden de los numeros introducidos es : "); //imprimir el orden de los numeros
        ordenarMayorAMenor(numero1, numero2, numero3, numero4); //llamo al metodo con las variables 

    }

    public static void ordenarMayorAMenor(int num1, int num2, int num3, int num4) { //creo método con los parametros
        int aux; //declaro variable

        for (int i = 0; i < 3; i++) { //creo bucle for para que itere tres veces el metodo ordenando los cuatro numeros
            if (num1 > num2) { //ordena primer numero
                aux = num1;
                num1 = num2;
                num2 = aux;
                System.out.println("El número 1 es mayor que el número dos : "); //imprimo por pantalla 
            }
            if (num2 > num3) { //ordena segundo numero 
                aux = num2;
                num2 = num3;
                num3 = aux;

                System.out.println("EL número 2 es mayor que el número tres : "); //imprimo por pantalla
            }
            if (num3 > num4) {//ordena tercer numero
                aux = num3;
                num3 = num4;
                num4 = aux;

                System.out.println("El número 3 es mayor que el número cuatro : "); //imprimo por pantalla 
            }

        }
        System.out.println("El orden de los numeros introducidos es el : " + num1 + "-" + num2 + "-" + num3 + "-" + num4); //imprimo por pantalla el orden de los numeros
    }

}
