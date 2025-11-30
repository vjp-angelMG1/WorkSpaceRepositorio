/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1operaciones;

/**
 * Multiplicacion: Tiene un atributo llamado multiplicador. El método realizarOperacion calcula la multiplicación
 * de los atributos multiplicador y numero y muestra el resultado por pantalla.
 * @author Ángel
 */
public class Multiplicacion extends Calculadora {
    
    //Creamos el atributo
    private double multiplicador;
    
    //Creamos el constructor por defecto con la herencia
    public Multiplicacion() {
        super();
        this.multiplicador = 0;
    }
    
    //Creamos el constructor parametrizado con la herencia
    public Multiplicacion(int numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    //Creamos el getter y setter
    public double getMultiplicador(){
        return multiplicador;
    }
    
    public void setMultiplicador(){
        this.multiplicador = multiplicador;
    }
    //Creo el método con el Override
    /**
     * Método que usa el método de la super clase que hace su función propia
     */
    @Override
    public void realizarOperacion() {
        double resultado = super.getNumero() * this.multiplicador;
        System.out.println("La multiplicación del número " + super.getNumero() + " por " + this.multiplicador + " es igual a:" + resultado);
    }
    
    //Creamos To String
    @Override
    public String toString() {
        return "La multiplicación del número " + super.getNumero() + " y el numero " + this.multiplicador;
                
    }
}   

