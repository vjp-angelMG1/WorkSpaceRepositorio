/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;
//• Ejercicio 31.- Desarrolla un programa que genere números
//enteros aleatorios entre 1 y 100 hasta obtener 3 números
//impares.
//• Al final del programa nos mostrará los tres números
//impares generados y la cantidad de valores aleatorios que
//han sido necesarios generar hasta obtener los 3 números
//impares.
/**
 *
 * @author Angel
 */
public class Ejercicio31 {


    public static void main(String[] args) {
        int numeroAleatorio; //declaro variables
        double aleatorio;
        int contadorImpar = 0; //inicializo variables
        int contadorTotal = 0;
       
        while(contadorImpar <3){
            aleatorio = Math.floor((Math.random()*101)+ 1); //guardo en la variable aleatorio un numero entre 1 y 100 en el que utilizo la clase mathRandom para redondear y mathfloor para truncar quitando los decimales 
            numeroAleatorio = (int)aleatorio; //realizo conversion explicita de variable de tipo double a int //puedo hacerlo resumiendo estas dos lineas en una con int aleatorio = (int)(Math.random()*101+1);
            if(numeroAleatorio%2==1){ //condicional si el numero es impar
                System.out.println("Impar: "+numeroAleatorio); //imprimo los 3 numeros aleatorios
                contadorImpar++; //contador de los numeros impares para parar el bucle
            }
            contadorTotal++; //contador del numero de intentos
        }
        System.out.println("Numero de intentos realizados: "+contadorTotal); //imprimo el numero de impares sumados
    }
    
}
