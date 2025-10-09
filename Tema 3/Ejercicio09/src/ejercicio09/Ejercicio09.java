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
        
        System.out.println("Introduce 4 números "); //Impresion de los cuatro numeros
        
        numero1 = entrada.nextInt(); //entrada numero1 dandole valor
        numero2 = entrada.nextInt(); //entrada numero2 dandole valor 
        numero3 = entrada.nextInt(); //entrada numero3 dandole valor 
        numero4 = entrada.nextInt(); //entrada numero4 dandole valor
        
        //comprobamos una primera vuelta al  el sistema burbuja 
        System.out.println("Primera vuelta");
        if(numero1>numero2){ //Condicional que compara si el numero 1 es mayor al numero 2 es igual a las condiciones siguientes
            numerotemporal=numero1; 
                   numero1=numero2;
                   numero2=numerotemporal;
        }else{ //Condicional que se afirma al no cumplirse las anteriores condiciones
            System.out.println("No se cambia numero1 y numero2 ");
          }
        if(numero2>numero3){ //Condicional que compara si el numero 2 es mayor al numero 3 es igual a las condiciones siguientes
            numerotemporal=numero2;
                   numero2=numero3;
                   numero3=numerotemporal;
        }else{ //Condicional que se afirma al no cumplirse las anterios condiciones
            System.out.println("No se cambia numero2 y numero3 ");
        }
        if(numero3>numero4){ //Condicional que compara si el numero 3 es mayor que al numero 4 es igual a las condiciones siguientes
            numerotemporal=numero3;
                   numero3=numero4;
                   numero4=numerotemporal;
        }else{
            System.out.println("No se cambia numero3 y numero4 ");
        }  //comparamos segunda vuelta de la burbuja
           System.out.println("Segunda vuelta");
        if(numero1>numero2){
            numerotemporal=numero1;
                   numero1=numero2;
                   numero2=numerotemporal;
        }else{
            System.out.println("No se cambia numero1 y numero2 ");
        }
        
        if(numero2>numero3) {
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
            
        }else{
            System.out.println("No se cambia numero3 y numero4");
        } //comparamos una tercera vuelta a la burbuja
         System.out.println("Tercera vuelta");
        if(numero1>numero2){
            numerotemporal=numero1;
                   numero1=numero2;
                   numero2=numerotemporal;
        }else{
            System.out.println("No se cambia numero1 y numero2 ");
        }
        
        if(numero2>numero3) {
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
            
        }else{
            System.out.println("No se cambia numero3 y numero4");
        }
      
        
        System.out.println("Numeros ordenados de menor a mayor");//mostramos resultado final
        System.out.println(numero1+"  "+numero2+"  "+numero3+"  "+numero4);
     }
        
        
        
    }
    

