/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *• Ejercicio 3. – Desarrolla un programa en JAVA, orientado a objetos, que
modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y el
triángulo rectángulo. Para ello, implementa una clase FiguraGeometrica que
contenga un atributo color y dos métodos abstractos que permitan calcular el
área y el perímetro de la figura. Las clases Circulo, Rectangulo y Cuadrado
deben heredar de la clase FiguraGeometrica y la clase TrianguloRectangulo de
Triangulo.
• Ten en cuenta que:
• El círculo tiene como atributo su radio en centímetros.
• El rectángulo, su base y altura en centímetros.
• El cuadrado, la longitud de sus lados en centímetros.
• El triángulo, su base y altura en centímetros.
* • Además, para el triángulo rectángulo se requiere:
• Un método que calcule y devuelva la hipotenusa del triángulo.
• Un método para determinar qué tipo de triángulo es:
Equilátero, Isósceles o Escaleno.
• Desarrolla una clase de prueba con un método main para crear
las cuatro figuras y probar sus respectivos métodos.
• Posteriormente, utiliza el polimorfismo para crear cada uno de
los objetos a partir de la superclase FiguraGeometrica y prueba
los métodos implementados nuevamente.
* 
 * @author Angel
 */
public class Rectangulo extends FiguraGeometrica{
    //ATRIBUTOS
    private double basecm;
    private double alturacm;
    //CONSTRUCTORES
    //Por defecto
    public Rectangulo() {
        this.basecm = 0.0;
        this.alturacm = 0.0;
    }
    //Parametrizado
    public Rectangulo(double basecm, double alturacm, String color) {
        super(color);
        this.basecm = basecm;
        this.alturacm = alturacm;
    }
    //Getters y Setters
    public double getBasecm() {
        return basecm;
    }

    public void setBasecm(double basecm) {
        this.basecm = basecm;
    }

    public double getAlturacm() {
        return alturacm;
    }

    public void setAlturacm(double alturacm) {
        this.alturacm = alturacm;
    }
    
    //metodos abstractos heredados de la clase padre
    @Override
    public void area(){
        double area = basecm * alturacm;
        System.out.println("Area del rectangulo: "+area);
    }
    @Override
    public void perimetro(){
        double perimetro = (2*basecm)+ (2*alturacm);
        System.out.println("Perimetro del rectangulo "+perimetro);
    
    }
    //metodo mostrar
    public void mostrar(){
        mostrarFiguraGeometrica();
        System.out.println("Base en cm"+this.basecm);
        System.out.println("Altura en cm"+this.alturacm);
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString() +"Rectangulo{" + "basecm=" + basecm + ", alturacm=" + alturacm + '}';
    }
    
}
