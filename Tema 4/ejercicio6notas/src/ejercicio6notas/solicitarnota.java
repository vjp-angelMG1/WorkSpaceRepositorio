/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6notas;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class solicitarnota {
    
    
    
    
    public static int solicitarNota(int nota) {
        
        Scanner entrada = new Scanner(System.in); //creo un objeto llamado entrada para capturar lo que escriba el usuario por el teclado
        System.out.println("Escribe tu nota entre 0 y 10"); //Impresion de la condicional principal esta ENTRE 0 y 10
        nota=entrada.nextInt(); //Recoje el numero de la variable
       
            
        switch (nota){ //Condicional que busca a que variable darle valor en caso de que ponga el usuario por ejemplo caso 0 valor 0 
            case 0: //valor de 0
            case 1: //valor de 1
            case 2: //valor de 2
            case 3: //valor de 3
            case 4: //valor de 4
                System.out.println("tu nota es suspenso"); //Impresion de la nota segun el case
                break; // Es para terminar la ejecución del ciclo y continuar con las siguientes instruciones en este caso case 5 y 6 dentro de la misma condicional switch
            case 5: //valor de 5
            case 6: //valor de 6
                System.out.println("tu nota es bien"); //Impresion de la nota segun el case 
                break; //es para terminar la ejecución del ciclo y continuar con las siguientes instruciones en este caso de case 7 y 8 dentro de la misma condicional switch
            case 7: //valor de 7
            case 8: //valor de 8
                System.out.println("tu nota es notable"); //Impresion de la nota segun el case
                break; //es para terminar la ejecución del ciclo y continuar con las siguientes instrucciones en este caso de case 9 y 10 dentro de la misma condicional switch
            case 9: //valor de 9
            case 10: //valor de 10
                System.out.println("tu nota es sobresaliente"); //Impresión de la nota segun el case         
                break; //es para terminar la ejecución del ciclo y continuar con las siguientes instrucciones en este caso defsult al encontrarse la nota fuera de rango entre el 0 y el 10
            default: //Condicion invalida al estar fuera del rango que pide el ejercicio
                System.out.println("Este numero es invalido"); //Impresión al estar fuera de rango la nota la da un valor inválido
        }
        return nota;
    }
}
    

