/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

// Importamos todas las clases que se usaban al principio
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Ejercicio11 {

    public static void main(String[] args) { //creo metodo principal main
        Scanner entrada = new Scanner(System.in); //creo objeto escanner

        
        
        Set<Alumno> alumnos = new TreeSet<>();// Usamos TreeSet porque guarda los datos SIN repetir y además los ordena automáticamente

        int opcion; //declaro variable para eleguir una opcion

        // Bucle principal que se repite al menos una vez
        do {
            mostrarMenu(); //llamo al metodo mostrar menu
            opcion = entrada.nextInt(); //pido al usuario la opcion

            switch (opcion) { //condicional switch para eleguir una opcion
                case 1:
                    aniadirAlumnos(alumnos); //llamo al metodo para añadir alumnos
                    break; //paro los casos con break para que no salte al siguiente
                case 2:
                    mostrarAlumnosPorExpediente(alumnos); //llamo al metodo para mostrar alumnos segun su expediente
                    break;
                case 3:
                    buscarPorExpediente(alumnos); //llamo al metodo buscar por expediente
                    break;
                case 4:
                    mostrarAlumnosPorNota(alumnos);//lamo al metodo para mostrar alumnos por la nota
                    break;
                case 5:
                    System.out.println("Saliendo del programa"); //imprimo caso 5 para salir del programa
                    break;
                default:
                    System.out.println("Error opcion no válida");
            }
        } while (opcion != 5); // Se repite el bucle hasta que elija un numero diferente a 5
    }

    public static void mostrarMenu() { //metodo para mostrar el menu
        System.out.println("-- MENU --");
        System.out.println("1. Añadir alumno");
        System.out.println("2. Mostrar alumnos por expediente");
        System.out.println("3. Buscar por expediente");
        System.out.println("4. Mostrar alumnos por nota");
        System.out.println("5. Salir");
        System.out.print("Elige una opcion");
    }

    // ================= AÑADIR ALUMNO =================
    public static void aniadirAlumnos(Set<Alumno> alumnos) { //metodo para añadir un alumno con el valor Set parametrizado
        System.out.println("-- Añadir alumno --");

        // Pedimos los datos al usuario
        String dni = pedirDni();
        int expediente = pedirExpediente();
        float media = pedirMedia();

        // Creamos el objeto alumno con los parametros
        Alumno nuevo = new Alumno(dni, expediente, media);

        // Lo añadimos al conjunto
        alumnos.add(nuevo);

        System.out.println("Alumno añadido correctamente");
    }

    public static void mostrarAlumnosPorExpediente(Set<Alumno> alumnos) { //metodo para mostrar alumno por expendiente con el valor parametrizado set
        if (alumnos.isEmpty()) {//Condicional para ver que no hay alumnos
            System.out.println("No hay alumnos registrados");
        } else {
            // TreeSet ya los tiene ordenados por expediente
            System.out.println("ALUMNOS ORDENADOS POR EXPEDIENTE");

            for (Alumno a : alumnos) {// Recorremos todos los alumnos con bucle for
                System.out.println(a);
                System.out.println();
            }
        }
    }

    public static void buscarPorExpediente(Set<Alumno> alumnos) { //metodo para buscar por expendiente con el valor parametrizado set
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de expediente: ");
        int buscar = entrada.nextInt();

        boolean encontrado = false;


        for (Alumno a : alumnos) {// Recorremos todos los alumnos con bucle for

            
            if (a.getNumeroExpediente() == buscar) {//Si coincide el expediente 
                System.out.println("Alumno encontrado:"); //imprimo por pantalla alumno encontrado
                System.out.println(a);
                encontrado = true;
                break; // dejamos de buscar
            }
        }

        
        if (!encontrado) {// Si no se encontró
            System.out.println("No existe ese alumno");
        }
    }


    public static void mostrarAlumnosPorNota(Set<Alumno> alumnos) { //metodo para mostrar alumnos por la nota con parametros set

        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {

            // Pasamos el Set a una lista para poder ordenarlo
            List<Alumno> lista = new ArrayList<>(alumnos);

            // Ordenamos por nota media (de menor a mayor)
            Collections.sort(lista, Comparator.comparing(Alumno::getNotaMedia));

            System.out.println("--- ALUMNOS ORDENADOS POR NOTA ---");

            for (Alumno a : lista) {
                System.out.println(a);
                System.out.println();
            }
        }
    }


   
    public static String pedirDni() {  // Metodo para pedir el DNI
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        return entrada.nextLine();
    }

    
    public static int pedirExpediente() { // Metodo para pedir el numero de expediente
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número expediente: ");
        return entrada.nextInt();
    }

    public static float pedirMedia() { //metodo para pedir la nota media 
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota media: ");
        return entrada.nextFloat();
    }
}

