/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Angel
 */
public class Ejercicio6 {


    public static void main(String[] args) {
        int primo[] = new int[80];                  //Creo el array
        int contador = 0;                           //Creo las variables
        int num = 2;

        while (contador < primo.length) {           //Repito el método hasta que se llene el array
            if (esPrimo(num)) {
                primo[contador] = num;
                contador++;
            }
            num++;
        }
        
        mostrarArray(primo);
    }
    
    /**
     * Método que comprueba si el número es primo
     * @param num
     * @return 
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {            
            if (num % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Método que muestra todos los valores del array primo 
     */
    public static void mostrarArray(int primo[]) {
        for (int i = 0; i < primo.length; i++) {
            System.out.println("["+ (i+1) +"] : "+ primo[i]);
        }
    }

}
    
}
