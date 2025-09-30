/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
 
/**
 *
 * @author alumno
 * Operaciones Aritméticas
 * @param args the comand line arguments
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dato1; // Declaro la variable entera dato1
       int dato2, resultado; //Declaro, a la vez, dos variables enteras: dato2 y resultado
       
       dato1 = 20; //Asigno el valor 20 a la variable dato1
       dato2 = 10;
       
       
       //Suma
       resultado = dato1 + dato2; //Guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " = " + resultado); /* El método println escribe
               por pantalla tanto el valor de las variables así como las cadenas que están entre
               comillas. Para unir los 5 elementos se ha utilizado el operador + */
        
        //Resta
        resultado = dato1 - dato2;
        System.out.println(dato1 + "-" + dato2 + "=" + resultado);
        
        //Producto
        resultado = dato1 * dato2;
        System.out.println(dato1 + " * " + dato2 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato2;
        System.out.println(dato1 + " / " + dato2 + " = " + resultado);
    }
    
}
