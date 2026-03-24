/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

/**
 *• Ejercicio 23.- Fíjate en el siguiente esquema, y
basándote en él, crea un programa en Java de tal
forma que cada clase debe disponer de constructor y
permitir establecer (set) y recuperar (get) el valor de
sus atributos. También crea un método que permita
mostrar la información del objeto cuando sea
procedente.
• Por otro lado, crea una clase test que contenga el
método main. En ella crea un objeto taxi y un objeto
autobús utilizando un constructor que reciba como
parámetros los valores de los atributos.
• Crea otros 2 objetos, uno por cada clase, utilizando el
constructor por defecto y, luego, utiliza los métodos
creados para asignarle valores a sus atributos.
• Por último muestra la información de cada objeto por
pantalla
 * @author Ángel
 */
public class Ejercicio23 {

    public static void main(String[] args) { //creo clase principal main ejecutable
        
        Taxi taxi1 = new Taxi("CC-3324","Sport",200,11); //creo objeto con parametros  
        Autobus autobus1 = new Autobus("BD-3218","Duster",130,60); //creo objeto con parametros 
        
        Taxi taxi2 = new Taxi(); //creo objeto con constructor por defecto
        
        taxi2.setMatricula("LC-6583"); //añado los valores a los parametros
        taxi2.setModelo("Clasico");
        taxi2.setPotencia(220);
        taxi2.setNumeroLicencia(17);
        
        
        Autobus autobus2 = new Autobus(); //creo objeto con constructor por defecto
        
        autobus2.setMatricula("DS-8432"); //añado los valores a los parametros
        autobus2.setModelo("JK");
        autobus2.setPotencia(300);
        autobus2.setNumeroPlazas(78);
       
        //muestro los vehiculos taxi1,autobus1,taxi2 y autobus2
        taxi1.mostrarTaxi();
        System.out.println("");
        autobus1.mostrarAutobus();
        System.out.println("");
        taxi2.mostrarTaxi();
        System.out.println("");
        autobus2.mostrarAutobus();
        
        //muestro los vehiculos taxi1,autobus1,taxi2 y autobus2 con el toString
        
        System.out.println("taxi 1 : "+taxi1.toString());
        System.out.println("autobus 1 : "+autobus1.toString());
        System.out.println("taxi 2 : "+taxi2.toString());
        System.out.println("autobus 2 : "+autobus2.toString());
    }
    
}
