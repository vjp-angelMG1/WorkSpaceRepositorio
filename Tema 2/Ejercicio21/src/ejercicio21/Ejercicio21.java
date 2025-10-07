/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */// Calcular tiempo//
package ejercicio21;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio21 {
    final static int SEGUNDOSD = 86400; //24*60*60
    final static int SEGUNDOSH = 3600; //60*60
    final static int SEGUNDOSM = 60;
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int tiempo =entrada.nextInt();
    
    int dias = (tiempo / SEGUNDOSD);
    int horas = (tiempo % SEGUNDOSD) / SEGUNDOSH;
    int minutos = (tiempo % SEGUNDOSM) / SEGUNDOSM;
    int segundos = tiempo % SEGUNDOSM;
    
        System.out.println(+tiempo +" segundos hace un total de: "+ dias + " dias, "+ horas+ minutos +"minutos y "+ segundos +" segundos");
    }
    
}
