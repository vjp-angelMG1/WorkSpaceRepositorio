/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner; //importo de la clase java el paquete util Scanner

/**
 *
 * @author Ángel
 */
public class Ejercicio9 {


    public static void main(String[] args) {
        double numero1; //Declaro las variables
        double numero2;
        double numero3;
        double numero4;
        double aux;
        
        Scanner entrada = new Scanner(System.in); //creo el escaner
        
        System.out.println("Introduce el primer numero"); //imprimo por pantalla para pedirle los numeros al usuario
        numero1 = entrada.nextInt(); //recojo el numero introducido por pantalla
        System.out.println("Introduce el segundo numero");//imprimo por pantalla para pedirle los numeros al usuario
        numero2 = entrada.nextInt(); //recojo el numero introducido por pantalla
        System.out.println("Introduce el tercer numero");//imprimo por pantalla para pedirle los numeros al usuario
        numero3 = entrada.nextInt();//recojo el numero introducido por pantalla
        System.out.println("Introduce el cuarto numero");//imprimo por pantalla para pedirle los numeros al usuario
        numero4 = entrada.nextInt();//recojo el numero introducido por pantalla
       //primera pasada formada con 3 condicionales if para ordenar los numeros de uno a uno haber cual es mayor por el método burbuja
       if (numero1>numero2){ 
           aux = numero1;
           numero1 = numero2;
           numero2 = aux;
       }
       if (numero2>numero3){
           aux = numero2;
           numero2 = numero3;
           numero3 = aux;    
       }
       if(numero3>numero4){
           aux = numero3;
           numero3 = numero4;
           numero4 = aux;
       }
       //segunda pasada formada por tres condicionales if para ordenar los numeros de uno a uno haber cual es mayor por el método burbuja
       if (numero1>numero2){
           aux = numero1;
           numero1 = numero2;
           numero2 = aux;
       }
       if (numero2>numero3){
           aux = numero2;
           numero2 = numero3;
           numero3 = aux;    
       }
       if(numero3>numero4){
           aux = numero3;
           numero3 = numero4;
           numero4 = aux;
       }
       //tercera pasada formada por tres condicionales if para ordenar los numeros de uno a uno haber cual es mayor por el método burbuja
              if (numero1>numero2){
           aux = numero1;
           numero1 = numero2;
           numero2 = aux;
       }
       if (numero2>numero3){
           aux = numero2;
           numero2 = numero3;
           numero3 = aux;    
       }
       if(numero3>numero4){
           aux = numero3;
           numero3 = numero4;
           numero4 = aux;
       }
        System.out.println("El orden de los numeros introducidos es :"+numero1+"-"+numero2+"-"+numero3+"-"+numero4+""); //imprimo por pantalla el orden de los numeros introducidos
    }
}
