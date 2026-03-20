/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 * • Ejercicio 12.- Escribe un programa en JAVA orientado a objetos, en el que
 * se le pida al usuario que introduzca la longitud de los catetos de un
 * triángulo rectángulo y que posteriormente el programa calcule la longitud de
 * la hipotenusa. • Para ello necesitarás una clase Triangulo con 2 atributos:
 * cateto1, cateto2. • En una clase Test crearás un objeto de la clase Triangulo
 * donde el tamaño de los catetos se los pedirás al usuario para pasárselos al
 * constructor. En esta clase también tendrás un método que calcule la
 * hipotenusa y otro método se encargará de mostrar los resultados por la
 * pantalla.
 *
 * @author Angel
 */
    public class Ejercicio12 {


    public static void main(String[] args) { //metodo principal main ejecutable

        Triangulo triangulo = new Triangulo(); // creo objeto triangulo 

        pedirDatos(triangulo);                 //llamo al metodo para pedirle los datos
        double hipotenusa = calcularHipotenusa(triangulo); //guardo en la variable hipotenusa el resultado al llamar al metodo con el objeto

        System.out.println(triangulo.toString()); //llamo al metodo toString para que me muestre los datos
        System.out.println("Hipotenusa: " + hipotenusa); //imprimo por pantalla la hipotenusa
    }

    // 🔹 Pedir datos usando SET
    public static void pedirDatos(Triangulo triangulo) { //metodo para pedir los datos pasando por parametros el objeto en el que modifico los datos y los actualizo con set
        Scanner entrada = new Scanner(System.in); //creo objeto escanner

        System.out.print("Introducir el primer cateto: "); //imprimo por pantalla
        triangulo.setCateto1(entrada.nextFloat()); //introduzco el primer cateto y lo actualizo con el set

        System.out.print("Introducir el segundo cateto: "); //imprimo por pantalla 
        triangulo.setCateto2(entrada.nextFloat()); //introduzco el segundo cateto y lo actualizo con el set
    }

    // 🔹 Calcular hipotenusa
    public static double calcularHipotenusa(Triangulo triangulo) {
        return Math.sqrt(triangulo.getCateto1() * triangulo.getCateto1() + triangulo.getCateto2() * triangulo.getCateto2());
    }
}


