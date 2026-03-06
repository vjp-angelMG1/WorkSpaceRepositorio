/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *• Ejercicio 04.- Escribe un programa que contenga un método que
acepte como parámetro una lista de números enteros mayores que
0, pudiendo contener elementos duplicados. Este método debe
sustituir cada valor repetido por 0.
• Otro método se encargará de mostrar la lista antes y después de
ser modificada.
• También necesitarás otro método para rellenar la lista de enteros.
Este método le irá pidiendo números al usuario hasta que este
introduzca un número negativo.
Ejemplo: 2 7 8 4 5 8 7 1 8 → 2 0 0 4 5 0 0 1 0
* 
 * @author Ángel
 */
public class Ejercicio4 {

    public static void main(String[] args) { //creo clase principal main

        ArrayList<Integer> numeros = new ArrayList<>(); //Creo la lisra donde voy a recojer los datos introducidos por el usuario
        //Se pide al usuario que rellene la lista, se muestra, luego los repetidos se sustituyen por 0 y se vuelve a mostrar
        rellenarLaLista(numeros); //llamo al usuario para que rellene la lista
        System.out.println("Lista principal"); //imprimo por pantalla el resultado
        mostrarLaLista(numeros); //llamo al método para mostrar la primera lista
        sustituirLosRepetidosPorCero(numeros); //Llamo al método para sustituir los numeros que estén repedidos por 0
        System.out.println("Lista con modificaciones"); //imprimo por pantalla la lista con las modificaciones
        mostrarLaLista(numeros); //llamo al metodo y muestro la lista 
    }
    
    //Metodo que rellena los numeros de la lista
    public static void rellenarLaLista(ArrayList<Integer> lista){ //metodo que rellena los números de la lista 
        int numero1; //Declaro variable 
        Scanner entrada = new Scanner(System.in); //Creo objeto escanner
        System.out.print("Introducir numeros positivos: "); //imprimo por pantalla 
        numero1 = entrada.nextInt();  //guardo en la variable numero1

        while(numero1 >= 0){ //bucle para que se añada a la lista mientras el numero sea mayor que 0
            lista.add(numero1);//añado a la lista el numero introducido
            System.out.print("----Numero: "); //Imprimo por pantalla los numeros
            numero1 = entrada.nextInt(); //guardo en la variable el numero introducido
        }
    }
    

    public static void mostrarLaLista(ArrayList<Integer> lista){ //metodo para mostrar la lista completa con parametros
        for(int i = 0; i < lista.size(); i++){ //con bucle for recorro la lista hasta el final del ultimo numero introducido y voy incrementandolo 
            System.out.println(lista.get(i) + " "); //imprimo por pantalla añado a la lista los numeros introducidos
        }
    }
    
   
    public static void sustituirLosRepetidosPorCero(ArrayList<Integer> lista){ //metodo para sustituir en 0 los numeros que son repetidos con parametros
        
        ArrayList<Integer> incrementador = new ArrayList<>(); //guardo en esta otra lista cuantas veces se incrementan por elemento
        
        //Primera pasada: cuento cuantas veces se repite cada valor
        for(int i = 0; i < lista.size(); i++){ //bucle for para comprobar las veces que se repite cada elemento
            int elemento = lista.get(i); //declaro e inicializo variable para guardar cada elemento actual
            int incremento = 0; //declaro e inicializo variable para incrementador que empiece a contar apartir de 0 las repeticiones de cada elemento
            //Se cuenta cuantas veces aparece el valor en toda la lista
            for(int j = 0; j < lista.size(); j++){ //con bucle for cuento las veces que aparece el elemento en la lista recorriendola otra vez para comparar elemento a elemento
                if(lista.get(j).equals(elemento)){ //si el elemento es igual
                    incremento++; //incremento el contador
                }
            }
            incrementador.add(incremento);//Guardo en la lista de incrementador las veces que se repite el numero
        }
        //Segunda pasada: Sustituyo por 0 los valores repetidos
        for(int i = 0; i < lista.size(); i++){ //bucle for para recorrer la lista principal
            if(incrementador.get(i) >= 2){ //condicional si el incrementador del elemento actual es 2 veces o mas el mismo se repite
                lista.set(i, 0); //susituyo en la lista su valor por 0
            }
        }
    }
}
    
}
