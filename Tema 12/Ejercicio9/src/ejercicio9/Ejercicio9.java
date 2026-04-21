/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.io.*; //importo todas la clases de los paquetes io y util
import java.util.*;

/**
 * • Ejercicio 09.- Realiza un programa en JAVA en el que muestres un menú que
 * te permita 4 opciones: 1. Leer frase.txt. 2. Escribir texto invertido de 
 * frase.txt en fraseinvertida.txt. 3. Leer fraseinvertida.txt. 4. Salir.
 * • Captura las excepciones que veas necesarias.
 *
 * @author alumno
 */
public class Ejercicio9 {

    public static final String FICHERO = "frase.txt"; //declaro constante para el nombre del primer fichero
    public static final String FICHERO2 = "fraseinvertida.txt"; //declaro constante para el nombre del segundo fichero

    public static void main(String[] args) { //metodo principal main ejecutable
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        // --- INICIO COMPROBACIÓN INTELIGENTE ---
        File arch = new File(FICHERO); //apuntando al fichero guardo el nombre en un objeto

        if (!arch.exists()) { //condicional para ver si el archivo existe del fichero 
            System.out.println("El fichero no existe todavia, se creara uno por defecto");
            try (FileWriter fw = new FileWriter(FICHERO);PrintWriter pw = new PrintWriter(fw)) { //// Creo el acceso al fichero para que se abra y se cierre de manera idependiente y para poder escribir le paso el objeto creado por parametros a la impresora
                
                pw.println("Hola, esta es una frase de prueba."); //escribo frases por defecto
                pw.println("El ejercicio 9 funciona correctamente."); //escribo frases por defecto
                
            } catch (IOException e) {
                System.out.println("Error al escribir el fichero: " + e.getMessage()); //muestro el mensaje de la captura de la exccepcion
            }
        }
        // --- FIN COMPROBACIÓN INTELIGENTE ---

        int opc = -1; //declaro e inicializo variables para que no tenga problemas con el control de excepciones

        do { //bucle que al menos se repite una vez
            try { //control de excepciones

                opc = menu(entrada); //llamo al metodo y guardo en la variable la opcion

                entrada.nextLine(); //limpio buffer

                switch (opc) { //condicional para elegir una opcion
                    case 1: //caso 1 
                        leerFicheroFrase(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 2: //caso 2
                        escribirFicheroFraseInvertida(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 3: //caso 3
                        leerFicheroFraseInvertida(); //llamo al metodo
                        break; //para no saltar al siguiente caso
                    case 4: //caso 4
                        System.out.println("Te has salido del programa...");
                        break; //para no saltar al siguiente caso
                    default:
                        System.out.println("Error: la opcion no es correcta");
                }

            } catch (InputMismatchException e) { //capturo las excepciones y las muestro por pantalla
                System.out.println("Error. Has intruducido una letra");
                entrada.nextLine(); //limpio el buffer del scanner
            } catch (FileNotFoundException e) { //capturo la excepcion de fichero no encontrado
                System.out.println("Error: No se ha encontrado el fichero");
                entrada.nextLine(); //limpio el buffer del scanner
            } catch (IOException e) { //capturo la excepcion de entrada/salida
                System.out.println("Error: Ha ocurrido un problema con la escritura o lectura del fichero");
                entrada.nextLine(); //limpio el buffer del scanner
            } catch (Exception e) { //capturo el resto de excepciones
                System.out.println("Error: es desconocido");
                entrada.nextLine(); //limpio el buffer del scanner
            }
        } while (opc != 4); //se repite el bucle mientras la opcion sea distinta de 4

    }

    public static int menu(Scanner entrada) { //metodo para mostrar el menu

        System.out.println("1. Leer frase.txt.");
        System.out.println("2. Escribir texto invertido de frase.txt en fraseinvertida.txt.");
        System.out.println("3. Leer fraseinvertida.txt.");
        System.out.println("4. Salir.");

        int opcion = entrada.nextInt(); //guardo en la variable la opcion
        return opcion; //devuelvo la opcion
    }

    public static void leerFicheroFrase() throws FileNotFoundException, IOException { //metodo para leer el primer fichero lanzando las excepciones
        try (FileReader fw = new FileReader(FICHERO); 
             BufferedReader br = new BufferedReader(fw)) { //uso el try-catch con recursos para abrir y cerrar de forma independiente FileReader y BufferedReader

            String linea = br.readLine(); //leo la primera linea del fichero
            while (linea != null) { //bucle que se repite mientras la linea no este vacia
                System.out.println(linea); //imprimo las lineas
                linea = br.readLine(); //leo la siguiente linea
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Error al leer el archivo: " + e.getMessage()); //imprimo por pantalla la excepcion erronea con el mensaje correspondiente
        }
    }

    public static void escribirFicheroFraseInvertida() throws FileNotFoundException, IOException { //metodo para escribir el fichero invertido lanzando las excepciones
        try (
                FileReader fr = new FileReader(FICHERO); //abro el primer fichero para leer
                BufferedReader br = new BufferedReader(fr); //creo el buffer para leer
                FileWriter fw = new FileWriter(FICHERO2); //abro el segundo fichero para escribir
                PrintWriter pw = new PrintWriter(fw) //creo la impresora para escribir pasandole el objeto por parametros
        ) {
            String linea = br.readLine(); //leo la primera linea del fichero original

            while (linea != null) { //bucle que se repite mientras la linea no este vacia
                String invertida = ""; //declaro e inicializo variable para guardar la frase invertida

                for (int i = linea.length() - 1; i >= 0; i--) { //bucle for que recorre la linea de final a principio
                    invertida = invertida + linea.charAt(i); //voy construyendo la frase invertida caracter a caracter
                }

                pw.println(invertida); //escribo la linea invertida en el nuevo fichero

                linea = br.readLine(); //leo la siguiente linea
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Error al escribir o leer el fichero: " + e.getMessage()); //imprimo por pantalla la excepcion erronea con el mensaje correspondiente
        }
    }

    public static void leerFicheroFraseInvertida() throws FileNotFoundException, IOException { //metodo para leer el fichero invertido lanzando las excepciones
        try (FileReader fw = new FileReader(FICHERO2); 
             BufferedReader br = new BufferedReader(fw)) { //uso el try-catch con recursos para abrir y cerrar de forma independiente FileReader y BufferedReader

            String linea = br.readLine(); //leo la primera linea del fichero invertido
            while (linea != null) { //bucle que se repite mientras la linea no este vacia
                System.out.println(linea); //imprimo las lineas
                linea = br.readLine(); //leo la siguiente linea
            }

        } catch (IOException e) { //capturo la excepcion
            System.out.println("Error al leer el archivo: " + e.getMessage()); //imprimo por pantalla la excepcion erronea con el mensaje correspondiente
        }
    }

}