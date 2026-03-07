/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoarraysfiguras;

/**
 *
 * @author Ángel
 */
public class Figura {

    //Atributos 
    private String nombre;
    private float valor;
    private String coleccion;

    // Constructor parametrizado
    public Figura() {
        this.nombre = " ";
        this.valor = 0.0f;
        this.coleccion = " ";
    }

    // Constructor por defecto 
    public Figura(String nombre, float valor, String coleccion) {
        this.nombre = nombre;
        this.valor = valor;
        this.coleccion = coleccion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    // toString
    @Override
    public String toString() {
        return "Figura{"
                + "nombre='" + nombre + '\''
                + ", valor=" + valor
                + ", coleccion='" + coleccion + '\''
                + '}';
    }
}
