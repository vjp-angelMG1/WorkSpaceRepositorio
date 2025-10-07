/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04numeromenor;
import java.util.Scanner; //importación de la libreria java util desde Scanner
/**
 *
 * @author Ángel // Etiqueta de quien lo hace
 * @since 07/10/2025 //Etiqueta de la fecha en la que se realizo
 */
public class Ejercicio04numeromenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main
        Scanner entrada= new Scanner(System.in);// Creo un objeto llamado escaner para capturar lo que escriba el usuario
        
        int numero1; //Declaro la variable int
        int numero2; //Declaro la variable int
        int numero3; //Declaro la variable int
        
        System.out.println("Porfavor introduzca el primer numero "); //Impresión del primer numero que voy a introducir
        numero1=entrada.nextInt();//Valor que le voy a dar al numero1
        System.out.println("Ahora introduzca el segundo numero ");
        numero2=entrada.nextInt();//Valor que le voy a dar al numero2
        System.out.println("Por ultimo,introduzca un tercer numero ");
        numero3=entrada.nextInt();//Valor que le voy a dar al numero3
        
        
        int menor = numero1;//Declaro la variable int del numero mayor igualandola a 1 para que despues se pueda comparar con otras varaibles su numero y ver cual de las tres cantidades es menor
        
        if (numero2 < menor){//Condicional que dice si el numero2 es mayor que el numero menor
            menor = numero2;//le estoy dando valor al numero menor
        }
        if (numero3 < menor){//Condicional que dice si el numero3 es mayor que el numero menor
            menor = numero3;//le estoy dando valor al numero menor
        }
        System.out.println("El menor de los introducidos es el "+menor);//Impresion de el resultado de cual numero de los tres es menor
        
        
        // TODO code application logic here
    }
    
}
