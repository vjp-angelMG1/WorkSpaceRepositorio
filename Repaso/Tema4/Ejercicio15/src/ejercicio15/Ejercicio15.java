/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

//• Ejercicio 15.- Diseña un programa en JAVA que pida al usuario dos números por teclado.

import java.util.Scanner;

//Posteriormente el programa mostrará un menú que le permitirá al usuario:
//• 1.- Sumar los números.
//• 2.- Restar los números.
//• 3.- Multiplicar los números.
//• 4.- Dividir los números.
//• 5.- Salir del programa.
//• Nota 1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a aparecer
//pidiendo nuevamente que le introduzcas una opción.
//• Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
//• Nota 3:Utiliza todos los subprogramas que se te ocurran.

// * @author Angel


public class Ejercicio15 {


    public static void main(String[] args) {
        double numero1;//Declaro la variable 
        double numero2;
        int opcion;
        Scanner scanner = new Scanner(System.in); //creo objeto scanner
        
        // Pedir los dos números una sola vez al inicio
        System.out.print("Introduce el primer número: "); //imprimo por pantalla el primer numero que le pido al usuario
        numero1 = scanner.nextDouble(); //guardo en la variable numero1
        System.out.print("Introduce el segundo número: "); //imprimo por pantalla el segundo numero que le pido al usuario
        numero2 = scanner.nextDouble(); //guardo en la variable numero2
        

        do { //creo metodo do while para hacer un menú dentro
            mostrarMenu(); //llamo al metodo menu para imprimir las opciones del método
            System.out.print("Seleccione una opcion: "); //imprimo por pantalla una opcion
            opcion = scanner.nextInt(); //guardo la variable con el numero que le pido al usuario
            
            switch (opcion) { //creo condicional swtich para elegir una opcion
                case 1: //caso 1
                    System.out.println("Suma: " + suma(numero1, numero2)); //imprimo por pantalla y lo contateno llamando al metodo sumar para que me realize la operación
                    break; //en caso de eleguir esta opcion la paro con break para que no salte a otro y asi con cada opción.
                case 2: //caso 2
                    System.out.println("Resta: " + resta(numero1, numero2)); //imprimo y contanteno la llamada al método resta para hacer la operacion
                    break;
                case 3: //caso 3
                    System.out.println("Multiplicación: " + multiplicacion(numero1, numero2)); //imprimo por pantalla y concateno la llamada al metodo para múltiplicar
                    break;
                case 4:
                    try { //utilizo control de excepciones capturo el valor
                        double resultado; //declaro variable 
                        resultado = division(numero1, numero2); //guardo en la variable el resultado de llamar al metodo divir que realiza la operacion en caso de que el divisor sea 0 pasa al catch
                        System.out.println("División: " + resultado); //imprimo por pantalla el resultado de la division
                    } catch (ArithmeticException e) { //en el control de excepcion en caso de introducir un cero en el divisor
                        System.out.println("Error: No se puede dividir por cero."); //imprimo por pantalla el resultado
                    } 
                    break;
                case 5: //caso 5 
                    System.out.println("Salir del programa"); //imprimo por pantalla el caso que es salir
                    System.out.println("Saliendo del programa...");
                    break;
                default: //por defecto 
                    System.out.println("Opción no válida. Intenta de nuevo."); //imprimo error si en la opcion introducida esta fuera del rango de los casos que existen
            }
        } while (opcion != 5); //mientras la opcion sea distinta de 5 el bucle se sigue repitiendo
        
    }
    

    public static void mostrarMenu() { //metodo para mostrar menu
        System.out.println("MENU DE OPERACIONES"); //Imprimo por pantalla el menú
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Salir");
    }
    
    // Subprogramas para cada operación
    public static double suma(double num1, double num2) { //creo método estatico con parametros
        return num1 + num2; //devolver la suma de los dos parametros
    }
    
    public static double resta(double num1, double num2) { //creo metodo estatico con parametros
        return num1 - num2; //devuelvo la resta de los dos parametros
    }
    
    public static double multiplicacion(double num1, double num2) { //creo metodo estatico con parametros
        return num1 * num2; //devuelvo la multiplicacion de dos parametros
    }
    
    public static double division(double num1, double num2) { //creo metodo estatico con parametros
        if (num2 == 0) { //condicional si el num2 es decir el dividendo es igual a 0
            System.out.println("Error: No se puede divir por cero"); //imprimo el error al divir por cero
            return 0.0; //*devuelvo valor cero cero para evitar division y que me salga infinity 
        }
        return num1 / num2; //devuelve la division de dos parámetros
    }
}
    


