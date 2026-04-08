/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 * *• Ejercicio 3. – Desarrolla un programa en JAVA, orientado a objetos, que
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
public abstract class FiguraGeometrica {
    
    //ATRIBUTOS
    private String color;
    //Parametrizado
    public FiguraGeometrica(){
        this.color = "";
    }
    //Por defecto
    public FiguraGeometrica(String color){
        this.color = color;
    }
    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //metodo abstractos de la clase padre
    public abstract void area();
    
    public abstract void perimetro();
    
    //metodo mostrar
    public void mostrarFiguraGeometrica(){
        System.out.println("Color"+this.color);
    }
    
    //metodo ToString
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }
    
}
