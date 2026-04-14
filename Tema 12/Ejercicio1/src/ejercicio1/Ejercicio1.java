/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * • Ejercicio 01.- Ayudándote de la clausula throws, realiza el siguiente
 * programa con listas y capturando todas las excepciones que te sean posibles:
 * • Implementa una aplicación en Java que escriba una agenda telefónica con los
 * siguientes atributos para cada contacto: • Nombre • Edad • Número de móvil •
 * Además, crearás un menú que le permita al usuario las siguientes opciones: 1.
 * Añadir contactos a la agenda: Pediremos los datos de un contacto al usuario y
 * lo introducimos en la lista. 2. Visualizar la lista de contactos. 3. Eliminar
 * contactos de la lista: Pediremos el número de teléfono y eliminamos el
 * contacto. 4. Mostrar todos los contactos ordenados por su edad. 5. Salir del
 * programa. • Hasta que el usuario no pulse 5 no saldremos del programa y se
 * volverá a mostrar el menú.
 *
 * @author Ángel
 */
public class Ejercicio1 {

    public static String pedirNombre() throws InputMismatchException {
        System.out.println("Nombre: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static int pedirEdad() throws InputMismatchException {
        System.out.println("Edad: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String pedirNumero() throws InputMismatchException {
        System.out.println("Numero de telefono: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static void main(String[] args) {

        int opc =-1;
        Scanner entrada = new Scanner(System.in);
        do {
            menu();
            try {
                opc = entrada.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("añadiendo contacto");
                        añadirContacto();
                        break;
                    case 2:
                        System.out.println("visualizando la lista");
                        visualizarAgenda();
                    case 3:
                        System.out.println("eliminar contactos de la lista");
                        eliminarContactos();
                        break;
                    case 4:
                        System.out.println("mostrar todos los contactos ordenados");
                        mostrarContactos();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa....");
                        break;
                    default:
                        System.out.println("Error has eleguido una opcion incorrepcta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error has escrito un tipo de dato incorrecto");
            }
        }while(opc!=5);
    
    }

    public static void menu() {
        System.out.println("Elige una opcion");
        System.out.println("1-Añadir contactos a la agenda");
        System.out.println("2-Visualizar la lista de contactos");
        System.out.println("3-Eliminar contactos de la lista");
        System.out.println("4-Mostrar todos los contactos ordenados");
        System.out.println("5-Salir del programa");

    }

    public static void añadirContacto() {
        System.out.println("-Añadir los contactos-");
        do {
            
        }
        
    }

    public static void visualizarAgenda() {
    }

    public static void eliminarContactos() {
    }

    public static void mostrarContactos() {
    }

}
