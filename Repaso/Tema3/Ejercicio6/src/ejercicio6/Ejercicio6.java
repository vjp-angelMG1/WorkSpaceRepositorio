/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //creo scanner
        int nota; //declaro variable nota
        System.out.println("Introduce una nota");//imprimo lo que le voy a pedir al usuario
        nota = entrada.nextInt(); //recojo el valor de la variable y lo guardo en nota
        switch(nota){ //condicional para comprobar la determinada nota segun su ponderación
            case 0:
            case 1:
            case 2:  
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;//al darse elecion por parte del usuario de la condicion permite que no siga ejecutandose la siguiente eleccion
            case 5:
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default: //permite ver que la eleccion no es correcta entre las opciones disponibles 
                System.out.println("Error numero incorrecto debe estar entre 0 y 10 "); //imprime el error de elegir otra opcion diferente a las que hay
        }
    }
}
