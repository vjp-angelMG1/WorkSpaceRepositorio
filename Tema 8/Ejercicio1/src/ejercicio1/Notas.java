/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Notas {

    //ATRIBUTOS
    private String nombre;
    private float notasAsignaturas;

    //CONSTRUCTORES 
    //por defecto
    public Notas(){
    this.nombre = "";
    this.notasAsignaturas = 0;
    }
    //parametrizado
    public Notas(String nombre, float notas) {
        this.nombre = nombre;
        this.notasAsignaturas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNotas() {
        return notasAsignaturas;
    }

    public void setNotas(float notas) {
        this.notasAsignaturas = notas;
    }
    // TO STRING
    @Override
    public String toString() {
        return "Asignaturas{" + "nombre=" + nombre + ", notas=" + notasAsignaturas + '}';
    }
    
    
}  