/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18contraseña;
import java.util.Scanner; // importación de la libreria java util desde scanner
/**
 *
 * @author Ángel Etiqueta nombre 
 * @since 19/10/2025 Etiqueta fecha
 */
public class Ejercicio18contraseña {

    /**
     * @param args the command line arguments
     */
    final static int clave = 1234; //Variable constante su valor no se modifica
    
    public static void main(String[] args) { //método main
        
        Scanner Entrada= new Scanner(System.in); //Creo un objeto llamado entrada para capturar lo que escriba el usuario
        
        int usuario; //Declaro variables
        int intentos;//Declaro variables
        int maximointentos;//Declaro variables
        
        
        intentos = 0; //Inicializo variables dándoles valor
        maximointentos = 3;
        do{ //Comienzo el bucle 
            System.out.println("Introduce la contraseña: "); //Imprimo lo que me pide el ejercicio
            usuario = Entrada.nextInt(); // Recojo el numero de la variable
            intentos++; //incremento en 1 cada vuelta que da el bucle para contarlo

            if (usuario==clave){ //Condicional que compara el usuario y la clave para comprobar que se cumple esta primera condicion
               System.out.println("!Contraseña correcta¡"); //Impresión de que se cumple esta primera condición
            } else { //Condicional que se ejecuta al no cumplirse la anterior condicion. cumpliendose esta
              System.out.println("Contraseña incorrecta error de acceso");  //Impresión de que se cumple esta segunda condición
            }
        
        }while(usuario!=clave && intentos<maximointentos);//Mientras que usuario sea distinto que clave y que se cumpla que los intentos son menores que el maximo de intentos se realizara el bucle cuando no se cumplan el bucle no seguira produciendose
    }
    
}
