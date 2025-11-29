/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase Test
 * Programa principal para crear y mostrar animales
 * Incluye ejemplos de objetos normales y polimórficos
 * @author Ángel
 */
public class Test {
    

    public static void main(String[] args) {
        // Creación de objetos normales
        Perros perro = new Perros("Ares", 5, 35); //creo un objeto Perro con nombre,edad y peso
        Lobos lobo = new Lobos("Fenrir", 4, 30); //creo un objeto Lobo con nombre,edad y peso
        Leones leon = new Leones("Mufasa", 8, 180); //creo un objeto León con nombre,edad y peso
        Gatos gato = new Gatos("Felix", 6, 8); //creo un objeto Gato con nombre,edad y peso
        
        //Muestro la información de los objetos normales
        System.out.println("Objetos normales");
        System.out.println("Perro:"); //Llama al método mostrarTodo de Perros
        perro.mostrarTodo();
        System.out.println("Lobo:"); //LLama al método mostrarTodo de Lobos
        lobo.mostrarTodo(); 
        System.out.println("Leon"); //Llama al método mostrarTodo de Leon
        leon.mostrarTodo();
        System.out.println("Gato"); //Llama al método mostrarTodo de Gato
        gato.mostrarTodo();
        
        //Polimorfismo: objetos a partir de la superclase
        //Creamos objetos de tipo Animal pero con instancias de subclases
        //Esto permite usar polimorfismo: un mismo tipo (Ánimal) puede referirse a diferentes subclases 
        System.out.println("POLIMORFISMO");
        
        Animal a1 = new Perros("Ares", 5, 35); // Perro con Animal
        Animal a2 = new Lobos("Fenrir", 4, 30); //Lobo como Animal
        Animal a3 = new Leones("Mufasa", 8, 180); //León como Animal
        Animal a4 = new Gatos("Felix", 6, 8); //Gato como Animal
        
        //Muestro cada animal polimórfico
        System.out.println("Sonido del Perro :");
        a1.sonido(); //Llama a mostrartodo de la subclase Perros
        System.out.println("Sonido del Lobo :");
        a2.sonido(); //Llama a mostrartodo de la subclase Lobos
        System.out.println("Sonido del Leon :");
        a3.sonido(); //Llama a mostrartodo de la subclase Leones
        System.out.println("Sonido del Gato :");
        a4.sonido(); //Llama a mostrartodo de la subclase Gatos
    }
    
}
