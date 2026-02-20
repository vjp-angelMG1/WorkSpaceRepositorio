/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Primos {

    public static int sumaPrimos(int numeroMaximo) {
 
        int acumulador = 0;                             //Instruccion 1 NODO 1
        int numero = 2;                                 //Instruccion 2
        int contador;
        boolean primo;

        do {                                           //Instruccion 3 NODO 2
            System.out.println(numero);                //Instruccion 4 NODO 3
            contador = 2;                              //Instruccion 5 NODO 4
            primo = true;                              //Instruccion 6 NODO 5

            while (primo && (contador != numero)) {    //Instruccion 7 NODO 6
                if (numero % contador == 0) {          //Instruccion 8 NODO 7
                    primo = false;                     //Instruccion 9 NODO 8
                }                                      //Instruccion 10 
                contador++;                            //Instruccion 11 NODO 9
            }                                          //Instruccion 11 

            if (primo) {                               //Instruccion 13 NODO 10
                acumulador = acumulador + numero;      //Instruccion 14 NODO 11
            }                                          //Instruccion 15 NODO

            numero++;                                  //Instruccion 16 NODO 15

        } while (numero <= numeroMaximo);              //Instruccion 17 NODO 16

        return acumulador;                             //Instruccion 18 NODO 17
    }                                                 
}                                                    
