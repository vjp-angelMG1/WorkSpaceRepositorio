/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Angel
 */
public class Contacto {
    //Atributos
    String nombre;
    int edad;
    String numero;
    //CONSTRUCTORES
    //Por defecto
    public Contacto(){
        this.nombre = "";
        this.edad = 0;
        this.numero = "";
    }
    //Parametrizado
    public Contacto(String nombre, int edad, String numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    //metodo to String
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Tel: " + numero;
    }
}
