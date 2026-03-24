/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Angel
 */

public class Donacion {
    // ATRIBUTOS
    private String nombrePersona;
    private float cantidad;
    
    // CONSTRUCTOR POR DEFECTO
    public Donacion() {
        this.nombrePersona = "";
        this.cantidad = 0f;
    }

    // CONSTRUCTOR PARAMETRIZADO
    public Donacion(String nombrePersona, float cantidad) {
        this.nombrePersona = nombrePersona;
        this.cantidad = cantidad;
    }
    
    // GETTERS Y SETTERS
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    // MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Nombre: " + nombrePersona + " | Cantidad: " + cantidad;
    }
}

