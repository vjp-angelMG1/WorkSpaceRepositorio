/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17test;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Test {
    private Enunciado p1;
    private Enunciado p2;
    private Enunciado p3;
    private Enunciado p4;

    private Scanner entrada = new Scanner(System.in);

    public Test() {
        p1 = new Enunciado("¿Cuál es la capital de España?", "Madrid");
        p2 = new Enunciado("¿Quién descubrió América?", "Cristóbal Colón");
        p3 = new Enunciado("¿En qué año comenzó la Segunda Guerra Mundial?", "1939");
        p4 = new Enunciado("¿Cuál es el río más largo del mundo?", "Nilo");
    }
    
      public void realizarTest() {
        double nota = 0;

        System.out.println("\n--- EXAMEN ---");

        // Pregunta 1
        System.out.println(p1.getPregunta());
        System.out.println("Tu respuesta: ");
        if (entrada.nextLine().trim().equalsIgnoreCase(p1.getRespuesta())) {
            System.out.println("Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto.");
            System.out.println("Respuesta correcta: " + p1.getRespuesta());
        }

        // Pregunta 2
        System.out.println(p2.getPregunta());
        System.out.println("Tu respuesta: ");
        if (entrada.nextLine().trim().equalsIgnoreCase(p2.getRespuesta())) {
            System.out.println("Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto.");
            System.out.println("Respuesta correcta: " + p2.getRespuesta());
        }

        // Pregunta 3
        System.out.println(p3.getPregunta());
        System.out.println("Tu respuesta: ");
        if (entrada.nextLine().trim().equalsIgnoreCase(p3.getRespuesta())) {
            System.out.println("Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto.");
            System.out.println(" Respuesta correcta: " + p3.getRespuesta());
        }

        // Pregunta 4
        System.out.println(p4.getPregunta());
        System.out.println("Tu respuesta: ");
        if (entrada.nextLine().trim().equalsIgnoreCase(p4.getRespuesta())) {
            System.out.println(" Correcto!");
            nota += 2.5;
        } else {
            System.out.println("Incorrecto.");
            System.out.println(" Respuesta correcta: " + p4.getRespuesta());
        }

        System.out.println("\n===============================");
        System.out.println("Tu nota final es: " + nota + "/10");
        System.out.println("===============================");
    }
    
}
