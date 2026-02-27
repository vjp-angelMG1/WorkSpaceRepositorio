/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;
import java.util.InputMismatchException;

/**Ejercicio 27.- Diseña un programa en JAVA que pida al usuario dos números por teclado. Posteriormente el programa mostrará un menú que le permitirá al usuario:
• 1.- Sumar los números.
• 2.- Restar los números.
• 3.- Multiplicar los números.
• 4.- Dividir los números.
• 5.- Salir del programa.
• Nota1: Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
aparecer pidiendo nuevamente que le introduzcas una opción.
• Nota 2: Controla el caso de división entre 0 mediante la captura de excepciones.
 *
 * @author Ángel
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        int num; //declaro las variables
        int num2;
        int opcion;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int resultado;
        Scanner entrada = new Scanner (System.in); //creo objeto para pedirle valores al usuario
        System.out.println("Por favor introduce un numero"); //imprimo por pantalla la entrada del primer numero
        num = entrada.nextInt(); //guardo en la variable el valor
        System.out.println("Por favor introduce otro número"); //imprimo por pantalla la entrada del segundo numero
        num2 = entrada.nextInt(); //guardo en la variable el valor 
        
        do{ //creo bucle do-while para el menú en el que se repite
            System.out.println("--Bienvenido al Menu--"); //imprimo por pantalla el menú
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir");
            System.out.println("Introduce una opcion");
            opcion = entrada.nextInt(); //recojo en la variable opcion las opciones del switch
                    
            switch(opcion){ //parametrizo el valor opcion para elegir uno de los casos
                    case 1: //primer caso
                        System.out.println("Se realiza la suma"); //Imprimo por pantalla la suma
                        resultado = num+num2; //guardo en la variable la operación
                        System.out.println("El resultado de la suma es"+resultado); //imprimo el valor del resultado de la suma
                        break; //para que no pase al siguiente caso utilizo el break
                    case 2: //segundo caso
                        System.out.println("Se realiza la resta"); //imprimo por pantalla la resta
                        resultado = num-num2; //guardo en la variable la operación
                        System.out.println("El resultado de la resta es"+resultado); //imprimo por pantalla el resultado de la resta
                        break; //lo mismo que el anterior
                    case 3: //caso 3
                        System.out.println("Se realiza la multiplicacion"); //imprimo por pantalla la multiplicación
                        resultado = num*num2; //guardo en la variable la operación
                        System.out.println("El resultado de la multiplicacion es"+resultado); //imprimo por pantalla el resultado de la multiplicación
                        break; //igual
                    case 4: //caso 4
                            try{ //control de excepciones en caso de la division por cero recojo el valor en el try
                                System.out.println("Se realiza la division");
                                resultado = num/num2; //realizo la operación
                                System.out.println("El resultado de la division es"+resultado); //imprimo por pantalla el resultado de la división
                            }catch(ArithmeticException e){ //al recojer un valor que impida la division en este caso el cero salta aquí siendo el resultado de la operación invalida 
                                System.out.println("Error no se puede divir por cero"); //imprimo por pantalla el error
                                
                            }
                        break; //igual
                    case 5: //caso 5
                        System.out.println("Saliendo del programa..."); //imprimo por pantalla la salida
                        break; 
                    default: //por defecto si introduzco un numero diferente al de los casos
                        System.out.println("Error el número no es valido con el menu"); //imprimo por pantalla el error
            } 
        }while(opcion!=5); //mientras la ocpion sea distinta a 5
    }
    
}
