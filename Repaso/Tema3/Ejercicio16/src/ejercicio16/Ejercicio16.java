/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Ángel
 */
public class Ejercicio16 {

    public static void main(String[] args) { //creo método principal main
       
        int contador = 0; //declarar e inicializar variable
        int numero; //declara variable
        System.out.println("Los impares entre 20 y 160 son :"); //imprimir por pantalla
        for(numero=20;numero<=160;numero++){ //bucle for para conocer los numero impares entre 20 y 160
            if(numero%2==1){ //condicional para saber los números impares
                System.out.print(+numero+"-"); //imprimo los numeros por pantalla sin salto de linea 
                contador++; //añado el contador para que cuente las vueltas o interaciones
            }
        }
        System.out.println("\n"+"La cantidad de números impares impresos han sido: "+contador+"\n");//imprimo por pantalla añadiendo el salto de linea
    }   
        
}
