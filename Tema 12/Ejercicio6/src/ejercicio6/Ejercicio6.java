/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.io.*; //importo todas la clases de los paquetes io y util
import java.util.*;

/**
 * • Ejercicio 06.- Realiza un programa en JAVA en el que muestres un menú que
 * te permita 3 opciones: 1. Volcado de un array con los 100 primeros números
 * pares a un fichero de texto. El nombre del fichero lo elegirá el usuario. 2.
 * Mostrar por pantalla el contenido del fichero de texto creado. 3. Salir del
 * Programa. • Captura las excepciones que veas necesarias.
 *
 * @author Angel
 */
public class Ejercicio6 {

    public static void main(String[] args) { //metodo principal main ejecutable
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        int opc = -1; //declaro e inicializo variables para que no tenga problemas con el control de excepciones

        do { //bucle que al menos se repite una vez
            try { //control de excepciones

                mostrarMenu(); //llamo al metodo y imprimo por pantalla sus opciones
                opc = entrada.nextInt(); //guardo en la variable la opcion

                entrada.nextLine(); //limpio buffer

                switch (opc) { //condicional para elegir una opcion
                    case 1: //caso 1 
                        volcarLosParesEnElFichero(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 2:
                        mostrarElFichero();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Error: la opcion no es correcta");
                }

            } catch (InputMismatchException e) { //capturo las excepciones y las muestro por pantalla
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine(); //limpio el buffer del scanner
            } catch (Exception e) {
                System.out.println("Error: es desconocido");
                entrada.nextLine(); //limpio el buffer del scanner
            }
        } while (opc != 3); //se repite el bucle mientras la opcion sea distinta de 3

    }

    public static void mostrarMenu() { //metodo para mostrar el menu

        System.out.println("Agenda Telefonica");
        System.out.println("1.Volcar los 100 primeros numeros pares a la agenda");
        System.out.println("2.Mostrar contenido de la agenda");
        System.out.println("3.Salir del programa");
    }

    public static void volcarLosParesEnElFichero() throws FileNotFoundException, IOException { //metodo para mostrar los pares en el fichero en el que lanzo las excepciones
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        int[] pares = new int[100]; //creo un array con 100 posiciones
        int num = 2; // declaro e incializo la variable para que empiece en par

        // Rellenamos el array con los 100 primeros pares
        for (int i = 0; i < pares.length; i++) { //con el bucle for recorro el array 
            pares[i] = num; // Guardamos en la variable para rellenar el array el número con la posición que tiene
            num = num + 2; // voy sumando 2 para añadir los numeros pares         
        }

        System.out.println("Introduce el nombre de la agenda: ");
        String nombreAgenda = entrada.nextLine(); //guardo en la variable el nombre de la agenda

        try (FileWriter fw = new FileWriter(nombreAgenda);PrintWriter pw = new PrintWriter(fw)) { //// Creo el acceso al fichero para que se abra y se cierre de manera idependiente y para poder escribir le paso el objeto creado por parametros a la impresora

            // Recorremos el array de números
            for (int n : pares) { // recorro en el Array solo los numeros pares
                pw.println(n); // Escribo los numeros pares en lineas distintas
            }

            System.out.println("El Array de numeros pares se ha volcado"); //imprimo por pantalla que se ha volcado el array

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage()); //muestro el mensaje de la captura de la exccepcion
        }
    }

    public static void mostrarElFichero() throws FileNotFoundException, IOException { //metodo para mostrar el contenido del fichero lazando las excepciones
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        System.out.println("¿Qué agenda vas a leer?: "); //imprimo por pantalla la agenda que quiere leer
        String nombreAgenda = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario

        // Apuntamos al fichero
        File arch = new File(nombreAgenda); //apuntando a la agenda guardo el nombre en un objeto

        if (!arch.exists()) { //condicional para ver si el archivo existe del fichero que le llamo agenda
            System.out.println("El fichero no existe todavia");
            return;
        }

        try (FileReader fr = new FileReader(arch); 
             BufferedReader br = new BufferedReader(fr)) { //uso el try-catch con recursos para abrir y cerrar de forma independiente FileReader y BufferedReader

            String linea; // Declaro variable para guardar las lineas que se van leyendo
            System.out.println("Contenido del fichero");

            while ((linea = br.readLine()) != null) { //bucle que se repite mientras la linea no este vacia
                System.out.println(linea); //imprimo las lineas
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Error al leer el archivo: " + e.getMessage()); //imprimo por pantalla la excepcion erronea con el mensaje correspondiente
        }
    }

}