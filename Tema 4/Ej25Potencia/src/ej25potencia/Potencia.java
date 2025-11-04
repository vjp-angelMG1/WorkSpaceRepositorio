/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej25potencia;

/**
 *
 * @Ángel
 */
public class Potencia {

    public static void main(String[] args) {
        try { //intentamos realizar las potencias utilizando el control de excepciones 
            System.out.println("2^3 = " + Calculopotencia.calcularPotencia(2, 3)); //imprimo el resultado de calcular la potencia de los numeros
            System.out.println("0^5 = " + Calculopotencia.calcularPotencia(0, 5));
            System.out.println("0^-2 = " + Calculopotencia.calcularPotencia(0, -2));
        } catch (ArithmeticException e) { //realizo la captura el control de excepciones en caso que alla algun 0 y no se pueda realizar para que me muestre el mensaje
            System.out.println(e.getMessage()); //imprimo el valor del metodo con el que llamo a la excepcion en la otra clase
        }
    }
    
}
