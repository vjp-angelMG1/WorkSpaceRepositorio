/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2r;

import java.util.Scanner;

/**
 *Ejercicio 02.- Realiza un programa en el que le solicites en el main al
usuario 2 números y, si el primer número introducido es mayor que 10, se
llamará a un método que los multiplicará y mostrará el resultado, y en
caso contrario se llamará a un método que los sume. ESTOS DOS
MÉTODOS ESTARÁN EN UNA CLASE DISTINTA EN EL MISMO
PAQUETE. Muestra al usuario la operación realizada y el resultado.
• Muestra por pantalla el resultado de la siguiente forma:
Por favor, introduzca un numero: xxx
Ahora, introduzca un segundo numero: xxx
La operación que se realizó es suma o producto y el resultado es xxx

 * @author Ángel
 */
public class Ejercicio2R {

    public static void main(String[] args) {
        
        int numero; //declaro variables
        int numero2;

        
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        System.out.println("Por favor, introduzca un numero"); //imprimo por pantalla
        numero=entrada.nextInt(); //guardo en variable el numero que le pido al usuario
        System.out.println("Ahora, introduzca un segundo numero:"); //imprimo por pantalla
        numero2=entrada.nextInt(); //guardo en la variable el numero que le pido al usuario
        if(numero>10){ //si el numero primero es mayor a 10
            Operaciones.multiplicacion(numero, numero2); //llamo a la clase y al metodo que esta dentro de la clase en el mismo paquete que la clase main y con la variables declaradas en la clase main
        }else{ //si no 
            Operaciones.suma(numero, numero2); //llamo a la clase y al metodo que esta dentro de la clase en el mismo paquete que la clase main y con la variables declaradas en la clase main
        }
    }

}
