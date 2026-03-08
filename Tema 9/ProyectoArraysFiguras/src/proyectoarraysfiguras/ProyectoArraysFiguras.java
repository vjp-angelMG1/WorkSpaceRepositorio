/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoarraysfiguras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class ProyectoArraysFiguras {

    public static int FILAS = 3; //Creo las constantes 
    public static int COLUMNAS = 3;

    public static int pedirOpcion() { //Creo método pedir opcion que devuelve el valor numerico
        Scanner entrada = new Scanner(System.in); //creo objeto scanner 
        return entrada.nextInt(); //devuelvo el numero que le pido al usuario
    }

    public static float pedirValor() { //creo método que pide el usuario el valor de la figura
        Scanner entrada = new Scanner(System.in); //creo objeto escaner
        System.out.println(" * Valor: "); //imprimo el valor 
        return entrada.nextFloat(); //devuelve el valor que le pido al usuario
    }

    public static String pedirNombre() { //creo metodo que devuelve el nombre 
        Scanner entrada = new Scanner(System.in); //creo objeto escaner
        System.out.println(" * Nombre: "); //imprimo el nombre 
        return entrada.nextLine(); //devuelvo la entrada del nombre que le pido al usuario
    }

    public static String pedirColeccion() { //metodo para pedirle la coleccion al usuario
        Scanner entrada = new Scanner(System.in); //creo objeto escanner
        System.out.println(" * Colección: "); //imprimo el nombre de la coleccion
        return entrada.nextLine(); //devuelvo la entrada del nombre que le pido al usuario
    }

    public static void rellenarVitrina(Figura[][] vitrinaFiguras) { //metodo que rellena la vitrina con figuras los datos de cada figura que se le pide al usuario
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println(" Creando nueva figura: ");
                vitrinaFiguras[i][j] = new Figura(pedirNombre(), pedirValor(), pedirColeccion());
            }
        }
    }

    public static void mostrarFigurasPorColeccion(Figura[][] vitrinaFiguras, String coleccion) { //metodo que muestra la figura de mayor valor dentro de la matriz y su ubicación
        boolean hayFiguras = false;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (vitrinaFiguras[i][j].getColeccion().equalsIgnoreCase(coleccion)) {
                    System.out.println(vitrinaFiguras[i][j]);
                    hayFiguras = true;
                }
            }
        }

        if (!hayFiguras) {
            System.out.println("No hay figuras de la coleccion introducida");
        }

    }

    public static void mostrarFiguraDeMayorValor(Figura[][] vitrinaFiguras) { //metodo que muestra la figura de mayor valor dentro de la matriz y su ubicación
        float valorMayor = -1;
        int indiceFila = -1, indiceColumna = -1;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (vitrinaFiguras[i][j].getValor() > valorMayor) {
                    valorMayor = vitrinaFiguras[i][j].getValor();
                    indiceFila = i;
                    indiceColumna = j;
                }
            }
        }
        System.out.println("La figura de mayor valor es " + vitrinaFiguras[indiceFila][indiceColumna]);
        System.out.println("Su ubicación es: FILA " + indiceFila + " y COLUMNA " + indiceColumna);
    }

    public static void main(String[] args) {
        Figura[][] vitrinaFiguras = new Figura[FILAS][COLUMNAS];
        int opc = -1;

        do {

            try {
                System.out.println("\n1. Rellenar vitrina");
                System.out.println("2. Mostrar figuras por colección");
                System.out.println("3. Mostrar figura más valiosa");
                System.out.println("4. Salir");
                System.out.println(" Opcion: ");
                opc = pedirOpcion();
                switch (opc) {
                    case 1:
                        System.out.println("\nRellenando vitrina de figuras...");
                        rellenarVitrina(vitrinaFiguras);
                        break;
                    case 2:
                        System.out.println("\nMostrando figuras por colección...");
                        mostrarFigurasPorColeccion(vitrinaFiguras, pedirColeccion());
                        break;
                    case 3:
                        System.out.println("\nMostrando figura de mayor valor...");
                        mostrarFiguraDeMayorValor(vitrinaFiguras);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion incorrecta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero entre 1 y 4");
            } catch (NullPointerException e) {
                System.out.println("Error:  no hay figuras en la vitrina");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: La posicion indicada no exite en la vitrina");
            } 

        } while (opc != 4);
    }
}
