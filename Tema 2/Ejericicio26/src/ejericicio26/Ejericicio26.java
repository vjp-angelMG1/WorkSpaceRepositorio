/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio26;

import java.util.Scanner; // importación de libreria java util desde la carpeta Scanner
/**
 *
 * @author Ángel //Etiqueta de nombre
 * @since 06/10/2025 //Etiqueta de fecha
 */
public class Ejericicio26 {
    
    
    public static void main(String[] args) { //método main 
        Scanner entrada =new Scanner(System.in); //Creación del objeto entrada para que se pueda leer los valores que les da el usuario
        
        int numero; //variable declarada 
        int numero1,numero2,numero3,numero4; //variable declarada de los diferentes numeros
        
        

    System.out.print("Introduce un número de 4 cifras (XYZW): "); //Impresión de las cifras dadas por el usuario
     
     numero = entrada.nextInt();  // Capturamos la entrada del usuario
     
     numero1= numero/1000; //Dandole valor al numero uno que es igual a dividirlo por 1000 ya que es un numero de cuatro cifras y lo queremos separar por orden y obtener en este caso en miles
     numero2= (numero/100)%10;//Dandole valor al segundo numero lo calculamos dividiendolo entre 100 y con el modulo es decir el reto de 10 calculamos las centenas
     numero3= (numero/10)%10;//Dandole valor al tercer numero lo calculamos diviendolo entre 10 y con el modulo es decir el resto de 10 calculamos las decenas
     numero4= numero % 10;//Dandole valor al cuarto numero lo calculamos con el modulo de 10 sobre el numero es decir el resto que nos da las unidades
     
     
    
    
        System.out.println("La descomposicion del numero es:");// Impresión de la descomposición del numero
        System.out.println("numero1 : " +numero1);// Impresión de la primer número
        System.out.println("numero2 : " +numero2);// Impresión del segundo número
        System.out.println("numero3 : " +numero3);// Impresion del tercer número 
        System.out.println("numero4 : " +numero4);// Impresion del cuarto número
    
         // finalmente se comprueda si la compilación es correcta ejecutandola y compilandola el boton Run Project
    }
    
}
