/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8arraysdeobjetos;

/**
 *
 * @author USUARIO
 */
public class Marcador {
    // ATRIBUTOS
    private String color;
    private float precio;
    
    //CONSTRUCTORES
    public Marcador() {
        this.color = "";
        this.precio = 0.0f;
    }
    public Marcador(String color, float precio) {
        this.color = color;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    // TO STRING

    @Override
    public String toString() {
        return "Marcador{" + "color=" + color + ", precio=" + precio + '}';
    }
      
}
