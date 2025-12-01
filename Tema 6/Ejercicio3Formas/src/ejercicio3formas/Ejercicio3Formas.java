/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author Ángel
 */
public class Ejercicio3Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OBJETOS QUE SE CREAN DE CADA FIGURA CON SUS ATRIBUTOS
        Circulo cir = new Circulo("Rojo", 5.5);
        Rectangulo r = new Rectangulo("Morado", 6.25, 4.45);
        Cuadrado cua = new Cuadrado("Amarillo", 5.80 );
        TrianguloRectangulo tr = new TrianguloRectangulo("Verde", 5, 4.80);
        
        //MOSTRAR DATOS DE CADA FIGURA USANDO EL MÉTODO AUXILIAR mostrarfigura()
        mostrarFigura(cir);
        mostrarFigura(r);
        mostrarFigura(cua);
        mostrarFigura(tr);
        
        //MÉTODOS ESPECÍFICOS DEL TRIÁNGULO RECTÁNGULO
        System.out.println("Hipotenusa del triangulo: " + tr.calcularHipotenusa());
        System.out.println("Tipo de triangulo: " + tr.tipoTriangulo());
        
        System.out.println("");
        
        //OBJETOS QUE SE CREAN DESDE LA CLASE FIGURAGEOMETRICA
        FiguraGeometrica fgcir = new Circulo("Azul", 6.5);
        FiguraGeometrica fgr = new Rectangulo("Rojo", 5.55, 3.25);
        FiguraGeometrica fgcua = new Cuadrado("Verde", 5.45);
        FiguraGeometrica fgtr = new TrianguloRectangulo("Morado", 3.75, 2.35);
        
        //MOSTRAR DATOS DE LAS FIGURAS CON POLIMORFISMOS
        mostrarFigura(fgcir);
        mostrarFigura(fgr);
        mostrarFigura(fgcua);
        mostrarFigura(fgtr);
        
        }
        
        //MÉTODO AUXILIAR QUE RECIBE CUALQUIER FIGURA GEOMÉTRICA Y MUESTRA SUS DATOS
        public static void mostrarFigura(FiguraGeometrica figura){
            System.out.println("\nFigura de color: " + figura.getColor());
            System.out.println("Area: " + figura.calcularArea() + " cm2");
            System.out.println("Perimetro: " + figura.calcularPerimetro() + " cm");
        } 

}
  

