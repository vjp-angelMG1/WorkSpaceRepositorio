/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *• Ejercicio 2. – Desarrolla un programa en JAVA, orientado a
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
public class Ejercicio2 {


    public static void main(String[] args) { //metodo principal main 
        System.out.println("Objetos subclases"); //creo 2 objetos de las subclases 
        Profesor profesor = new Profesor("Juan","CMC");
        Alumno alumno = new Alumno("Pepa","2ºB");
        
        System.out.println(profesor.saludar()); //llamo a los metodos dentro de un sout ya que lo que me devuelve es un String
        System.out.println(alumno.saludar());
        
        System.out.println("Polimorfismo"); //creo 3 objetos atraves de la clase padre con el polimorfismo
        Persona persona1 = new Profesor("Clara","MAT");
        Persona persona2 = new Alumno("Gonzalo","1ºE");
        System.out.println(persona1.saludar()); //llamo a los metodos dentro de un sout ya que lo que me devuelve es un String
        System.out.println(persona2.saludar());
    }
    
}
