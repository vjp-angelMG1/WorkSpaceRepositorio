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
 * 
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dinero;   //dinero total //Variable
        int billetes50,billetes20,billetes10,billetes5,monedas2,monedas1; //   En lo que se dividen los billetes //Variable
              System.out.print("Introduce un importe en euros: ");
            dinero = entrada.nextInt();
        

        // Billetes de 50 euros
           billetes50 = dinero/50; // cuantos billetes de 50 puedo sacar en total
           billetes20 = (dinero % 50)/ 20; //cuantos billetes de 20 saco de las sobras de 50
           billetes10 = (dinero % 20)/ 10; // cuantos billetes de 10 saco de las sobras de 20
           billetes5 = (dinero % 10)/ 5; // cuantos billetes de 5 saco de las sobras de 10
           monedas2 = (dinero % 5)/ 2; // cuantas monedas de 2 saco de las sobras de 5
           monedas1 = dinero % 2; //cuantas monedas de 1 saco de las sobras de 2
                   

       

      

        // Mostrar resultados
        System.out.println("Desglose del importe: " + dinero + " euros");
        System.out.println("Billetes de 50 euros: " + billetes50);
        System.out.println("Billetes de 20 euros: " + billetes20);
        System.out.println("Billetes de 10 euros: " + billetes10);
        System.out.println("Billetes de 5 euros: " + billetes5);
        System.out.println("Monedas de 2 euros: " + monedas2);
        System.out.println("Monedas de 1 euro: " + monedas1);
    }
    
}
