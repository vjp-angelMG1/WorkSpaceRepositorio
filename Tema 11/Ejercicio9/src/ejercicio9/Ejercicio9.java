/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.time.LocalDate; //importo clase para guardar la fecha del paquete time
import java.util.Map; //importo las demas clases de mapas y scanner del paquete util 
import java.util.Scanner;
import java.util.TreeMap;
/**
 *• Ejercicio 09.- El operador de loterías “TuLotero” desea gestionar
los sorteos que realiza a lo largo del año.
• Para tratar esta información, necesitaremos una clase Sorteo, cuyos
atributos serán la fecha del sorteo (será un LocalDate) y un vector
de 4 celdas con los números ganadores (aleatorios de 1 a 100).
• Los sorteos se organizarán en un .TreeMap, cuyas claves serán las
fechas del sorteo.
* • Facilitaremos las siguientes opciones al operador de loterías:
• Realizar sorteo (La fecha será la de hoy y los números ganadores serán
aleatorios entre 1 y 100).
• Repetir sorteo. Se eliminará el sorteo de hoy y se volverá a realizar el
sorteo.
• Mostrar sorteos del mes actual.
• Mostrar sorteo dada una fecha.
• Realizar sorteo por fecha (Pediremos una fecha y se realizará el sorteo de
esa fecha en concreto - comprobando, previamente, que no hay sorteo
en esa fecha).
• Mostrar todos los sorteos
* 
 * @author Angel
 */
public class Ejercicio9 {

