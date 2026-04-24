/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *• Ejercicio 14.- Realizar un programa que partiendo del fichero “DatosBeca.txt”
calcule la cuantía de la beca (en caso de que la haya). El total de la beca se calcula
como sigue:
• Base fija de 1500€
• Si los ingresos anuales de la familia son menores o iguales a la media (12.000€), la beca
se incrementa en 500€, en caso contrario no lleva complementos.
• Si la edad de la persona es inferior a 23 años, 200€ de gratificación, si es mayor no hay
gratificación.
• Si no hay suspensos en el curso anterior, hay una gratificación de 500€, 1 suspenso
200€, si hay 2 suspensos o más no hay beca.
• Si vive de alquiler (no residencia familiar), 1000€ más de gratificación.
• Visualizar el nombre de cada uno de los becarios y su cuantía total (sólo los que
tienen beca).
* 
 * @author Angel
 */
public class Ejercicio14 {
    
    public static final String FICHERO = "DatosBeca.txt"; // Defino la constante con el nombre del fichero
    
    public static void main(String[] args) {
        int opcion = 0; // Variable para guardar la opción del menú
        do {
            try { // Creo un try-catch para manejar las excepciones
                opcion = menu(); // Llamo al método que muestra el menú y devuelve la opción
                switch (opcion) {
                    case 1:
                        calcularBecas(); // Llamo al método que calcula las becas
                        break;
                    case 2:
                        System.out.println("Te has salido del programa."); // Mensaje de despedida
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 2."); // Mensaje de error
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un tipo de dato correcto."); // Error si no se introduce un número
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero."); // Error si no existe el fichero
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error con la escritura o lectura del fichero."); // Error de lectura/escritura
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error desconocido."); // Error inesperado
            }
        } while (opcion != 2); // El bucle se repite hasta que se elige salir
    }

    public static int menu() { // Método que muestra el menú y devuelve la opción elegida
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Calcular becas."); // Opción 1 del menú
        System.out.println("2. Salir."); // Opción 2 del menú

        int opcion = entrada.nextInt(); // Leo la opción introducida por el usuario
        return opcion; // Devuelvo la opción
    }

    public static void calcularBecas() throws FileNotFoundException, IOException { // Método que lee el fichero y calcula las becas, lanza las excepciones
        try (
            FileReader fr = new FileReader(FICHERO); // Creo un FileReader con el fichero
            BufferedReader br = new BufferedReader(fr); // Creo un BufferedReader para leer línea a línea
        ) {
            String linea = br.readLine(); // Leo la primera línea del fichero
            while (linea != null) { // Mientras haya líneas que leer
                String[] datos = linea.split(";"); // Separo los datos por el delimitador ";"

                String nombre = datos[0]; // Guardo el nombre en la posición 0
                int edad = Integer.parseInt(datos[2]); // Guardo la edad en la posición 2
                int suspensos = Integer.parseInt(datos[3]); // Guardo los suspensos en la posición 3
                String residencia = datos[4]; // Guardo la residencia en la posición 4
                double ingresos = Double.parseDouble(datos[5]); // Guardo los ingresos en la posición 5

                if (suspensos < 2) { // Si tiene menos de 2 suspensos, puede tener beca

                    double beca = 1500; // Base fija de la beca

                    if (ingresos <= 12000) { // Si los ingresos son menores o iguales a 12000€
                        beca += 500; // Incremento la beca en 500€
                    }

                    if (edad < 23) { // Si la edad es menor de 23 años
                        beca += 200; // Incremento la beca en 200€
                    }

                    if (suspensos == 0) { // Si no hay suspensos
                        beca += 500; // Incremento la beca en 500€
                    } else if (suspensos == 1) { // Si hay 1 suspenso
                        beca += 200; // Incremento la beca en 200€
                    }

                    if (residencia.equalsIgnoreCase("NO")) { // Si no vive en residencia familiar
                        beca += 1000; // Incremento la beca en 1000€
                    }

                    System.out.println("" + nombre + ", Beca: " + beca + " €"); // Muestro el nombre y la cuantía total de la beca
                }
                linea = br.readLine(); // Leo la siguiente línea
            }
        }
    }

}