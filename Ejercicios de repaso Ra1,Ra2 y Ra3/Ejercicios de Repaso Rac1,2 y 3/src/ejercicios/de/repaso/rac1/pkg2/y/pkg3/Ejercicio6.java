/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.de.repaso.rac1.pkg2.y.pkg3;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {
    
    public static void main (String[] args){ //método main 
    int num1; //declaro las variables
    int num2;
    int resultado;
    num1 = 200; //inicializo las variables
    num2 = 21;
    boolean divisible = esDivisible(num1,num2); //declaro la variable boolean y llamo al método
    
        System.out.println( " Resultado " + divisible);//Imprimo el valor que me devuelve la  variable divisible del método esDivisible para saber si es verdadero o falso
    }
    public static boolean esDivisible(int num1,int num2){ //metodo bolean en el que introduzco dos parametros de números enteros 
        if(num2 !=0){ //condicional//si el numero2 es distinto de 0
            if(num1 % num2 == 0){ //condicional//dentro de que se cumpla el primer if seguiria con este en el que el rsto de la división de numero1 y numero2 es igual a 0
            System.out.println( num1 + " es divisible por "+num2+ "(el resto es 0) " ); //imprimo el que se cumple la condición 
            return true; //devuelvo el valor veradero al metodo main
            } else{ //condicional//si se cumple el primer if pero no el segundo entonces se da esta condicion
                System.out.println( num1 + " no es divisble "+num2+"(el resto no es 0) "); //imprimo que se cumple esta condicion
                return false; //devuelvo el valor verdadero al metodo main
            }
        
        }else{ //si el numero 2 no es distinto de 0
            System.out.println(" No se puede divir por cero "); //imprimo resultado 
            return false; //devuelvo el valor segun el resultado
        }
    
    }
    
}
