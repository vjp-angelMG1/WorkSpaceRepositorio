/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 * Ejercicio 10.- Escribe un programa en JAVA que, utilizando bucles,
imprima la tabla de multiplicar de un número que elija el usuario. El
número se pedirá en un método y la tabla de multiplicar se escribirá
en otro.
• Ejemplo:
Introduzca un numero para calcular su tabla de multiplicar: 8
8 x 0 = 0
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24 ...

 * @author Ángel
 */
public class Ejercicio10 {

 
    public static void main(String[] args) { //Creo método main principal ejecutable
//         int numero; //declaro variable 
//         numero = Pedir.pedirNumero(); //guardo en la variable el numero que le pido al usuario en el metodo pedirNumero en la clase Pedir para que me devuelva el valor 
//         TablaDeMultiplicar.tabla(numero); //llamo al metodo con la variable para obtener el resultado de la operacion
        TablaDeMultiplicar.tabla(Pedir.pedirNumero());
    }
    
}
