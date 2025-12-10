/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08vehiculo;

/**
 *
 * @author Ángel
 */

public class Coche extends Vehiculo {
    //Atributo
    private boolean aireEncendido;
    
    //Constructores
    public Coche(){
        super();
        aireEncendido = false;
    }

    public Coche(int velocidad) {
        super(velocidad);
        aireEncendido = false;
    }
    public boolean isAireEncendido() {    
        return aireEncendido;
    }

    //Getter/Setter
    public void setAireEncendido(boolean aireEncendido) {    
        this.aireEncendido = aireEncendido;
    }
    //Mostrar
    @Override
    public String toString() {
        return "Coche{" + "aireEncendido=" + aireEncendido + '}';
    }
    
    //Métodos
    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche esta circulando a " + getVelocidad() + " km/h");
    }

    public void encenderAire() {
        if (!aireEncendido) {
            aireEncendido = true;
            setVelocidad(getVelocidad() - 10);
            System.out.println("El coche ha encendido el aire. La velocidad se reduce");
        } else {
            System.out.println("El aire ya está encendido");
        }
    }
    
}
