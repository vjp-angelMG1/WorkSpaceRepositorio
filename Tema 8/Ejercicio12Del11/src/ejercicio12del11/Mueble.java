/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12del11;

/**
 *
 * @author Angel
 */
public class Mueble {

    private double precio;
    private String descripcion;

    //Getters y setters
    public Mueble() {
        this.precio = 0F;
        this.descripcion = "";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Getters y setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodos de mostrar como toString
    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }

    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio + " €");
    }

}
