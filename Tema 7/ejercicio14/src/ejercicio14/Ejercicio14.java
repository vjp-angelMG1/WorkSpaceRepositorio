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
                    RellenarLasTemperaturas(temperaturas);
                    System.out.println("Array rellenado correctamente");
                    break;
                case 2:
                    MostrarLasTemperaturas(temperaturas);
                    break;
                case 3:
                    VisualizarLaTemperaturaMediaDelMes(temperaturas);
                    System.out.println("3-Visualizar las temperaturas media del mes");
                    break;
                case 4:
                    DiaDiasMasCalurosoDelMes(temperaturas);
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
    
    public static void RellenarLasTemperaturas(int temperaturas[][]){
        int grados;
        for (int i= 0; i < temperaturas.length; i++) {
            Scanner rellenar = new Scanner(System.in);
            grados = rellenar.nextInt();
        }   
    }
    
    public static void MostrarLasTemperaturas(int temperaturas[][]){
        for (int i= 0; i <temperaturas.length; i++) {
            for ( int j=0; j <temperaturas.length; j++){}
        }
    }    
    public static void VisualizarLaTemperaturaMediaDelMes(int temperaturas [][]){
        System.out.println("La temperatura media del mes es" + : + "grados");
    }
    public static void DiaDiasMasCalurosoDelMes(int temperaturas [][]){
        
    }
    }
}    
    

