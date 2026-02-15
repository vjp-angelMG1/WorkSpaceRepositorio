/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author USUARIO
 */
public class ArrayBurbuja {
    

    private boolean burbuja(int[] arrayNumeros) {
        boolean ordenado = true;                               //Instruccion 1 NODO 1
        int elementoActual, elementoSiguiente;                 //Instruccion 2 

        for (int x = 0; x < arrayNumeros.length; x++) {        //Instruccion 3 NODO 2
            for (int y = 0; y < arrayNumeros.length - 1; y++) { //Instruccion 4 NODO 3
                elementoActual = arrayNumeros[y];               //Instruccion 5 NODO 4
                elementoSiguiente = arrayNumeros[y + 1];        //Instruccion 6 NODO 5

                if (elementoActual > elementoSiguiente) {       //Instruccion 7 NODO 6
                    // intercambiar
                    arrayNumeros[y] = elementoSiguiente;        //Instruccion 8 NODO 7
                    arrayNumeros[y + 1] = elementoActual;       //Instruccion 9 NODO 8
                    ordenado = false;                           //Instruccion 10 NODO 9
                }                                               //Instruccion 11 NODO 10
            }                                                   //Insrruccion 12 NODO 11 
        }                                                       //Insruccion 13 NODO 12
        return ordenado;                                        //Instruccion 14 NODO 13
    }                                                           //Instruccion 15 
}                                                               //Instruccion 16
