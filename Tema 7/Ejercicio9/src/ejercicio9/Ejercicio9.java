/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio9 {

    
    //Método que pide un número entero mayor que 0
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        do{
            System.out.print("Escribe un numero: ");
            try{
                numero = entrada.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(numero<1);//Repetimos mientras el número sea menor que 1
        return numero;//Devolvemos el número válido
    }
    
    //Método que calcula cuántas cifras tiene un número
    public static int calcularCifras(int numero){
        int contador = 0;
        //Mientras el número sea mayor que 0, se va dividiendo entre 10 y suma una cifra
        while(numero>0){
            numero /= 10;
            contador++;
        }
        System.out.println("El numero tiene " + contador + " cifras");
        return contador;//Devolvemos cuántas cifras tiene
    }
    
    //Método que divide el número en cifras y las guarda en el vector
    public static void dividirNumeros(int numero, int [] vector){
        //Recorremos el array y vamos extrayendo las cifras del número
        for(int i = 0; i < vector.length; i++){
            vector[i] = numero % 10;
            numero /= 10;
        }
    }
    
    //Método que muestra el número al revés usando el vector
    public static void mostrarNumeros(int[] vector){
        System.out.print("El numero introducido escrito al reves es el: ");
        //Recorremos el vector y mostramos cada cifra
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int numero = pedirNumeros();//Pedimos un número válido al usuario
        int[] vector = new int[calcularCifras(numero)];//Array donde guardaremos las cifras que diga el usuario
        
        dividirNumeros(numero, vector);//Dividimos el número en cifras
        mostrarNumeros(vector);//Mostramos el número al revés
    }
}
