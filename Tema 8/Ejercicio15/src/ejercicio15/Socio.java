/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Angel
 */
public class Socio {
    // ATRIBITOS

    private String nombre;
    private double precio;

    // CONSTRUCTOR POR DEFECTO
    public Socio() {
        this.nombre = "";
        this.precio = 0;
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Socio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Socios{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
