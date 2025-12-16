/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.repaso.rac1.pkg2.y.pkg3;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {
    public static void main (String[] args){
        int numero; //declaro las variables
        numero = 12; //inicializo las variables
        boolean esMultiplo = esMultiploDeCinco(numero);//Llama al método
        
        System.out.println("Resultado: " +esMultiplo);
    }
    public static boolean esMultiploDeCinco(int numero){ //Método que devuelve si se cumple que el número es múltiplo de 5 
        if (numero % 5 == 0){
            System.out.println("el numero es multiplo de 5");
            return true;
        }else {
            System.out.println("el numero no es multiplo de 5");
            return false;
        }
        
    }    
}
