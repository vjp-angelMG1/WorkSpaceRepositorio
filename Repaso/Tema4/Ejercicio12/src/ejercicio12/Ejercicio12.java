/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.InputMismatchException;
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


    public static void main(String[] args) { //creo método main ejecutable
        int contraseñaCorrecta; //declaro la variable
        contraseñaCorrecta =2345; //inicializo la variable con el numero correcto de la contraseña
        resultado(contraseñaCorrecta); //llamo al metodo para 
    }
    
    public static int peticionContraseña(){ //Método para pedir al usuario un número de 4 cifras y lo devuelve 
        
        int num = 0; //declaro la variable y la inicializo a -1 
        Scanner entrada = new Scanner (System.in); //creo objeto escanner
        try{ //captura las excepciones
        System.out.println("Por favor introduce un numero de cuatro cifras "); //imprimo por pantalla
        num = entrada.nextInt(); //guardo la variable con el numero introducido por el usuario
        
        }catch(InputMismatchException e){ //en caso de la excepción que se captura es una letra salta e imprime el mensaje
            System.out.println("Error has introducido una letra");
            entrada.nextLine();//limpiar buffer
        }
        return num ; //devuelvo el numero
    }
    public static boolean comprobacionContraseña(int contraseña, int verdadera){ //metodo booleano que compara boolean con la contraseña correcta
        return contraseña == verdadera; //para enteros (simple y eficiente)
    }
    public static void resultado(int contraseñaCorrecta){ //Método principal que controla como maximo tres intentos con parámetros
        int intentos;   //declaro variable 
        boolean acierto;
        intentos = 3; //inicializo la variable en 3 ya que son 3 intentos (*se podria hacer con bucle for)
        acierto = false; //inicializo variable guardo false en acierto
        
        while(intentos > 0 && !acierto){ //bucle mientras intentos sea menor que 0 y verdadero (distinto de falso)
            int numIntroducido = peticionContraseña(); //guardo en la variable numIntroducido el numero que le pido al usuario en el otro metodo
            acierto = comprobacionContraseña(numIntroducido,contraseñaCorrecta); //guardo en la variable actualizando el resultado si es verdadero, llamando al metodo me compare la contraseña introducida por el usuario a la otra que es correcta
            
            if(acierto){ //condicional si se cumple la condicion
                System.out.println("Has acertado el resultado es correcto"); //imprimo por pantalla que es verdadero
            } else { //si no se cumple la condicional
                intentos--; //voy restandole intentos
                if (intentos > 0){ //condicional si los intentos es menor que 0
                    System.out.println("Contraseña incorrecta tienes "+intentos+ "intentos"); //imprimo por pantalla los intentos restantes
                }
            }
            
        }
        
        if (!acierto){ //condicional si es distinto al acierto
            System.out.println("Error de acceso has completado el numero de intentos"); //imprimo por pantalla el error al completar el numero de acceso
        }
       
    }
    
}
