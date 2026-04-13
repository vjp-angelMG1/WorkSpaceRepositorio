/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *• Ejercicio 1. – Realiza un programa en JAVA, orientado a objetos,
en el que crees una clase llamada Calculadora que contenga un
atributo numero y el método abstracto realizarOperacion.
• Implementa las siguientes clases, las cuales heredan de
Calculadora:
• Suma: Tiene un atributo llamado sumando. El método realizarOperacion calcula la
suma de los atributos sumando y numero y muestra el resultado por pantalla.
• Multiplicacion: Tiene un atributo llamado multiplicador. El método realizarOperacion
calcula la mutliplicación de los atributos multiplicador y numero y muestra el resultado
por pantalla.
• Potencia: Tiene un atributo llamado exponente. El método realizarOperacion calcula la
potenica de numero elevado a exponente y muestra el resultado por pantalla.
• Crea una clase Test en la que instancies un objeto de cada
subclase implementada anteriormente y pruebes el método
realizarOperacion de cada objeto.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la superclase Calculadora y prueba los
métodos implementados nuevamente.
* 
 * @author Angel
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("OBJETOS DE LAS SUBCLASES");
        Suma suma = new Suma(4,6); //creo 3 objetos de las subclases
        Multiplicacion multiplicacion = new Multiplicacion(3,7);
        Potencia potencia = new Potencia(5,6);
        
        suma.realizarOperacion(); //llamo a cada metodo de las clases para que realice la operacion
        multiplicacion.realizarOperacion();
        potencia.realizarOperacion();
        
        System.out.println("POLIMORFISMO");
        Calculadora calculadora = new Suma(7,5); //creo 3 objetos con polimorfismo apartir de la clase padre
        Calculadora calculadora1 = new Multiplicacion(8,6);
        Calculadora calculadora2 = new Potencia(6,3);
        
        calculadora.realizarOperacion(); //llamo a cada metodo de las clases para que realice la operacion
        calculadora1.realizarOperacion();
        calculadora2.realizarOperacion();
    }
    
}
