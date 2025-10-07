/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);//Creo un objeto llamado entrada para capturar lo que escriba el usuario
        
        int numero1,numero2,numero3,numero4,numerotemporal; //Declaramos la variable 
        
        System.out.println("Introduce 4 números ");
        
        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();
        numero3 = entrada.nextInt();
        numero4 = entrada.nextInt();
        
        if(numero1>numero2){
            numerotemporal=numero1;
                   numero1=numero2;
                   numero2=numerotemporal;
        }else{
            System.out.println("No se cambia numero1 y numero2 ");
          }
        if(numero2>numero3){
            numerotemporal=numero2;
                   numero2=numero3;
                   numero3=numerotemporal;
        }else{
            System.out.println("No se cambia numero2 y numero3 ");
        }
        if(numero3>numero4){
            numerotemporal=numero3;
                   numero3=numero4;
                   numero4=numerotemporal;
        }
        
    }
    
}
