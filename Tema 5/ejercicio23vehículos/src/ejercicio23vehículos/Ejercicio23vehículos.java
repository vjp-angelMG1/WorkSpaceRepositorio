/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23vehículos;

/**
 *
 * @author USUARIO
 */
public class Ejercicio23vehículos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Constructor por defecto
        //vehiculos vehiculos = new vehiculos();
        //System.out.println(vehiculos);
        //Mostramos por pantallos los valores que va a tener nuestro TAXI 
        taxi taxi = new taxi("1234ABC", "AUDI", 90, 154);
        System.out.println(taxi);
        //Aqui se asigna y muestran los valores del AUTOBUS
        autobus autobus = new autobus("9283JKL", "Mercedes", 120, 70);
        System.out.println(autobus);
    }
    
}
