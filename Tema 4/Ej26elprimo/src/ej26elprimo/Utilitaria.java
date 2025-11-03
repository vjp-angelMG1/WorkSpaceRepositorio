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
            
        if (numero <= 1) //Condicional si numero es menor o igual que 1
            return false; //devuelve el valor al ser falso y no ser primo
        for (int i = 2; i < numero; i++) { //Bucle para  si la variable de i es 2 y el valor de i es menor que el numero  se le incrementa uno a cada vuelta que da
            if (numero % i == 0) //Condicional si el resto de la division del numero entre 2 es igual a 0
            return false; // devolvemos el valor falso 
        }
        return true; //si no se cumple ninguna de las dos el resultado es verdadero

    }
}  
