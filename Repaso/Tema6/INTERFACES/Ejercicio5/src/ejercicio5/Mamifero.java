/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 * *• Ejercicio 5. – Desarrolla un programa en JAVA, orientado a objetos, en
el que crees una clase llamada Mamifero con los atributos nombre,
sexo, color y edad. Crea también las clases Ornitorrinco (hereda de
Mamifero y tiene como atributo el número de huevos del ornitorrinco)
y Murcielago (hereda de Mamifero y tiene como atributo la altura de
vuelo del murciélago en metros).
• Posteriormente, crea dos interfaces para definir el comportamiento de
los siguientes tipos de mamíferos:
• Oviparo, con los métodos obtenerMensajeOviparo, ponerHuevo,
incubarHuevo y mostrarNumHuevos.
• Volador, con los métodos obtenerMensajeVolador,
aumentarAlturaVuelo, bajarAlturaVuelo y mostrarAlturaVuelo.
* • El Ornitorrinco implementa el siguiente comportamiento:
• obtenerMensajeOviparo. Devuelve el mensaje “El ornitorrinco es un mamífero
ovíparo”.
• ponerHuevo. Aumenta el número de huevos del ornitorrinco en una unidad.
• incubarHuevo. Disminuye el número de huevos del ornitorrinco en una unidad.
• mostrarNumHuevos. Muestra el número de huevos del ornitorrinco.
• El murciélago implementa el siguiente comportamiento:
• obtenerMensajeVolador: Devuelve el mensaje “El murciélago es un animal volador”.
• aumentarAlturaVuelo.Aumenta la altura de vuelo del murciélago en 5 metros.
• bajarAlturaVuelo. Disminuye la altura de vuelo del murciélago en 5 metros.
• mostrarAlturaVuelo. Muestra los metros de altura a los que está volando el
murciélago
* • Crea una clase Test en la que instancies un objeto de cada
subclase implementada anteriormente y pruebes los métodos de
cada objeto.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la interfaz correspondiente y prueba los
métodos implementados nuevamente.
* 
 * @author Angel
 */
public class Mamifero {
    
    //ATRIBUTOS
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    //CONSTRUCTORES
    //Por defecto
    public Mamifero(){
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //metodo mostrar
    public void mostrarMafiero(){
        System.out.println("Nombre :"+this.nombre);
        System.out.println("Sexo :"+this.sexo);
        System.out.println("Color :"+this.color);
        System.out.println("Edad :"+this.edad);
        
    }
    //método to String
    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
    
    
}
