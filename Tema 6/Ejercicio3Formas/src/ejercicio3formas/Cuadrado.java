/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author Ángel
 */
public class Cuadrado extends FiguraGeometrica {
    //ATRIBUTO
    private double lado;


    //CONSTRUCTORES
    public Cuadrado(){
        super();
        lado = 0;
    }
    
    public Cuadrado(String color, double lado){
        super(color);
        this.lado = lado;
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularArea()
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
}