/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 * • Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario
 * las notas de las 6 asignaturas del Ciclo de DAM y te calcule la nota media
 * del curso.
 * • o Nota 1: Cada una de las asignaturas serán un objeto cuyos
 * atributos serán el nombre y la nota. 
 * • o Nota 2: Crea un constructor con el
 * que puedas asignar directamente el nombre de la asignatura al crear el
 * objeto. En cambio, el atributo nota, será el usuario quien lo introduzca
 * mediante un método al que se le pase la nota como argumento. 
 * • o Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media
 * (return) • o Ejemplo de ejecución: Por favor, introduzca la nota de
 * Programación: 6,5 Introduzca la nota de Lenguajes de Marcas: 7,5 Introduzca
 * la nota de Bases de Datos: 7,5 Introduzca la nota de Entornos de Desarrollo:
 * 8 Introduzca la nota de Sistemas Informáticos: 6,5 Por último, introduzca la
 * nota de Formación y Orientación Laboral: 6 Su nota media del curso es de: 7
 *
 * @author Ángel
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Asignaturas programacion = new Asignaturas("programacion"); //creo los objetos con cada una de las asignaturas que pertenecen a la clase asignaturas con constructor por defecto
        String nombreAsignatura = programacion.getNombre(); //guardo en la variable el valor del nombre del objeto programacion que le pido al constructor
        float notaProg = pedirNota(nombreAsignatura); //guardo en la variable float la nota que le pido al metodo de nombre asignatura
        programacion.setNota(notaProg);

        Asignaturas lenguajeDeMarcas = new Asignaturas("Lenguajes de Marcas");
        float notaLeng = pedirNota(lenguajeDeMarcas.getNombre());
        lenguajeDeMarcas.setNota(notaLeng);

        Asignaturas basesDeDatos = new Asignaturas("Bases de Datos");
        float notaBases = pedirNota(basesDeDatos.getNombre());
        basesDeDatos.setNota(notaBases);

        Asignaturas entornosDeDesarrollo = new Asignaturas("Entornos de Desarrollo");
        float notaEntornos = pedirNota(entornosDeDesarrollo.getNombre());
        entornosDeDesarrollo.setNota(notaEntornos);

        Asignaturas sistemasInformaticos = new Asignaturas("Sistemas Informáticos");
        float notaSistemas = pedirNota(sistemasInformaticos.getNombre());
        sistemasInformaticos.setNota(notaSistemas);

        Asignaturas formacionYOrientacionLaboral = new Asignaturas("Formación y Orientación Laboral");
        float notaFOL = pedirNota(formacionYOrientacionLaboral.getNombre());
        formacionYOrientacionLaboral.setNota(notaFOL);

        programacion.mostrarNota(); //muestro las notas de cada asignaturas llamando al metodo mostrar
        lenguajeDeMarcas.mostrarNota();
        basesDeDatos.mostrarNota();
        entornosDeDesarrollo.mostrarNota();
        sistemasInformaticos.mostrarNota();
        formacionYOrientacionLaboral.mostrarNota();
        System.out.println("");
        
        float media = (programacion.getNota() + lenguajeDeMarcas.getNota() + //guardo en una variable la nota del valor de las asignaturas que le pedido y lo divido entre el numero de asignaturas
                       basesDeDatos.getNota() +  entornosDeDesarrollo.getNota() +
                       sistemasInformaticos.getNota() + formacionYOrientacionLaboral.getNota()) / 6;

        System.out.println("La nota media del curso es: " + media); //imprimo por pantalla la media de las asignaturas

    }

    public static float pedirNota(String asignatura) { //creo metodo float con parametro del nombre de la asignatura para que me devuelva su nota
        Scanner nota = new Scanner(System.in); //creo objeto escanner
        System.out.println("Introduce la nota de " + asignatura + ":"); //imprimo por pantalla la nota de la asignatura
        return nota.nextFloat(); //y le devuelvo el valor de la nota
    }
        // Nuevo método que calcula la nota media y la devuelve
    public static float calcularMedia(Asignaturas p, Asignaturas l, Asignaturas b,Asignaturas e, Asignaturas s, Asignaturas f) { //metodo para hacer la media y devolver el valor
        return (p.getNota() + l.getNota() + b.getNota() +
                e.getNota() + s.getNota() + f.getNota()) / 6; //devuelvo el valor de la media 
    }
}
