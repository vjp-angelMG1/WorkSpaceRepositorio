/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *• Ejercicio 08.- Una importante empresa multinacional nos ha 
solicitado un programa para gestionar las distintas sedes que tiene 
repartidas a lo largo del mundo. Para ello, dispondremos de un 
arrayList de ciudades. De cada ciudad, almacenaremos su nombre y 
un conjunto de sedes (elige el tipo de conjunto que prefieras). 
• De cada sede almacenaremos el nombre de la sede y sus ingresos 
anuales.
* • Implementa las siguientes opciones para el software: 
• Añadir una ciudad (al menos pediremos los datos de una sede. Después de 
añadir cada sede, preguntaremos al usuario si desea seguir añadiendo sedes). 
• Mostrar todas las ciudades junto con sus sedes. 
• Método que muestre el nombre de las sedes cuyos ingresos anuales son 
superiores a la media. 
• Buscar por nombre de sede. (El método retornará un booleano). 
• Añadir sede (pediremos el nombre de la ciudad y, si ésta existe en el arrayList, 
pediremos los datos de la nueva sede y los insertaremos). 
• Mostrar todas las sedes ordenadas de mayor a menor número de ingresos 
anuales (PISTA: Utiliza una estructura de datos donde ir añadiendo todas las 
sedes de manera ordenada).
* 
 * @author Angel
 */
public class Ejercicio8 {

    public static void main(String[] args) { //creo metodo principal main ejecutable
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        ArrayList<Ciudad> ciudades = new ArrayList<>(); //lista creada en la que guardo todas las ciudades 

        int opcion; //declaro variable 

        do { //bucle para recorrerlo al menos una vez 
            mostrarMenu(); //llamo al metodo para mostrar menu
            opcion = entrada.nextInt(); //pido la opcion al usuario
            switch (opcion) { //condicional para eleguir una opcion del menu
                case 1 :
                    aniadirCiudad(ciudades); //llamo a los metodos en cada opcion 
                    break; //en cada caso lo pongo para que no salte al siguiente
                case 2 :
                    mostrarCiudades(ciudades);
                    break;
                case 3 :
                    mostrarSedesSuperioresMedia(ciudades);
                    break;
                case 4 :
                    buscarSede(ciudades);
                    break;
                case 5 :
                    aniadirSede(ciudades);
                    break;
                case 6 :
                    mostrarTodasLasSedesOrdenadas(ciudades);
                    break;
                case 7 :
                    System.out.println("Salimos del programa..."); //imprimo por pantalla la opcion de salida
                    break;
                default : 
                    System.out.println("Error opcion no valida, intentelo de nuevo"); //imprimo la opcion de error
            }
        } while (opcion != 7); //mientras la opcion sea diferente a 7
    }

    public static void mostrarMenu() { //metodo para mostrar el menu
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir ciudad");
        System.out.println("2. Mostrar ciudades con sus sedes");
        System.out.println("3. Mostrar sedes con ingresos superiores a la media");
        System.out.println("4. Buscar sede por nombre");
        System.out.println("5. Aniadir sede a una ciudad");
        System.out.println("6. Mostrar todas las sedes ordenadas por ingresos");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }

    public static void aniadirCiudad(ArrayList<Ciudad> ciudades) { //metodo para añadir una nueva ciudad y donde se puede añadir mas de una sede cpn parametros del array
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        System.out.print("Nombre de ciudad: ");
        String nombreCiudad = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario
        Ciudad ciudad = new Ciudad(nombreCiudad); //creo objeto ciudad

        String continuar; //declaro variable 
        do { //bucle que se repite al menos una vez
            ciudad.aniadirSede(); //añado a la sede la ciudad 
            System.out.print("Aniadir otra sede - Si/No: ");
            continuar = entrada.nextLine(); //guardo en la variable el nombre que le pido al usuario
        } while (continuar.equalsIgnoreCase("si")); //se repite mientras quiere añadir mas sedes
        ciudades.add(ciudad); //añado en la lista de sedes la ciudad
    }

    public static void mostrarCiudades(ArrayList<Ciudad> ciudades) { //metodo para mostrar ciudades con sus sedes con parametros del array

        if (ciudades.isEmpty()) { 
            System.out.println("No hay ciudades registradas");
        } else {
            for (Ciudad ciudad : ciudades) {
                System.out.println("Ciudad: " + ciudad.getNombre());
                ciudad.mostrarSedes();
            }
        }
    }

    public static void mostrarSedesSuperioresMedia(ArrayList<Ciudad> ciudades) { //metodo que muestra las sedes que tienen la media de ingresos en cada ciudad
        System.out.println();

        for (Ciudad ciudad : ciudades) {
            ciudad.mostrarSedeSuperioresMedia();
        }
    }


    public static void buscarSede(ArrayList<Ciudad> ciudades) {     //Metodo que busca una sede por nombre en todas las ciudades
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la sede a buscar: ");
        String nombreSede = entrada.nextLine();

        boolean encontrado = false;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.buscarSede(nombreSede)) {
                //Se recorre las sedes de esa ciudad para obtener los ingresos
                for (Sede sede : ciudad.getSedes()) {
                    if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                        System.out.println("La sede \"" + nombreSede + "\" con ingresos " + sede.getIngresos()
                                + " esta en " + ciudad.getNombre());
                        encontrado = true;
                    }
                }
            }
        }
        if(!encontrado) {
            System.out.println("La sede no existe");
        }
    }


    public static void aniadirSede(ArrayList<Ciudad> ciudades) {     //Metodo que añade una sede a una ciudad ya creada
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la ciudad donde aniadir la sede: ");
        String nombreCiudad = entrada.nextLine();

        Ciudad encontrada = null;
        boolean encontrado = false;
        Iterator<Ciudad> it = ciudades.iterator();//Sirve para recorrer una coleccion elemento a elemento

        while (it.hasNext() && !encontrado) {//Sirve para poder detener el recorrido cuando se quiera
            Ciudad ciudad = it.next();
            if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {
                encontrada = ciudad;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe esa ciudad");
        } else {
            encontrada.aniadirSede();
        }
    }

  
    public static void mostrarTodasLasSedesOrdenadas(ArrayList<Ciudad> ciudades) {   //Metodo que muestra todas las sedes de todas las ciudades ordenadas de mayor a menor ingresos

        System.out.println("--TODAS LAS SEDES ORDENADAS--");
        ArrayList<Sede> sedes = new ArrayList<>();

        //Se mezcla todas las sedes de todas las ciudades
        for (Ciudad ciudad : ciudades) {
            sedes.addAll(ciudad.getSedes());
        }
        //Ordenacion burbuja
        for (int i = 0; i < sedes.size() - 1; i++) {
            for (int j = 0; j < sedes.size() - 1 - i; j++) {

                if (sedes.get(j).getIngresos() < sedes.get(j + 1).getIngresos()) {
                    Sede aux = sedes.get(j);
                    sedes.set(j, sedes.get(j + 1));
                    sedes.set(j + 1, aux);
                }
            }
        }
        for (Sede sede : sedes) {
            System.out.println(sede.toString());
        }
    }
}
    

