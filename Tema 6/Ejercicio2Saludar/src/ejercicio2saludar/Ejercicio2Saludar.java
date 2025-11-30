/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2saludar;

/**
 *
 * @author Ángel
 */
public class Ejercicio2Saludar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJETOS QUE CREO DE LA CLASE {PROFESOR, ALUMNO} con sus Atributos
        Profesor profesor1 = new Profesor("Carlos", "IPE");
        Alumno alumno1 = new Alumno("Borja", "3B");
        
        //SE LLAMA AL MÉTODO SALUDAR() DE CADA OBJETO Y SE MUESTRA POR PANTALLA
        System.out.println(profesor1.saludar());
        System.out.println(alumno1.saludar());
        
        System.out.println("");
        
        //OBJETOS QUE SE CREAN DE TIPO PROFESOR Y ALUMNO PERO REFERENCIADOS DESDE LA SUPERCLASE PERSONA
        Persona profesor2 = new Profesor("Macarena", "Matemáticas");
        Persona alumno2 = new Alumno("Carmen", "1ºC" );
        
        //EJECUTAR EL MÉTODO SALUDAR() DE LA CLASE PERSONA CON POLIMORFISMO
        System.out.println(profesor2.saludar());
        System.out.println(alumno2.saludar());
        
    }         
}
