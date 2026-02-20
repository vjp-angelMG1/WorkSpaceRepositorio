/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Ángel
 */
public class Ejercicio12 {

    public static void main(String[] args) { //creo método main
//        int numero; //Declaro variable
//        numero = 11; //Inicializo variable
//        int contador; //Declaro variable
//        contador = 0; //Inicializo variable

//        while (numero <= 133) { //bucle para buscar numero pares al conocer exactamente lo que me pide al menos se realiza una vez
//            if (numero % 2 == 0) { //si el numero es par al ser el resto de 2 igual a 0
//                System.out.println(numero); //Imprimo el número
//                contador++; //utilizo un contador para ver cuantas veces imprimo un número par
//            }
//            numero++; //incremento a 1 el valor del numero al repetir el bucle que empieza en 11 y acaba en 133
//        }
//        System.out.println("La cantidad de números pares es :"+contador); //imprimo por pantalla los números que se repiten
//    }
//}
       // con un bucle do while
        int numero; //Declaro variable 
        numero = 11; //inicializo variable
        int contador;//Declaro variable
        contador = 0;//Inicializo variable
        do { //Utilizo bucle do while en este caso porque al menos se realizo una vez
            if (numero % 2 == 0 ) { //si numero es par para ello utilizamos el modulo para saber que el resto es cero
                System.out.println(numero); //imprimo por pantalla los numeros que cumplen esa condición al introducirle los parámetros
                contador++;
            }
            numero++; //incrementar el valor del numero hasta que se pare el bucle
        } while (numero <= 133); //parte del bucle que para hasta que el valor del numero sea menor o igual a 133
        
        System.out.println("Cantidad de números pares: "+contador);//Imprimo por pantalla para saber la cantidad de números pares
    }
}
