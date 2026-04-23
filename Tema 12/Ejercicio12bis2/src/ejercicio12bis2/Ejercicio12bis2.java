/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *• Ejercicio 12 (bis2) .- Escriba un programa en JAVA que
contenga un método, de nombre
escribirCadenasEnArchivo, que reciba un array de 4
cadenas de caracteres (previamente relleno por el
usuario) y vuelque su contenido a un archivo cuyo
nombre también se recibirá por parámetro.
• Las cadenas quedarán separadas en el archivo por un
asterisco.
 * @author Angel
 */
public class Ejercicio12bis2 {
    
        public static void main(String[] args) { //metodo principal main
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        
        String[]misFrases = new String[4]; // Creo el array de 4 posiciones
        
        System.out.println("Introducir 4 frases para guardar en el archivo: "); // Pido al usuario que rellene el array
        for (int i = 0; i < misFrases.length; i++) {
            System.out.println("Escribe la frase " + (i + 1) + ": ");
            misFrases[i] = entrada.nextLine();
        }
        
        System.out.println("¿Qué nombre quieres ponerle al archivo?: "); // Pido el nombre del archivo de destino
        String nombreFichero = entrada.nextLine()+".txt";
        
        try { // Creo un try-catch y llamo al método creado
            escibirLasCadenasEnElArchivo(misFrases, nombreFichero);
            System.out.println("Se ha creado el fichero con éxito");
            
        } catch (FileNotFoundException e) { //catpturas de excepciones
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }


    public static void escibirLasCadenasEnElArchivo(String[]cadenas, String nombre)throws FileNotFoundException,IOException{ 
        
        try(FileWriter fw = new FileWriter(nombre); PrintWriter pw = new PrintWriter(fw)){ // Creo un try-with-resources
            
            for (int i = 0; i < cadenas.length; i++) { // Recorro el array para volcar el contenido del fichero
                
                pw.print(cadenas[i]); // Escribo la frase actual sin saltar de línea(usando print)
                
                if(i < cadenas.length - 1){ // Si no es la última cadena, pongo el separador "*"
                    pw.print("*");
                }
                
            }
            
        }
    }

}
