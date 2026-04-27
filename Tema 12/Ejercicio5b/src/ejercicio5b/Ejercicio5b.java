package ejercicio5b;

import java.io.*;
import java.util.*;

/**
 * Ejercicio 05:
 * Programa con menú para:
 * 1. Añadir contactos a un fichero "agenda.txt"
 * 2. Mostrar contenido del fichero
 * 3. Salir
 */
public class Ejercicio5b {
    
    private static final String FICHERO = "agenda.txt";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opc = -1; // variable para controlar el menú

        do {
            try {

                opc = mostrarMenu(); // mostramos menú y guardamos opción

                switch (opc) {

                    case 1:
                        añadirContacto(); // añadir contacto
                        break;

                    case 2:
                        mostrarContenido(); // mostrar fichero
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Error: opción no válida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: has introducido un valor no válido");
                entrada.nextLine();

            } catch (FileNotFoundException e) {
                System.out.println("Error: no se encontró el archivo");

            } catch (Exception e) {
                System.out.println("Error desconocido");
                entrada.nextLine();
            }

        } while (opc != 3);

        entrada.close();
    }

    // ---------------- MENÚ ----------------
    public static int mostrarMenu() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nAGENDA TELEFÓNICA");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Ver contactos");
        System.out.println("3. Salir");
        System.out.print("Elige opción: ");

        return entrada.nextInt();
    }

    // ---------------- AÑADIR CONTACTO ----------------
    public static void añadirContacto() throws IOException {

        Scanner entrada = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Introduce su nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Introduce la edad: ");
        String edad = entrada.nextLine();

        System.out.println("Introduce el teléfono: ");
        String telefono = entrada.nextLine();

        // Abrimos fichero en modo añadir (append)
        try (FileWriter fw = new FileWriter(FICHERO, true);
             PrintWriter pw = new PrintWriter(fw)) {

            // 🔥 Guardamos TODO en una sola línea (formato ordenado tipo CSV)
            pw.println(nombre + ";" + edad + ";" + telefono);

            System.out.println("Contacto guardado correctamente");
        }
    }

    // ---------------- MOSTRAR CONTENIDO ----------------
    public static void mostrarContenido() throws IOException {

        File fichero = new File(FICHERO);

        // comprobamos si existe el fichero
        if (!fichero.exists()) {
            System.out.println("La agenda no existe todavía");
            return;
        }

        try (FileReader fr = new FileReader(fichero);
             BufferedReader br = new BufferedReader(fr)) {

            String linea;

            System.out.println("\nCONTENIDO DE LA AGENDA\n");

            // leemos línea a línea
            while ((linea = br.readLine()) != null) {

                // separamos los datos
                String[] partes = linea.split(";");

                System.out.println("Nombre: " + partes[0]);
                System.out.println("Edad: " + partes[1]);
                System.out.println("Teléfono: " + partes[2]);
                System.out.println("----------------------");
            }
        }
    }
}