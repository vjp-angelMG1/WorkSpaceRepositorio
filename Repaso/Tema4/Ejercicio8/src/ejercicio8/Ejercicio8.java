/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *Ejercicio 08.- Realiza un programa que dado un importe en euros (en el main) se
los pase a un método que nos indique número óptimo de billetes de 50, 20, 10 y 5,
así como la cantidad sobrante en monedas de 2 y de 1 euro. En caso de que NO
haya billetes/monedas de algún tipo NO se mostrarán.
• Por ejemplo:
Por favor, indique una cantidad de dinero: 232
232 Euros se descomponen en:
Billetes de 50: 4
Billetes de 20: 1
Billetes de 10: 1
Monedas de 2 euros: 1
En el tema anterior: 232 Euros se descomponen en 4 billetes de 50, 1 billetes de 20, 1 billetes de 10, 0 billetes de 5, 1 monedas de 2 euros y 0 monedas de 1 euro
 
 * @author Ángel
 */
public class Ejercicio8 {


    public static void main(String[] args) { //creo método main
        int eurosTotal; //declaro la variable
        Scanner entrada = new Scanner(System.in); //creo objeto
        
        System.out.println("Introduce una cantidad en euros"); //imprimo por pantalla
        eurosTotal = entrada.nextInt();//recojo en la variable el valor
        descomponerEnEuros(eurosTotal); //llamo al metodo dentro de la misma clase main ya que no dice nada con la variable del metodo main en la cual se copia el resutado de la operacion el valor parametrizado del metodo
    }
    public static void descomponerEnEuros(int total){ //creo metodo con valor parametrizado 
         
        int billetes50; //Declaro las variables
        int billetes20;
        int billetes10;
        int billetes5;
        int monedasDe2;
        int monedasDe1;

        billetes50 = total / 50; //hago el calculo para separar el dinero actualizando el cambio de valor parametrizado total
            total = total % 50; //de cada operacion hago el resto para divirlo en los correspondientes billetes y monedas
        billetes20 = total / 20;
            total = total % 20;
        billetes10 = total / 10;
            total = total % 10;
        billetes5 = total / 5;   
            total = total % 5;
        monedasDe2 = total / 2;
        monedasDe1 = total % 2;
        
        
        if (billetes50 > 0){ //condicionales si es mayor que 0 se imprime si no nada
            System.out.println("Billetes de 50: " + billetes50);//imprimo por pantalla si se da la condicion
        }
        if (billetes20 > 0){
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0){
            System.out.println("Billetes de 10: " + billetes10);
        }   
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedasDe2 > 0){
            System.out.println("Monedas de 2: " + monedasDe2);
        }
        if (monedasDe1 > 0){
            System.out.println("Monedas de 1: " + monedasDe1);
        }
    
    }
    
}
