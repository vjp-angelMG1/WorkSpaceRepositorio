/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08billetesymonedas;

/**
 *
 * @author USUARIO
 */
public class repartimiento {
    
    public static void descomponer(int dinero){ //metodo static void descomponer para llamar a la clase main
        
        int billete50; //Declaro las variables
        int billete20;
        int billete10;
        int billete5;
        int moneda2;
        int moneda1;
                
        
        billete50 = dinero / 50; //Inicializo las variable para billetes de 50 lo divido entre 50 el total
        dinero = dinero % 50; // el resto de la division anterior para continuar con las operaciones
        billete20 = dinero / 20;
        dinero %= 20;
        billete10 = dinero / 10;
        dinero %= 10;
        billete5 = dinero / 5;
        dinero %= 5;
        moneda2 = dinero / 2;
        dinero %= 2; 
        moneda1 = dinero; //el sobrante de los calculos y el ultimo resto del dinero de las monedas de 2 son las monedas de 1

        System.out.println("Euros descompuestos:"); //Imprimo el resultado
        if (billete50 > 0) System.out.println("Billetes de 50: " + billete50); //codicionales para saber cuantos billetes y monedas voy a repartir para que me imprima solo los que se den los que sean 0 no salen
        if (billete20 > 0) System.out.println("Billetes de 20: " + billete20);
        if (billete10 > 0) System.out.println("Billetes de 10: " + billete10);
        if (billete5 > 0) System.out.println("Billetes de 5: " + billete5);
        if (moneda2 > 0) System.out.println("Monedas de 2 euros: " + moneda2);
        if (moneda1 > 0) System.out.println("Monedas de 1 euro: " + moneda1);
    }
}
