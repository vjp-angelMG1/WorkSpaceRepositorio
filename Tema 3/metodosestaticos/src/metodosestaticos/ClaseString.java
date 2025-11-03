/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosestaticos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ClaseString {

    public static void main(String[] args) {
        // Declarar una variable de tipo String
        String nombre;
        String nombre1;
        // Inicializo la variable
        nombre = "Manolo";
        nombre1 = "manolo";
        // Declarar e inicializar una variable de tipo String
        String apellido = "Arsanaliev";

        // Pedir una cadena al usuario   
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál fue el último trofeo que ganaste?: ");
        String trofeos = entrada.nextLine();
        System.out.println("Tienes " + trofeos);

        // Comparar dos valores ( .equals() e .equalsIgnoreCase() )
        if (nombre.equals(apellido)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        if (nombre.equalsIgnoreCase(nombre1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

    }
}
