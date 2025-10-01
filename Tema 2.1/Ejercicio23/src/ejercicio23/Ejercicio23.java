/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

        // Pedir el precio del producto
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        double precioUnidad = entrada.nextDouble();

        // Pedir cuántas unidades quiere comprar
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        int cantidad = entrada.nextInt();

        // Calcular el total
        double totalCompra = precioUnidad * cantidad;

        // Mostrar el resultado
        System.out.println("El precio total de tu compra es "+totalCompra);
        
    }
    
}
