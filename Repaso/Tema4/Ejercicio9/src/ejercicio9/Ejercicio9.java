/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *• Ejercicio 09.- Escribir un algoritmo en JAVA que pida tres
números (utiliza un método) y se los pase a otro método
que los imprima por pantalla el menor de ellos. ESTOS
MÉTODOS ESTARÁN EN UNA CLASE DISTINTA DEL
MISMO PAQUETE.
 * @author Ángel
 */
public class Ejercicio9 {


    public static void main(String[] args) { //creo metodo main ejecutable
        int num1; //declaro variables
        int num2;
        int num3;
        num1 = PedirTresNumeros.PedirNumeros(); //guardo objeto el metodo para pedirlos 3 numeros lo realizo 3 veces 
        num2 = PedirTresNumeros.PedirNumeros();
        num3 = PedirTresNumeros.PedirNumeros();
        NumeroMenor.numeroMenor(num1, num2, num3); //llamo al metodo numero menor para o
    }    
}
