/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 * *• Ejercicio 1. – Realiza un programa en JAVA, orientado a objetos, en el
 * que crees una clase llamada Calculadora que contenga un atributo numero y el
 * método abstracto realizarOperacion. • Implementa las siguientes clases, las
 * cuales heredan de Calculadora: • Suma: Tiene un atributo llamado sumando. El
 * método realizarOperacion calcula la suma de los atributos sumando y numero y
 * muestra el resultado por pantalla. • Multiplicacion: Tiene un atributo
 * llamado multiplicador. El método realizarOperacion calcula la mutliplicación
 * de los atributos multiplicador y numero y muestra el resultado por pantalla.
 * • Potencia: Tiene un atributo llamado exponente. El método realizarOperacion
 * calcula la potenica de numero elevado a exponente y muestra el resultado por
 * pantalla. • Crea una clase Test en la que instancies un objeto de cada
 * subclase implementada anteriormente y pruebes el método realizarOperacion de
 * cada objeto. • Posteriormente, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la superclase Calculadora y prueba los métodos
 * implementados nuevamente.
 *
 * @author Angel
 */
public abstract class Calculadora {

    //ATRIBUTOS
    private int numero;
    //CONSTRUCTORES
    //por defecto
    public Calculadora() {
        this.numero = 0;
    }
    //parametrizado
    public Calculadora(int numero) {
        this.numero = numero;
    }
    //Geters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //metodo abstracto
    public abstract void realizarOperacion();
    
    //metodo mostrar
    public void mostrar(){
        System.out.println("Numero"+this.numero);
    }
    //ToString
    @Override
    public String toString() {
        return "Calculadora{" + "numero=" + numero + '}';
    }
    
}
