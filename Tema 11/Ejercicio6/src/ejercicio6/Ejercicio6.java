/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *  Ejercicio 06.- Debido a la avalancha de campañas de donaciones
para la compra de material para hospitales y residencias contra el
coronavirus, el Ministerio de Sanidad ha decidido crear un software
que gestione todo el dinero donado. En la versión alfa del software
debemos gestionar las donaciones de una única campaña. Para ello,
debemos implementar las siguientes clases:
• Clase Donacion, que almacenará el nombre de la persona que
dona y la cantidad donada.
• Clase Campania, que almacenará un conjunto de donaciones y el
nombre de la campaña.
 *• El programa mostrará un menú con las siguientes opciones:
1. Añadir donación.
2. Mostrar donaciones.
3. Mostrar donaciones por nombre de donante (Pediremos un nombre y mostraremos las
donaciones cuyo donante coincida con el nombre dado).
4. Mostrar número de donaciones.
5. Mostrar total dinero recaudado.
6. Ordenar donaciones (de mayor a menor importe de las donaciones)
7. Salir.
NOTA: No se puede utilizar el método de la Burbuja para realizar la ordenación de las
donaciones.
PISTA: Podéis utilizar un vector de Donaciones donde ir insertándolas de manera
ordenada.
* 
 * @author Angel
 */
public class Ejercicio6 {

    public static void mostrarMenu() { //metodo para mostrar menu
        System.out.println("MENU");
        System.out.println("1. Aniadir donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar por nombre de donante");
        System.out.println("4. Numero de las donaciones");
        System.out.println("5. Total que se ha recaudado");
        System.out.println("6. Ordenar las donaciones");
        System.out.println("7. Salir programa");
        System.out.print("Eligir una de las opciones: ");
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //creo objeto scanner 
        Campanea campaña = new Campanea(); //creo  objeto campaña para controlar las donaciones

        int opcion = -1; //declaro varible para el menu

        do { //bucle que se repite al menos una vez
            mostrarMenu(); //llamo al metodo para mostrar menu
            opcion = entrada.nextInt(); //pido la opcion al usuario
            switch (opcion) { //condicional para eleguir una opcion
                case 1: 
                    campaña.aniadirDonacion();//Allamo al metodo para añadir una donacion
                    break; //para que no salte al siguiente caso 
                case 2:
                    campaña.mostrarDonaciones();//llamo al metodo para mostrar todas las donaciones
                    break;
                case 3:
                    campaña.buscarPorNombre();//llamo al metood para buscar por el nombre
                    break;
                case 4:
                    System.out.print("Numero de las donaciones: " + campaña.numeroDonaciones());//llamo al metodo return para ver el total de donaciones
                    break;
                case 5:
                    System.out.print("Total que se ha recaudado: " + campaña.totalRecaudado() + " Euros");//llamo al metodo return para ver el total recaudado
                    break;
                case 6:
                    campaña.ordenarDonaciones();//llamo al metodo para que muestre la ordenacion
                    break;
                case 7:
                    System.out.println("Saliendo programa...");
                    break;
                default:
                    System.out.println("Error : La opcion no es correcta siga probando");
            }
        } while (opcion != 7); //mientras que la opcion no sea distinta de 7
    }

}
