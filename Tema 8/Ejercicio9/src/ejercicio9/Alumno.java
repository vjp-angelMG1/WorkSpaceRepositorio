/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author Angel
 */
public class Alumno {

    private String nombreAlumno;
    private Asignatura[] notas;

    //Constructores
    public Alumno() {
        this.nombreAlumno = "";
        this.notas = new Asignatura[4];
    }

    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    //Getters y setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }

    //Metodo override que muestra
    @Override
    public String toString() {
        return "Alumno{" + "nombreAlumno=" + nombreAlumno + ", notas=" + notas + '}';
    }

}
