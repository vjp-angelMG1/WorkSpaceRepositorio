/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num = new int [5]; //Declaro e inicializo el numero que le bvoy a pedir de cinco cifras
        
        PedirNumero(num); //muestro el resultado del método PedirNumero
        DividirNumeroEnCifras(num,numero); //muestro el resultado del método DivirNumeroEnCifras
        MeterElArray();
        VisualizarElArray(num,numero); //muestro el resultado del array meter numero
        
        
    }    
    public static void PedirNumero(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i < numero.length; i++){
            
        }
        numero = entrada.nextInt();
    }
    public static void DividirNumeroEnCifras(){
        int num;
        num = num%10;
        int numero = num/10;
        numero [0]=8;
        numero [1]=5;
        numero [2]=9;
        numero [3]=2;
        numero [4]=1;
        System.out.println("El numero esta divido en 5 partes que son": );
    }
    public static void MeterElArray(int [] num){
        
    }
    public static void VisualizarElArray(int [] num){
        System.out.println("El array"+numero+);
        return numero;
    }
        
}
    

