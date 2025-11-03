/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Utilidades {
         // Método que pide un número al usuario
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        return entrada.nextInt();
    }
    public static char letraAleatoria() {
    int codigoAscii = (int) (Math.random()* (122 - 97 + 1)) + 97; //declaramos variable ASCII igualandolo a int que al estar en parentesis convierte el numero decimal en entero nombramos la clase math random para el valor aleatorio y lo multiplicamos por 122 y 97 porque son los codigos ASCII que representan la a y la z del 97 al 122 y le sumamos el numero para tener todas las letras del abecedario
    return (char) codigoAscii; //devolvemos el valor con la letra aleatoria del codigAscii
    }
    
}
