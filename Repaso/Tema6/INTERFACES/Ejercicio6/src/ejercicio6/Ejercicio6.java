/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 * • Ejercicio 6. – Realiza un programa en JAVA, orientado a objetos, en el que
 * crees una interfaz Transformable que contenga las siguientes operaciones
 * sobre cadenas: • concatenarTodo. Devuelve una cadena resultado de concatenar
 * todas las cadenas de un objeto separadas con el carácter ‘#’. •
 * obtenerIniciales. Devuelve una cadena resultado de concatenar las iniciales
 * de todas las cadenas de un objeto. • contarVocales. Cuenta todas las vocales
 * de todas las cadenas de un objeto y muestra el resultado por pantalla. •
 * obtenerCadenaMasLarga. Devuelve la cadena mas larga de todas las cadenas de
 * un objeto. • buscarCadena. Recibe una cadena por parámetros. Devuelve true si
 * el objeto tiene una cadena con ese valor y false en caso contrario. • Crea
 * las clases Libro (con los atributos título, autor y género) y Persona (con
 * los atributos nombre, apellidos y alias). Ambas clases deben implementar el
 * comportamiento definido en la interfaz Transformable. • Para probar el
 * programa, implementa una clase Test en la que instancies un objeto de cada
 * clase creada anteriormente y pruebes los métodos de cada objeto. •
 * Posteriormente, utiliza el polimorfismo para crear cada uno de los objetos a
 * partir de la interfaz Transformable y prueba los métodos implementados
 * nuevamente.
 *
 * @author Angel
 */
public class Ejercicio6 {

  public static void main(String[] args) {
        System.out.println("Objetos de la subclase");
        
        System.out.println("--LIBRO --"); //creo los objetos de las subclases y compruebo las iniciales,la cadena mas larga y la cadena buscada
        Libro libro = new Libro("Submarino amarillo", "Pablo Nuñez", "Aventuras");
        System.out.println(libro.concatenarTodo());
        System.out.println("Iniciales del libro: " + libro.obtenerIniciales());
        libro.contarVocales();
        System.out.println("La cadena más larga es el: " + libro.obtenerCadenaMasLarga());
        String cadenaBuscada = "Aventuras";
        if (libro.buscarCadena(cadenaBuscada)) {
            System.out.println("El libro tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("El libro no tiene la cadena '" + cadenaBuscada + "'");
        }

        System.out.println("-- PERSONA --");
        Persona persona = new Persona("Jose", "Lopez Barco", "Profesor");
        System.out.println(persona.concatenarTodo());
        System.out.println("Iniciales: " + persona.obtenerIniciales());
        persona.contarVocales();
        System.out.println("La cadena más larga es: " + persona.obtenerCadenaMasLarga());
        cadenaBuscada = "Conductor";
        
        // 
        if (persona.buscarCadena(cadenaBuscada)) {
            System.out.println("La persona tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("La persona no tiene la cadena '" + cadenaBuscada + "'");
        }

        System.out.println("-- POLIMORFISMO --"); //creo los objetos con polimorfismo apartir de la interfaz y compruebo las iniciales,la cadena mas larga y la cadena buscada

        System.out.println("-- LIBRO --");
        Transformable libroTransformable = new Libro("Submarino amarillo", "Pablo Nuñez", "Aventuras");
        System.out.println(libroTransformable.concatenarTodo());
        System.out.println("Iniciales: " + libroTransformable.obtenerIniciales());
        libroTransformable.contarVocales();
        System.out.println("La cadena más larga es: " + libroTransformable.obtenerCadenaMasLarga());
        cadenaBuscada = "Aventuras";
        if (libroTransformable.buscarCadena(cadenaBuscada)) {
            System.out.println("El libro tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("El libro no tiene la cadena '" + cadenaBuscada + "'");
        }

        System.out.println("-- PERSONA --");
        Transformable personaTransformable = new Persona("Jose", "Lopez Barco", "Profesor");
        System.out.println(personaTransformable.concatenarTodo());
        System.out.println("Iniciales: " + personaTransformable.obtenerIniciales());
        personaTransformable.contarVocales();
        System.out.println("La cadena más larga es: " + personaTransformable.obtenerCadenaMasLarga());
        cadenaBuscada = "conductor";
        if (personaTransformable.buscarCadena(cadenaBuscada)) {
            System.out.println("La persona tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("La persona no tiene la cadena '" + cadenaBuscada + "'");
        }

    }
}
