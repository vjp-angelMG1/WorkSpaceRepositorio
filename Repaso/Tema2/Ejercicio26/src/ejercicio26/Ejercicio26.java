/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int numeroTotal;
        System.out.println("Por favor, introduzca un número de 4 cifras:");
        numeroTotal = entrada.nextInt();
            
        int primerNumero = numeroTotal/1000;
        int resto = numeroTotal%1000;
        int segundoNumero = resto/100;
        resto = resto%100;
        int tercerNumero = resto/10;
        int cuartoNumero = resto%10;
        System.out.println("La primera cifra es : "+primerNumero);
        System.out.println("La segunda cifra es : "+segundoNumero);
        System.out.println("La tercera cifra es : "+tercerNumero);
        System.out.println("La cuarta cifra es : "+cuartoNumero);
        
    }
    
}
