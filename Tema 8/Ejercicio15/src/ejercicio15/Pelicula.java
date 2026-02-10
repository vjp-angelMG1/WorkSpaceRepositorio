/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Angel
 */
public class Pelicula {
        // ATRIBUTOS
    private String titulo;
    private double costeLicencia;
    private Socio[] socios;
    
    // CONSTRUCTOR POR DEFECTO
    public Pelicula() {
        this.titulo = "";
        this.costeLicencia = 0;
        this.socios = new Socio [4];
        for (int i = 0; i < socios.length; i++) {
            socios[i] = new Socio();
        }
    }
    
    // CONSTRUCTOR PARAMETRIZADO
    public Pelicula(String titulo, double costeLicencia, Socio[] socios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socios = socios;
    }
    
    // GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(double costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socio[] getSocios() {
        return socios;
    }

    public void setSocios(Socio[] socios) {
        this.socios = socios;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", socios=" + socios + '}';
    }
    
}
