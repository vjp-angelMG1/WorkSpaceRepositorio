/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 * * *• Ejercicio 2. – Desarrolla un programa en JAVA, orientado a
objetos, en el que crees una clase llamada Persona que contenga
un atributo nombre y el método abstracto saludar. Crea también
las clases Profesor (hereda de Persona y tiene el atributo
especialidad) y Alumno (hereda de Persona y tiene el atributo
grupo).
• Dependiendo del tipo de persona (profesor o alumno) el método
saludar devolverá un String con un saludo del tipo “Hola, soy el
alumno … y estoy en el grupo de …) o bien “Hola, soy el profesor
… y soy de la especialidad de …).
• Crea una clase Test en la que instancies un objeto de cada
subclase implementada anteriormente y pruebes el método
saludar de cada objeto.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la superclase Persona y prueba los
métodos implementados nuevamente.

 * @author Angel
 */
public class Profesor extends Persona {
    //ATRIBUTOS
    private String especialidad;
    //CONSTRUCTORES
    //por defecto
    public Profesor(){
        super();
        this.especialidad = "";
    }
    //parametrizado
    public Profesor(String nombre,String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }
    //Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    //metodo mostrar
    public void mostrarProfesor(){
        mostrarPersona();
        System.out.println("Especialidad"+this.especialidad);
    }
    
    //metodo saludar heredado del metodo abstracto de la clase padre
    @Override
    public String saludar(){
        return "Hola, soy el profesor "+getNombre()+" y soy de la especialidad de "+this.especialidad; 
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "especialidad=" + especialidad + '}';
    } 
    
}
