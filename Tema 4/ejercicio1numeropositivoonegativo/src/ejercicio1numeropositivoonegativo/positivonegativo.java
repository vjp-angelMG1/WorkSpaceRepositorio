/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1numeropositivoonegativo;

import java.util.Scanner; //Importamos la clase escaner desde el paquete javautil

public class Positivonegativo {

public static int pedirNum() { //método en el que nombramos con int para pedir numero //EL EJERCICIO SERIA AL REVES EL CONTENIDO DE LOS METODOS
        int numero1; //Declaro la variable int

        if (numero1 > 0) { //condicional si el numero1 que me ha devuelto es mayor que 0 entonces es positivo
            System.out.println("El numero es positivo"); //Imprimo el valor de la variable
        } else if (numero1 < 0) { //condicional si el numero1 que me ha devuelto es menor que 0 entonces es negativo
            System.out.println("El numero es negativo"); //Imprimo el valor de la variable
        } else {//condicional si no se cumplen ninguna de las otras dos condiciones creo esta tercera al ser el resultado 0 
            System.out.println("El numero es 0"); //Imprimo el valor de la variable
        return numero1; // devuelve el valor del numero al ser nombrado por el método main
    }

    /**
     * @param args the command line arguments       
     */
    public static void main(String[]args) { //método main que llama al otro metodo para pedirle el numero
        int numero1 = pedirNum(); //declaro la variable con la llamada al metodo pedirNum numero para que me devuelva el valor 
        Scanner entrada = new Scanner(System.in); // Creo objeto scanner para capturar lo que me pida el usuario
        System.out.println("Por favor introduce un número: "); //Imprimo la entrada del numero 
        numero1 = entrada.nextInt(); //Inicializo la entrada guardando el valor que metera el usuario en numero1 
        
        }

    }

}                
        
        
    
    

