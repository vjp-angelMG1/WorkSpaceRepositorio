/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 * • Ejercicio 26.- Escribe un programa que contenga un método llamado esPrimo
 * que reciba un número entero como parámetro y devuelva un booleano que indique
 * si se trata de un número primo o no. • Pista: Para comprobar que se trata de
 * un número primo, hay que comprobar que no tiene divisores distintos de la
 * unidad y del propio número. Se irá comprobando si tiene algún divisor a
 * partir del 2 en adelante y si se encuentra algún divisor cuyo resto sea 0 ya
 * sabremos que ese número no es primo
 *
 * @author Angel
 */
public class Ejercicio26 {

    public static void main(String[] args) { //metodo principal main ejecutabe
        int numero; //declaro la variable
        boolean primo;

        do { //condicional que se repite al menos una vez 
            numero = pedirNumero(); //guardo en la variable el metodo que le pido al usuario
            if (numero < 0) { //condicional si numero es menor que 0
                System.out.println("Error. El número tiene que ser  positivo."); //imprimo por pantalla el numero que tiene que ser positivo
            }
        } while (numero < 0); //mientras el numero sea menor que 0 el bucle se repite ya que necesito un numero positivo

        primo = esPrimo(numero); //guardo en la variable boolean si se cumple la condicion de la llamada al metodo

        if (primo) { //condicional si el numero es primo
            System.out.println("El número " + numero + " es primo"); //imprimo por pantalla que el numero es primo
        } else { //codicional si no es primo el numero
            System.out.println("El número " + numero + " no es primo"); //imprimo por pantalla que el numero no es primo
        }
    }
    
    public static int pedirNumero() { //metodo para pedir el numero y devolverlo 
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        int numero; //declaro la variable numero

        System.out.print("Introduzca un número "); //imprimo por pantalla el numero que le voy a pedir
        numero = entrada.nextInt();//guardo en la variable numero el numero que le pido al usuario

        return numero; //devuelvo el numero
    }

    public static boolean esPrimo(int numero) { //metodo que parametriza un numero para devolver si es primo o no
        boolean primo = true; //declaro e inicializo la variable si es cierto
        int i = 2; //declaro e inicializo la variable en dos para saber si apartir de este numero es primo o no

        while ((i < (numero / 2)) && (primo == true)) { //mientras que 2 sea menor a la division del nunmero entre 2 y primo sea verdadero  se repite el bucle
            if ((numero % i) == 0) {  //Condicional para comprobar si el numero es divisible e igual a 0
                primo = false; //el primo es falso
            }
            i++;  //incremento el numero para saber si los siguientes cumplen la condicion
        }

        return primo; //devuelvo el primo
    }

}
