/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
/**
 *
 * @author Ángel
 */
public class Ejercicio4 {
    public final static int FILAS = 4;
    public final static int COLUMNAS = 3;   
    
public static void main(String[] args) {
        int[][]numeroAleatorio = new int[4][3];
        
     RellenarDatos(numeroAleatorio);
     MostrarDatos(numeroAleatorio);
       
       

    }

    public static void RellenarDatos(int numeroAleatorio[][]){
  
       for (int i=0; i < numeroAleatorio.length;i++){
            for(int j=0; j < numeroAleatorio[i].length ;j++){
                numeroAleatorio[i][j] = (int)(Math.random()*101)+ 100;
            }
       }
       
          
           
    }
    
    public static void MostrarDatos(int numeroAleatorio[][]){
        System.out.println("Muestro los números pares");
        for (int i=0; i < numeroAleatorio.length;i++){
            for(int j=0; j < numeroAleatorio[i].length ;j++){
                if (numeroAleatorio[i][j] % 2==0)
                System.out.println("Pertenece a la casilla ["+ i + j +"]" +numeroAleatorio[i][j]);
            }
       }
    }
        
    
}