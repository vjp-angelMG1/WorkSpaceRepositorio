/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.InputMismatchException;

/**
 * • Ejercicio 06.- Realiza un programa en el que utilices una lista de enteros
 * y que muestre un menú en el que se le ofrezcan al usuario las siguientes
 * opciones: 1. Introducir las ventas de coches de cada uno de los 12 meses del
 * año. 2. Mostrar las ventas introducidas en el punto anterior. 3. Mostrar las
 * ventas introducidas al revés. 4. Que muestre la suma total de ventas del año.
 * 5. Que muestre las ventas totales de los meses cuyo nombre contenga la letra
 * a. 6. Que muestre el nombre del mes (o meses) con más ventas. 7. Salir del
 * programa. • Necesitarás, un array unidimensional (o una lista) con el nombre
 * de los meses del año. • Controlaremos que el usuario elija una opción del
 * menú entre 1 y 7. Hasta que el usuario no pulse 7 no saldremos del programa
 *
 * @author Ángel
 */
import java.util.ArrayList; //imprimo por pantalla la clase ArrayList del paquete java util
import java.util.InputMismatchException; //imprimo por pantalla la clase InputMismatchException del paquete java util
import java.util.Scanner; //imprimo por pantalla la clase Scanner del paquete java util

public class Ejercicio6 {

    /**
     *
     * @author Ángel
     */
    final static int MESES = 12; //creo constante con los meses

    public static void main(String[] args) { //creo metodo main ejecutable
        ArrayList<Integer> ventasDeCoches = new ArrayList<>(); //creo la lista de las ventas de los coches                  
        String[] nombreDeLosMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; //Creo el array con el nombre de los meses

        int opcion = 0; //variable para guardar la opcion del menú

        do { //bucle   para mostrar el menú al menos una vez                                                          //Creo el menú con sus opciones
            try { //captura de excepciones 
                mostrarElMenu(); //llama al método para mostrar el menú
                opcion = pedirNumero(); //Leo la opcion del usuario
                switch (opcion) { //creo condicional switch para elegir una de las opciones
                    case 1: //caso 1 
                        rellenarVentas(ventasDeCoches, nombreDeLosMeses); //llamo al metodo con las variables de la lista y del array
                        break; //con el break no sigo ejecutando otros casos
                    case 2:
                        if (ventasDeCoches.isEmpty()) { //condicional para ver si la lista esta vacia 
                            System.out.println("No hay ventas que mostrar"); //imprimo por pantalla
                        } else { //condicional que muestra la ventas 
                            mostarVentas(ventasDeCoches, nombreDeLosMeses); //llama al metodo para mostrar las ventas en los meses del 1 al 12
                        }
                        break;
                    case 3:
                        if (ventasDeCoches.isEmpty()) { //condicinal para ver si la lista esta vacia 
                            System.out.println("No hay ventas que mostrar"); //imprimo por pantalla
                        } else {
                            mostarVentasReves(ventasDeCoches, nombreDeLosMeses); //llamo al metodo para mostrar las ventas en los meses del 12 al 1
                        }
                        break;
                    case 4:
                        if (ventasDeCoches.isEmpty()) { //igual que los condicionales anteriores
                            System.out.println("No hay ventas que mostrar"); //imprimo por pantalla
                        } else {
                            mostrarVentasTotales(ventasDeCoches); //llamo al metodo para mostrar el numero total de las ventas
                        }
                        break;
                    case 5:
                        if (ventasDeCoches.isEmpty()) { //igual que los condicionales anteriores
                            System.out.println("No hay ventas que mostrar"); //imprimo por pantalla
                        } else {
                            mostrarVentasMesesKeTieneA(ventasDeCoches, nombreDeLosMeses); //llamo al metodo para filtrar meses con a
                        }
                        break;
                    case 6:
                        if (ventasDeCoches.isEmpty()) { //igual
                            System.out.println("No hay ventas que mostrar"); //imprimo por pantalla
                        } else {
                            mostrarMesDeMasVentas(ventasDeCoches, nombreDeLosMeses); //llamo al metodo para filtrar el mes de mas venta
                        }
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");//imprimo por pantalla para salir del programa
                        break;
                    default: //caso por defecto
                        System.out.println("Error: La opción no valida"); //imprimir por pantalla
                    }

            } catch (InputMismatchException e) { //control de excepciones que al recoger en el try detecta en el catch si he introducido una letra
                System.out.println("Error, tienes que introducir una opcion dentro del rango de los casos del menu");
            }

        } while (opcion != 7); //se repite el bucle mientras la opcion sea distinta a 7
    }

