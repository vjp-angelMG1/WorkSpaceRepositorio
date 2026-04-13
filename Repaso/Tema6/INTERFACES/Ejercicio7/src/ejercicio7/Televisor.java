/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 * *• Ejercicio 7. – Desarrolla un programa en JAVA, orientado a objetos, en
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
public class Televisor implements ControlRemoto {
    //ATRIBUTOS
    private boolean encendido;
    private int canal;
    private int volumen;
    //CONSTRUCTORES
    //Por defecto
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    //Parametrizado
    public Televisor(int canal, int volumen) {
        this.encendido = false;
        this.canal = canal;
        this.volumen = volumen;
    }
    //GETERS / SETERS
    public float getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    //METODO SOBRESCRITOS ABSTRACTOS DESDE LA INTERFAZ   
    @Override
    public void apagar() {
        if(encendido) {
            System.out.println("La TV se apagara en 10 segundos");
            encendido = false;
        }
    }
    
    @Override
    public void encender() {
        if(!encendido) {
            encendido = true;
            System.out.println("Estas viendo el canal " + canal);
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido) {
            volumen--;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido) {
            volumen++;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if(encendido) {
            this.canal = (int)canal;
            System.out.println("Estas viendo el canal " + canal);
        }
    }
      

    @Override
    public String toString() {
        return super.toString()+"Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
        
}

