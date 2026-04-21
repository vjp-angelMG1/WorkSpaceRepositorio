/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis;
//importar las clase de los paquetes io y util
import java.io.FileNotFoundException; //importo la clase FileNotFoundException (al abrir el archivo o cuya ruta es incorrecta)
import java.io.IOException; //importo la clase IOException (para leer un archivo,cerrar un recurso o acceder a un flujo de datos)
import java.io.FileReader; //importo la clase FileReader (para leer archivos de texto completos con mas comodidad)
import java.io.BufferedReader; //importo la clase BufferedReader(para leer archivos de texto completos)
import java.util.InputMismatchException;//importo la clase InputMismatchException(para las excepciones de las letras)
import java.util.Scanner;//importo la clase Scanner 

/**
 * • Ejercicio 12 (bis).- Realiza un programa en JAVA que lea un archivo creado
 * en el bloc de notas llamado masnumeros.txt que contiene varias líneas y en
 * cada una de ellas hay varios números separados por ; (punto y coma). • El
 * programa te mostrará por pantalla la suma de todos los números del fichero.
 *
 * @author Ángel
 */
public class Ejercicio12bis {

    public static final String FICHERO = "masnumeros.txt"; //Declaro constante para el nombre del fichero

    public static void main(String[] args) { //metodo principal main ejecutable
        Scanner entrada = new Scanner(System.in);
        int opc = -1; //declaro e inicializo variable para que no tenga problemas con el control de excepciones
        do { //bucle que al menos se repite una vez
            try { //control de excepciones
                menu();//llamo al metodo para mostrar menu
                opc = entrada.nextInt();//guardo en la variable la entrada del usuario
                switch (opc) { //condicional para elegir opcion
                    case 1: //caso 1
                        sumarNumerosFichero(); //llamo al metodo 
                        break; //utilizo el break para no saltar a la siguiente opcion
                    case 2:
                        System.out.println("Te has salido del programa."); //imprimo por pantalla 
                        break;
                    default:
                        System.out.println("Introduce una opción entre 1 y 2.");
                }
            } catch (InputMismatchException e) { //capturo la excepcion para introducir un tipo de letra
                System.out.println("Introduce un tipo de dato válido.");
            } catch (FileNotFoundException e) { //capturo la excepcion para no encontrarse fichero
                System.out.println("No se ha encontrado el fichero.");
            } catch (IOException e) { //capturo la excepcion de escritura o de lectura del archivo
                System.out.println("Ha ocurrido un error con la escritura o lectura del fichero.");
            } catch (Exception e) { //capturo la excepcion del error desconocido
                System.out.println("Ha ocurrido un error desconocido.");
            }
        } while (opc != 2); //bucle mientras la opcion sea diferente a 2
    }

    public static void menu() { //creo metodo menu
        System.out.println("1. Leer suma de masnumeros.txt."); //imprimo por pantalla
        System.out.println("2. Salir.");
    }

    public static void sumarNumerosFichero() throws FileNotFoundException, IOException { //creo metodo sumarNumerosFichero lanzo las excepciones
        try (FileReader fr = new FileReader(FICHERO);   
            BufferedReader br = new BufferedReader(fr);) { //uso el try-catch con recursos para abrir y cerrar de forma independiente FileReader y BufferedReader
            String linea = br.readLine(); //leo la primera linea del fichero
            int suma = 0; //declaro e inicializo suma

            while (linea != null) { //mientras la linea este vacio

                String[] numeros = linea.split(";"); //declaro  array para contar los numeros sin el punto y coma utilizando split para separar y guardar por pantes los diferentes numeros en el array

                for (int i = 0; i < numeros.length; i++) { //recorro los numeros del array
                    suma = suma + Integer.parseInt(numeros[i]); // paso de texto a número para poder sumar y guardo en la variable suma
                }

                linea = br.readLine(); //leo la siguiente linea
            }

            System.out.println("La suma total es de " + suma + "."); //imprimo por pantalla la suma total
        }
    }

}
