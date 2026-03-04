/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *• Ejercicio 12.- Realiza un programa que le pida una
contraseña al usuario. Si la escribe bien le dará la
enhorabuena, pero si la escribe mal 3 veces le dará un
mensaje de error de acceso.
• La petición de contraseña la haremos en un método, la
comprobación de la contraseña la haremos en otro
método de tipo booleano, y el resultado de la
comprobación la haremos desde otro método.
 *
 * @author Ángel
 */
public class Ejercicio12 {


    public static void main(String[] args) {
        int contraseñaCorrecta =2345;
        resultado(contraseñaCorrecta);
    }
    
    public static int peticionContraseña(){
        
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor introduce un numero de cuatro cifras ");
        num = entrada.nextInt();
        return num;

   
    }
    public static boolean comprobacionContraseña(int contraseña, int verdadera){
        return contraseña == verdadera;
    }
    public static int resultado(int contraseñaCorrecta){
        int intentos = 3;
        boolean acierto = false;
        
        while(intentos > 0 && !acierto){
            int numIntroducido = peticionContraseña();
            acierto = comprobacionContraseña(numIntroducido,contraseñaCorrecta);
            
            if(acierto){
                System.out.println("Has acertado el resultado es correcto"); 
            } else {
                intentos--;
                if (intentos > 0){
                    System.out.println("Contraseña incorrecta tienes "+intentos+ "intentos");
                }
            }
            
        }
        
        if (!acierto){
            System.out.println("Error de acceso has completado el numero de intentos");
        }
    }
    
}
