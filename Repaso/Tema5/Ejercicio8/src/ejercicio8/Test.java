/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *Ejercicio 08.- Realiza un programa en JAVA, orientado a
objetos, en el que crees una clase llamada Numero que
contendrá un único atributo privado, llamado valor, de tipo
entero.
• Para probar el funcionamiento de la clase Numero, crea una
nueva clase llamada Test donde le pidas al usuario un
número por teclado. Luego, crea un objeto, siendo el
número introducido por el usuario el valor del atributo valor.
Posteriormente, le pasarás el objeto a un método que le dirá
al usuario si el número introducido es par o impar.
* 
 * @author Angel
 */
public class Test {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // creo scanner para pedir el numero entero
        int numero; //declaro la variable 
        System.out.print("Introduce un número entero: "); //imprimo por pantalla la clase
         numero = entrada.nextInt(); // guardo en la variable la entrada del numero que doy
         
        Numero num = new Numero(numero); //creo objeto num con el valor introducido netre parentesis

        mostrarParImpar(num);//lamo al metodo que recibe el objeto mostrando si es par o no

    }


    public static void mostrarParImpar(Numero num) { //metodo que recibe el objeto por parametros y muestra si es par o no
        if (num.esPar()) { //Condicional si para comprobar si el objeto al llamar al metodo es par
            System.out.println("El número " + num.getNumero() + " es par."); //si es par me devuelve el valor del numero par 
        } else { //condicional si no es par
            System.out.println("El número " + num.getNumero() + " es impar."); //me devuelve el valor del numero impar
        }
    }
    
    
}
