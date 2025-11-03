/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20tema4;

import java.util.Scanner;

/**
 * Método que le pide al usuario
 * la respuesta a la pregunta
 * @return la respuesta del usuario
 * @author alumno
 */
public class Ejercicio20tema4 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colon";
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España";
    public final static String PREGUNTA2 = "¿Quién descubrió America?";
    
    public final static int PUNTUACION =  5;
    
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuestaUsuario = entrada.nextLine();
        return entrada.nextLine();
    }
    /**
     * Método  que compara que la respuesta del usuario
     * con la respuesta correcta y devuelve true o false.
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * @return true si la respuesta correcta y false en caso contrario
     */
    
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        boolean correcto;
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)){
            correcto = true;
        } else {
            correcto = false;
        } 
       return correcto;     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta,RESPUESTA1)){
            System.out.println("Muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + RESPUESTA2);
        }
        
        System.out.println("NOTA DEL EXAMEN: " + puntuacionFinal);
    
    }
    
}
