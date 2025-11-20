/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5notas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio5notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
        Asignatura prog = new Asignatura("Programacion");
        Asignatura lmsgi = new Asignatura("Lenguaje de Marcas");
        Asignatura bd = new Asignatura("Bases de Datos");
        Asignatura ed = new Asignatura("Entornos de Desarrollo");
        Asignatura si = new Asignatura("Sistemas Informaticos");
        Asignatura fol = new Asignatura("Formacion y Orientacion Laboral");
        
        System.out.println("Por favor, introduzca la nota de " + prog.getNombre() + ":");
        prog.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + lmsgi.getNombre() + ":");
        lmsgi.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + bd.getNombre() + ":");
        bd.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + ed.getNombre() + ":");
        ed.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + si.getNombre() + ":");
        si.setNota(entrada.nextDouble());
        System.out.println("Introduzca la nota de " + fol.getNombre() + ":");
        fol.setNota(entrada.nextDouble());
        
        double notaMedia = Asignatura.notaMedia(prog.getNota(), lmsgi.getNota(), bd.getNota(), ed.getNota(), si.getNota(), fol.getNota());
        
        System.out.println("La nota media del curso es: " + notaMedia);
        
    }
    
}
