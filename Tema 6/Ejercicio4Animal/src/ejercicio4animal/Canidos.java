/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author alumno
 */
public abstract class Canidos extends Animal {
    
    //CONSTRUCTOR
    //Por defecto
    public Canidos(){
        super();
    }
    //Parametrizado
    public Canidos(String nombre,int edad, double peso){
        super(nombre,edad,peso);
    }
    //Mostrar
    @Override
    public String toString(){
        return super.toString();
    }
    
        
}
    

