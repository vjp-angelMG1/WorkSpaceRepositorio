/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *• Ejercicio 09.- Realiza un programa en JAVA que lea un
archivo creado en el bloc de notas llamado frase.txt que
contiene una línea de texto. Luego, el programa creará
un archivo llamado fraseinvertida.txt que contendrá el
texto invertido del archivo frase.txt.
• Ejemplo: Si frase.txt contiene Hola, que tal
fraseinvertida.txt contendrá lat euq ,aloH

 * @author Angel
 */
public class Ejercicio9 {
        public static String BLOGDENOTAS = "frase.txt";
    public static void leerFichero(BufferedReader br)throws IOException{
        String linea;
        linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        
    }
    public static void main(String[] args) {
        
    }
    
}
