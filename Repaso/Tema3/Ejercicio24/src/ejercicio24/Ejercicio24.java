/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;


import java.util.Scanner;

//• Ejercicio 24.- Crea un programa en JAVA que que imprima todos
//los números múltiplos de 3 que existen entre el número 1 y otro
//número introducido por el usuario. (for)
//• Controla que el usuario te meta un número mayor que 0 y, sino,
//avísale del error y vuélveselo al pedir las veces que hagan falta.(do-while)
//• Por último infórmale al usuario del total de números mostrados (sout en for)
/**
 *
 * @author Ángel
 */
public class Ejercicio24 {

    public static void main(String[] args) {

        int num=1; //declaro variable y la inicializo
        int num2; //declaro variable 
        int contadorMultiplosDe3 = 0; //declaro variable y la inicializo en O 
        Scanner entrada = new Scanner(System.in); //creo objeto scanner para imprimir por pantalla

        //hago bucle do-while para comprobar que el número es mayor que 0 y si no que se repita el bucle
        do{  //bucle que se ejecuta al menos una vez
            System.out.println("Introduce un numero mayor a : " + num); //imprimo por pantalla numero mayor
            num2 = entrada.nextInt(); //guardo en la variable el numero introducido por el usuario
            
            if (num2<=0) { //Condicional si el num2 es menor e igual que 0
                System.out.println("Error el num2 tiene que ser mayor que 0"); //imprimo por pantalla el error
            }

        } while (num2<=0); //mientras el numero pedido sea menor que 0 se repite el bucle
        
        //Hago el bucle for para mostrar los múltiplos de 3
        System.out.println("Los multiplos de 3 entre : " +num+ "y "+num2); //Imprimo por pantalla los numeros
        
        for (num = 1; num <= num2; num++) { //bucle for para comprobar todos los numeros //sabes los numero que se van a repetir
            if(num%3 ==0){ //Condicional para ver los multiplos de 3 entre un numero y otro
               System.out.println(num); //imprimo por pantalla los numeros
               contadorMultiplosDe3++; //utilixo la variable contador para contar los numeros multiplos de 3
            }
        }
        System.out.println("Total de múltiplos de 3 contados "+contadorMultiplosDe3); //imprimo por pantalla el total del contador
    }
}

