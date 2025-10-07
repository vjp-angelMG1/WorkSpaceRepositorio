/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24; //hacer la nota media con la suma de las asignaturas//
import java.util.Scanner; //Se hace la importación de los datos escaner que no estan aquí para escanear la entrada que le vamos a dar es necesario para que el programa sepa que es Scanner

 /**
* 
 * @author Ángel 
 * @since 5/10/2025
 */
public class ejercicio24notamedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float programación, marcas, datos, desarrollo, informaticos, laboral; // Se noombra la variables y se les da como dato float porque es un resultado en decimales es el que mas se adapta//
        float NotaMedia; // Se nombra esta variable para hacer el calculo mas tarde
         Scanner entrada = new Scanner(System.in); //Se le da una entrada al objeto de impresión a la hora de poner las notas
        
         
        System.out.println("introduce la nota de programación"); //Impresion de la nota que le vamos a dar a la asignatura
        
        programación = entrada.nextFloat();                                     //Entrada de la impresion del valor numerico que le vamos a dar 
        
        System.out.println("introduce la nota de lenguaje de marcas");
        
        marcas = entrada.nextFloat ();
        
        System.out.println("introduce la nota de bases de datos");
        
        datos = entrada.nextFloat ();
        
        System.out.println("introduce la nota de entornos de desarrollo");
        
        desarrollo = entrada.nextFloat ();
        
        System.out.println("introduce la nota de sistemas informaticos");
        
        informaticos = entrada.nextFloat ();
        
        System.out.println("introduce la nota de formación y orientación laboral");
        
        laboral = entrada.nextFloat ();
        
        
        NotaMedia =(programación+marcas+datos+desarrollo+informaticos+laboral)/6; //Calculo de la nota media dandole el valor 
        
        System.out.println("el resultado de la nota media es " + NotaMedia);
        
        
        
        
    }
    
}
