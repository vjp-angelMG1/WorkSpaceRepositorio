/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *jercicio 21.- Desarrolla un programa que, a partir de dos
números que nos introduzca el usuario, muestre en pantalla
la suma total de todos los números pares comprendidos
entre ambos.
• Utiliza 2 métodos distintos para pedir los datos al usuario, ya
que en el segundo método deberás comprobar que el
usuario te mete un número mayor que el primero (y sino se
lo vuelves a pedir)
• Utiliza también otro método que muestre el resultado a
partir de los números recibidos.
 * @author Ángel
 */
public class Ejercicio21 {


    public static void main(String[] args) { //metodo main principal 
        int numero = pedirPrimerNumero(); //declaro e inicializo la variable guardando en la variable la llamada al metodo
        int numero2 = pedirSegundoNumero(numero); //declaro e incializo la variable guardando en la variable el numero que sea mayor

        mostrarPares(numero, numero2); //llamo al metodo para que me muestre los pares
    }

    public static int pedirPrimerNumero() { //metodo para pedir el primer numero
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        System.out.print("Introduce el primer número: "); //imprimo por pantalla el primer numero
        return entrada.nextInt(); //devuelvo el valor del numero que le pido al usuario
    }

  
    public static int pedirSegundoNumero(int primero) { //metodo para pedir el segundo numero
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        int num; //declaro variable 

        do { //creo bucle para pedir al menos una vez el numero
            System.out.print("Introduce un segundo número mayor que " + primero + ": "); //imprimo por pantalla
            num = entrada.nextInt(); //guardo en la variable el numero que introduzco

            if (num <= primero) { //condicional si el numero es menor o igual que el primero
                System.out.println("Error. Debe ser mayor que el primero."); //imprimo por pantalla
            }

        } while (num <= primero); //mientras el numero sea menor o igual que el primero

        return num; //devuelvo el numero
    }


    public static void mostrarPares(int a, int b) { //metodo para calcular si el numero es par o impar con parametros
        int suma = 0; //declaro e inicializo la variable a 0

        for (int i = a; i <= b; i++) { //bucle for para saber el recorrido de los numero pares
            if (i % 2 == 0) { //condicional si el numero es par
                suma += i; //se incrementa a 1 
            }
        }

        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + suma); //imprimo por pantalla la suma entre los dos numeros 
    }
}
    
    

