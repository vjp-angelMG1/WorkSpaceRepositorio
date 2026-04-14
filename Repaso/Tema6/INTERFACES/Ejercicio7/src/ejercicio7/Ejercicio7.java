/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *• Ejercicio 7. – Desarrolla un programa en JAVA, orientado a objetos, en
el que crees una interfaz ControlRemoto con los siguientes métodos
de tipo void: apagar(), encender(), bajarVolumen(), subirVolumen() y
cambiarCanal(float canal).
• Crea dos clases que implementen interfaz: La clase Televisor tiene
como atributos encencido (boolean), canal (int) y volumen (int). Por
defecto, el canal se inicializa en 1 y el volumen en 10. Añade todos los
métodos propios de la clase, salvo los get y set de encendido.
Después, implementa los métodos de la interfaz, de manera que:
• encender: si la tv no está encendida, se encienda y muestre el canal
actual.
• apagar: si la tv está encendida, muestre el mensaje “La TV se apagará
en 10s”.
• bajarVolumen: si la tv está encendida, se decrementa en 1 el valor del
volumen y muestra el volumen actual.
• subirVolumen: si la tv está encendida, se incrementa en 1 el valor del
volumen y muestra el volumen actual.
• cambiarCanal: si la tv está encendida, le asigna al atributo canal el
valor pasado por parámetro y muestra por pantalla el canal actual.
• La clase Radio tiene como atributos encencido (boolean), emisora
(float) y volumen (int). Por defecto, la emisora se inicializa en 80.0 y el
volumen en 15. Añade todos los métodos propios de la clase, salvo los
get y set de encendido. Después, implementa los métodos de la
interfaz, de manera que:
• encender: si la radio no está encendida, se encienda.
• apagar: si la radio está encendida, se apague.
• bajarVolumen: si la radio está encendida, se decrementa en 5 el valor del volumen.
• subirVolumen: si la radio está encendida, se incrementa en 5 el valor del volumen.
• cambiarCanal: si la radio está encendida, le asigna al atributo emisora el valor pasado
por parámetro.
• Crea una clase Test en la que instancies un objeto de la clase
Televisor, la enciendas, muestres su información, subas el
volumen 3 veces, muestres el volumen actual, cambies de canal,
bajes el volumen, la apagues y muestres de nuevo su
información.
• Haz lo mismo con un objeto de la clase Radio.
* 
 * @author Angel
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        System.out.println("SUBCLASES"); //creo dos objetos y voy cumpliendo los comportamientos que me pide el enunciado tanto de radio como de television
        
        System.out.println("RADIO");
        
        Radio radioMacondo = new Radio();
        radioMacondo.encender();
        System.out.println(radioMacondo);
        radioMacondo.subirVolumen();
        radioMacondo.subirVolumen();
        radioMacondo.subirVolumen();
        System.out.println(radioMacondo.getVolumen());
        radioMacondo.cambiarCanal(76.8f);
        radioMacondo.bajarVolumen();
        System.out.println(radioMacondo.getVolumen());
        radioMacondo.apagar();
        System.out.println(radioMacondo);
        
        System.out.println("TELEVISOR");
        
        Televisor televisionDT = new Televisor();
        televisionDT.encender();
        System.out.println(televisionDT);
        televisionDT.subirVolumen();
        televisionDT.subirVolumen();
        televisionDT.subirVolumen();
        System.out.println((char) televisionDT.getVolumen());
        televisionDT.cambiarCanal(7);
        televisionDT.bajarVolumen();
        System.out.println(televisionDT.getVolumen());
        televisionDT.apagar();
        System.out.println(televisionDT);
    }
    
}
