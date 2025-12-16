/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.repaso.rac1.pkg2.y.pkg3;


import java.util.Scanner; //importamos la clase escaner desde el paquete javautil

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero = pedirNumero(); //Declaro variable y pido el número al usuario
        mostrarNumero(numero); //Mostramos el número
    }
    
    //Método que pide un numero y lo devuelve (int)
    public static int pedirNumero(){
        Scanner escaner = new Scanner(System.in); //Creo el escaner
        System.out.println("Introduce un número"); //Imprimir por pantalla la solicitud del número
        
        int numero = escaner.nextInt(); //metiendo el valor del escaner en la variable número
        return numero; //devolver el valor de numero
        
    }   

    //Método que muestra el número recibido
    public static void mostrarNumero(int numero){
        System.out.println("el número introducido es: " + numero); //imprimir por pantalla el mensaje y el numero escrito
    }


}
    

