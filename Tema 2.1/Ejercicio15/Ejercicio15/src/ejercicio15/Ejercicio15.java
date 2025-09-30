/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author USUARIO
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo;  //tiempo total en sengundos
        int minutos; //tiempo total en minutos 10000/60
        int horas; // tiempo total en horas 10000/3600
        int resultadoMinutos;
        int resultadoHoras;
        int resultadoSegundos;
        
        tiempo = 10000 ;
        minutos = 60 ; // 60 minutos son una hora lo dividimos entre 60 para saber los minutos que son dandonos el tiempo 10000 segundos
        horas = 3600 ; //horas en segundo 60 horas x 60 minutos son 3600 segundos
        resultadoMinutos = tiempo/minutos ;
        resultadoHoras = tiempo/horas ;
        resultadoSegundos= tiempo%horas ;
        
        
        System.out.println("10000 segundos son : " + tiempo + "/" + minutos + "=" + resultadoMinutos + "minutos");
        System.out.println("10000 segundos son : " + tiempo + "/" + horas + "=" + resultadoHoras + "horas");
        //10000 segundos hacen un total de: horas , minutos y segundos
        System.out.println("10000 segundos hacen un total de: " + resultadoHoras + "horas" + resultadoMinutos + "minutos" + resultadoSegundos + "segundos");
        
        
        
        
                        
                
    }
    
}
