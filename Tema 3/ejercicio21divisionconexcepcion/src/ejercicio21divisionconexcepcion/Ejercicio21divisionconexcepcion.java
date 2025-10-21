/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21divisionconexcepcion;
import java.util.Scanner; //Importación de la libreria java util desde scanner
/**
 *
 * @author Ángel
 * @since 19/10/2025
 */
public class Ejercicio21divisionconexcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main
       Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para capturar lo que escriba el usuario
       
       int dividendo; //Declaro las variables 
       int divisor;   
       int resultado;
       
        System.out.println("Introdución del dividendo"); //imprimo el valor de la variable que recojo
        dividendo = entrada.nextInt(); //recojo el valor de la variable que me pide 
        
        System.out.println("Introdución del divisor"); //imprimo el valor de la variable que recojo 
        divisor = entrada.nextInt(); //recojo el valor de la variable que me pide
        
        try { //intenta realizar el bloque en el que puede haber una excepción si no la hay lo realiza de manera normal control de excepcion
            resultado=dividendo/divisor;//inicializo la operación resultado
            System.out.println("El resultado de la división es : " +resultado);//imprimo el resultado de la division si es correcta
        }catch (ArithmeticException e){ //Atrapa la excepcion en caso de que el resultado del divisor sea erroneo es decir 0 ya que no se puede dividir entre el
            System.out.println("Error no se puede divir entre 0"); //imprimo el error si se produce al dividir entre 0
        }
        
    }
    
}
