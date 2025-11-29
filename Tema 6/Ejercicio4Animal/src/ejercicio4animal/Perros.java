/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    //CONSTRUCTORES
    //por defecto
    public Perros(){
        super();
    }
    //parametrizado
    public Perros(String nombre,int edad, double peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Ladrido.");
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Carnivora.");
    }
    
    @Override
    public void habitat() {
        System.out.println("Domestico");
    }
    
    @Override
    public void nombreCientifico() {
        System.out.println("Canis lupus familiaris.");
    }

    //Mostrar
    @Override
    public String toString(){
        return super.toString();
    }
}
