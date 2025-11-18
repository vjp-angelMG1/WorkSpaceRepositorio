/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;

/**
 *
 * @author alumno
 */
public class Ciclista {
    //ATRIBUTOS
    private String nombre;
    private int dorsal;
    private String tipo;

    // CONSTRUCTORES
    public Ciclista() {
        this.nombre = "";
        this.dorsal = 0;
        this.tipo = "";
    }
    
    public Ciclista(String nombre, int dorsal, String tipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.tipo = tipo;
    }
    
    // GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDorsal() {
        return this.dorsal;
    }
    
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    //MÉTODOS
    
    
    // TO STRING
    @Override
    public String toString() {
        return this.nombre + " (Dorsal " + this.dorsal + ") - " + this.tipo;
    }
}

