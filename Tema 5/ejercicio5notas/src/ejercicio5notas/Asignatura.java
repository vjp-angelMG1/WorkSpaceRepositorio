/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5notas;

/**
 *
 * @author USUARIO
 */
public class Asignatura {
    
     
    private String nombre;
    private double nota;

    public Asignatura() {
        nombre = "";
        nota = 0;
    }

    public Asignatura(String nom, double not) {
        nombre = nom;
        nota = not;
    }
    
    public Asignatura(String nom){
        nombre = nom;
        nota = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double not){
        nota = not;
    }
    
    public static double notaMedia(double notaProg, double notaLmsgi, double notaBd, double notaEd, double notaSi, double notaFol){
        double notaMedia = (notaProg + notaLmsgi + notaBd + notaEd + notaSi + notaFol) / 6;
        return notaMedia;
    }
}
