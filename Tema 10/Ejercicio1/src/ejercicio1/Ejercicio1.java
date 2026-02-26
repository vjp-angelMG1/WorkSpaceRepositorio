/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * • Ejercicio 01.- Crea una lista en la que almacenes nombres de personas y
 * luego la muestres por pantalla. • Para ello, crea un método para rellenar la
 * lista, en el que le vayas pidiendo al usuario el nombre de la persona a
 * introducir y si desea introducir otro nombre. • Crea otro método para mostrar
 * la lista por pantalla.
 *
 *
 * @author Ángel
 */
public class Ejercicio1 {

    public static void main(String[] args) { 
        
        ArrayList<String> lista = rellenarLista();
        mostrarLista(lista);
    }

    public static ArrayList<String> rellenarLista() { //creo método para rellenar la lista que devuelve un Arraylist
        int personas; //declaro la variable
        
        Scanner entrada = new Scanner(System.in); //creo el objeto escanner para pedirle al usuario los datos
        
        ArrayList<String> lista = new ArrayList<>(); //creo lista vacia de tipo String
        
        System.out.println("Introducir el número de las personas :"); //imprimo por pantalla lo que le pido al usuario
        personas = entrada.nextInt(); //guardo en la variable el valor que le pido al usuario
        entrada.nextLine(); //Creo buffer para que no salte a la siguiente persona sin rellenar el primer campo

        for (int i = 0; i < personas; i++) { //creo bucle for para que se repita con las personas que el usuario introduzca 
            System.out.println("Introducir nombre de las personas" + (i + 1) + ""); //imprimo por pantalla el nombre de las personas empezando el 1 
            lista.add(entrada.nextLine()); //añado a la lista con add el nomnbre que el usuario introduce por pantalla
            }

        return lista;//devuelvo la lista ya rellenada 
    }

    public static void mostrarLista(ArrayList<String> lista) { //metodo para mostrar lista que recibe la lista por parametros
        for (int i = 0; i < lista.size(); i++) { //bucle for para recorrer la lista con size que devuelve el tamaño de la lista
            System.out.println("-Personas " + (i + 1) + "-"); //imprimo por pantalla el número de personas
            System.out.println(lista.get(i)); //imprimo por pantalla con get(i) para obtener que persona esta en el rango de i
        }
    }

}


    
    

