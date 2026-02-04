/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercio14del13;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Ejercio14Del13 {



        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            //Se crea el alumno usando el contructor por defecto
            Alumno alumno1 = new Alumno();
            alumno1.setNombre("Manuel");
            alumno1.setEdad(15);
            alumno1.setNotaMedia(6.5f);

            //Se crea el alumno usando el contructor parametrizado
            Alumno alumno2 = new Alumno("Carlos", 12, 7.8f);

            //Mostrar los dos alumnos creados
            System.out.println("--ALUMNO-1--");
            System.out.println(alumno1.toString());
            System.out.println("--ALUMNO-2--");
            System.out.println(alumno2.toString());
            System.out.println("");

            //Se crea un array de 5 alumnos
            Alumno[] alu = new Alumno[5];
            int opcion;

            do {
                mostrarMenu();
                opcion = entrada.nextInt();

                switch (opcion) {//Se ejecuta la opción elegida
                    case 1 ->
                        rellenarAlumnos(alu);
                    case 2 ->
                        mostrarAlumnos(alu);
                    case 3 ->
                        mostrarAlumnosMediaEncima(alu);
                    case 4 ->
                        mostrarAlumnosMediaSuspensa(alu);
                    case 5 ->
                        buscarAlumnos(alu);
                    case 6 ->
                        System.out.println("Saliendo del programa...");
                    default ->
                        System.out.println("Opcion no valida, intentalo de nuevo");
                }
            } while (opcion != 6);//No termina hasta que elija el 6
        }

        //Metodo que muestra el menu
        public static void mostrarMenu() {
            System.out.println("\n--MENU--");
            System.out.println("1. Rellenar un alumno");
            System.out.println("2. Mostrar vector del alumno");
            System.out.println("3. Mostrar alumnos con nota media por encima de una nota dada");
            System.out.println("4. Mostrar cuantos alumnos hay con la nota media suspensa");
            System.out.println("5. Buscar alumnos");
            System.out.println("6. Salir del programa");
            System.out.print("Introduce una opcion: ");
        }

        //Metodo que rellena los datos del alumno
        public static void rellenarAlumnos(Alumno[] alu) {
            System.out.println("");
            Scanner entrada = new Scanner(System.in);

            int posicion;
            //Se pide al usuario una posición válida dentro del array
            do {
                System.out.print("Introduce la posicion entre el 0 y el 4: ");
                posicion = entrada.nextInt();
                entrada.nextLine();

                //Si la posición está fuera del rango permitido
                if (posicion < 0 || posicion >= alu.length) {
                    System.out.println("Posicion fuera de rango");
                    //Si la posición está dentro del rango pero ya tiene un alumno guardado
                } else if (alu[posicion] != null) {
                    System.out.println("Esa posicion ya esta ocupada. Elige otra");
                }
                //Se repite mientras la posición sea inválida o esté ocupada
            } while (posicion < 0 || posicion >= alu.length || alu[posicion] != null);

            //Se piden los datos del alumno
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Edad: ");
            int edad = entrada.nextInt();
            System.out.print("Nota media: ");
            float nota = entrada.nextFloat();

            //Se crea el alumno y se guarda los datos en la posicion indicada
            alu[posicion] = new Alumno(nombre, edad, nota);
            System.out.println("Alumno insertado correctamente");
        }

        //Metodo que muestra los datos del alumno
        public static void mostrarAlumnos(Alumno[] alu) {
            System.out.println("");
            for (int i = 0; i < alu.length; i++) {
                if (alu[i] != null) {
                    System.out.println("--Posicion " + i + "--");
                    System.out.println(alu[i].toString());
                }
            }
        }

        //Metodo que muestra los alumnos que tienen la nota media superior al indicado
        public static void mostrarAlumnosMediaEncima(Alumno[] alu) {
            System.out.println("");
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce una nota limite: ");
            float limite = entrada.nextFloat();

            boolean encontrado = false;

            for (int i = 0; i < alu.length; i++) {
                if (alu[i] != null && alu[i].getNotaMedia() > limite) {
                    System.out.println(alu[i].toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No hay alumnos con nota media superior a " + limite);
            }
        }

        //Metodo que muestra los alumnos que tienen la nota media inferior a 5
        public static void mostrarAlumnosMediaSuspensa(Alumno[] alu) {
            System.out.println("");
            int contador = 0;
            String nombre = "";

            for (int i = 0; i < alu.length; i++) {
                if (alu[i] != null && alu[i].getNotaMedia() < 5) {
                    contador++;
                    nombre += alu[i].getNombre() + " ";
                }
            }
            System.out.println("Hay " + contador + " alumnos con la nota media suspensa y son: " + nombre);
        }

        //Metodo que busca el alumno por si nombre y muestra sus datos si existe
        public static void buscarAlumnos(Alumno[] alu) {
            System.out.println("");
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce el nombre del alumno a buscar: ");
            String nombre = entrada.nextLine();

            boolean encontrado = false;
            int posicionActual = 0;

            while (posicionActual < alu.length && !encontrado) {
                //Se comprueba que la posición no sea null y que el nombre coincida
                if (alu[posicionActual] != null && alu[posicionActual].getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                } else {
                    posicionActual++;
                }
            }
            if (encontrado) {
                System.out.println("El alumno 'si' esta matriculado");
                System.out.println(alu[posicionActual].toString());
            }
            if (!encontrado) {
                System.out.println("El alumno 'no' esta matriculado");
            }
        }
}
