/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 07.- Vamos a crear ahora la versión beta del software anterior. En esta
versión, debemos gestionar las donaciones de varias campañas (no sabemos cuántas
habrá). Opciones de menú:
1. Añadir campaña (En esta opción SÓLO pediremos el nombre de la campaña).
2. Añadir donación (Las insertará de una en una y preguntaremos al usuario el
nombre de la campaña donde insertar la donación).
3. Mostrar campañas junto con donaciones.
4. Mostrar campaña por nombre (Pediremos un nombre y mostraremos la
campaña junto con las donaciones).
5. Mostrar total dinero recaudado.
6. Mostrar mayor donación.
7. Salir
* 
 * @author Angel
 */
public class Ejercicio7 {


    
    public static void mostrarMenu() { // Método para mostrar el menú
        System.out.println("MENÚ ");
        System.out.println("1. Añadir campaña");
        System.out.println("2. Añadir donación");
        System.out.println("3. Mostrar todas las campañas con donaciones");
        System.out.println("4. Mostrar campaña por nombre");
        System.out.println("5. Total dinero recaudado");
        System.out.println("6. Mayor donación");
        System.out.println("7. Salir");
        System.out.print("Elija una opción: ");
    }

        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Creo objeto scanner para leer datos
        ArrayList<Campanea> campañas = new ArrayList<>(); //Creo lista para manejar varias campañas
        int opcion = -1; //Declaro e inicializo variable 

        do { //Bucle que se repite al menos una vez
            mostrarMenu(); //Llamo al metodo para mostrar menu
            opcion = entrada.nextInt(); //Pido opcion al usuario
            entrada.nextLine(); //Limpio buffer despues de nextInt

            switch(opcion) { //Condicional para elegir la opcion

                case 1: //Añadir campaña
                    System.out.print("Ingrese el nombre de la nueva campaña: "); //Pido nombre de campaña
                    String nombreCampaña = entrada.nextLine(); //Guardo nombre en variable
                    campañas.add(new Campanea(nombreCampaña)); //Creo objeto campaña y lo añado a la lista
                    System.out.println("Campaña " + nombreCampaña + " añadida"); //Confirmo al usuario
                    break;

                case 2://Añado la donación a campaña existente
                    System.out.print("Ingrese el nombre de la campaña donde donar: "); //Pido nombre de campaña
                    String nombre = entrada.nextLine(); //Guardo nombre de campaña
                    boolean encontrada = false; //Variable para controlar si la campaña existe
                    for (Campanea c : campañas) { //Recorro la lista de campañas
                        if (c.getNombre().equalsIgnoreCase(nombre)) { //Si coincide el nombre
                            c.aniadirDonacion(entrada); //Llamo al metodo para añadir donacion, paso scanner
                            encontrada = true; //Marco que se encontro la campaña
                            break; //Para que no salte a la siguiente
                        }
                    }
                    if (!encontrada) { //Si no se encontro la campaña
                        System.out.println("Campaña no encontrada."); //Aviso al usuario
                    }
                    break;

                case 3: //Messtro todas las campañas con donaciones
                    if (campañas.isEmpty()) { //Si no hay campañas
                        System.out.println("No hay campañas registradas."); //Aviso al usuario
                    } else { //Si hay campañas
                        for (Campanea c : campañas) { //Recorro lista de campañas
                            System.out.println("Campaña: " + c.getNombre()); //Muestro nombre de campaña
                            c.mostrarDonaciones(); //Muestro sus donaciones
                        }
                    }
                    break;

                case 4: //Muestro campaña por nombre
                    System.out.print("Ingrese el nombre de la campaña: "); //Pido nombre
                    String buscar = entrada.nextLine(); //Guardo nombre a buscar
                    boolean encontrada2 = false; //Variable para controlar si se encuentra
                    for (Campanea campaña : campañas) { //Recorro lista de campañas
                        if (campaña.getNombre().equalsIgnoreCase(buscar)) { //Si coincide
                            System.out.println("Campaña: " + campaña.getNombre()); //Muestro nombre
                            campaña.mostrarDonaciones(); //Muestro donaciones
                            encontrada2 = true; //Marco que se encontro
                            break; 
                        }
                    }
                    if (!encontrada2) { //Condicional si no se encontro
                        System.out.println("Campaña no encontrada."); //Aviso al usuario
                    }
                    break;

                case 5: //Muestro total dinero recaudado
                    float total = 0; //Variable para guardar total
                    for (Campanea c : campañas) { //Recorro lista de campañas
                        total += c.totalRecaudado(); //Sumo total de cada campaña
                    }
                    System.out.println("Total recaudado: " + total + " Euros"); //Muestro total
                    break;

                case 6: //Muestro mayor donación
                    float mayor = 0; //Variable para mayor donacion
                    for (Campanea campaña : campañas) { //Recorro lista de campañas
                        float m = campaña.mayorDonacion(); //Obtengo mayor de la campaña
                        if (m > mayor) mayor = m; //Si es mayor, actualizo
                    }
                    if (mayor == 0) { //Si no hay donaciones
                        System.out.println("No hay donaciones registradas."); //Aviso al usuario
                    } else {
                        System.out.println("La mayor donación es: " + mayor); //Muestro mayor donacion
                    }
                    break;

                case 7: 
                    System.out.println("Saliendo del programa..."); //Imprio para salir del programa
                    break;

                default: 
                    System.out.println("Error : Opción no válida"); //imprimo por pantalla el error
            }

        } while (opcion != 7); //Mientras la opcion sea distinta de 7

    }
}