/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio6;

/**
 *• Ejercicio 6. – Realiza un programa en JAVA, orientado a objetos, en el
que crees una interfaz Transformable que contenga las siguientes
operaciones sobre cadenas:
• concatenarTodo. Devuelve una cadena resultado de concatenar todas las cadenas de
un objeto separadas con el carácter ‘#’.
• obtenerIniciales. Devuelve una cadena resultado de concatenar las iniciales de todas
las cadenas de un objeto.
• contarVocales. Cuenta todas las vocales de todas las cadenas de un objeto y muestra el
resultado por pantalla.
• obtenerCadenaMasLarga. Devuelve la cadena mas larga de todas las cadenas de un
objeto.
• buscarCadena. Recibe una cadena por parámetros. Devuelve true si el objeto tiene una
cadena con ese valor y false en caso contrario.
* • Crea las clases Libro (con los atributos título, autor y género) y
Persona (con los atributos nombre, apellidos y alias). Ambas
clases deben implementar el comportamiento definido en la
interfaz Transformable.
• Para probar el programa, implementa una clase Test en la que
instancies un objeto de cada clase creada anteriormente y
pruebes los métodos de cada objeto.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la interfaz Transformable y prueba los
métodos implementados nuevamente.

 * @author Angel
 */
public interface Transformable { 
    
    public String concatenarTodo(); //metdos abstractos de la interfaz
    public String obtenerIniciales();
    public void contarVocales();
    public String obtenerCadenaMasLarga();
    public boolean buscarCadena (String cadena);
    
}
