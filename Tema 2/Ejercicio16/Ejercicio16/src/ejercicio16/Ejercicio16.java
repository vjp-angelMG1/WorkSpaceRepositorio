/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author USUARIO
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cartera = 130;
        int billete50 = 50;
        int billete10 = 10;
        
        int num50 = cartera/ billete50 ;
        int resto = cartera % billete50;
        int num10 = resto/10;
        
        System.out.println("130 euros hacen un total de: " + num50 + " Billetes de 50 euros y " + num10 + " billetes de 10 euros" );
        
        
    }
    
}
