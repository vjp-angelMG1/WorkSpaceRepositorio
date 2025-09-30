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
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca la nota de Programación: ");
        double programacion = scanner.nextDouble();

        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        double lenguajesDeMarcas = scanner.nextDouble();

        System.out.print("Introduzca la nota de Base de Datos: ");
        double baseDeDatos = scanner.nextDouble();

        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        double entornosDeDesarrollo = scanner.nextDouble();

        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        double sistemasInformaticos = scanner.nextDouble();

        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        double formacionYOrientacionLaboral = scanner.nextDouble();

        double notaMedia = (programacion + lenguajesDeMarcas + baseDeDatos +
                            entornosDeDesarrollo + sistemasInformaticos +
                            formacionYOrientacionLaboral) / 6;

        System.out.printf("Su nota media del curso es: ", notaMedia);
    }
    
}
