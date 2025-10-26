/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package division;

/**
 *
 * @author USUARIO
 */
public class division {
    /**
     * @param args the command line arguments
     */
    public static int division(int numero) { //metodo de division en la que no la variable del numero que me pide en el metodo main
        int resto; //declaro la variable resto 
        if (numero % 2 == 0) { //Condicional en la cual si el resto de la division del numero entre 2 es igual a 0 se cumple la condicion y el numero es par 
            System.out.println("El numero es par. "); // Imprimo la condicional si se cumple
        } else { // Condicional en la cual si el resto de la division entre 2 no es igual a cero 
            System.out.println("El numero es impar. "); // Imprimo la condicional si se cumple 
        }
        return numero; //devuelvo el valor del reultado al metodo main
    
    }
}