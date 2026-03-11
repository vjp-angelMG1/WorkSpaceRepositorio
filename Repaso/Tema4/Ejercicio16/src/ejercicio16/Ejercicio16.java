/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *• Ejercicio 16.- Crea un programa en JAVA que calcule las siguientes operaciones y
muestre su resultado:
• Raíz cuadrada de 64.
• 8 elevado al cubo.
• Exponencial de 2.
• Logaritmo de 2,71828.
• Menor valor entre 2 y 3.
• Valor absoluto de -4,5.
• Redondeando -4,5 con ROUND.
• Seno de 45 grados.
• IMPORTANTE: Cada operación se realizará en un subprograma.
 * @author Ángel
 */
public class Ejercicio16 {

    public static void main(String[] args) { //metodo principal main que ejecuta
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        System.out.print("Introduce un número: "); //imprimo el numero que le voy a pedir
        double numero = entrada.nextDouble(); //guardo en la variable el numero

        System.out.println("Raíz cuadrada de " + numero + ": " + raizCuadrada(numero)); //llamo a los metodos con un sout al ser de tipo return en las que pido el resultado de cada operacion
        System.out.println(numero + " elevado al cubo: " + elevadoAlCubo(numero));
        System.out.println("Exponencial de " + numero + ": " + exponencial(numero));
        System.out.println("Logaritmo de " + numero + ": " + logaritmo(numero));
        System.out.println("Valor absoluto de " + numero + ": " + valorAbsoluto(numero));
        System.out.println("Redondeo de " + numero + " con ROUND: " + redondeoRound(numero));
        System.out.println("Seno de " + numero + " grados: " + senoGrados(numero));

      
    }
    //Creo los metodos con las distintas operaciones con parametros y de tipo return
    public static double raizCuadrada(double num) {
        return Math.sqrt(num);
    }

    public static double elevadoAlCubo(double num) {
        return Math.pow(num, 3);
    }

    public static double exponencial(double num) {
        return Math.exp(num);
    }

    public static double logaritmo(double num) {
        return Math.log(num); // logaritmo neperiano
    }

    public static double valorAbsoluto(double num) {
        return Math.abs(num);
    }

    public static long redondeoRound(double num) {
        return Math.round(num);
    }

    public static double senoGrados(double grados) {
        double rad = Math.toRadians(grados);
        return Math.sin(rad);
    }
}
    
    

