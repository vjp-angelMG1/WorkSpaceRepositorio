/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio15 {
       // método que muestra por pantalla el menú con todas las opciones disponibles
    public static void mostrarMenu() {
        System.out.println("INTRODUCE UNA OPCIÓN");
        System.out.println("1. Rellenar las películas junto con los socios que han acudido a verla");
        System.out.println("2. Mostrar las películas y los socios que la han visto");
        System.out.println("3. Mostrar película más rentable");
        System.out.println("4. Mostrar película menos rentable");
        System.out.println("5. Pedir el nombre de una película y mostrar el beneficio neto y la información de los socios que han asistido");
        System.out.println("6. Contar el número de socios que han abonado una cantidad mayor a la pedida por pantalla");
        System.out.println("7. Salir del programa");
    }

    // método main, punto de entrada del programa
    public static void main(String[] args) {

        int opcion = 0; // declaro e inicializo la variable opción
        Pelicula[] peliculas = null; // declaro el array de películas sin inicializar
        Scanner entrada = new Scanner(System.in); // creo el Scanner para leer datos por teclado

        // bucle que se repite hasta que el usuario elija la opción 7
        do {
            mostrarMenu(); // llamo al método para mostrar el menú
            opcion = entrada.nextInt(); // recojo la opción introducida por el usuario

            // estructura switch para ejecutar la opción elegida
            switch (opcion) {
                case 1:
                    peliculas = rellenarPeliculasConSocios(); // relleno el array de películas
                    break;
                case 2:
                    mostrarPeliculasConSocios(peliculas); // muestro las películas y sus socios
                    break;
                case 3:
                    mostrarPeliculaMasRentable(peliculas); // muestro la película más rentable
                    break;
                case 4:
                    mostrarPeliculaMenosRentable(peliculas); // muestro la película menos rentable
                    break;
                case 5:
                    pedirNombreYMostrar(peliculas); // pido el nombre de una película y muestro su información
                    break;
                case 6:
                    contarSocios(peliculas); // cuento los socios que han pagado más de una cantidad
                    break;
                case 7:
                    System.out.println("Te has salido del programa"); // mensaje de salida
                    break;
                default:
                    System.out.println("Introduce una opción válida"); // control de errores
            }
        } while (opcion != 7); // condición de salida del bucle
    }

    // método para rellenar el array de películas junto con sus socios
    public static Pelicula[] rellenarPeliculasConSocios() {

        Scanner entrada = new Scanner(System.in); // creo el Scanner
        System.out.println("Introduce el número de películas");
        int numeroPeliculas = entrada.nextInt(); // recojo el número de películas

        Pelicula[] peliculas = new Pelicula[numeroPeliculas]; // creo el array de películas

        // bucle para recorrer cada película
        for (int i = 0; i < peliculas.length; i++) {
            entrada.nextLine(); // limpio el buffer del Scanner

            System.out.println("Introduce el título de la película " + (i + 1));
            String titulo = entrada.nextLine(); // recojo el título

            System.out.println("Introduce el coste de la película " + (i + 1));
            double coste = entrada.nextDouble(); // recojo el coste
            entrada.nextLine(); // limpio el buffer

            Socio[] socios = new Socio[4]; // creo el array de socios

            // bucle para rellenar los socios
            for (int j = 0; j < socios.length; j++) {
                System.out.println("Introduce el nombre del socio " + (j + 1));
                String nombre = entrada.nextLine(); // recojo el nombre del socio

                System.out.println("Introduce el precio abonado del socio " + (j + 1));
                double precio = entrada.nextDouble(); // recojo el precio
                entrada.nextLine(); // limpio el buffer

                socios[j] = new Socio(nombre, precio); // creo el objeto socio
            }

            peliculas[i] = new Pelicula(titulo, coste, socios); // creo el objeto película
        }

        return peliculas; // devuelvo el array de películas
    }

    // método para mostrar todas las películas con sus socios
    public static void mostrarPeliculasConSocios(Pelicula[] peliculas) {

        // recorro el array de películas
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("Título: " + peliculas[i].getTitulo());
            System.out.println("Coste de licencia: " + peliculas[i].getCosteLicencia());

            Socio[] socios = peliculas[i].getSocios(); // obtengo los socios de la película

            // recorro los socios
            for (int j = 0; j < socios.length; j++) {
                System.out.println("  Socio " + (j + 1) + ":");
                System.out.println("    Nombre: " + socios[j].getNombre());
                System.out.println("    Precio abonado: " + socios[j].getPrecio());
            }
        }
    }

    // método para mostrar la película más rentable
    public static void mostrarPeliculaMasRentable(Pelicula[] peliculas) {

        int indiceMejor = 0; // guardo el índice de la mejor película
        double mejorBeneficio = 0; // guardo el mayor beneficio

        // recorro el array de películas
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;

            // sumo el dinero aportado por los socios
            for (int j = 0; j < socios.length; j++) {
                suma += socios[j].getPrecio();
            }

            double beneficio = suma - peliculas[i].getCosteLicencia(); // calculo el beneficio

            // comparo para ver si es la más rentable
            if (i == 0 || beneficio > mejorBeneficio) {
                mejorBeneficio = beneficio;
                indiceMejor = i;
            }
        }

        System.out.println("La película más rentable es " +
                peliculas[indiceMejor].getTitulo() +
                " con un beneficio de " + mejorBeneficio);
    }

    // método para mostrar la película menos rentable
    public static void mostrarPeliculaMenosRentable(Pelicula[] peliculas) {

        int indicePeor = 0; // guardo el índice de la peor película
        double menorBeneficio = 0; // guardo el menor beneficio

        // recorro el array de películas
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;

            // sumo el dinero aportado por los socios
            for (int j = 0; j < socios.length; j++) {
                suma += socios[j].getPrecio();
            }

            double beneficio = suma - peliculas[i].getCosteLicencia(); // calculo el beneficio

            // comparo para ver si es la menos rentable
            if (i == 0 || beneficio < menorBeneficio) {
                menorBeneficio = beneficio;
                indicePeor = i;
            }
        }

        System.out.println("La película menos rentable es " +
                peliculas[indicePeor].getTitulo() +
                " con un beneficio de " + menorBeneficio);
    }

    // método para pedir el nombre de una película y mostrar su información
    public static void pedirNombreYMostrar(Pelicula[] peliculas) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre de una película");
        String nombre = entrada.nextLine(); // recojo el nombre

        boolean encontrado = false; // variable de control
        int i = 0;

        // busco la película por nombre
        while (i < peliculas.length && !encontrado) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(nombre)) {
                encontrado = true;
            } else {
                i++;
            }
        }

        // si la película existe
        if (encontrado) {
            System.out.println("Título: " + peliculas[i].getTitulo());
            System.out.println("Coste: " + peliculas[i].getCosteLicencia());

            Socio[] socios = peliculas[i].getSocios();
            double suma = 0;

            // muestro los socios y sumo el dinero
            for (int j = 0; j < socios.length; j++) {
                suma += socios[j].getPrecio();
                System.out.println("Nombre: " + socios[j].getNombre());
                System.out.println("Total precio: " + socios[j].getPrecio());
            }

            double beneficio = suma - peliculas[i].getCosteLicencia();
            System.out.println("Beneficio de la película: " + beneficio);
        } else {
            System.out.println("La película no existe");
        }
    }

    // método para contar los socios que han abonado más de una cantidad
    public static void contarSocios(Pelicula[] peliculas) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un precio");
        int precio = entrada.nextInt(); // recojo el precio de referencia

        int contador = 0; // contador de socios

        // recorro todas las películas
        for (int i = 0; i < peliculas.length; i++) {
            Socio[] socios = peliculas[i].getSocios();

            // recorro los socios
            for (int j = 0; j < socios.length; j++) {
                if (socios[j].getPrecio() > precio) {
                    contador++;
                }
            }
        }

        System.out.println("Número de socios que han abonado más de " + precio + ": " + contador);
    }
}

