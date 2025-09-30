/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;

/**
 *
 * @author Ángel
 * @since 30/09/2025
 */

import java.util.Scanner;
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in); //Scanner de entrada 
        
        System.out.println("Por favor, introduzca la nota de Programación: "); //Instrucciones

        double programacion = entrada.nextDouble(); //Le estamos dando valor a cada entrada como repetiremos a continuación 
        
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        
        double lenguajesDeMarcas = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Base de Datos: ");
        
        double baseDeDatos = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        
        double entornosDeDesarrollo = entrada.nextDouble();
        
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        
        double sistemasInformaticos = entrada.nextDouble();
        
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral");
        
        double formacionYOrientacionLaboral = entrada.nextDouble();

        double notaMedia = (programacion + lenguajesDeMarcas + baseDeDatos +   //variable con la suma de las diferentes entradas que tenemos anteriormente y la dividimos entre 6 para obtener el calculo
                            entornosDeDesarrollo + sistemasInformaticos +
                            formacionYOrientacionLaboral) / 6;
        System.out.println("Su nota media del curso es: " +notaMedia); //impresión con el resultado que nos pide el ejercicio que cojemos de la anterior variable 
    }
    
}
