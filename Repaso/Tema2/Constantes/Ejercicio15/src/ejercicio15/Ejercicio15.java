/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author USUARIO
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempoTotalEnSegundos = 10000;
        int tiempoEnHoras = tiempoTotalEnSegundos / 3600; //horas
        int tiempoRestante = tiempoTotalEnSegundos % 3600; //segundos restantes
        int tiempoEnMinutos = tiempoRestante / 60; //minutos
        int tiempoEnSegundos = tiempoRestante % 60; //segundos
        System.out.println("10.000 segundos hacen un total de: " + tiempoEnHoras + " horas, " + tiempoEnMinutos + " minutos y " + tiempoEnSegundos + " segundos.");

    }
}