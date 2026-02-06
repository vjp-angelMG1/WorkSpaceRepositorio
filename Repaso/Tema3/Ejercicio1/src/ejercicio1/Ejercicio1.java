/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        System.out.println("Introduce un numero");
        numero1 = entrada.nextInt();
        if (numero1>0){
            System.out.println("el numero es positivo");
        }else if (numero1<0){
            System.out.println("el numero es negativo");
        }
        
    }
    
}
