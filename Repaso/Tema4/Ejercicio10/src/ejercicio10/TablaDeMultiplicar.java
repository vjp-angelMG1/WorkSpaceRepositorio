/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class TablaDeMultiplicar {
    
    public static void Tabla(int num){ //creo metodo estatico void que no devuelve valores pero tiene parametros
        System.out.println("Tabla de multiplicar " + num + ":"); //imprimo por pntalla 
        for (int i = 0; i<=10; i++) { //creo bucle for para recorrer los 10 numeros por los que multiplico la tabla
            System.out.println(num + " x " + i + " = " + (num* i)); //imprimo por pantalla la operacion que realizo en cada vez que se ejecuta el bucle
        }
    }
    
}
