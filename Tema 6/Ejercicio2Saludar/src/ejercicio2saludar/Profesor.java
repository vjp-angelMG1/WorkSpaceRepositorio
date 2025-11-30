/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2saludar;

/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona{
    //ATRIBUTO
    private String especialidad;
    
    //CONSTRUCTORES
    public Profesor() {
        super();
        especialidad = "";
    }
    
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }
    
    //GETTER/SETTER
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO SALUDAR()
    public String saludar(){
        return "Hola, soy el/la profesor/a " + getNombre() + " y soy de la especialidad de " + especialidad;
    }
    //MOSTRAR
    @Override
    public String toString() {
        return "Profesor/a{" + "especialidad=" + especialidad + '}';
    }
    
    
}
