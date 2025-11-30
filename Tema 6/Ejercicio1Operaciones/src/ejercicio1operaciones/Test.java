/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1operaciones;

/**
 * Crear una clase Test en la que se instancie un objeto de cada subclase
 * implementada anteriormente y probar el método realizarOperación de cada objeto.
 * 
 * Posteriormente, utilizar el polimorfismo para crear cada uno de los objetos a partir
 * de la subclase Calculadora y prueba los métodos implementados nuevamente.
 * @author Ángel
 */
public class Test {


    public static void main(String[] args) {
        
        //Creamos los objetos normales sin el polimorfismo
        Suma suma = new Suma(4, 7);
        suma.realizarOperacion(); //Llamamos al metodo con el objeto suma creado
        
        Multiplicacion multiplicacion = new Multiplicacion(8, 4.3);
        multiplicacion.realizarOperacion(); //Llamamos al metodo con el objeto multiplicación creado
        
        Potencia potencia = new Potencia(20, 4);
        potencia.realizarOperacion(); //Llamamos al metodo con el objeto potencia creado
        
        //Creamos los objetos con polimorfismo
        
        //Declaramos una única variable de la superclase abstracta.
        
        Calculadora calculadora; // Esta variable puede apuntar a cualquier objeto que herede de Calculadora
    
        System.out.println("---Usando Suma---");
        calculadora = new Suma(8,9);
        calculadora.realizarOperacion();
        
        System.out.println("---Usando Multiplicación---");
        calculadora = new Multiplicacion(3,6);
        calculadora.realizarOperacion();
        
        System.out.println("---Usando Potencia---");
        calculadora = new Potencia(7, 3);
        calculadora.realizarOperacion();
    }
    
}