    public static int pedirNumero() { //creo metodo estatico que devuelve el numero
        Scanner entrada = new Scanner(System.in); //creo objeto scanner

        return entrada.nextInt(); //devuelve el numero introducido por el usuario
    }

    public static void mostrarElMenu() { //Método que muestra las opciones del menú
        System.out.println("1.-Rellenar las ventas-");
        System.out.println("2.-Mostrar las ventas-");
        System.out.println("3.-Mostrar las ventas al reves-");
        System.out.println("4.-Ventas totales del anio-");
        System.out.println("5. Ventas totales de los meses que tenga una a");
        System.out.println("6. Mostrar el mes o los meses con mas ventas");
        System.out.println("7. Salir");
        System.out.println("Introduzca la opcion en orden de ejecucion : ");

    }

    /**
     * Método que pide al usuario rellenar las ventas de cada mes
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void rellenarVentas(ArrayList<Integer> ventas, String[] nombreMeses) { //método que pide al usuario rellenar las ventas en cada mes con parametros de la lista y el nombre de los meses
        for (int i = 0; i < MESES; i++) { //recorro bucle for para los meses 
            System.out.println("Introduzca las ventas de " + nombreMeses[i]); //imprimo por pantalla las ventas de cada mes

            ventas.add((int) (Math.random() * 1001) + 1000); //genero numero aleatorio entre 1000 y 2000
        }
    }

    /**
     * Método que muestra las ventas de todos los meses
     *
     * @param ventas
     * @param nombreMeses
     */
    public static void mostarVentas(ArrayList<Integer> ventas, String[] nombreMeses) { //metodo que muestra las ventanas de todos los meses con parametros de la lista y el array
        for (int i = 0; i < MESES; i++) { //recorro bucle for para los meses del 1 al 12
            System.out.println("En " + nombreMeses[i] + " tengo " + ventas.get(i) + " euros en  las ventas"); //imprimo por pantalla los meses y las ventas
        }
    }

    public static void mostarVentasReves(ArrayList<Integer> ventas, String[] nombreMeses) { // muestro todos los meses de las ventas al reves
        for (int i = MESES - 1; i >= 0; i--) { //recorro bucle for para los meses del 12 al 1
            System.out.println("En " + nombreMeses[i] + " tengo " + ventas.get(i) + " Euros"); //imprimo por pantalla los meses y las ventas
        }
    }

    public static void mostrarVentasTotales(ArrayList<Integer> ventas) { //metodo que suma todas las ventas y las muestra en pantalla
        int total = 0; //declaro e inicializo en 0 para comprobar el numero de las ventas

        for (int i = 0; i < MESES; i++) { //recorro bucle for del 1 al 12
            total += ventas.get(i); //sumo el total de las ventas y las guardo en la variable total
        }

        System.out.println("Total de las ventas en el año es de " + total + " Euros"); //imprimo por pantalla el total 
    }


    public static void mostrarVentasMesesKeTieneA(ArrayList<Integer> ventas, String[] nombreMeses) { // metodo que muestra la venta de todos los meses que contengan la "a" con parametros de la lista y el array
        for (int i = 0; i < MESES; i++) { //recorro bucle for del 1 al 12
            if (nombreMeses[i].contains("a") || nombreMeses[i].contains("A")) { //condicional para mostrar los meses que contengan una a minuscula o una A mayuscula
                System.out.println("Ventas de meses " + nombreMeses[i] + " es de: " + ventas.get(i) + " euros"); //imprimo por pantalla la venta de los meses que tienen la a
            }
        }
    }

    public static void mostrarMesDeMasVentas(ArrayList<Integer> ventas, String[] nombreMeses) { //metodo que muestra el mes o los meses con mas ventas
        int mayorMesDeVentas = 0; //declaro e inicializo el mayor mes de Ventas

        System.out.println("Los meses o mes con mas ventas son :"); //imprime los meses o mes con mas ventas

        for (int i = 0; i < MESES; i++) { //recorro bucle for con meses del 1 al 12
            if (ventas.get(i) > mayorMesDeVentas) { //condicional si la venta es mayor que la máxima actual
                mayorMesDeVentas = ventas.get(i); //actualizo la máxima
            }
        }

        for (int i = 0; i < MESES; i++) { //recorro bucle for con meses del 1 al 12
            if (ventas.get(i) == mayorMesDeVentas) { //condicional si coincide con el máximo 
                System.out.println(nombreMeses[i] + " con " + ventas.get(i) + " euros"); //imprimo por pantalla el valor del mes de mas ventas
            }
        }

    }

}
