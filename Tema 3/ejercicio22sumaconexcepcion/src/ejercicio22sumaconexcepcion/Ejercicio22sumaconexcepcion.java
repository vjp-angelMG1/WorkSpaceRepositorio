/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22sumaconexcepcion;
import java.util.Scanner; //importación de la libreria java util desde Scanner
import java.util.InputMismatchException; //importacion de la libreria java util desde InputMismatchExcepction
/**
 *
 * @author USUARIO
 */
public class Ejercicio22sumaconexcepcion {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) { //Método main
        Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para capturar lo que escriba el usuario
        int numero1; //Declaro las variables
        int numero2;
        int resultado;
        try{ //control de excepcion que intenta realizar la operación de manera correcta y si no puede se pasa al catch
            System.out.println("escribe un numero");//Imprimo el primer numero que me pide
            numero1=entrada.nextInt(); //Inicializo la entrada recojiendo el valor de la variable numero1
            System.out.println("escribe otro numero"); //Imprimo el segundo numero que me pide
            numero2=entrada.nextInt(); //Inicializo la entrada recojiendo el valor de la variable numero2
            System.out.println("resultado es igual : " +(numero1+numero2)); //imprimo y realizo la operacion dentro del sout entre parentesis siempre las operaciones
        } catch (InputMismatchException e){ //Continuo dentro del control de excepcion al darse entrada de una de las dos variables con una letra o texto cuando me pedian numero es decir de manero incorrecta
            System.out.println("Has introducido un valor inválido"); //Imprimo el error producido al introducir letra o texto en una de las entradas de las variables mostrandome la excepción
        }   
    }
    
}
