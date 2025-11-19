/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombreynota;

/**
 *
 * @author Ángel
 */
public class Alumno {
     //Atributos de la clase Alumno
    private static String nombre;
    private static int nota;
    
    //Constructores

    public Alumno() {
        nombre = "";
        nota = 0;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters/Setters
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(int nota){
        this.nota = nota;
    }
    
    //Metodos
    public static String mostrarCalificacion(){
        String calificacion;
        if (nota < 0 || nota > 10){
            calificacion = "Error";
        } else if (nota <= 4){
            calificacion = "Suspenso";
        } else if (nota <=6){
            calificacion = "Bien";
        } else if (nota <=8){
            calificacion = "Notable";
        } 
        else {
            calificacion = "Sobresaliente";
        }
       return calificacion;
    }
    
    //Mostrar datos de Alumno
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }   
}
