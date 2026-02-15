/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

public class Binaria {

    private int array[];

    public Binaria() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public int busquedaBinaria(int numero) {

        int umbral_inferior = 0;                                            //intruccion 1      - NODO 1
        int umbral_superior = array.length - 1;                             //intruccion 2
        int respuesta = -1;                                                 //intruccion 3
        int index;

        while (umbral_inferior <= umbral_superior) {                          //instruccion 4     - NODO 2

            index = (umbral_inferior + umbral_superior) / 2;                 //instruccion 5     - NODO 3

            if (array[index] == numero) {                                    //instruccion 6     - NODO 4

                respuesta = index;                                          //instruccion 7     - NODO 5
                umbral_inferior = umbral_superior + 1;                       //instruccion 8
            }//fin if                                                       //instruccion 9     - NODO 6
            else if (array[index] < numero) {                                //instruccion 10    - NODO 7

                umbral_inferior = index + 1;                                 //instruccion 11    - NODO 8
            } //fin else if                                                 //instruccion 12    - NODO 9
            else {                                                          //instruccion 13    - NODO 10
                umbral_superior = index -1;                                 //instruccion 14    -NODO 11
            } // fin else                                                   //instruccion 15    -NODO 12
        } // fin while                                                      //instruccion 16    -NODO 13

        return respuesta;                                                   //intruccion 17     - NODO 14

    } // fin metodo                                                         //Instruccion 18                                    
}
