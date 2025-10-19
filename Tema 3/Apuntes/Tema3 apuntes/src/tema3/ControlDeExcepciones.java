/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class ControlDeExcepciones {
    
    public static void main(String[] args) {

    int num1, num2, resultado;
    Scanner entrada = new Scanner(System.in);            
    
    //2. CONTROL DE EXCEPCIONES
    //Controlo la división por 0 con ArithmeticException
    //Y la entrada del tipo de dato adecuado con ImputMismatchExcepcion
    
    try {
        System.out.println("Escribe un números");
        num1 = entrada.nextInt();
        System.out.println("Escribe un números");
        num2 = entrada.nextInt();
        
        resultado = num1 / num2;
        System.out.println(num1 +"/"+num2+"="+resultado);
    } catch(ArithmeticException e){
            System.out.println("No puedes dividir por cero");
            System.out.println(e);
    } catch(InputMismatchException e){
            System.out.println("Has introducido un dato invalido");
    }

    System.out.println("Sigue el programa");
}
}

