/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * • Ejercicio 03.- Diseña un programa en Java para gestionar los autobuses de
 * la estación de Plasencia. • Nuestro programa dispondrá de un vector de 6
 * celdas dónde “aparcar” los autobuses. • De cada autobús, almacenaremos su
 * matrícula y los conductores que tiene asignados (los cuales se almacenarán en
 * un HashMap). • De cada conductor almacenaremos su DNI (que hará las veces de
 * clave) y su nombre. • El programa dispondrá del siguiente menú: • Aparcar
 * (pedirá un número, que será la posición del vector donde deberemos aparcar el
 * autobús. Si la posición está ocupada, se volverá a pedir hasta encontrar una
 * libre). • Mostrar dársenas libres. • Buscar autobús (método que muestre toda
 * la información del autobús a partir de su matrícula). • Buscar conductor
 * (Mostrará la matrícula del autobús que tiene asignado). • Método que retorne
 * la posición del vector donde se encuentra el autobús con mayor número de
 * conductores asignados.
 *
 * @author Ángel
 */

public class Ejercicio3 {

        public static void main(String[] args) { //metodo principal main ejecutable
            Autobus[] estacion = new Autobus[6]; //creo un vector o array de 6 posiciones para los autobuses de la estacion
            int opc; // declaro la variable para guardar la opción del menú

            do { //creo bucle para que se repita al menos una vez
                opc = menu(); // llamo al metodo mostrar menu y guardo la opcion
                switch (opc) { //Condicional para elegir una opcion
                    case 1:
                        aparcar(estacion); //llamo al metodo para aparcar un autobus
                        break; //para que no salte al siguiente caso si se cumple este
                    case 2:
                        mostrarDarsenasLibres(estacion); // llamo al metodo para mostrar dársenas libres
                        break;
                    case 3:
                        buscarAutobus(estacion); // llamo al metodo para buscar autobús por matrícula
                        break;
                    case 4:
                        buscarConductor(estacion); // llamo al metodo para buscar conductor por DNI
                        break;
                    case 5:
                        int posicion = posicionMaxConductores(estacion); //busco autobús con más conductores

                        if (posicion != -1) { // si hay autobuses
                            System.out.println("El autobús que tiene más conductores se encuentra en la posición: " + posicion); //imprimo la posición
                            System.out.println("Matrícula: " + estacion[posicion].getMatricula()); //imprimo la matrícula
                            System.out.println("Número de conductores: " + estacion[posicion].getConductores().size()); //imprimo la cantidad de conductores
                        } else {
                            System.out.println("No hay autobuses en la estacion.");
                        }
                        break;
                    case 6:
                        System.out.println("Te has salido del programa."); // salir
                        break;
                    default:
                        System.out.println("Error.Introduce un número entre 1 y 6."); // imprimo por pantalla el error
                }
            } while (opc != 6); // repetir mientras no elija salir
        }

        public static int menu() { //creo metodo menu
            Scanner entrada = new Scanner(System.in); //creo objeto escaner
            
            System.out.println(" MENÚ "); //imprimo por pantalla los mensajes del menu
            System.out.println("1. Aparcar.");
            System.out.println("2. Mostrar dársenas libres.");
            System.out.println("3. Buscar autobús.");
            System.out.println("4. Buscar conductor.");
            System.out.println("5. Autobús con más conductores.");
            System.out.println("6. Salir del programa.");
            System.out.print("Elige una opción: ");

            int opc = entrada.nextInt(); // guardamos la opción
            
            return opc; // devolvemos la opción elegida
        }

        public static void aparcar(Autobus[] estacion) { //metodo para aparcar con parametros del array
            Scanner entrada = new Scanner(System.in); //creo objeto escanner

            System.out.print("Introducir matrícula del autobús: "); //imrpimo por pantalla la matricula
            String matricula = entrada.nextLine(); // guardo en la variable la matricula
            Autobus autobus = new Autobus(matricula); // creo objeto autobus con la variable matricula

            System.out.print("Introducir el número de los conductores: "); //imprimo por pantalla el numero de los conductores
            int numero = entrada.nextInt(); // guardo en la variable el número de conductores

          
            for (int i = 0; i < numero; i++) { //bucle for para pedir los datos de cada conductor
                System.out.println("Conductor " + (i + 1)); //imprimo por pantalla el numero de conductores
                System.out.print("Introduce DNI del conductor: "); //imprimo por pantalla el Dni de cada conductor
                String dni = entrada.nextLine();//guardo en la variable string el dni que le pido al usuario
                System.out.print("Introduce nombre del conductor: "); //imprimo por pantalla
                String nombre = entrada.nextLine(); //guardo en la variable el nombre que le pido 
                autobus.getConductores().put(dni, new Conductor(dni, nombre)); //guardo las caracteristicas del conductor en el mapa del autobus
            }

            System.out.print("Introduce en la posición quieres aparcar el autobús del 0 al 5 : "); //imprimo por pantalla la posicion que quiero aparcar el autobus
            int posicion = entrada.nextInt(); //guardo en la posicion la entrada que le pido al usuario

            // Mientras la posición sea inválida o esté ocupada, pedimos otra
            while (posicion < 0 || posicion >= estacion.length || estacion[posicion] != null) { //bucle para que mientras la posicion no sea valida o este ocupada pido otra
                System.out.println("Error esta ocupada o en obras. Elige otra: "); //imprimo por pantalla
                posicion = entrada.nextInt(); //guardo en la posicion la entrada que le pido al usuario
                entrada.nextLine(); // creo buffer para limpiar el bucle
            }

            estacion[posicion] = autobus; //guardo el autobus en la posicion elegida
            System.out.println("El autobús fue aparcado correctamente en la posición " + posicion); //imprimo por pantalla la posicion del autobus
        }

