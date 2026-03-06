/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 07.- Diseña programa que almacene, en una lista de listas de enteros (2
dimensiones), las temperaturas medias de un mes que introduzca un usuario. Para
hacerlo más sencillo vamos a suponer que el mes tiene 28 días y está formado por 4
semanas de 7 días. Hasta que el usuario pulse 5, mostrar un menú que nos permita:
1. Rellenar las temperaturas.
2. Mostrar las temperaturas.
3. Visualizar la temperatura media del mes.
4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos fueron:
• ElJueves de la Semana 3 con 40 grados.
• El Sábado de la Semana 4 con 40 grados.
5. Salir del programa.
• Fíjate que necesitarás un array (o una lista) con el nombre de los días de la semana.
 * @author Ángel
 */
public class Ejercicio7 {


    //Constante con el numero de semanas
    public static final int SEMANAS = 4; // Creo constante para el numero de las semanas

    public static void main(String[] args) { //creo método main para ejecutar
        Scanner entrada = new Scanner(System.in); //creo objeto escaner

        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>(); //lista dentro de otra lista donde se guardan las temperaturas del mes

        String[] diaDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; //array con los dias de la semana

        int opcion; //declaro la opcion

 
        do { //bucle principal para crear menu
            mostrarElMenu(); //muestro el menu
            opcion = entrada.nextInt(); //guardo en variable opcion
            switch (opcion) { //condicional para eleguir opcion
                case 1 :
                    rellenarLasTemperaturas(temperaturas, diaDeLaSemana); //llamo al método con las variables
                    break;//paro el primer caso y asi con cada caso para que no salte al siguiente
                case 2 : 
                    mostrarTemperaturas(temperaturas, diaDeLaSemana); //llamo al metodo con las variables 
                    break;
                case 3 :
                    temperaturaMedia(temperaturas, diaDeLaSemana); //Llamo al metodo con las variables
                    break;
                case 4 : 
                    diaMasCaluroso(temperaturas, diaDeLaSemana); //llamo al metodo con las variables
                    break;
                case 5 :
                        System.out.println("Saliendo..."); //imprimo por pantalla el caso salir
                    break;
                default :
                    System.out.println("Error : Opcion no valida"); //imprimo por pantalla el error 
            }
        } while (opcion != 5); //mientras la opcion sea distinta de 5
    }

    public static void mostrarElMenu() { //metodo que muestra el menu de las opciones
        System.out.println("  MENU  "); //imprimo por pantalla el menu
        System.out.println("1. Rellenar las temperaturas");
        System.out.println("2. Mostrar las temperaturas");
        System.out.println("3. Mostrar la temperatura de la media del mes");
        System.out.println("4. los dias o dia mas caluroso del mes");
        System.out.println("5. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }


    public static void rellenarLasTemperaturas(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) { //método que rellena la lista de temperaturas que introduce el usuario con parámetros
        Scanner entrada = new Scanner(System.in); //creo objeto escaner
        lista.clear();//limpio la lista comenzando de nuevo 
        System.out.println("Introduce las temperaturas"); //imprimo por pantalla
        for (int i = 0; i < SEMANAS; i++) { //recorro bucle for de semanas
            lista.add(new ArrayList<>());//añado una nueva semana a la lista
            System.out.println(" Semana " + (i + 1) + " ");//imprimo por pantalla la lista de la correspondiente 

            for (int j = 0; j < diaSemana.length; j++) { //recorro bucle for de dia de la semana
                System.out.print("  " + diaSemana[j] + ": "); //imprime por pantalla los dias de la semana
                int tempera = entrada.nextInt(); //guardo en la variable la temperatura que introduzca el usuario
                lista.get(i).add(tempera);//Se guarda la temperatura en la semana correspondiente
            }
        }
    }


    public static void mostrarTemperaturas(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) { //Metodo que muestra las temperaturas del mes organizada por semana con parametros
        if (lista.isEmpty()) { //condicional para ver si la lista esta vacia
            System.out.println("Todavia no se ha introducido temperatura");//imprimo por pantalla 
        } else { //concidional si no esta vacia
            System.out.println(" Las Temperaturas del mes "); //imprimo por pantalla la temperatura del mes
            for (int i = 0; i < lista.size(); i++) { //recorro bucle para ver el numero de las semanas dentro de la lista
                System.out.println("Semana " + (i + 1) + ":"); //imprimo por pantalla las semanas

                for (int j = 0; j < lista.get(i).size(); j++) { //bucle for para recorrer cada dia de la semana
                    System.out.println("  " + diaSemana[j] + ": " + lista.get(i).get(j) + "C"); //imprimo por pantalla los dias de la semana segun el mes de ambas listas
                }
            }
        }
    }

    
    public static void temperaturaMedia(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) { //metodo que calcula la temperatura media del mes con parametros
        if (lista.isEmpty()) { //condicional si la lista esta vacia
            System.out.println("Todavia no se ha introducido temperatura"); //imprimo por pantalla 
        } else { //condicional si no 
            int suma = 0; //declaro e inicializo la suma a 0 
            int totalDias = diaSemana.length * SEMANAS;  // guardo en la variable los dias de la semana por las semanas 

            for (int i = 0; i < lista.size(); i++) { //recorro bucle for con la lista de cada semana
                for (int j = 0; j < lista.get(i).size(); j++) { //recorro bucle for la lista de cada dia
                    suma += lista.get(i).get(j); //sumo las temperaturas
                }
            }

            float media = (float) suma / totalDias; //guardo en la varaible el calculo de la media
            System.out.println("La Temperatura media del mes es : " + media + " grados centigrados"); //imprimo por pantalla la temperatura media del mes
        }
    }


    public static void diaMasCaluroso(ArrayList<ArrayList<Integer>> lista, String[] diaSemana) { //Metodo que busca la temperatura maxima del mes con parametros

        if (lista.isEmpty()) { //condicional de la lista vacia
            System.out.println("Todavia no se ha introducido temperatura"); //imprimo por pantalla la temperatura
        } else { //condicional si no esta vacia la lista
            ArrayList<Integer> listaTemperaturas = lista.get(0); //creo lista de array de temperatura
            int maxima = listaTemperaturas.get(0); //guardo en la variable la primera temperatura como máximo inicial

            for(int i = 0; i < lista.size(); i++) { //creo bucle for para recorrer la semana
                for(int j = 0; j < lista.get(i).size(); j++) { //recorro bucle for para cada dia
                    int tempera = lista.get(i).get(j); //guardo en la variable la temperatura especifica de la lista de array similar a la matriz
                    if(tempera > maxima) { //condicional si encuentro temperatura mayor 
                        maxima = tempera; //guardo en la variable la temperatura
                    }
                }
            }
            System.out.println("Los dias o dia mas caluroso han sido : " + maxima + "grados centigrados"); //imprimo por pantalla el dia o dias mas caluroso
            
            for(int i = 0; i < lista.size(); i++) { //recorro bucle for de la lista de cada semana
                for(int j = 0; j < lista.get(i).size(); j++) { //recorro bucle for de la lista de cada dia
                    if(lista.get(i).get(j) == maxima) { //condicional si la lista de la lista es igual al valor maximo de temperatura
                        System.out.println("  " + diaSemana[j] + " de la semana " + (i+1)); //imprimo por pantalla el dia mas caluroso de la semana
                    }
                }
            }
        }
    }
}
    
}
