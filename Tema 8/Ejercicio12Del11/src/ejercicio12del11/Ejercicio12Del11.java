/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12del11;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Ejercicio12Del11 {

    public static void main(String[] args) {

        // Objeto con constructor por defecto.
        Mueble mueble1 = new Mueble();

        //Con parametrizado.
        Mueble mueble2 = new Mueble(50.0, "Mueble barato");

        //Cambios usando setters
        mueble1.setDescripcion("Mesa premium con madera de roble en extincion desde el 1020 A.C con acabados de pinguino euroafricano");
        mueble1.setPrecio(999999.99);

        mueble2.setDescripcion("Mesa barata, probablemente con poner un vaso vacio se desarme entera, (fabricada con carton usado 1300 veces)");

        //Mostrar muebles
        mostrarInfoMuebles(mueble1, mueble2);

        //Ejercicio12
        Mueble[] muebles = new Mueble[4];
        menu(muebles);

    }

    public static void mostrarInfoMuebles(Mueble mueble1, Mueble mueble2) {
        System.out.println("\n Mueble 1");
        mueble1.mostrarInfo();

        System.out.println("\n Mueble 2");
        mueble2.mostrarInfo();
    }

    //Métodos del ejercicio 12
    public static void menu(Mueble[] muebles) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ MUEBLES ---");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMuebles(muebles);
                    break;
                case 2:
                    mostrarMuebles(muebles);
                    break;
                case 3:
                    mostrarMueblesPorPrecio(muebles);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

        } while (opcion != 4);
    }

    //Metodo para rellenar info de los muebles
    public static void rellenarMuebles(Mueble[] muebles) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < muebles.length; i++) {
            System.out.println("\n Mueble " + (i + 1));
            System.out.println("Introduce descripcion: ");
            String descripcion = sc.nextLine();
            System.out.println("Introduce precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();//Limpiar buffer.
            muebles[i] = new Mueble(precio, descripcion);

        }
    }

    //Mostrar los muebles creados.
    public static void mostrarMuebles(Mueble[] muebles) {
        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null) {
                System.out.println("\n Mueble " + (i + 1));
                muebles[i].mostrarInfo();
            }
        }
    }

    //Mostramos los muebles que no esten vacios y que cuyo precio sea inferior al maximo.
    public static void mostrarMueblesPorPrecio(Mueble[] muebles) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio máximo: ");
        double precioMax = sc.nextDouble();

        for (int i = 0; i < muebles.length; i++) {
            if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                System.out.println("\nMueble " + (i + 1));
                muebles[i].mostrarInfo();
            }
        }
    }

}
