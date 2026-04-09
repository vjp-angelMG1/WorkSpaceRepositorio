/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 * *• Ejercicio 11.- Implementa un programa en el que crees la clase
Alumno con los atributos dni (String), número de expediente (int) y
nota media (float).
• Tu programa deberá mostrar las siguientes opciones:
• Añadir alumno.
• Mostrar alumnos (ordenados de menor a mayor número de
expediente).
• Buscar por número de expediente.
• Mostrar alumnos por nota.
• Utiliza como ED un conjunto.
* 
 * @author Angel
 */
public class Alumno implements Comparable<Alumno> {
    //Atributos
    private String dni;
    private int numeroExpediente;
    private float notaMedia;

    //Constructores
    public Alumno() {
        dni = "";
        numeroExpediente = 0;
        notaMedia = 0f;
    }

    public Alumno(String dni, int numeroExpediente, float notaMedia) {
        this.dni = dni;
        this.numeroExpediente = numeroExpediente;
        this.notaMedia = notaMedia;
    }

    //Getters/Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
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
        return "DNI: " + dni + "Numero de expediente: " + numeroExpediente + "Nota media: " + notaMedia;
    }

    //CompareTo
    @Override
    public int compareTo(Alumno a) {
        if (this.numeroExpediente < a.getNumeroExpediente()) {
            return -1;
        } else if (this.numeroExpediente > a.getNumeroExpediente()) {
            return 1;
        } else {
            return 0;
        }
    }
}
