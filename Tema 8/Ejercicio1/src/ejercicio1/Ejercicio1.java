/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Notas[] asignaturas = new Notas[6]; // array de objetos

        // Inicializo cada objeto del array con su nombre y nota 0
        asignaturas[0] = new Notas("Programación", 0);
        asignaturas[1] = new Notas("Lenguajes de Marca", 0);
        asignaturas[2] = new Notas("Bases de Datos", 0);
        asignaturas[3] = new Notas("Entorno de Desarrollo", 0);
        asignaturas[4] = new Notas("Sistemas Informáticos", 0);
        asignaturas[5] = new Notas("Formación y Orientación Laboral", 0);

        // Pido las notas al usuario y las guardo en cada objeto
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.print("Introduzca la nota de " + asignaturas[i].getNombre() + ": ");
            float nota = entrada.nextFloat();
            asignaturas[i].setNotas(nota); // usa setNotas de tu clase
        }

        float media = calcularNotaMedia(asignaturas);
        System.out.println("La nota media del curso es: " + media);

        entrada.close();
    }

    // Si quieres seguir usando este método, podrías integrarlo en el bucle
    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: ");
        return entrada.nextFloat();
    }

<<<<<<< HEAD
    public static float calcularNotaMedia(Notas[] asignaturas) {
        float suma = 0;
        for (int i = 0; i < asignaturas.length; i++) {
            suma += asignaturas[i].getNotas(); // usa getNotas de tu clase
        }
        return suma / asignaturas.length;
    }
=======
    public static float calcularNotaMedia(){
    for (int=0; i< asigntauras.length; i++){
    
    }
    
>>>>>>> 55edc414249f63643dec4f249bd3c5734235d7aa
}