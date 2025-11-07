/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 * @author USUARIO
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dato1; // Declaro la variable entera dato1
       int dato2; // Declaro la variable entera dato2
       int dato3, resultado; //Declaro, a la vez, tres variables enteras: dato3 y resultado
       
       dato1 = 20; //Asigno el valor 20 a la variable dato1
       dato2 = 10; //Asigno el valor 10 a la variable dato2
       dato3 = 5; //Asigno el valor 5 a la variable dato3
       
       
       //Suma
       resultado = dato1 + dato2 + dato3 ; //Guardo la suma de las tres variables en la variable resultado
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado); /* El método println escribe
               por pantalla tanto el valor de las variables así como las cadenas que están entre
               comillas. Para unir los 5 elementos se ha utilizado el operador + */
        
        //Resta
        resultado = dato1 - dato2 - dato3 ;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //Producto
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //Cociente
        resultado = dato1 / dato2 / dato3 ;
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
    }
    
}
