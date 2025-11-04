/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej26elprimo;

/**
 *
 * @author USUARIO
 */
public class Utilitaria {

    public static boolean esPrimo(int numero) { //metodo esPrimo que recibe el valor de un numero entero y lo devuelve en booleano true o false

        int i = 2; //declaro la variable y la inicializo 
        boolean primo = true; //declaro e inicializo la variable

        while (i < numero && primo == true) { //bucle mientras la i es menor que el numero y el boolean es verdadero
            if (numero % i == 0) { //si la division por el resto del numero es igual a 0
                primo = false;

            } else { //si no se cumple la condicion se incrementa a uno
                i++;
            }

        }
        return primo; //devuelve el valor del numero
    }
}
