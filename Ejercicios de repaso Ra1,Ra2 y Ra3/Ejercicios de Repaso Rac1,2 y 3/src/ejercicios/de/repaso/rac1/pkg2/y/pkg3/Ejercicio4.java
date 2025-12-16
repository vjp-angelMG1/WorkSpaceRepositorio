/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.repaso.rac1.pkg2.y.pkg3;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {
    public static void main (String[]args){
        int numero1; //Declaro la variables
        int numero2;
        int resultado;
        numero1 = 2; //inicializo las variables
        numero2 = 7;
        resultado = numero1+numero2;
        System.out.println("La suma de los numeros es:" + resultado);
    }
    
    public static int Suma(int numero1, int numero2){//método que recibe dos número por parametros 
    
    int resultado = numero1 + numero2; //Declaro la variable resultado con la suma de los números
    return resultado; //devuelvo el resultado con la suma al método main
    
    }
}
