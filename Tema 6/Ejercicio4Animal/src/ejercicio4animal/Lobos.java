/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author USUARIO
 */
public class Lobos extends Canidos{
    public Lobos() {
        super();
    }
    public Lobos(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Aullido.");
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora.");
    }
    
    @Override
    public void habitat() {
        System.out.println("Monte");
    }
    
    @Override
    public void nombreCientifico() {
        System.out.println("Canis lupus.");
    }
    
}
