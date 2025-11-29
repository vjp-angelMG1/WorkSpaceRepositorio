/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase abstracta Felinos
 * Subclase de Animal
 * Base para Leones y Gatos
 * @author alumno
 */
    public abstract class Felinos extends Animal {
    
    //CONSTRUCTOR
    //Por defecto
    public Felinos(){
        super(); //Llama al constructor por defecto de Animal
    }
    //Parametrizado
    public Felinos(String nombre,int edad, double peso){
        super(nombre,edad,peso); //Llana al constructor de Animal con parámetros
    }
    //Mostrar
    @Override
    public String toString(){
        return super.toString();// Devuelve la información básica del anímal
    }
    
        
}

