/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09numeromenor;

/**
 *
 * @author alumno
 */
public class Ejercicio09numeromenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int numero1; 
      int numero2; 
      int numero3;
      
      numero1 = impresora.pedirNumero(); //pedir numeros
      numero2 = impresora.pedirNumero(); //pedir numeros
      numero3 = impresora.pedirNumero(); //pedir numeros 
      
      operacion.comparacionNumero(numero1, numero2, numero3);
    }
    
}
