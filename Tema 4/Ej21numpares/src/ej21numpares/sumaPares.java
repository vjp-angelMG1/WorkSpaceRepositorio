/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej21numpares;

/**
 *
 * @author Angel
 */
public class sumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main 
         System.out.println("Primera forma (sin validación):"); //Imprimo el valor sin la validación 
        Datos.datosSinValidar();//llamo a la clase datos y al metodo para que me de el valor 

        System.out.println("\nSegunda forma (con validación):"); //Imprimo el valor con la validación
        Datos.datosConValidacion();//llamo a la clase datos y al metodo para que me de el valor
    }
    
}
