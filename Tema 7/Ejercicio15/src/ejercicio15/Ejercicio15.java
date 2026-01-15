/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = -1; // Declaro e inicializo la variable con menos uno ya que es un valor que no se va a dar 

        int[] ventasDeCoches = new int[12]; // Declaro e inicializo el array

        // Declaro el array de los meses para poder mostrar el mes con más ventas
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        Scanner entrada = new Scanner(System.in); // Escaneo un numero al usuario para el menú

        do { // Creo bucle do while para hacer menú con sus opciones
            System.out.println("Menú");
            System.out.println(" 1. Rellenar un Array ");
            System.out.println(" 2. Mostrar las ventas ");
            System.out.println(" 3. Mostrar las ventas al revés");
            System.out.println(" 4. Suma total de las ventas del año");
            System.out.println(" 5. Ventas totales de los meses pares");
            System.out.println(" 6. Mes con más ventas");
            System.out.println(" 7. Salir del programa");

            try { // Creo el control de excepciones en caso de que no sea un número entero 
                num = entrada.nextInt(); // Entrada del número que le voy pedir al usuario

                switch (num) { // Condicional para elegir el numero

                    case 1: // Caso del switch
                        rellenarArray(ventasDeCoches); // Llamo al método para rellenar el array
                        System.out.println("Array rellenado correctamente");
                        break; // En caso de ser la opción correcta irrumpe con los demás casos

                    case 2:
                        mostrarArray(ventasDeCoches); // Muestro las ventas
                        break;

                    case 3:
                        mostrarArrayReves(ventasDeCoches); // Muestro las ventas al revés
                        break;

                    case 4:
                        System.out.println("Suma total de las ventas del año: "
                                + valorTotalVentas(ventasDeCoches) + " euros");
                        break;

                    case 5:
                        System.out.println("Ventas totales de los meses pares: "
                                + valorTotalVentasPares(ventasDeCoches) + " euros");
                        break;

                    case 6:
                        mostrarMesConMasVentas(ventasDeCoches, meses); // Muestro el mes con más ventas
                        break;

                    case 7:
                        System.out.println("Salir del programa");
                        break;

                    default: // En caso de elegir una opción diferente a las demás
                        System.out.println("Opción no válida"); // Imprimo la elección
                }

            } catch (InputMismatchException e) { // Control de excepciones en caso de no introducir un número entero
                System.out.println("Error introduce número entero"); // Imprimo la excepción 
                entrada.next(); // Obligatorio limpiar el buffer para que no se me creen bucles
            }

        } while (num != 7); // Bucle mientras sea distinto de 7

        entrada.close(); // Cierro el Scanner
    }

    public static void rellenarArray(int array[]) {
        // recorremos todos los indices del array y le asignamos en cada posicion un valor aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10; // valor aleatorio de 10-100
        }
    }

    public static void mostrarArray(int array[]) {
        // recorremos todos los indices del array y mostramos su valor
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " valor: " + array[i] + " euros");
        }
        System.out.println(""); // salto de línea
    }

    public static void mostrarArrayReves(int array[]) {
        // recorremos todos los indices del array empezando desde el último [11] hasta el primero [0]
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + " valor: " + array[i] + " euros");
        }
        System.out.println(""); // salto de línea
    }

    public static int valorTotalVentas(int array[]) {

        int totalventas = 0; // inicializamos el valor de total de ventas en 0

        // recorremos todos los indices del array mientras que se van sumando los valores
        for (int i = 0; i < array.length; i++) {
            totalventas += array[i]; // incrementando el valor de la variable según el recorrido
        }

        return totalventas; // devuelve el total
    }

    public static int valorTotalVentasPares(int array[]) {

        int totalventas = 0; // inicializamos el valor de total de ventas en 0

        // recorremos todos los indices del array empezando en la posicion [1]
        // y dando saltos de dos en dos
        for (int i = 1; i < array.length; i += 2) {
            totalventas += array[i]; // incrementando el valor de la variable según el recorrido
        }

        return totalventas; // devuelve el total
    }

    public static void mostrarMesConMasVentas(int ventas[], String meses[]) {

        int mesMayorVentas = 0; // en esta variable guardamos la posicion del mes con más ventas

        // este bucle recorre el array desde la posición 0 hasta la 11 (enero a diciembre)
        for (int i = 0; i < ventas.length; i++) {

            // si las ventas del mes actual son mayores que las del mes guardado
            // se actualiza la posición
            if (ventas[i] > ventas[mesMayorVentas]) {
                mesMayorVentas = i; // guardamos dicha posicion (mes)
            }
        }

        System.out.println("Mes con más ventas: " + meses[mesMayorVentas]
                + " ventas --> " + ventas[mesMayorVentas] + " euros.");
    }
}
