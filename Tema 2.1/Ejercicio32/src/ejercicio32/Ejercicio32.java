/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
//

import java.util.Scanner;

/**
 *
 * @author Ángel
 * @Since 30/09/2025
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
              System.out.print("Introduce un importe en euros: ");
        int importe = entrada.nextInt();

        int original = importe; // Guardamos el valor original para mostrar al final

        // Billetes de 50 euros
        int billetes50 = importe / 50;
        importe = importe % 50;

        // Billetes de 20 euros
        int billetes20 = importe / 20;
        importe = importe % 20;

        // Billetes de 10 euros
        int billetes10 = importe / 10;
        importe = importe % 10;

        // Billetes de 5 euros
        int billetes5 = importe / 5;
        importe = importe % 5;

        // Monedas de 2 euros
        int monedas2 = importe / 2;
        importe = importe % 2;

        // Monedas de 1 euro (restante)
        int monedas1 = importe;

        // Mostrar resultados
        System.out.println("Desglose del importe: " + original + " euros");
        System.out.println("Billetes de 50 euros: " + billetes50);
        System.out.println("Billetes de 20 euros: " + billetes20);
        System.out.println("Billetes de 10 euros: " + billetes10);
        System.out.println("Billetes de 5 euros: " + billetes5);
        System.out.println("Monedas de 2 euros: " + monedas2);
        System.out.println("Monedas de 1 euro: " + monedas1);
    }
    
}
