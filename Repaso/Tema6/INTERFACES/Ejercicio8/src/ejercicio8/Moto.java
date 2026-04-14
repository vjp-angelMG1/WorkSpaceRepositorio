/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 * *• Ejercicio 8. – Realiza un programa en JAVA, orientado a objetos, en el
que crees una clase llamada Vehiculo que contenga un atributo
velocidad y el método abstracto mostrarMovimiento. Ademas, debes
crear dos clases que hereden deVehiculo:
• La clase Coche tiene el atributo aireEncendido y los siguientes
métodos:
• mostrarMovimiento. Muestra el mensaje “El coche está circulando a … km/h”.
• encenderAire. Si el aire no está encendido, lo enciende, muestra el mensaje “El coche ha
encendido el aire. La velocidad se reduce” y decrementa el atributo velocidad en 10 km/h. Si el
aire está encendido, muestra el mensaje “El aire ya está encendido”.
* • La clase Moto tiene el atributo haciendoCaballito y los siguientes métodos:
• mostrarMovimiento. Muestra el mensaje “La moto está circulando a … km/h”.
• hacerCaballito. Si la moto no está haciendo un caballito, lo hace, muestra el mensaje “La moto está
haciendo un caballito. La velocidad aumenta” y aumenta el atributo velocidad en 15 km/h. Si la moto
está haciendo un caballito, muestra el mensaje “La moto ya está haciendo un caballito”.
• Crea una clase main llamada Test en la que implementes el método procesarVehiculo
(Vehiculo vehiculo). Este método no devuelve nada y realiza lo siguiente:
• Muestra el movimiento del vehículo.
• Si el vehículo es un coche, enciende el aire y muestra el movimiento del coche.
• Si el vehículo es una moto, hace un caballito y muestra el movimiento de la moto.
• Posteriormente, instancia un Vehiculo de cada tipo (Coche y Moto) e invoca al método
procesarVehiculo pasándole ambos objetos
* 
 * @author Angel
 */
public class Moto extends Vehiculo {

    //ATRIBUTOS
    private boolean haciendoCaballito;
    
    //CONSTRUCTORES
    //por defecto
    public Moto() {
        super();
    }
    //parametrizado
    public Moto(int velocidad) {
        super(velocidad);
        this.haciendoCaballito = false;
    }
    
    //GETTERS / SETTERS
    public boolean isHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    
    //METODO SOBREESCRITO DESDE LA INTERFACE
    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto esta circulando a " + getVelocidad() + "km/h.");
    }
    
    public void hacerCaballito() {
        if(!haciendoCaballito) {
            haciendoCaballito = true;
            System.out.println("La moto esta haciendo un caballito. La velocidad aumenta.");
            setVelocidad(getVelocidad() + 15);
        } else {
            System.out.println("La moto ya esta haciendo un caballito");
        }
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return super.toString() + ". Moto{" + "haciendoCaballito=" + haciendoCaballito + '}';
    }
    
}

