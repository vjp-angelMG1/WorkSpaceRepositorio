/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Angel
 */
public class Ejercicio14 {
    public final static int FILAS = 4;
    public final static int COLUMNAS = 7;
   
    public static void main(String[] args) {
        int [][] temperaturas = new int [4][7];
        int numero;
        numero = -1;
        String [] dias = {
            "Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"
        };
        
     
        
        Scanner entrada = new Scanner(System.in);
       
        do{
            System.out.println("Menú");
            System.out.println(" 1. Rellenar las temperaturas");
            System.out.println(" 2. Mostrar las ventas");
            System.out.println(" 3. Visualizar la temperatura media del mes");
            System.out.println(" 4. Día o Días mas calurosos del mes");
            System.out.println("5. Salir del programa");
           try { 
                numero = entrada.nextInt();
        
            switch (numero){
                case 1:
                    rellenarLasTemperaturas(temperaturas);
                    System.out.println("Array rellenado correctamente");
                    break;
                case 2:
                    mostrarLasTemperaturas(temperaturas);
                    break;
                case 3:
                    visualizarLaTemperaturaMediaDelMes(temperaturas);
                    System.out.println("3-Visualizar las temperaturas media del mes");
                    break;
                case 4:
                    diaDiasMasCalurosoDelMes(temperaturas);
                    System.out.println("Día o Días mas calurosos del mes");
                    break;
                case 5:
                    System.out.println("Salir del programa");
                    break;
                default:
            }         System.out.println("Opció´n no válida");   
           }catch(InputMismatchException e){
                
               System.out.println("Error introduce número entero");
               entrada.next();
            }
               
           
        }while(numero !=5);
        
    } 
    
    public static void rellenarLasTemperaturas(int temperaturas[][]){
        int grados;
        for (int i= 0; i < temperaturas.length; i++) {
            Scanner rellenar = new Scanner(System.in);
            grados = rellenar.nextInt();
            temperaturas[i][j] = temperaturas;
        }   
    }
    
    public static void mostrarLasTemperaturas(int temperaturas[][]){
        for (int i= 0; i <temperaturas.length; i++) {
            for ( int j=0; j <temperaturas.length; j++){}
            System.out.println("Temperaturas"+ temperaturas[4][7] + i + ":");
        }
    }    
    public static void visualizarLaTemperaturaMediaDelMes(int temperaturas [][]){
        System.out.println("La temperatura media del mes es" + : + "grados");
    }
    public static void diaDiasMasCalurosoDelMes(int temperaturas [][]){
        
    }
    
}    
    

