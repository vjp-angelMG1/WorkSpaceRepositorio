/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercio14del13;

/**
 *
 * @author Angel
 */
public class Alumno {

    //Atributos
    private String nombre;
    private int edad;
    private float notaMedia;

    //Constructores
    public Alumno() {
        nombre = "";
        edad = 0;
        notaMedia = 0;
    }

    public Alumno(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nNota media: " + notaMedia;
    }
}
