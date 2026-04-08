/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Ejercicio3 {


    public static void main(String[] args) { //metodo principal main ejecutable
        System.out.println("SUBCLASES");
        
        Circulo circulo = new Circulo(4.5,"rojo"); //creo objeto de las subclases con los parametros 
        Cuadrado cuadrado = new Cuadrado(3.5,"amarillo");
        Rectangulo rectangulo = new Rectangulo(20,10.4,"azul");
        Triangulo triangulo = new Triangulo(23,11,"violeta");
        TrianguloRectangulo tRectangulo = new TrianguloRectangulo(25,3,"Plata");
        System.out.println("CIRCULO");
        circulo.area(); //muestro las areas y los perimetros de las figuras
        circulo.perimetro();
        System.out.println("CUADRADO");
        cuadrado.area();
        cuadrado.perimetro();
        System.out.println("RECTANGULO");
        rectangulo.area();
        rectangulo.perimetro();
        System.out.println("TRIANGULO");
        triangulo.area();
        triangulo.perimetro();
        System.out.println("TRIANGULO RECTANGULO");
        tRectangulo.area();
        tRectangulo.perimetro();
        
        System.out.println("POLIMORFISMO");
        
        FiguraGeometrica figuraC = new Circulo(5.5,"granate"); //creo objetos desde la clase padre con polimorfismo
        FiguraGeometrica figuraCD = new Cuadrado(3.7,"blanco");
        FiguraGeometrica figuraRC = new Rectangulo(20.9,10,"ocre");
        FiguraGeometrica figuraT = new Triangulo(24,11,"gris");
        FiguraGeometrica figuraTR = new TrianguloRectangulo(26,32,"dorado");
        System.out.println("CIRCULO");
        figuraC.area(); //muestro las areas y los perimetros de las figuras atraves del polimorfismo
        figuraC.perimetro();
         System.out.println("CUADRADO");
        figuraCD.area();
        figuraCD.perimetro();
        System.out.println("RECTANGULO");
        figuraRC.area();
        figuraRC.perimetro();
        System.out.println("TRIANGULO");
        figuraT.area();
        figuraT.perimetro();
        System.out.println("TRIANGULO RECTANGULO");
        figuraTR.area();
        figuraTR.perimetro();
        
        //System.out.println("Hipotenusa: " + figuraTrianguloRectangulo.obtenerHipotenusa());
        //figuraTrianguloRectangulo.determinarTipoTriangulo();
        //los metodos creados en triangulo rectacngulo no los puedo crear ya que no estan creados en la superclase y no son metodos abstractos si no particulares de una clase nieta
    }
    
}
