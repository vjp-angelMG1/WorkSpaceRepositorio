/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coladecorreos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ATRIBUTOS
       //Variables estáticas
       public static int numeroEnvio = 1;
       public static int numeroRecogida = 1;
       
       // Constantes
       public final static char LETRA_INICIO_RANGO = 'A';
       public final static char LETRA_FIN_RANGO = 'F';
       
       // MÉTODOS
       
       /**
        * Método que muestra las opciones del menú
        */
       public static void mostrarMenu(){
           System.out.println("PIDA NÚMERO PARA SER ATENDIDO -");
           System.out.println("");
           System.out.println("+---------------------------+");
           System.out.println("| 1. Enviar                 |");
           System.out.println("+---------------------------+");
           System.out.println("| 2. Recoger                |");
           System.out.println("+---------------------------+");
           System.out.println("| 3. Salir                  |");
           System.out.println("+---------------------------+");
           System.out.println("");
       }
       
       /**
        * Método que pide al usuario un número entero
        * para elegir una opción del menú
        * 
        * @return el número introducido por el usuario
        */
       public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una opción: ");
        return entrada.nextInt();
        
       }
       
              
    }
    
}
