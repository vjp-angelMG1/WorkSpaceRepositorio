/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 * *• Ejercicio 2. – Desarrolla un programa en JAVA, orientado a
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
public abstract class Persona {
    
    //ATRIBUTOS
    private String nombre;
    
    public Persona(){
        this.nombre = "";
    
    }
    
    public Persona(String nombre){
        
        this.nombre = nombre;
    
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodo mostrar
    public void mostrarPersona(){
        System.out.println("Nombre :"+this.nombre);
    }
    //metodo Abstracto de la clase padre
    public abstract String saludar();
    //metodo ToString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }    
}
