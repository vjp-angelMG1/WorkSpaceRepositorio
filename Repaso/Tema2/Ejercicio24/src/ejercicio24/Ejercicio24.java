/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author Angel
 * @date 03/02/2026
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double programacion;
        double lenguajeDeMarca;
        double basesDeDatos;
        double entornosDeDesarrollo;
        double sistemasInformaticos;
        double ingles;
        double ipe;
        double notaMedia;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca la nota de Programación:");
        programacion = entrada.nextDouble();
        System.out.println("Introduzca la nota de Lenguajes de Marcas:");
        lenguajeDeMarca = entrada.nextDouble();
        System.out.println("Introduzca la nota de Bases de Datos:");
        basesDeDatos = entrada.nextDouble();
        System.out.println("Introduzca la nota de Entornos de Desarrollo:");
        entornosDeDesarrollo = entrada.nextDouble();
        System.out.println("Introduzca la nota de Sistemas Informáticos:");
        sistemasInformaticos = entrada.nextDouble();
        System.out.println("Introduzca la nota de Inglés Profesional:");
        ingles = entrada.nextDouble();
        System.out.println("introduzca la nota de Itinerario Personal para la Empleabilidad: ");
        ipe = entrada.nextDouble();
        notaMedia = (programacion+lenguajeDeMarca+basesDeDatos+entornosDeDesarrollo+sistemasInformaticos+ingles+ipe)/7;
        System.out.println("La nota media es : "+notaMedia);
        
    }
    
}