    public static void main(String[] args) { // Método principal: empieza la ejecución del programa
        
        
        Map<LocalDate, Sorteo> sorteos = new TreeMap<>();// Creo un mapa para guardar los sorteos La clave será la fecha (LocalDate) y el valor será el objeto Sorteo.

        
        int opcion;// Variable para guardar la opción elegida en el menú

        
       
        do {// Bucle se muestra al menos una vez
            opcion = menu(); //guardo la opcion que elijo al llamar al menu

            switch (opcion) { //condicional para eleguir menu
                case 1: //caso 1
                    realizarSorteo(sorteos); //llamo al metodo para realizar sorteo
                    break; //para no saltar a la siguiente opcion utilizo el break
                case 2:
                    repetirSorteo(sorteos); //llamo al metodo para repetir el sorteo
                    break;
                case 3:
                    mostrarSorteosDelMesActual(sorteos); //llamo al metodo para mostrar sorteos del mes actual
                    break;
                case 4:
                    mostrarSorteoDadaUnaFecha(sorteos); //llamo al metodo para mostrar sorteo segun una fecha concreta
                    break;
                case 5:
                    realizarSorteoPorFecha(sorteos); //llamo al metodo para realizar el sorteo
                    break;
                case 6:
                    mostrarTodosLosSorteos(sorteos); //llamo al metodo para mostrar todos los sorteos
                    break;
                case 7:
                    System.out.println("Te has salido del programa."); //imprimo por pantalla que me he salido del programa
                    break;
                default:
                    System.out.println("Error Introduce una opción válida entre 1 y 7."); //imprimo por pantalla en caso de elegir un error
            }
        } while (opcion != 7); //mientras la opcion sea diferente de 7
    }

    
    public static int menu() { // Muestra el menú principal y devuelve la opción que ha elegido el usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Realizar sorteo.");
        System.out.println("2. Repetir sorteo.");
        System.out.println("3. Mostrar sorteos del mes actual.");
        System.out.println("4. Mostrar sorteo dada una fecha.");
        System.out.println("5. Realizar sorteo por fecha.");
        System.out.println("6. Mostrar todos los sorteos.");
        System.out.println("7. Salir.");
        System.out.print("Elige una opción: ");

        return entrada.nextInt();
    }

    
    public static void realizarSorteo(Map<LocalDate, Sorteo> sorteos) {// metodo que crea un sorteo nuevo con la fecha actual
        
        Sorteo s = new Sorteo();// Creo un objeto Sorteo

        sorteos.put(s.getFecha(), s);// Guardamos el sorteo en el mapa usando su fecha como clave

        System.out.println("Sorteo realizado.");
    }

   
    public static void repetirSorteo(Map<LocalDate, Sorteo> sorteos) { //metodo que elimina el sorteo de hoy si existe y crea uno nuevo
        
        if (sorteos.containsKey(LocalDate.now())) {// condicional que Comprueba si ya existe un sorteo en la fecha actual
            sorteos.remove(LocalDate.now());// Si existe el sorteo lo borro
            System.out.println("Sorteo borrado.");
        }
     
        Sorteo s = new Sorteo();   // Creamos un nuevo sorteo
        
        sorteos.put(s.getFecha(), s);// Lo guardo en el mapa

        System.out.println("Se ha generado un nuevo sorteo.");
    }

    
    public static void mostrarSorteosDelMesActual(Map<LocalDate, Sorteo> sorteos) { // metodo que muestra los sorteos que pertenecen al mes actual
        
        boolean encontrado = false;// Esta variable sirve para saber si se ha encontrado algún sorteo

        
        for (Map.Entry<LocalDate, Sorteo> entry : sorteos.entrySet()) {// bucle for que  recorro todos los elementos del mapa
            
            if (entry.getKey().getMonthValue() == LocalDate.now().getMonthValue()) {// condiconal con la que compruebo si el mes del sorteo coincide con el mes actual
                encontrado = true;
                System.out.println(entry);
            }
        }

        
        if (!encontrado) {//Condicional si no se ha encontrado ninguno, mostramos un mensaje
            System.out.println("No se han encontrado sorteos del mes actual.");
        }
    }

    
    public static void mostrarSorteoDadaUnaFecha(Map<LocalDate, Sorteo> sorteos) {// metodo que muestra el sorteo correspondiente a una fecha introducida por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el año del sorteo: ");// Pedimos al usuario el año
        int año = entrada.nextInt();

        System.out.print("Introduce el mes del sorteo: ");// Pedimos al usuario el mes
        int mes = entrada.nextInt();

        System.out.print("Introduce el día del sorteo: ");// Pedimos al usuario el día
        int dia = entrada.nextInt();
       
        LocalDate fechaBuscada = LocalDate.of(año, mes, dia); // Creamos una fecha con los datos introducidos

        
        boolean encontrado = false;// Variable para saber si se ha encontrado el sorteo

       
        for (Map.Entry<LocalDate, Sorteo> entry : sorteos.entrySet()) { // bucle que recorre el mapa buscando la fecha indicada
            if (entry.getKey().equals(fechaBuscada)) {
                encontrado = true;
                System.out.println(entry);
            }
        }

        
        if (!encontrado) { //condicional si no existe esa fecha en el mapa, avisamos al usuario
            System.out.println("No se ha encontrado ningún sorteo en esa fecha.");
        }
    }

    
    public static void realizarSorteoPorFecha(Map<LocalDate, Sorteo> sorteos) { // metodo que crea un sorteo para una fecha concreta elegida por el usuario
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduce el año donde crear el sorteo: ");// Pido el año
        int año = entrada.nextInt();

        
        System.out.print("Introduce el mes: ");// Pido el mes
        int mes = entrada.nextInt();

        
        System.out.print("Introduce el día: ");// Pido el día
        int dia = entrada.nextInt();

        
        LocalDate fecha = LocalDate.of(año, mes, dia);// Creo la fecha con los datos introducidos

        
        if (!sorteos.containsKey(fecha)) {//Condicional que comprobamos si ya existe un sorteo en esa fecha
            
            Sorteo s = new Sorteo();// Creamos el objeto Sorteo

            
            s.setFecha(fecha);// Le asignamos la fecha elegida

            
            sorteos.put(fecha, s);// Lo guardamos en el mapa

            System.out.println("Sorteo creado correctamente.");
        } else {
            System.out.println("Ya hay un sorteo en la fecha introducida.");
        }
    }

    
    public static void mostrarTodosLosSorteos(Map<LocalDate, Sorteo> sorteos) {// metodo que muestra todos los sorteos guardados en el mapa
        
        for (Map.Entry<LocalDate, Sorteo> entry : sorteos.entrySet()) { // Recorro todos los sorteos del mapa y lo muestro
            System.out.println(entry);
        }
    }
}