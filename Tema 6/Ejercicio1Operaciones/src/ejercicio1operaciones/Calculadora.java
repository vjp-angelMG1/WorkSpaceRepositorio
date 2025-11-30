/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1operaciones;

/**
 * Realiza un programa en JAVA, orientado a objetos, en el que crees una clase
 * llamada Calculadora que contenga un atributo numero y el método abstracto realizarOperacion.
 *
 * • Implementa las siguientes clases, las cuales heredan de Calculadora:
 *
 * • Suma: Tiene un atributo llamado sumando. El método realizarOperacion calcula la
 * suma de los atributos sumando y numero y muestra el resultado por pantalla.
 *
 * • Multiplicacion: Tiene un atributo llamado multiplicador. El método realizarOperacion
 * calcula la mutliplicación de los atributos multiplicador y numero y muestra el resultado
 * por pantalla.
 *
 * • Potencia: Tiene un atributo llamado exponente. El método realizarOperacion calcula la
 * potenica de numero elevado a exponente y muestra el resultado por pantalla.
 *
 * @author KevinNS
 */
public abstract class Calculadora { //Esta será la superclase y es abstracta
    
    //Creamos el atributo
    private int numero;
    
    //Creamos el constructor por defecto
    public Calculadora(){
        this.numero = 0;
    }
    
    //Creamos el constructor parametrizado
    public Calculadora(int numero){
        this.numero = numero;
    }
    
    //Creamos el getter y el setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Creamos el método abstracto realizarOperacion
    public abstract void realizarOperacion();
    
    
    //Creamos To String

    @Override
    public String toString() {
        return "El número es: " + this.numero;
    }
    

    
}
