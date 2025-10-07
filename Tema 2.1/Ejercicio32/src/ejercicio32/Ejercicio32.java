/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
//

import java.util.Scanner; //importación  de la libreria java util desde scanner

/**
 *
 * @author Ángel     // Etiqueta de descripción de el autor que lo hizo
 * @since 06/10/2025 // Etiqueta de descripción de la fecha en la que se realizo 
 */
public class Ejercicio32 { //Nombre del ejercicio

    /**
     * @author Ángel // Etiqueta del nombre 
     * @since 07/10/2025
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        
        int dinero;   //dinero total //Variable
        int billetes50,billetes20,billetes10,billetes5,monedas2,monedas1; //   Variable que muestra en lo que se van a dividir los billetes y las monedas //Variable
            Scanner entrada = new Scanner(System.in); //Entrada del scanner nueva para darle valor al objeto 
        System.out.println("Introduce un importe en euros: "); //Se imprime el enunciado con el que vamos a dar valor al dinero
            dinero = entrada.nextInt(); //valor que le voy a dar de entrada al dinero
        

        
           billetes50 = dinero/50; // cuantos billetes de 50 puedo sacar en total
           billetes20 = (dinero % 50)/ 20; //cuantos billetes de 20 saco de las sobras de 50
           billetes10 = (dinero % 20)/ 10; // cuantos billetes de 10 saco de las sobras de 20
           billetes5 = (dinero % 10)/ 5; // cuantos billetes de 5 saco de las sobras de 10
           monedas2 = (dinero % 5)/ 2; // cuantas monedas de 2 saco de las sobras de 5
           monedas1 = dinero % 2; //cuantas monedas de 1 saco de las sobras de 2
                   

       

      

        // Muestra los resultados atraves de la impresión de los diferentes billetes y monedas 
        System.out.println("Desglose del importe: " + dinero + " euros"); //Imprimir el desglose del importe
        System.out.println("Billetes de 50 euros: " + billetes50); //Imprimir el resultado de los billetes de 50 euros
        System.out.println("Billetes de 20 euros: " + billetes20); //Imprimir el resultado de los billetes de 20 euros
        System.out.println("Billetes de 10 euros: " + billetes10); //Imprimir el resultado de los billetes de 10 euros
        System.out.println("Billetes de 5 euros: " + billetes5); //Imprimir el resultado de los billetes de 5 euros 
        System.out.println("Monedas de 2 euros: " + monedas2); //Imprimir el resultado de las monedas de 2 euros
        System.out.println("Monedas de 1 euro: " + monedas1); //Imprimir el resultado de las monedas de 1 euro
    }
    
}
