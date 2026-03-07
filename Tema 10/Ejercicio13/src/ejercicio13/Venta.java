/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Ángel
 */
public class Venta {
    // ATRIBUTOS
    private String nombreMes;
    private int ventas;
    
    // CONSTRUCTORES
    // Por defecto
    public Venta() {
        this.nombreMes = "";
        this.ventas = 0;
    }
    // Parametrizado
    public Venta(String nombreMes, int ventas) {
        this.nombreMes = nombreMes;
        this.ventas = ventas;
    }
    
    // GETTERS Y SETTERS
    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Venta{" + "nombreMes=" + nombreMes + ", ventas=" + ventas + '}';
    }
    
}

