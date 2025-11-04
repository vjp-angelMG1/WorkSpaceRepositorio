/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej25potencia;

/**
 *
 * @author Ángel
 */
public class Calculopotencia {

    public static double calcularPotencia(double base, double exponente) { //metodo para calcular la potencia con las vairables y tener el control de la excepcion
        if (base == 0 && exponente < 0) { //si la base es igual a 0 y el exponente es menor que 0
            throw new ArithmeticException("Error: 0 elevado a un número negativo es infinito."); //lanzo la excepcion con throw new y imprimo al cumplirse la condicional de la excepcion
        }
        return Math.pow(base, exponente);//devuelvo el valor con la clase math.pow de la base y el exponente
    }
    
}
