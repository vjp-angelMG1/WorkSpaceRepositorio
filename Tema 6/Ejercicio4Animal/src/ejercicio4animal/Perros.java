/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase Perros
 * Subclase de Canidos
 * Implementa los métodos abstractos de Animal
 * @author Ángel
 */
public class Perros extends Canidos {
    //CONSTRUCTORES
    //por defecto
    public Perros(){
        super(); //Constructor por defecto, Llama a Canidos()
    }
    //parametrizado
    public Perros(String nombre,int edad, double peso){
        super(nombre, edad, peso); // Constructor parametrizado, Llama a Canidos()
    }
    //MÉTODOS ABSTRACTOS CON OVERRIDE
    @Override
    public void sonido() {
        System.out.println("Ladrido."); //Sonido del perro
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora."); //Alimentación de los perros
    }
    
    @Override
    public void habitat() {
        System.out.println("Domestico");
    }
    
    @Override
    public void nombreCientifico() {
        System.out.println("Canis lupus familiaris."); // Nombre cinetífico
    }

    //Mostrar
    @Override //toString hereda de Animal
    public String toString(){
        return super.toString();
    }
}
