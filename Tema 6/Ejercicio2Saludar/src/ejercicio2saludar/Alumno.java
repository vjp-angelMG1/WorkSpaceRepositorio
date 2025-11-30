/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2saludar;

/**
 *
 * @author Ángel
 */
public class Alumno extends Persona{
    //ATRIBUTO
    private String grupo;
    
    //CONSTRUCTORES
    public Alumno(){
        super();
        grupo = "";
    }
    
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }   
    //GETTER/SETTER
    public String getGrupo() {
        return grupo;
    }
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO SALUDAR()
    @Override
    public String saludar(){
        return "Hola, soy el/la alumn@ " + getNombre() + " y estoy en el grupo de " + grupo;
    }
    @Override
    public String toString(){
      return "Alumno{" + "grupo=" + grupo + '}';  
    }
}