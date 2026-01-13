/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = -1; //Declaro e inicializo la variable con menos uno ya que es un valor que no se va a dar 

        int [] ventasDeCoches = new int [12]; //Declaro e inicializo el array
        Scanner entrada = new Scanner (System.in); //Escaneo un numero al usuario para el menú
        
                RellenarUnArray(); //Llamo al metodo para que me de el resultado
                
                
        do{ //Creo bucle do while para hacer menú con sus opciones
            System.out.println("Menú");
            System.out.println(" 1. Rellenar un Array ");
            System.out.println(" 2. Mostrar las ventas ");
            System.out.println(" 3. Mostrar las ventas al reves");
            System.out.println(" 4. Suma total de las ventas del año");
            System.out.println(" 5. Ventas totales de los meses pares");
            System.out.println(" 6. Mes con mas ventas");
            System.out.println(" 7. Salir del programa");
            try { //Creo el control de excepciones en caso de que no sea un número entero 
                num = entrada.nextInt(); //Entrada del número que le voy pedir al usuario
                switch(num){ //Condicional para eleguir el numero
                    case 1: //Caso del swtich 
                            System.out.println("Rellenar un Array"); //Imprimo el resultado del primer caso
                        break; //En caso de ser la opcion correcta irrumpe con los demas casos
                    case 2 :
                            System.out.println("Mostrar las ventas");
                        break;
                    case 3 :
                            System.out.println("Mostrar las ventas al reves");
                        break;
                    case 4 :
                            System.out.println("Suma total de las ventas del año");
                        break;
                    case 5 :
                            System.out.println("Ventas totales de los meses pares"); 
                        break;
                    case 6 :
                            System.out.println("Mes con mas ventas");
                        break;
                    case 7 :
                            System.out.println("Salir del programa");
                        break;
                    default: //en caso de eleguir una opción diferente a las demas
                        System.out.println("Opción no válida"); //Imprimo la eleccion
                }
            }catch(InputMismatchException e) { //control de excepciones en caso de no introducir un número entero
                System.out.println("Error introduce número entero"); //Imprimo la excepcion 
                entrada.next(); //Obligatorio limpiar el buffer para que no se me creen bucles
            }  
        }while(num !=7); //Bucle junto con Mientras sea distinto de 7
        
   
        
    } 
    
    public static void RellenarUnArray(){

    }

}