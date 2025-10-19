/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07diasdelasemana;
import java.util.Scanner; //Importación de la libreria java util desde scanner
/**
 *
 * @author Ángel //Etiqueta con el nombre 
 * @since 09/10/2025 //Etiqueta con la fecha
 */
public class Ejercicio07diasdelasemana { //Nombre del ejercicio

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Método main
        
        int diasemana; //Declaro la variable semana
        boolean laborable; //Declaro la variable laborable 
        Scanner entrada = new Scanner(System.in); //Creo un objeto llamado entrada para capturar lo que escriba el usuario
        
        System.out.println("lunes(1),martes(2),miercoles(3),jueves(4),viernes(5),sabado(6) y domingo(7)"); //Impresión con los dias de la semana asignados a un case
        diasemana=entrada.nextInt(); //Recoje el número de la variable
        laborable = true; //inicializo la variable que es boolean solo puede ser true o false
        
        switch(diasemana){ // Condicional que busca a que variable darle valor a los case del 1 al 5
            case 1: //valor de 1 que seria el lunes
            case 2: //valor de 2 que seria el martes
            case 3: //valor de 3 que seria el miercoles
            case 4: //valor de 4 que seria el jueves
            case 5: //valor de 5 que sería el viernes
                laborable=true; //inicialización de la variable declarada arriva que es un boolean al ser true o false
                break; //Se utiliza para terminar la ejecución del ciclo y continuan con las siguientes instrucciones
            case 6: //valor de 6 que seria el sabado
            case 7: //valor de 7 que seria el domingo
                laborable=false; //Inicialización de la variable declarada arriva que es un boolean al ser true o false
                }
            if (laborable == true) { //Condicional si laborable es igual a verdadero
                  System.out.println("dia laborable"); //Impresión de la varaible si se cumple la condicional
            } else {
                  System.out.println("fin de semana"); //Impresión de la variable si se cumple la condicional
            }
        
        
    }
    
}
