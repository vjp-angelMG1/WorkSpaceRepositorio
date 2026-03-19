/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 * • Ejercicio 09.- Realiza un programa en JAVA, ORIENTADO A OBJETOS, que lea
 * tres números e imprima por pantalla el mayor de ellos. • Realiza el ejercicio
 * a tu gusto, con los métodos que consideres necesarios (cuantos más mejor). •
 * Pista: Necesitarás crear 3 objetos de una clase “Numero” con un atributo
 * llamado “valor”.
 *
 * @author Ángel
 */
public class Ejercicio9 {

    public static void main(String[] args) { //creo metodo principal main
        int mayor; //declaro variable

        Numero num1 = new Numero(pedirNumero("primer número")); //creo los tres objetos que piden el numero dentro del metodo pedir numero
        Numero num2 = new Numero(pedirNumero("segundo número"));
        Numero num3 = new Numero(pedirNumero("tercer número"));

        
        num1.mostrarValor(); //muestro los numeros llamando desde el objeto al metodo
        num2.mostrarValor();
        num3.mostrarValor();

        mayor = obtenerMayor(num1, num2, num3); //guardo en la variable el mayor obtenido al llamar al metodo con los objetos

        // Mostrar resultado
        mostrarResultado(mayor); 
    }
    
    public static int pedirNumero(String mensaje) { //metodo para pedir un numero por pantalla con parametros
        int numero; //declaro la variable
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        numero = entrada.nextInt();
        System.out.print("Introduce el " + mensaje + ": "); //imprimo por pantalla el mensaje
        return numero; //devuelvo un entero
    }

    // Método para calcular el mayor de tres números
    public static int obtenerMayor(Numero num1, Numero num2, Numero num3) { //metodo para calcular el mayor de los tres numeros con parametros
        int mayor = -1; //declaro e inicializo para ver cual es mayor 
        
        if (num1.getValor() > mayor){
            mayor = num1.getValor();
        }
        if (num2.getValor() > mayor) {
            mayor = num2.getValor();
        }
        if (num3.getValor() > mayor) {
            mayor = num3.getValor();
        }

        return mayor; // devolvemos un int con el valor mayor
    }
    
    public static void mostrarResultado(int mayorK){ //metodo para mostrar el resultado del mayor de los tres con parametros
        System.out.println("El numero mayor es: "+ mayorK); //muestro cual es el numero mayor  
    }

}
