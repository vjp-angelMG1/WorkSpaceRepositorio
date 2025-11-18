/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;

/**
 *
 * @author USUARIO
 */
public class Coche {
       //Creamos los atributos
    private String marca;
    private String modelo;
    private String color;
    public int velocidad;
    public boolean motorEncendido;

    //Creamos los constructores por defecto
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }

    //Creamos los constructores con sus parámetros
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }

    //Creamos los getter y setters para que devuelvan y establezcan el valor de los atributos
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean getMotorEncendido() {
        return this.motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    //Creamos los métodos públicos
    
    /**
     * Método que establece la marca
     * @param marca 
     */
    public void establecerMarca(String marca) {
        this.marca = marca;
        System.out.println("Esta es la marca: " + this.marca);
    }
    /**
     * Método que establece el modelo
     * @param modelo 
     */
    public void establecerModelo(String modelo) {
        this.modelo = modelo;
        System.out.println("Este es el modelo: " + this.modelo);
    }
    /**
     * Método que establece el color
     * @param color 
     */
    public void establecerColor(String color) {
        this.color = color;
        System.out.println("Su color es: " + this.color);
    }
    /**
     * Método que arranca el coche
     */
    public void arrancarCoche() {
        this.motorEncendido = true;
        this.velocidad = 10;
        System.out.println("El coche ha arrancado " + this.motorEncendido
                + " su velocidad es " + this.velocidad);
    }
    /**
     * Método que apaga el coche
     */
    public void apagarCoche() {
        this.motorEncendido = false;
        this.velocidad = 0;
        System.out.println("El coche está apagado " + this.motorEncendido
                + " su velocidad es: " + this.velocidad);
    }
    /**
     * Método que acelera el coche
     */
    public void acelerarCoche() {
        if (this.motorEncendido) {
            this.velocidad += 20;
            System.out.println("El coche ha acelerado. Velocidad actual: " + this.velocidad);
        } else {
            System.out.println("No se puede acelerar. El motor está apagado");
        }
    }
    /**
     * Método que frena el coche
     */
    public void frenarCoche() {
        if (this.motorEncendido) {
            this.velocidad -= 6;
            if (this.velocidad < 0) {
                this.velocidad = 0; //Así no nos dá velocidad negativa        
            }
            System.out.println("El coche ha frenado. Su velocidad es: " + this.velocidad);
        } else {
            System.out.println("No se puede frenar. El motor está apagado");
        }
    }
    /**
     * Método que muestra el estado del coche
     */
    public void mostrarEstado() {
        System.out.println("Estado del coche:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Velocidad: " + this.velocidad);
        System.out.println("Motor encendido: " + this.motorEncendido);
    }

    //Creamos el TO STRING
    @Override
    public String toString() {
        return "Mi coche es de la marca: " + this.marca + "El modelo es: "
                + this.modelo + "Es de color: " + this.color + "Su velocidad ahora mismo: "
                + this.velocidad + " y su motor ahora mismo está: " + this.motorEncendido;
    }
}
