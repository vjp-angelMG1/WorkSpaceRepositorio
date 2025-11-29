/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase abstracta Canidos 
 * Subclase de Animal
 * Base para Perros y Lobos
 * @author alumno
 */
public abstract class Canidos extends Animal { 
    
    //CONSTRUCTOR
    //Por defecto //Llama al constructor por defecto de la superclase Animal
    public Canidos(){
        super(); //Llama al constructor por defecto de la superclase Animal
    } 
    //Parametrizado //Recibe nombre,edad y peso 
    public Canidos(String nombre,int edad, double peso){
        super(nombre,edad,peso); //Llama al constructor de Animal con parámetros
    }
    //Mostrar //Hereda el comportamiento de Animal
    @Override
    public String toString(){
        return super.toString(); //Devuelve la información básica del animal
    }
    
        
}
    

