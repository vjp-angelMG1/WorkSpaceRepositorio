/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author Ángel
 */
public class Rectangulo extends FiguraGeometrica {
    //ATRIBUTOS
    private double base;
    private double altura;
    
    //CONSTRUCTORES
    public Rectangulo() {
        super();
        base = 0;
        altura = 0;
    }
    
    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //GETTER/SETTER
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularArea()
    @Override
    public double calcularArea(){
        return base * altura;
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
        
    //MOSTRAR
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}   

