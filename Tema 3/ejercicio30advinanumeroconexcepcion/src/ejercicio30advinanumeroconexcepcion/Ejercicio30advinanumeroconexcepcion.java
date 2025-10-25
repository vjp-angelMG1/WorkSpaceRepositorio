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
        
        int numero = (int) (Math.random()*100+1); //Declaro una variable i para hacer de contador en el metodo Match.radom que devuelve un numero aleatorio multiplicado por 100 y +1 para que el resultado de decimal
        int intento = 200; //Declaro variable con 200 posibilidades de intentos del numero que introduce el usuario
        int intentos=0;    //Declaro variable para que empiece a contar los intentos desde 0
          
         
        do{ //bucle do while en el se cumple 
            try{
                 System.out.println("Adivina un numero entre 1 y el 100"); //Imprimo lo que me pide el ejercicio

                 System.out.println("Introduce el numero"); //Imprime o muestra un mensaje para que se introduzca el numero
                 
                 intento = entrada.nextInt(); //recojo el valor de la variable que me pide y lo guardo 
                
                if (intento!=numero){ //Si no acierto el numero le aviso diciendole los intentos que le quedan
                    System.out.println("No has acertado");//imprimo el la primera condicional
                } if (intento<numero){ //Condicional si es mayor que el numero introducido por el usuario 
                    System.out.println(" El número es mayor que " +intento); //imprimo el de la condicional si es mayor que el numero
                
                } else { //condicional que si no es mayor entonces es mayor 
                    System.out.println(" El número es menor que " +intento);//Imprimo si se da la condicional else
                }
                } catch (InputMismatchException e){ //Excepcion en caso de que se introduzca una letra en vez de un numero
                System.out.println("Error debes introducir un numero"); // imprime el valor de la entrada del número
                System.out.println(e);
                entrada.nextLine(); //Frena el bucle para que la entrada de la letra no lo repita y se limpie 
                }
             intentos++; //incremento de los intentos que se han ido realizando
        } while (intento != numero); //repite el bucle mientras la condicion no sea verdadera es decir no se haya adivinado el numero
        if (intento==numero){ //Condicional que se cumple si el numero se acierta
           System.out.println("Enhorabuena has acertado el numero " + intentos + " intentos "); //Imprime el resultado del bucle en el que felicita al ser encontrado el numero y en que determinados intentos se ha logrado
        }
        
    }
    
}
