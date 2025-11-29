/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 * Clase Gatos
 * Subclase de Felinos
 * Implementa los métodos abstractos de Animal
 * @author Ángel
 */
public class Gatos extends Felinos {
    public Gatos(){
        super(); //Constructor por defecto
    }
    //parametrizado
    public Gatos(String nombre,int edad, double peso){
        super(nombre, edad,peso); //Constructor parametrizado
    }
    //MÉTODOS ABSTRACTOS
    @Override
    public void sonido() {
        System.out.println("Maullido."); //Sonido del gato
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Ratones."); //Alimentación del gato
    }
    
    @Override
    public void habitat() {
        System.out.println("Domestico."); //Hábitat del gato
    }
    
    @Override
    public void nombreCientifico(){
        System.out.println("Felis catus"); //Nombre científico
    }
    
    //Mostrar
    @Override //muestra información basica hereda de Animal
    public String toString(){
        return super.toString();
    }
}
