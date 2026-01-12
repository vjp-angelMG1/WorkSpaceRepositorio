/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class Ejercicio5Mamifero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Objetos que se crean en la clase (Ornitorinco y Murcielago)
       Ornitorrinco ornitorrinco = new Ornitorrinco("Cafe", "Macho", "Negro", 5 , 2);
       Murcielago murcielago = new Murcielago("Kela", "Hembra", "Hembra", "Negro", 3, 10);
       
       //Mostrar los datos del ornitorrinco y simulamos los comportamientos ovíparos
       System.out.println("--Datos del Ornitorrico--");
       ornitorrinco.mostrarDatos();
       ornitorrinco.ponerHuevo();
       ornitorrinco.incubarHuevo();
       ornitorrinco.mostrarNumHuevos();
       
       
       
    }
    
}
