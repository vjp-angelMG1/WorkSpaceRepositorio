/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.newpackage;

/**
 * *• Ejercicio 03.- Diseña un programa en JAVA que lea tres números en
el main y se los pase a un método que imprimirá por pantalla el
mayor de ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE
DISTINTA DE OTRO PAQUETE.
• Muestra por pantalla el resultado de la siguiente forma:
Por favor, introduzca el primer numero: xxx
Ahora, introduzca un segundo numero: xxx
Por último, introduzca un tercer numero: xxx
El número mayor de los introducidos es el xxx
 * @author Ángel
 */
public class NumeroMayor {
    
    public static void mayorK(int num1,int num2,int num3){ //creo metodo mayorK en otro paquete del proyecto
        int aux; //declaro variables
        if(num1>num2&&num1>num3){ //condicional si el primer numero es mayor imprimo con resultado
            System.out.println("El numero mayor de los introducidos es el numero 1: "+num1);
        }
        if(num2>num1&&num2>num3){ //condicional si el segundo numero es mayor imprimo con resultado
           System.out.println("El numero mayor de los introducidos es el numero 2:  "+num2);
        }
        if(num3>num1&&num3>num2){ //condicional si el tercer numero es mayor imprimo con resultado
            System.out.println("El numero mayor de los introducidos es el numero 3: "+num3);
        }
    }
    
}
