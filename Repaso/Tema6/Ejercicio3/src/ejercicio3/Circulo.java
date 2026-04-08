/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 * • Ejercicio 3. – Desarrolla un programa en JAVA, orientado a objetos, que
 * modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y
 * el triángulo rectángulo. Para ello, implementa una clase FiguraGeometrica que
 * contenga un atributo color y dos métodos abstractos que permitan calcular el
 * área y el perímetro de la figura. Las clases Circulo, Rectangulo y Cuadrado
 * deben heredar de la clase FiguraGeometrica y la clase TrianguloRectangulo de
 * Triangulo. • Ten en cuenta que: • El círculo tiene como atributo su radio en
 * centímetros. • El rectángulo, su base y altura en centímetros. • El cuadrado,
 * la longitud de sus lados en centímetros. • El triángulo, su base y altura en
 * centímetros. • Además, para el triángulo rectángulo se requiere: • Un método
 * que calcule y devuelva la hipotenusa del triángulo. • Un método para
 * determinar qué tipo de triángulo es: Equilátero, Isósceles o Escaleno. •
 * Desarrolla una clase de prueba con un método main para crear las cuatro
 * figuras y probar sus respectivos métodos. • Posteriormente, utiliza el
 * polimorfismo para crear cada uno de los objetos a partir de la superclase
 * FiguraGeometrica y prueba los métodos implementados nuevamente.
 *
 * @author Angel
 */
public class Circulo extends FiguraGeometrica {
    //Atributos
    private double radiocm;
    //Constructores
    //Por defecto
    public Circulo() {
        this.radiocm = 0.0;
    }
    //Parametrizado
    public Circulo(double radiocm, String color) {
        super(color);
        this.radiocm = radiocm;
    }
    //Getters y Setters
    public double getRadiocm() {
        return radiocm;
    }

    public void setRadiocm(double radio) {
        this.radiocm = radiocm;
    }

    //metodos abstractos de la clase padre con otros comportamientos en la clase hija
    @Override
    public void area() {
        double area = Math.PI * (radiocm * radiocm);
        System.out.println("Area del circulo: "+area);
    }
    //metodos abstractos heredados de la clase padre
    @Override
    public void perimetro() {
        double perimetro = Math.PI * 2 * radiocm;
        System.out.println("Perimetro del circulo: "+perimetro);
    }
    //metodo mostrar circulo
    public void mostrarCirculo(){
        mostrarFiguraGeometrica();
        System.out.println("Radio"+this.radiocm);
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString()+"Circulo{" + "radio=" + radiocm + '}';
    }

}
