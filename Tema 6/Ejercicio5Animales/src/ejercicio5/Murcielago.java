/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador {
    


    //ATRIBUTOS
    private double alturaDeVuelo;
    
    //CONSTRUCTORES
    //Por defecto 
    public Murcielago(){
    
        this.alturaDeVuelo = 0.0;
    
    }
    //parametrizado
    public Murcielago(String nombre,String sexo,String color, int edad, double alturaDeVuelo){
        super(nombre, sexo, color, edad);
        this.alturaDeVuelo = alturaDeVuelo;
    }
    //Getters y Setters
    public double GetalturaDeVuelo(){
        return alturaDeVuelo;
    }
    
    public void SetalturaDeVuelo(){
        this.alturaDeVuelo = alturaDeVuelo;
    }
    //Metodos para incrementar los interfaces
    @Override
    public String obtenerMensajeVolador() {
        return "El murcielago es un animal volador";
    }
    @Override 
    public void aumentarAlturaVuelo() {
        this.alturaDeVuelo = alturaDeVuelo + 5;
        System.out.println("La altura vuelo ha aumentado 5 metros");
    }
    @Override 
    public void bajarAlturaVuelo() {
        this.alturaDeVuelo = alturaDeVuelo - 5;
        System.out.println("La altura vuelo ha disminuido 5 metros");
    }
    
   
    

    //Método toString
    @Override
    public  String toString(){
        return super.toString()+ ", Murcielago{" + "alturaVuelo=" + altura de vuelo + '}';
    }
    
    
    
    
    
    
    
    
    
}
