/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22; //calcular el area de un triangulo y el perimetro e imprimirlo por separado

import java.util.Scanner; // importación de la clase Scanner del paquete javautil para poder leer los datos de entrada//

/**
 *
 * @author Ángel           //   Comentario javadoc Para poner el autor que lo crea
 * @since 2025             //   Comentario javadoc Para poner la fecha en la que se creo
 */
public class Ejercicio22 {
    
    final static float Raicescuadradasde3=1.73205080757f; //Constante al ser siempre el mismo resultado al tener decimales se usa el float

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método principal 
        System.out.println("introduce la medida de un lado de un triangulo equilatero"); //Impresión de texto con lo que pide parte del ejercicio
        
        Scanner entrada = new Scanner(System.in); //Crea un objeto para darle entrada al usuario
        
        int lado = entrada.nextInt(); // variable en este caso lee un numero entero al ser int y lo guarda en la variable lado que nosotros le demos cuando se compile
        
        float area = lado * lado * Raicescuadradasde3 / 4; //variable del calculo del area lado al cuadrado 
        
        int perimetro = 3 * lado; //variable del calculo del perimetro //variable con correspondiente valor que es igual al perimetro
        
        System.out.println("El area de un triangulo de lado: " + lado + " es " + area + "centimetros cuadrados "); //impresion de los valores del area calculada para que salga a la hora de compilarlo y ejecutarlo
        System.out.println("El perimetro de un triangulo de lado: " + lado + " es: " + perimetro + "centimetros.");//impresión de los valores del perimetro de un triangulo de lado
       
        // TODO code application logic here
    }
    
}
