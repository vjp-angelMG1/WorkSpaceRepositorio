/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos {
    public Gatos(){
        super();
    }
    //parametrizado
    public Gatos(String nombre,int edad, double peso){
        super(nombre, edad,peso);
    }
    
    @Override
    public void sonido() {
        System.out.println("Maullido.");
    }
    
    @Override
    public void alimentacion() {
        System.out.println("Ratones.");
    }
    
    @Override
    public void habitat() {
        System.out.println("Domestico.");
    }
    
    @Override
    public void nombreCientifico(){
        System.out.println("Felis catus");
    }
    
    //Mostrar
    @Override
    public String toString(){
        return super.toString();
    }
}
