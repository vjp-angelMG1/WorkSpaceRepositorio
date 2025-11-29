/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.InputMismatchException; //importo la clase java util desde InputMistatchException para las excepciones de letra
import java.util.Scanner; // importo la clase java util desde Scanner

/**
 *
 * @author alumno
 */
public class Examen {
       
   //ATRIBUTOS
    //variables estaticas
     public static int numeroFrecuencia = 42;
     public static int opcion = 0;
   //variables constantes
     public final static double PI = 3,14;


    //Método main para elegir una opción imprimida por pantalla 
    public static void Menu() {
        System.out.println("Elige una opción");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1. Analizar señal recibida del espacio                       ");
        System.out.println("+--------------------------------------------------------- ---+");
        System.out.println("| 2. Ajustar las potencias de sus motores antes del lanzamiento");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 3. Calcular el volumen de un planeta.........................");
        System.out.println("");
    }
    
    //Método para pedir una opcion al usuario y devolver el valor con return
    public static int Opcion() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("entrada de numero entero");
    return entrada.nextInt(); 
    }
    

    //Método para elegir la opción que le pido al usuario
    public static int ElegirOpcion() {
        switch(opcion){
            case 1:
                System.out.println("Analizar");
            case 2:
                System.out.println("Ajustar");
            case 3:
                System.out.println("Calcular");
            default:
                System.out.println("Opcion incorrecta");
        }
    //Método para calcular la frecuencia
    public static void Frecuencia() {
        
        opcion = 0;
        do{
            try{                                   //Utilizamos try y catch para el control de excepciones
                    Menu();
                    Opcion();
                    ElegirOpcion();
                
                 
            
                
            }catch(InputMismatchException e); 
                    System.out.println("error al introducir letra");
                    
                    
            
        
         
             
         }while(!=3)
      
    }
    //Método para ordenar las potencias de menor a mayor
    public static void Orden(){
    
        int numero1 = 20;
        int numero2 = 40;
        int numero3 = 10;
        int aux;
        
        if(numero1<numero2){
        numero1=numero2;
        numero2=numero3;
        numero3=aux;
                  
        }
        if(numero2<numero3){
        numero2=numero1;
        numero3=numero2;
        numero1=aux;
                
        }
        if(numero3<numero1){
        numero3=numero2;
        numero1=numero3;
        numero2=aux;
        }

    }
    //metodo main para calcular el volumen del planeta 
    public static void main(String[] args) {
       
    double volumen; //declaro la variable
    volumen = 4/3 * PI * (Math.PI); //inicializo la variable
        System.out.println("El resultado de calcular el volumen de un planeta es = " + volumen); //imprimo el resultado de calcular el volumen de un planeta
    
    }
    
    }

}
