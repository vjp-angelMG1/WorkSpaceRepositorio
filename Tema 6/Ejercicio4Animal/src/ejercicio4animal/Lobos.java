/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase Lobos 
 * Subclase de Canidos
 * Implementa los métodos abstractos de Animal
 * @author USUARIO
 */
public class Lobos extends Canidos{
    public Lobos() {
        super(); //Constructor por defecto
    }
    public Lobos(String nombre, int edad, int peso) {
        super(nombre, edad, peso); //Constructor parametrizado
    }
    //MÉTODOS ABSTRACTOS
    @Override
    public void sonido() {
        System.out.println("Aullido."); //Sonido del Lobo
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora.");//Alimentación del Lobo
    }
    
    @Override
    public void habitat() {
        System.out.println("Monte");// Hábitat del lobo
    }
    
    @Override //toString hereda el de Animal
    public void nombreCientifico() {
        System.out.println("Canis lupus."); //Nombre científico
    }
    
}
