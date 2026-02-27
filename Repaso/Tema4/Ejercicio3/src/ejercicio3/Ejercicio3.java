/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import ejercicio3.newpackage.NumeroMayor; //importo el nuevo paquete del proyecto donde esta la clase mayorQ
import java.util.Scanner;
/**
 *• Ejercicio 03.- Diseña un programa en JAVA que lea tres números en
el main y se los pase a un método que imprimirá por pantalla el
mayor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE
DISTINTA DE OTRO PAQUETE.
• Muestra por pantalla el resultado de la siguiente forma:
Por favor, introduzca el primer numero: xxx
Ahora, introduzca un segundo numero: xxx
Por último, introduzca un tercer numero: xxx
El número mayor de los introducidos es el xxx
 * @author Ángel
 */
public class Ejercicio3 {


    public static void main(String[] args) { //creo método principal main
        
        int numero; //declaro las variables
        int numero2;
        int numero3; 
        Scanner entrada = new Scanner(System.in); //creo la clase escanner
        System.out.println("Porfavor introduzca el primer numero"); //imprimo por pantalla el primer numero que le pido al usuario
        numero=entrada.nextInt(); //guardo en la variable numero
        System.out.println("Porfavor introduzca el segundo numero"); //imprimo por pantalla el segundo numero
        numero2=entrada.nextInt(); //guardo en la variable numero
        System.out.println("Porfavor introduzca el segundo numero"); //imprimo por pantalla el tercer numero
        numero3=entrada.nextInt(); //guardo en la variable numero
        
        
        NumeroMayor.mayorK(numero,numero2,numero3); //llamo a la clase y al metodo con los parametros del metodo main para que me haga una copia de los parametros del metodo y de esta manera obtener los resultados de la operación
        
     
    }
    
}
