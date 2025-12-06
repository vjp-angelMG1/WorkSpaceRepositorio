/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08vehiculo;

/**
 *
 * @author USUARIO
 */

public abstract class Vehiculo {
    //Atributo
    private int velocidad;
    
    //Constructores
    public Vehiculo(){
        velocidad = 0;
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Getter/Setter
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Mostrar
    @Override    
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + '}';
    }

    // Método abstracto que cada subclase debe implementar
    public abstract void mostrarMovimiento();
}

