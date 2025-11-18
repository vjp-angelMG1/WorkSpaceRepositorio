/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05.Herencias;

/**
 *
 * @author alumno
 */
public class Jugador extends Personaje {
    // ATRIBUTOS
    public String inventario;
    
    // CONSTRUCTORES 
    public Jugador() {
        // Llamar al constructor por defecto de Personaje
        super();
        this.inventario = "";
    }
    
    public Jugador(int vida, String inventario) {
        super(vida);
        this.inventario = inventario;
    }
    
    //GETTERS Y SETTERS
    public String getInventario() {
        return this.inventario;
    }
    
    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    
    //MÉTODOS
    public void recoger(String objeto) {
        System.out.println("Recogiendo " + objeto + "...");
    }
    //TO STRING
    @Override
    public String toString() {
        return super.toString() + " y es un JUGADOR con " + this.inventario;
    }
}
