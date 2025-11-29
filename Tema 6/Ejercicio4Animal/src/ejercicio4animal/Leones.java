/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author USUARIO
 */
public class Leones extends Felinos {
    public Leones() {
        super();
    }
    public Leones(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Rugido");
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora.");
    }
    @Override
    public void habitat() {
        System.out.println("Africa subsahariana.");
    }
    
    @Override
    public void nombreCientifico() {
        System.out.println("Panthera leo.");
    }
     //Mostrar
    @Override
    public String toString(){
        return super.toString();
    }
    
}
