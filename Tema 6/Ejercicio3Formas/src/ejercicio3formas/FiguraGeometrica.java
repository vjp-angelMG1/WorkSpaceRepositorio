/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author USUARIO
 */
public abstract class FiguraGeometrica {
    //ATRIBUTO
    private String color;
    
    //CONSTRUCTORES
    public FiguraGeometrica(){
        color = "";
    }
    
    public FiguraGeometrica(String color){
        this.color = color;
    }
    
    //GETTER/SETTER
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    //MÉTODOS ABSTRACTOS
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    //MOSTRAR
    @Override
    public String toString(){
        return "FiguraGeometrica{" + "color=" + color + '}';
    }      
    
}
