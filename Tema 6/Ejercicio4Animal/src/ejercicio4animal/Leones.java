/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase Leones
 * Subclase de Felinos
 * Implementa los métodos abstractos de Animal
 * @author Ángel
 */
public class Leones extends Felinos {
    public Leones() {
        super(); // Constructor por defecto
    }
    public Leones(String nombre, int edad, int peso) {
        super(nombre, edad, peso); //Constructor parametrizado
    }
    //MÉTODOS ABSTRACTOS
    @Override
    public void sonido() {
        System.out.println("Rugido"); //Sonido del León
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora."); //Alimentación del León
    }
    @Override
    public void habitat() {
        System.out.println("Africa subsahariana."); //Hábitat del León
    }
    
    @Override
    public void nombreCientifico() {
        System.out.println("Panthera leo."); // Nombre cientifíco
    }
     //Mostrar
    @Override
    public String toString(){
        return super.toString();
    }
    
}
