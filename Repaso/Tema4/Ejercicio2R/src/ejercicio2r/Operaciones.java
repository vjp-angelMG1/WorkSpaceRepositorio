/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2r;
// * Ejercicio 03.- Diseña un programa en JAVA que lea tres números en
//el main y se los pase a un método que imprimirá por pantalla el
//mayor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE
//DISTINTA DE OTRO PAQUETE.
//• Muestra por pantalla el resultado de la siguiente forma:
//Por favor, introduzca el primer numero: xxx
//Ahora, introduzca un segundo numero: xxx
//Por último, introduzca un tercer numero: xxx
//El número mayor de los introducidos es el xxx
// 
// 
/**
 *
 * @author Ángel
 */
public class Operaciones {
    public static void multiplicacion(int numero1,int numero2){ //creo el metodo suma con los parametros 
        int resultado1; //declaro variable
        resultado1 = numero1*numero2; //realizo operación 
        System.out.println("La operación que se realizo es producto el resultado es "+resultado1); //imprimo por pantalla
    }
    
    public static void suma(int numero2, int numero3){ //creo el metodo suma con los parametros
        int resultado2; //declaro variable
        resultado2=numero2+numero3; //realizo operación
        System.out.println("La operacion que se realizo es suma el resultado es "+resultado2); //imprimo por pantalla
    }
}
