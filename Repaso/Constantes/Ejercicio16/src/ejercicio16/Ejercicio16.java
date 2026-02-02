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
        int billetera = 130;
        int billetesDe50 = 130/50;
        int resto = 130%50;
        int billetesDe10 = resto/10;
        System.out.println("130 euros hacen un total de: " +billetesDe50+ " billetes de 50 euros y "+billetesDe10+ " billetes de 10 euros");
    }
    
}
