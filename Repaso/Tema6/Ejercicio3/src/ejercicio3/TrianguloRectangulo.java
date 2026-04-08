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
public class TrianguloRectangulo extends Triangulo { //hereda de triangulo

    //No hay atributos de la clase nieta
    //CONSTRUCTORES
    //Por defecto
    public TrianguloRectangulo() {
        super();
    }

    //Parametrizado
    public TrianguloRectangulo(double basecm, double alturacm, String color) {
        super(basecm, alturacm, color);
    }

    //metodo para calcular la hipotenusa y devolver el resultado con la clase math.hypot la suma de los catetos al cuadrado
    public double hipotenusa() {
        return Math.hypot(getBasecm(), getAlturacm());
    }

    //metodo para comprobar el tipo de triangulo que es 3 lados iguales equilatero,escaleno todos los lados diferentes,isoceles dos de sus lados iguales
    public void tipoTriangulo() {
        if ((getBasecm() == getAlturacm()) && (getBasecm() == obtenerHipotenusa())) { //condicional si las bases y las alturas son iguales
            System.out.println("Es equilatero todos sus lados son iguales");
        } else if ((getBasecm() != getAlturacm()) && (getBasecm() != obtenerHipotenusa()) && (getAlturacm() != obtenerHipotenusa())) { //condicional si las bases y las alturas son diferentes
            System.out.println("Es escaleno todos sus lados son diferentes");
        } else { //condicional si no iguales ni diferentes
            System.out.println("Es isosceles"); //imprimo por pantalla que es isosceles porque al menos tienen que tener 2 lados iguales
        }
    }

    //metodo mostrar
    public void mostrarTrianguloRectangulo() {
        mostrarFiguraGeometrica();
        mostrarTriangulo();
    }

    //toString
    @Override
    public String toString() {
        return "TrianguloRectangulo: " + super.toString();
    }
    //metodos abstractos heredados de la clase padre a la hija(nieta)

    @Override
    public void area() {
        double area = (getBasecm() * getAlturacm()) / 2;
    }

    @Override
    public void perimetro() {
        double perimetro = getBasecm() + getAlturacm() + obtenerHipotenusa();
        System.out.println("Perimetro del triangulo: " + perimetro);
    }

}
