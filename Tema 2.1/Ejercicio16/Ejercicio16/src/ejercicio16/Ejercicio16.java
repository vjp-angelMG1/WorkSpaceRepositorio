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
        int cartera;
        int billeteGrande;
        int billetePequeño;
        
        cartera = 130;
        billeteGrande = cartera/50;
        billetePequeño = cartera/10;
        
        System.out.println("130 euros hacen un total de: " + 2 + "*" + billeteGrande + "y" + 3 + "*" + billetePequeño + "=" + cartera );
        
        
    }
    
}
