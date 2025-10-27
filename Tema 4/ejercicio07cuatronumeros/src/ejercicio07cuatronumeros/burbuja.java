/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07cuatronumeros;

/**
 *
 * @author Ángel
 * @since 26/10/2025
 */
public class burbuja {
    
    public static void ordenarburbuja(int numero1,int numero2,int numero3,int numero4){ //método burbuja con las variables declaradas
        
        int numerotemporal;//Declaramos la variable numero temporal
       
   
        
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
        System.out.println(numero1+"  "+numero2+"  "+numero3+"  "+numero4+"  ");//Mostramos los numeros reales ordenados
    }
}