        public static void mostrarDarsenasLibres(Autobus[] estacion) { //metodo para mostrar darsenas libres con parametros del array
            System.out.println("Dársenas libres:"); //imprimo por pantalla
            boolean libre = false; // guardo en la variable boolean para saber si hay alguna libre

            for (int i = 0; i < estacion.length; i++) { //bucle for para recorrer estaciones
                if (estacion[i] == null) { // Condicional si la estacion esta vacia
                    System.out.println("[" + i + "]"); //imprimo por pantalla la posicion
                    libre = true; //si se cumple que esta libre
                }
            }

            if (!libre) { // Condicional si no hay ninguna libre
                System.out.println("No hay dársenas libres."); //imprimo por pantalla
            }
        }

      
        public static void buscarAutobus(Autobus[] estacion) { //metodo para buscar el autobus con parametros del array
            Scanner entrada = new Scanner(System.in); //creo objeto escanner
            System.out.print("Introducir la matrícula que buscar: "); //imprimo por pantalla 
            String matricula = entrada.nextLine(); //guardo la matricula en la variable

            boolean encontrado = false; // variable para controlar si no se encontró

            for (int i = 0; i < estacion.length; i++) { //bucle for para recorrer las posiciones de la estacion
                if (estacion[i] != null && estacion[i].getMatricula().equals(matricula)) { //condicional para comprobar que no esta vacia y que la maticula concide con la que busco
                    encontrado = true; //si la he contrado lo muestro
                    System.out.println("Autobús ha sido encontrado en la posición: " + i); //muestro en la posicion que estaba el autobus
                    System.out.println("Matrícula: " + estacion[i].getMatricula()); //muestro la matricula correspondiente
                    System.out.println("Conductores que han asignados:"); //muestro los conductores
                    for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) { //recorro el mapa para ver los conductores del autobus
                        System.out.println("DNI: " + entry.getValue().getDni() + ", Nombre: " + entry.getValue().getNombre()); //imprimo por pantalla el dni y el nombre
                    }
                }
            }

            if (!encontrado) { //condicional si no ha sido encontrado 
                System.out.println("No se ha encontrado ningún autobús con la matrícula correspondiente."); //imprimo por pantalla que no ha sido encontrada
            }
        }

        public static void buscarConductor(Autobus[] estacion) { //metodo para buscar conductor con parametros del array
            Scanner entrada = new Scanner(System.in); //creo objeto escanner
            System.out.print("Introducir DNI del conductor que busco: "); //imprimo por pantalla
            String dni = entrada.nextLine(); //guardo en la variable el nombre que le pido 

            boolean encontrado = false; //si no coincide le digo que es falso

            for (int i = 0; i < estacion.length; i++) { //bucle for para recorrer la estacion
                if (estacion[i] != null) { // condicional si hay autobús en la posición no esta vacio
                    for (Map.Entry<String, Conductor> entry : estacion[i].getConductores().entrySet()) { //metodo for para recorrer en el mapa los conductores que hay en la estacion
                        if (entry.getValue().getDni().equals(dni)) { //condicional en la que comparamos el dni
                            encontrado = true; //si se cumple es verdadero
                            System.out.println("Conductor ha sido encontrado:"); //imprimo por pantalla que ha sido encontrado
                            System.out.println("DNI: " + entry.getValue().getDni()); //muestro el DNI
                            System.out.println("Nombre: " + entry.getValue().getNombre()); //muestro el Nombre
                            System.out.println("Matrícula del autobús: " + estacion[i].getMatricula()); //muestro la matricula del autobus
                        }
                    }
                }
            }

            if (!encontrado) { //condicional si no lo encuentro
                System.out.println("No se ha encontrado ningún conductor con ese DNI."); //miuestro por pantalla que no se ha encontrado ningun conductor
            }
        }

        public static int posicionMaxConductores(Autobus[] estacion) { //metodo para ver la posicion con mas conductores con parametros del array
            int maxConductores = -1; // variable para guardar el máximo número de conductores
            int posicion = -1;        // posición del autobús con más conductores

            for (int i = 0; i < estacion.length; i++) { //buclero for para recorrer las posiciones de la estacion
                if (estacion[i] != null) { // condicional si hay un autobús
                    int numConductores = estacion[i].getConductores().size(); //guardo en la variable la cuenta de los conductores
                    if (numConductores > maxConductores) {
                        maxConductores = numConductores; // actualizamos máximo
                        posicion = i; // guardamos posición
                    }
                }
            }

            return posicion; // devolvemos la posición
        }
    
}
