/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoGestionColaCorreos;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class ProyectoGestionColaCorreos {

    /**
     * @param args the command line arguments
     */
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
       
      /**
       * Método que gestiona la opción del menú
       * elegida por el usuario.
       * 
       * @param opcion
       */
       public static void gestionarMenu(int opcion){
           switch(opcion) {
                case 1:
                    generarNumeroEsperaEnvio();
                    System.out.println("Mesa: "+ generarLetraAleatoria(LETRA_INICIO_RANGO,LETRA_FIN_RANGO) + "\n");
                    break;
                case 2:
                    generarNumeroEsperaRecogida();
                    System.out.println("Mesa: "+ generarLetraAleatoria(LETRA_INICIO_RANGO,LETRA_FIN_RANGO) + "\n");
                    break;
                case 3:
                    System.out.println( "Gracias por respetar la cola :)");
                    break;
                default:
                    System.out.println("\nLa opción " + opcion + "no es correcta. Por favor , selecione una opción válida \n");
           }            
       }
       
       /**
        * Método que genera una letra aleatoria
        * dentro del rango establecido por parámetro.
        * 
        * @param inicioRango
        * @param finRango
        * 
        * @return la letra aleatoria dentro del rango
        */
       
    public static char generarLetraAleatoria(char inicioRango, char finRango) {
        //Convierto los caracteres a int
        int numInicioRango = (int)inicioRango;
        int numFinRango = (int)finRango;
        int numeroAleatorio;
        
        //Genero el número aleatorio entre los números de inicio + 1 y fin de rango
        numeroAleatorio = (int)(Math.random()*(numFinRango + 1 - numInicioRango)) + numInicioRango;
        
        //Otra forma de hacer lo mismo, por si lo ves más claro;
//        int desfase = inicioRango;
//        int rango = finRango + 1 - inicioRango;
//        numAleatorio = (int)(desfase + (Math.random() * rango));
        return (char)numeroAleatorio;
    } 
    /**
     * Método que incrementa en 1 el número de envío
     */
    
    
    public static void incrementarNumeroEnvio() {
        numeroEnvio++;
    }
    
    /**
     * Método que incrementa en 1 el número de recogida
     */
    public static void incrementarNumeroRecogida() {
        numeroRecogida++;
    }
    /**
     * Método que imprime por pantalla el mensaje para el usuario,
     * mostrando el número de envío y la mesa que le atenderá.
     * Incrementa el número de envío.
     */
    public static void generarNumeroEsperaEnvio() {
        System.out.println("\nNúmero: E-" + numeroEnvio);
        incrementarNumeroEnvio();
    
    }
    /**
     * Método que imprime por pantalla el mensaje para el usuario,
     * mostrando el número de recogida y la mesa que le atenderá.
     * incrementa el número de recogida y la mesa que le atenderá.
     * Incrementa el número de recogida.
     */
    public static void generarNumeroEsperaRecogida() {
        System.out.println("\nNúmero: R-" + numeroRecogida);
        incrementarNumeroRecogida();
    }
    
    /**
     * Método principal que ejecuta el menú
     * hasta que el usuario pulsa la opción Salir.
     * 
     * Controla que el usuario introduzca
     * el tipo de dato correcto.
     * 
     * @param args the comand line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        
        do {
            try {
                
                mostrarMenu();
                opcion = pedirOpcion();
                gestionarMenu(opcion);
                System.out.println("");
                
            }catch(InputMismatchException e) {
                System.out.println("Opción incorrecta. Escribe un número entre 1 y 3.\n");
            }
        } while(opcion !=3);    
    }
        
}
    

