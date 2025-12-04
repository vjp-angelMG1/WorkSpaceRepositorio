/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7transistor;

/**
 *
 * @author USUARIO
 */
public class Ejercicio7Transistor {


    public static void main(String[] args) {
               //Objeto que se crea de la clase Televisor
        Television tv = new Television();
        
        System.out.println("--Television--");
        System.out.println("-Encender la tele-");
        tv.encender();
        System.out.println("\n-Mostrar informacion-");
        tv.mostrarInformacion();//Mostrar estado actual
        System.out.println("\n-Subir volumen 3 veces-");
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println("\n-Mostrar la informacion despues de subir el volumen");
        tv.mostrarInformacion();//Mostrar el nuevo volumen
        System.out.println("\n-Cambiar de canal-");
        tv.cambiarCanal(5);//Cambiar al canal 5
        System.out.println("\n-Bajar el volumen y apagar la tele-");
        tv.bajarVolumen();
        tv.apagar();
        System.out.println("\n-Mostrar informacion de todo-");
        tv.mostrarInformacion();//Mostrar estado final
        
        //Objeto que se crea de la clase Radio
        Radio radio = new Radio();
        
        System.out.println("\n--Radio--");
        System.out.println("-Encender la radio-");
        radio.encender();
        System.out.println("\n-Mostrar informacion-");
        radio.mostrarInformacion();//Mostrar estado actual
        System.out.println("\n-Subir volumen 3 veces-");
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println("\n-Mostrar la informacion despues de subir el volumen");
        radio.mostrarInformacion();//Mostrar el nuevo volumen
        System.out.println("\n-Cambiar de frecuencia-");
        radio.cambiarCanal(95.5f);//Cambiar a la frecuencia 95.5
        System.out.println("\n-Bajar el volumen y apagar la tele-");
        radio.bajarVolumen();
        radio.apagar();
        System.out.println("\n-Mostrar informacion de todo-");
        radio.mostrarInformacion();//Mostrar estado final
    }
}
    
    

