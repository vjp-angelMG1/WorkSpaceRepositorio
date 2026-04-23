/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *• Ejercicio 13.- Realizar un programa que lea de teclado (la entrada estándar) los
siguientes datos:
• Nombre y apellido de un supuesto becario.
• Sexo (H-M)
• Edad (20-60)
• Número de suspensos del curso anterior (0-4).
• Residencia familiar (SI-NO)
• Ingresos anuales de la familia.
• Los datos se almacenan en un fichero llamado “DatosBeca.txt”.
• Cuando vuelvas a ejecutar el programa no se sobrescribirá el fichero, sino que se
seguirán añadiendo posibles becarios al final del fichero.
* 
 * @author Angel
 */
public class Ejercicio13 {
    
        public static void main(String[] args) {
        
        try { // Creo un try-catch
            añadirElBecario(); // Llamo al método que pide los datos y los guarda
            System.out.println("Proceso finalizado. Los datos se han guardado en DatosBecas.txt");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: No se encuentra el archivo. Comprueba su ubicación.");
        } catch (IOException e) {
            System.out.println("ERROR de lectura/escritura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.toString());
        }

    }


    public static void añadirElBecario() throws FileNotFoundException, IOException { //metodo que pide los datos del becario al usuario y lanza las excepciones
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre y apellidos: "); // Pido el nombre y apellidos
        String nombre = entrada.nextLine();
        System.out.println("Sexo (H/M): "); // Pido el sexo
        String sexo = entrada.nextLine();
        System.out.println("Edad (20-60): "); // Pido la edad
        int edad = entrada.nextInt();
        entrada.nextLine(); // Limpio el buffer del teclado
        System.out.println("Número de suspensos (0-4): "); // Pido el número de suspensos
        int suspensos = entrada.nextInt();
        entrada.nextLine(); // Limpio el buffer del teclado
        System.out.println("Residencia familiar (si/no): "); // Pido la residencia familiar
        String residencia = entrada.nextLine();
        System.out.println("Ingresos anuales de la familia: "); // Pido los ingresos anuales
        double ingresos = entrada.nextDouble();
        entrada.nextLine(); // Limpio el buffer del teclado

        guardarEnElArchivo(nombre, sexo, edad, suspensos, residencia, ingresos); // Llamo al método utilizando las variables que creo en el main para que muestre los valores de los parametros
    }

    private static void guardarEnElArchivo(String nombre, String sexo, int edad, int suspensos, String residencia, double ingresos) throws FileNotFoundException, IOException { //metodo para meter los datos en el fichero de texto con parametros y que lanza las excepciones
        String nombreFichero = "DatosBeca.txt"; // Creo el nombre del fichero

        try (FileWriter fw = new FileWriter(nombreFichero, true); PrintWriter pw = new PrintWriter(fw)) { // Creo un try-with-resources

            pw.println("Becario: " + nombre); // Escribo los datos del becario
            pw.println("Sexo: " + sexo + " | Edad: " + edad + " años");
            pw.println("Suspensos: " + suspensos + " | Residencia Familiar: " + residencia);
            pw.println("Ingresos anuales: " + ingresos + "€");
            System.out.println("**********"); // Imprimo una línea separadora
        }
    }


}