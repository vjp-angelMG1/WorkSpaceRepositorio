/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2saludar;

/**
 *
 * @author USUARIO
 */
public abstract class Persona {
    //ATRIBUTO
    private String nombre;
    
    //CONSTRUCTORES
    public Persona() {
        nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //GETTER/SETTER
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //MÉTODO ABSTRACTO
    public abstract String saludar();
    //MOSTRAR
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
    
    
}
