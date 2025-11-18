/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05.Herencias;

/**
 *
 * @author alumno
 */
public class Main {
    
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        System.out.println(personaje);
        
        Jugador jugador = new Jugador(50,"Palo");
        System.out.println("jugador");
        
        Enemigo enemigo = new Enemigo(30,"Espada"); //llamar a la clase enemigo para crear el objeto enemigo
        System.out.println("enemigo");
        
        personaje.atacar();
        jugador.atacar();
        enemigo.atacar();
        
        jugador.recoger("moneda");
//        personaje.recoger("moneda"); // Personaje no tiene el metodo 
//        enemigo.recoger("moneda"); // Enemigo no tiene el método 
        enemigo.crearSoldados(); //
        
        
        System.out.println("En el inventario hay un "+jugador.getInventario());
        System.out.println("El jugador tiene de vida "+jugador.getVida());
        System.out.println("El enemigo tiene " +enemigo.getArma());
        System.out.println("El personaje tiene de vida " +personaje.getVida());
        System.out.println("El enemigo tiene de vida " +enemigo.getVida());
        
        
    }
}
     