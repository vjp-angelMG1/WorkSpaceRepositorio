/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Angel
 */
public class Ejercicio8 {

    
    //Método que pide al usuario un número de 5 cifras
    public static int pedirNumeros(){
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        boolean valido = false;
        
        do{
            System.out.print("Escribe un numero de 5 cifras: ");
            try{
                numero = entrada.nextInt();
                if(numero >= 10000 && numero <= 99999){//Comprobamos si tiene 5 cifras
                    valido = true;
                }else{
                    System.out.println("Error: Debe de ser un numero de 5 cifras");
                }
            }catch(InputMismatchException e){
                System.out.println("Error: Debe introducir un numero entero");
                entrada.next();
            }
        }while(!valido);//Repetimos hasta que el número sea válido
        return numero;//Devolvemos el número correcto
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
        int[] vector = new int[5];//Array donde guardaremos las 5 cifras
        
        dividirNumeros(numero, vector);//Dividimos el número en cifras
        mostrarNumeros(vector);//Mostramos el número al revés
    }
}
    

