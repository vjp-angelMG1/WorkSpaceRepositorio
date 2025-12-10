/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09impuestos;

/**
 *
 * @author USUARIO
 */
public class Ejercicio09Impuestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Objetos que se crean de la clase (Persona, Vehiculo) con sus atributos
       Persona p1 = new Persona ("32246567A", 18500.75);
       Vehiculo v1 = new Vehiculo(1600, "7623BFD", "23455378D");
       
       //Mostrar los datos de los objetos
       p1.mostrarDatos();
        System.out.println("");
       v1.mostrarDatos();
    } 
    
}
