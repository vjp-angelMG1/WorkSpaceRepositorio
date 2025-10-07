/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9;

/**
 *
 * @author Ángel Montero Gregorio
 * @since 27/09/2025
 * EJERCICIOS ESTRUCTURA DE SINTEXIS DE UN PROGRAMA EN JAVA
 * TEMA 2 PROGRAMACIÓN
 */
public class Ejercicio9 {

    final static double PI = 3.14f; //Variable constante por lo que siempre tiene que ir fuera es decir antes de la variable metódo main
    
    public static void main(String[] args) {
 
        double radio = 3.55; //Variable, usamos double por que son decimales y es mas preciso que float
        double diametro = 2;
        double resultado = diametro*PI*radio; //longuítud de una circunferencia 2*pi*radio
        
       
        System.out.println("la longuitud de una circunferencia cuyo radio es igual a " + radio + " es  = "+ resultado + " metros");
        
        
        
    }
    
}
