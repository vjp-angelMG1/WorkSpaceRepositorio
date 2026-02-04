/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Angel
 */
public class Asignatura {

    private String nombreAsignatura;
    private float nota;

    //Constructores
    public Asignatura() {
        this.nombreAsignatura = "";
        this.nota = 0F;

    }

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    //Getters y setters
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    //Metodo override para mostrar.
    @Override
    public String toString() {
        return "Asignatura{" + "nombreAsignatura=" + nombreAsignatura + ", nota=" + nota + '}';
    }

}
