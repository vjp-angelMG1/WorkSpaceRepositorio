/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 * * Escribir un programa que lea un día de la semana que le introduzca el usuario
 * (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo) y, según sea su
 * valor, escriba en pantalla su posición en la semana. 
 * (Ejemplo: “Es el tercer día de la semana”) 
 * • En vez de utilizar una estructura switch, utiliza un array de Strings donde
 * tengas los días de la semana guardados previamente
 * @author Ángel 
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int l = 0; //declaro e inicializo variable en la que recorro el array
        boolean encontrado = false; //inicializo variable que utilizare para saber si he encontrado el dia
        Scanner entrada = new Scanner(System.in); //creo objeto scanner para imprimir por pantalla lo que me pida el usuario
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}; //creo un array string con los dias de la semana


        System.out.println("Introduzca un dia de la semana: "); //pido el dia al usuario
        String diaElegido = entrada.nextLine(); //guardo en el objeto el valor eleguido

        

        while (l < dias.length && !encontrado) { //bucle para buscar mientras no haya llegado al final del array y no se haya encotrado el dia
            if (dias[l].equalsIgnoreCase(diaElegido)) { //condicional en la que comparo el dia del array con el dia introducido ignorando mayusculas y minusculas con equalsIgnoreCase
                System.out.println("Es el " + (l + 1) + " º día de la semana");//imprimo por pantalla la posicion del dia a empezar el array en 0
                encontrado = true; //cambio el valor de la variable al haberlo encontrado
            }
            l++; // incremento el contador para pasar al siguiente día del array
        }

        if (!encontrado) { //condicional si no encuentro despues de buscar el dia
            System.out.println("No existe el dia"); //imprimo por pantalla que el dia no existe
        }
    }

}
