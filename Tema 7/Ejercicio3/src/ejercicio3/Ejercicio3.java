/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    
    //Método para elegir la longitud del array entre 1 y 10, con control de excepciones
    public static int elegirLongitud(){
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        
        do{
            System.out.print("Por favor, introduzca la longitud del vector entre 1 y 10: ");
            try{
                longitud = entrada.nextInt();
            }catch(InputMismatchException e){
                System.out.println(e);
                System.out.println("Error: Debes introducir un numero entero");
                entrada.next();
            }
            if(longitud < 1 || longitud > 10){
                System.out.println("La longitud debe estar entre 1 y 10");
            }
        }while(longitud < 1 || longitud > 10);
        
        return longitud;
    }
    
    //Método para rellenar el array con números aleatorios entre 1 y 6
    public static void rellenarVector(int [] vector){
        Random aleatorio = new Random();
        System.out.println("Rellenando el vector con numeros aleatorios entre 1 y 6...");
        
        for(int i = 0; i < vector.length; i++){
            vector[i] = aleatorio.nextInt(6) + 1;
        }
    }
    
    //Método para mostrar el contenido del array
    public static void mostrarVector(int [] vector){
        System.out.println("\n--CONTENIDO DEL VECTOR--\n");
        for(int i = 0; i < vector.length; i++){
            System.out.println("La posicion de " + i + ": " + vector[i] + "\n");
        }
    }
    public static void main(String[] args) {
        int longitud = elegirLongitud();//Elegir longitud del array
        int[] vector = new int[longitud];//Crear array con esa longitud
        
        rellenarVector(vector);//Rellenar con números aleatorios
        mostrarVector(vector);//Mostrar el contenido
    }
    
}