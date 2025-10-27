/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09numeromenor;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class impresora {
    
    public static int pedirNumero(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Por favor introduce el numero");
    int numero= entrada.nextInt();
    
           return numero; //devuelve el valor al numero al ser nombrado por el metodo main
    }
}
