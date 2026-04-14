/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.*; //importo todas las clases de el paquete io y util
import java.util.*;

/**
• Ejercicio 05.- Realiza un programa en JAVA en el que muestres un
menú que te permita 3 opciones:
1. Añadir un contacto a un fichero de texto (“agenda.txt”) en el que
indiques en cada línea:
• Un Nombre.
• Una Edad.
• Un número de teléfono.
2. Mostrar por pantalla el contenido del fichero de texto creado.
3. Salir del Programa.
• Captura las excepciones que veas necesarias.
* 
 * @author Angel
 */
public class Ejercicio5 {

    public static void main(String[] args) { //metodo principal main para mostrar el menu
        Scanner entrada = new Scanner(System.in); //creo objeto escanner

        int opc = -1; //inicializo y declaro la variable a -1 para no tener porblemas con el control de excepciones
        do { //bucle que al menos se repite una vez
            try { //cojo la excepcion
                mostrarMenu(); //llamo al metodo para que muestre las opciones
                opc = entrada.nextInt(); //guardo en una variable la opcion que le pido al usuario

                switch (opc) { //condicional para eleguir la opcion de los casos
                    case 1: //caso 1 llamo al metodo para añadir el contacto
                        añadirContacto();
                        break; //para que no salte al siguiente caso
                    case 2:
                        mostrarContenido(); //llamo al metodo para mostrar el contenido
                        break;
                    case 3:
                        System.out.println("Saliendo del programa..."); //imprimo por pantalla para que salga del programa
                        break;
                    default: //por defecto
                        System.out.println("Error: la opcion no es la correcta"); //imprimo por pantalla
                    }

            } catch (InputMismatchException e) {
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Error desconocido");
                entrada.nextLine();
            }

        } while (opc != 3); //se repite el bucle mientras la opcion sea distinta de 3

    }

    public static void mostrarMenu() { //metodo para mostrar menú
        System.out.println("Agenda Telefonica");
        System.out.println("1.Añadir los contacto");
        System.out.println("2.Visualizar los contactos");
        System.out.println("3.Salir del programa");

    }

    public static void añadirContacto() throws FileNotFoundException, IOException { //metodo para añadir contactos lanzando las excepciones con el throws
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        // Pedimos los datos que tiene el contacto al usuario
        System.out.println("Introduce su nombre: ");
        String nombreDelContacto = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario
        System.out.println("Introduce la edad: ");
        String edad = entrada.nextLine(); //guardo en la variable la edad 
        System.out.println("Introduce el teléfono: ");
        String telefono = entrada.nextLine();//guardo en la variable el telefono

        try (FileWriter fw = new FileWriter("agenda.txt", true); PrintWriter pw = new PrintWriter(fw)) {//creo un control de excepciones con recursos con FileWriter y PrinWriter para escribir y imprimir en la agenda por lineas

            pw.print("Nombre: " + nombreDelContacto); //imprimo por lineas los diferentes contactos 
            pw.print("Edad: " + edad);
            pw.print("Teléfono: " + telefono);
            System.out.println("El contacto ha sido guardado");

        } catch (IOException e) { //capturo las excepciones por si hay algun error

            System.out.println("Error al escribir en la agenda: " + e.getMessage()); //muesto por pantalla el mensaje de la excepcion
        }

    }

    public static void mostrarContenido() { //metodo para mostrar el contenido del fichero

        File fichero = new File("agenda.txt"); //creo objeto apuntado al fichero

        // Comprobamos si el archivo existe antes de abrirlo
        if (!fichero.exists()) { //condicional para ver si el fichero ya existe
            System.out.println("no existe la agenda telefonica"); //muestro por pantalla
            return;
        }

        try (FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr)) { //creo un try-catch con recursos declarando FileReader y BufferedReader

            String linea; //declaro la linea
            System.out.println("contenido en la agenda");

            // Leemos línea a línea hasta nos devuelva null
            while ((linea = br.readLine()) != null) { //bucle mientras la linea no sea null sigo mostrandola
                System.out.println(linea);
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Error al leer en la agenda: " + e.getMessage()); //muestro por pantalla el mensaje de la excepcion
        }
    }
}

