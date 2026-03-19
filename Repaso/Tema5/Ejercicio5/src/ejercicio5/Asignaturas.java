/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Ángel
 */
public class Asignaturas {

    private String nombre;
    private float nota;

    public Asignaturas() {

        this.nombre = "";
        this.nota = 0;
    }

    public Asignaturas(String nombre, float nota) {

        this.nombre = nombre;
        this.nota = nota;
    }

    public Asignaturas(String nombre) {//creo constructor que le paso el nombre pero la nota se la inicializo yo
        this.nombre = nombre;
        this.nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void mostrarNota() {

        System.out.println("La nota de " + nombre + " es: " + nota);
    }

    //Método toString
    @Override
    public String toString() {
        return "Asignaturas{" + "nombre" + nombre + "nota" + nota + '}';
    }

}
