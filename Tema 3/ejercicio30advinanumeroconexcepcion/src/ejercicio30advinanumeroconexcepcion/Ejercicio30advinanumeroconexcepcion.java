/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30advinanumeroconexcepcion;
import java.util.Scanner; //Importación de la libreria java util Scanner
import java.util.InputMismatchException;//Importacion de la libreria java util InputMismatchException

/**
 *
 * @author Ángel
 * @since 19/10/2025
 */
public class Ejercicio30advinanumeroconexcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main donde empieza ejecución del programa
        Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para que me lea o capture lo que escriba el usuario
        
        int numerosecreto; //declaro la variable numero secreto
        int intentos; //declaro la variable intentos
        int numero; //declaro la variable numero
        
        numerosecreto=23; //inicializo la variable dandoles valor el numero secreto seria el 23
        intentos = 0;     //inicializo la variable dandole valor a los intentos para que me los cuente empezando desde 0
        numero = 0;       //inicializo la varaiable dandole valor desde el que empiezo a introducir numeros
        
         System.out.println("Adivina un numero entre 1 y el 100"); //Imprimo lo que me pide el ejercicio
         
         
        do{ //bucle do while en el se cumple 
            try{
                 System.out.println("Introduce el numero"); //Imprime o muestra un mensaje para que se introduzca el numero
                 numero = entrada.nextInt(); //recojo el valor de la variable que me pide y lo guardo 
                 intentos++;
            } catch (InputMismatchException e ){
                entrada.next(); //Frena el bucle para que la entrada de la letra no lo repita y se limpie 
                System.out.println("Error debes introducir un numero"); // imprime el valor de la entrada del número
                intentos++; //Incrementa el valor a uno los intentos
            }
            
          if(numero < numerosecreto) { //Condicional if si el numero es menor que el numero secreto
                System.out.println("El numero es mayor"); //imprimo que el numero es mayor
            } else if (numero > numerosecreto)  { //Condicional else if si numero es mayor que el numero secreto
                System.out.println("El numero es menor"); //imprimo que el numero sea menor
                
            }
        } while (numero != numerosecreto); //repite el bucle mientras la condicion no sea verdadera es decir no se haya adivinado el numero
        
        System.out.println("Enhorabuena has acertado el numero " + intentos + " intentos "); //Imprime el resultado del bucle en el que felicita al ser encontrado el numero y en que determinados intentos se ha logrado
    }
    
}
