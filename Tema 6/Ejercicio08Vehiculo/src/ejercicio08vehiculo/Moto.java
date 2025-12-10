/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08vehiculo;

/**
 *
 * @author USUARIO
 */

public class Moto extends Vehiculo {
    //Atributo
    private boolean haciendoCaballito;
    
    //Constructores
    public Moto(){
        super();
        haciendoCaballito = false;
    }
    public Moto(int velocidad) {
        super(velocidad);
        haciendoCaballito = false;
    }
    
    //Getter/Setter

    public boolean getHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Moto{" + "haciendoCaballito=" + haciendoCaballito + '}';
    }
    
    //Métodos
    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto esta circulando a " + getVelocidad() + " km/h");
    }

    public void hacerCaballito() {
        if (!haciendoCaballito) {
            haciendoCaballito = true;
            setVelocidad(getVelocidad() + 15);
            System.out.println("La moto esta haciendo un caballito. La velocidad aumenta");
        } else {
            System.out.println("La moto ya está haciendo un caballito");
        }
    }
}
    

