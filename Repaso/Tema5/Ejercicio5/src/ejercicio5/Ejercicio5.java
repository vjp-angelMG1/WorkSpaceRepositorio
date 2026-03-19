/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *• Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6 asignaturas del
Ciclo de DAM y te calcule la nota media del curso.
• o Nota 1: Cada una de las asignaturas serán un objeto cuyos atributos serán el nombre y la nota.
• o Nota 2: Crea un constructor con el que puedas asignar directamente el nombre de la asignatura al crear el
objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método al que se le
pase la nota como argumento.
• o Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media (return)
• o Ejemplo de ejecución:
Por favor, introduzca la nota de Programación: 6,5
Introduzca la nota de Lenguajes de Marcas: 7,5
Introduzca la nota de Bases de Datos: 7,5
Introduzca la nota de Entornos de Desarrollo: 8
Introduzca la nota de Sistemas Informáticos: 6,5
Por último, introduzca la nota de Formación y Orientación Laboral: 6
Su nota media del curso es de: 7
* 
 * @author Ángel
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        Asignaturas programacion = new Asignaturas(); //creo los objetos con cada una de las asignaturas que pertenecen a la clase asignaturas con constructor por defecto
        programacion.setNombre("Programacion");
        System.out.println("Introduce la nota de programacion");
        programacion.getNota(pedirNota());
        Asignaturas LenguajeDeMarcas = new Asignaturas();
        Asignaturas BasesDeDatos = new Asignaturas();
        Asignaturas EntornosDeDesarrollo = new Asignaturas();
        Asignaturas SistemasInformaticos = new Asignaturas();
        Asignaturas FormacionYOrientacionLaboral = new Asignaturas();
 
        
        programacion.mostrarNota();
        System.out.println("");

        
    }
    public static int pedirNota(){
        int notas;
        Scanner nota = new Scanner(System.in);
        notas = nota.nextInt();
        return notas;
    }
}
