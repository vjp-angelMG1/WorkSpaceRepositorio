/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1operaciones;

/**
 * Suma: Tiene un atributo llamado sumando. El Método realizarOperación calcula la suma de los atributos sumando y numero y muestra el resultado por pantalla.
 * 
 * @author USUARIO
 */
public class Suma extends Calculadora {
    
    //Creamos los atributos
    private int sumando;
    
    //Creamos el constructor por defecto con la herencia
    public Suma() {
        super();
        this.sumando = 0;
    }
    
    //Creamos el constructor parametrizado con la herencia
    public Suma(int sumando, int numero) {
        super(numero);
        this.sumando = sumando;
    }
    
    //Creamos el getter y setter para devolver valor o modificar el que ya tiene
    public int getSumando(){
        return sumando;
    }
    
    public void setSumando(int sumando) {
        this.sumando = sumando;
    }
  
    //Creamos el método con el Override
    
    /**
     * Método que usa el método de la super clase que hace su funcíon propia
     */
    @Override
    public void realizarOperacion(){
        int resultado = super.getNumero() + this.sumando;
        System.out.println("La suma del numero " + super.getNumero() + "y el número " + this.sumando + " es: " + resultado);
    }
    //Creo ToString
    @Override
    public String toString() {
        return "La suma del número " + super.getNumero() + " y el número " + this.sumando;
    }
}   


