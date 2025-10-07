/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.Scanner; //darle importación a java util desde la carpeta Scanner
/**
 *
 * @author USUARIO
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); //Entea del scanner nueva para darle valor al objeto
        
        int dinero;   //dinero total //Variable
        int billetes50,billetes20,billetes10,billetes5,monedas2,monedas1; //   VAriable que muestra en lo que se van a dividir los billetes y las monedas //Variable
              System.out.println("Introduce un importe en euros"); //Se imprime el enunciado con el que vamos a dar valor al dinero
            dinero = entrada.nextInt(); //valor que le voy a dar de entrada al dinero
        

        
           billetes50 = dinero/50; // cuantos billetes de 50 puedo sacar en total
           billetes20 = (dinero % 50)/ 20; //cuantos billetes de 20 saco de las sobras de 50
           billetes10 = (dinero % 20)/ 10; // cuantos billetes de 10 saco de las sobras de 20
           billetes5 = (dinero % 10)/ 5; // cuantos billetes de 5 saco de las sobras de 10
           monedas2 = (dinero % 5)/ 2; // cuantas monedas de 2 saco de las sobras de 5
           monedas1 = dinero % 2; //cuantas monedas de 1 saco de las sobras de 2
           
               System.out.println(dinero + "Euros se descomponen en:" ); //impresión del dinero total para descomponerlo en billetes y monedas
           if(billetes50 > 0){//condicional si los billetes de 50 son mayores que cero cuantos hay segun la operación anterior
               System.out.println("billetes de 50 " + billetes50); // impresión de los billetes de 50 que me van a salir
           }if (billetes20 > 0){//condicional si los billetes de 20 son mayores que cero cuantos hay segun la operación anterior
               System.out.println("billetes de 20 " + billetes20); // impresión de los billetes de 20 que me van a salir
           }if (billetes10 > 0){//condicional si los billetes de 10 son mayores que cero cuantos hay segun la operación anterior
               System.out.println("billetes de 10 " + billetes10); //impresión de los billetes de 10 que me van a salir
           }if (billetes5 > 0){//condicional si los billetes de 5 son mayores que cero cuantos hay segun la operación anterior
               System.out.println("billetes de 5 " +billetes5); // impresión de los billetes de 5 que me van a salir
           }if (monedas2 > 0){//condicional si las monedas de 2 son mayores que cero cuantas monedas hay respecto al total
               System.out.println("monedas de 2 " +monedas2); //impresion de las monedas de 2 que me van a salir
           }if (monedas1 > 0){//condicional si las monedas de 1 son mayores que cero cuantas monedas hay respecto al total
           }
               
    }
    
}
