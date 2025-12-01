/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author USUARIO
 */
public abstract class Triangulo extends FiguraGeometrica{
    //ATRIBUTOS
    private double base;
    private double altura;
    
    //CONSTRUCTORES
    public Triangulo(){
        super();
        base = 0;
        altura = 0;
    }
    
    public Triangulo(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    //GETTER Y SETTER
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //MOSTRAR
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}