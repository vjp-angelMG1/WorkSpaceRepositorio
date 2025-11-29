/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author USUARIO
 */
public class Test {
    
    /**
     * 
     */
    public static void main(String[] args) {
        // Creación de objetos normales
        Perros perro = new Perros("Ares", 5, 35);
        Lobos lobo = new Lobos("Fenrir", 4, 30);
        Leones leon = new Leones("Mufasa", 8, 180);
        Gatos gato = new Gatos("Felix", 6, 8);
        
        System.out.println("Objetos normales");
        perro.mostrarTodo();
        lobo.mostrarTodo();
        leon.mostrarTodo();
        gato.mostrarTodo();
        
        // Polimorfismo: objetos a partir de la superclase
        System.out.println("Polimorfismo");
        Animal a1 = new Perros();
        Animal a2 = new Lobos();
        Animal a3 = new Leones();
        Animal a4 = new Gatos();
        
        System.out.println("Sonido del Perro :");a1.sonido();
        System.out.println("Sonido del Gato :");a2.sonido();
        System.out.println("Sonido del Leon :");a3.sonido();
        System.out.println("Sonido del Gato :");a4.sonido();
    }
    
}
