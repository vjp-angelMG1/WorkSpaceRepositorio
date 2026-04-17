/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.*;

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
    
    // Declaro e inicializo la lista global para guardar los contactos
    public static ArrayList<Contacto> agenda = new ArrayList<>();

    public static String pedirNombre() throws InputMismatchException { //metodo para pedir nombre en el que lanzo la excepcion
        System.out.println("Nombre: ");
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        return entrada.nextLine(); //devuelvo lo que introduce el usuario
    }

    public static int pedirEdad() throws InputMismatchException { //metodo para pedir la edad lanzando la excepcion
        System.out.println("Edad: ");
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        return entrada.nextInt(); //devuelvo el entero introducido
    }

    public static String pedirNumero() throws InputMismatchException { //metodo para pedir el numero lanzando la excepcion
        System.out.println("Numero de telefono: ");
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        return entrada.nextLine(); //devuelvo el numero como String
    }

    public static void main(String[] args) { //metodo principal main ejecutable

        int opc =-1; //declaro e inicializo la variable de opcion
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        
        do { //bucle que al menos se repite una vez
            menu(); //llamo al metodo para mostrar las opciones
            try { //control de excepciones para la entrada de datos

                opc = entrada.nextInt(); //guardo en la variable la opcion elegida
                entrada.nextLine(); //limpio buffer

                switch (opc) { //condicional para elegir una opcion del menu

                    case 1: //caso 1 añadir
                        System.out.println("añadiendo contacto");
                        añadirContacto(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 2: //caso 2 visualizar
                        System.out.println("visualizando la lista");
                        visualizarAgenda(); //llamo al metodo
                        break;
                    case 3: //caso 3 eliminar
                        System.out.println("eliminar contactos de la lista");
                        eliminarContactos(); //llamo al metodo
                        break;
                    case 4: //caso 4 ordenar
                        System.out.println("mostrar todos los contactos ordenados");
                        mostrarContactos(); //llamo al metodo
                        break;
                    case 5: //caso 5 salir
                        System.out.println("Saliendo del programa....");
                        break;
                    default: //opcion por defecto si no es correcta
                        System.out.println("Error has eleguido una opcion incorrepcta");
                }
            } catch (InputMismatchException e) { //capturo si el usuario introduce una letra
                System.out.println("Error has escrito un tipo de dato incorrecto");
                entrada.nextLine(); //limpio el buffer del scanner
            }
        } while(opc!=5); //se repite el bucle mientras la opcion sea distinta de 5
    
    }

    public static void menu() { //metodo para imprimir el menu por pantalla
        System.out.println("Elige una opcion");
        System.out.println("1-Añadir contactos a la agenda");
        System.out.println("2-Visualizar la lista de contactos");
        System.out.println("3-Eliminar contactos de la lista");
        System.out.println("4-Mostrar todos los contactos ordenados");
        System.out.println("5-Salir del programa");
    }

    public static void añadirContacto() { //metodo para añadir un contacto a la lista
        try { //control de excepciones al llamar a los metodos de pedir datos
            String nombre = pedirNombre(); //guardo el nombre en la variable
            int edad = pedirEdad(); //guardo la edad en la variable
            String numero = pedirNumero(); //guardo el numero
            
            agenda.add(new Contacto(nombre, edad, numero)); //añado a la lista el nuevo objeto contacto creado
            System.out.println("Guardado correctamente.");
        } catch (InputMismatchException e) { //capturo el error si los datos no son correctos
            System.out.println("Error: El dato introducido no es válido.");
        }
    }

    public static void visualizarAgenda() { //metodo para mostrar la lista por pantalla
        if (agenda.isEmpty()) { //condicional por si la lista no tiene datos
            System.out.println("La agenda está vacía.");
        } else {
            for (Contacto c : agenda) { //bucle for each para recorrer la lista
                System.out.println(c); //imprimo cada contacto
            }
        }
    }

    public static void eliminarContactos() { //metodo para borrar un contacto por su telefono
        Scanner entrada = new Scanner(System.in); //creo objeto scanner
        System.out.println("Introduce el número de teléfono a eliminar:");
        String num = entrada.nextLine(); //guardo en la variable el numero a buscar
        
        
        boolean eliminado = agenda.removeIf(c -> c.numero.equals(num));// Busco en la lista y borro si coincide el numero
        
        if (eliminado) { //condicional para informar si se ha borrado
            System.out.println("Contacto eliminado.");
        } else { // si no imprimo por pantalla
            System.out.println("No se encontró ese número.");
        }
    }

    public static void mostrarContactos() { //metodo para ordenar la lista por edad
        agenda.sort((c1, c2) -> Integer.compare(c1.edad, c2.edad));// Ordeno la lista usando un comparador por el atributo edad
        visualizarAgenda(); //llamo al metodo para mostrar la lista ya ordenada
    }

}