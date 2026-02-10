/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Ángel 
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //creo método maín
        int numero; //Declaro variable
        int resultado;
        for(numero=1;numero<=10;numero++){ //Utilizo bucle for ya que se conozco las veces que quiero que se repita el número
            resultado =8*numero;
            System.out.println("la tabla del 8 es : "+"8 x "+numero+"="+resultado); //Imprimo por pantalla contatenando el valor del numero incrementado y el resultado
        }
    }
    
}
