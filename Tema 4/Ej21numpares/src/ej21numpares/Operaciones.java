/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej21numpares;

/**
 *
 * @author Angel
 */
public class Operaciones {

    public static int calcularSumaPares(int num1, int num2) { //metodo para el calculo de suma de los pares con las variables 
        int suma; //Declaro la varible suma
        suma = 0; //inicializo el valor de suma
        for (int i = num1; i <= num2; i++) { //bucle si i es igual a numero1 y es menor o igual a num2 se incremeta a uno su valor
            if (i % 2 == 0) { //condicional si el resto de divir i entre 2 es igual a cero para saber si es par
                suma += i;  //suma el numero par actual para agregarlo al valor de i actual
            }
        }
        return suma; //devuelve el valor de la suma total

    }
}
