/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author Ángel
 */
public class Circulo extends FiguraGeometrica{
    //ATRIBUTO
    private double radio;
    
    //CONSTRUCTORES
    public Circulo(){
        super();
        radio = 0;
    }
    
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }
    
    //GETTER Y SETTER
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    //IMPLEMENTACIÓN DEL MÉTOODO ABSTRACTO calcularArea()
    @Override
    public double calcularArea(){
        return Math.PI * (radio * radio);
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO CALCULARPERIMETRO()
    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
