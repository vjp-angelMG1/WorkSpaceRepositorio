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
public class Cuadrado extends FiguraGeometrica {
    //ATRIBUTOS
    private double longuitudladcm;
    //CONSTRUCTORES
    //Por defecto
    public Cuadrado() {
        this.longuitudladcm = 0.0;
    }
    //Parametrizado
    public Cuadrado(double longuitudladcm, String color) {
        super(color);
        this.longuitudladcm = longuitudladcm;
    }
    //Getters y Setters
    public double getLonguitudladcm() {
        return longuitudladcm;
    }

    public void setLonguitudladcm(double longuitudladcm) {
        this.longuitudladcm = longuitudladcm;
    }
    //Metodo mostrar
    public void mostrar(){
        mostrarFiguraGeometrica();
        System.out.println("longuitudladcm"+longuitudladcm);
    }
    //metodos abstractos heredados de la clase padre
    @Override
    public void area(){
        double area = longuitudladcm * longuitudladcm;
        System.out.println("Area del cuadrado: "+ area);
    }
    
    @Override
    public void perimetro(){
        double perimetro = 4 * longuitudladcm;
        System.out.println("Perimetro del cuadrado: "+perimetro);
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString()+"Cuadrado{" + "longuitudladcm=" + longuitudladcm + '}';
    }
    
}
