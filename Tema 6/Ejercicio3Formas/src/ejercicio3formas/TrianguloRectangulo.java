/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3formas;

/**
 *
 * @author Ángel
 */
public class TrianguloRectangulo extends Triangulo{
    //CONSTRUCTORES
    public TrianguloRectangulo(){
        super();
    }
    
    public TrianguloRectangulo(String color, double base, double altura){
        super(color, base, altura);
    }
    
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularArea()
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;
    }
    //IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO calcularPerimetro()
    @Override
    public double calcularPerimetro(){
        return getBase() + getAltura() + calcularHipotenusa();
    }
    
    //MÉTODO PARA CALCULAR LA HIPOTENUSA USANDO EL TEOREMA DE PITÁGORAS
    public double calcularHipotenusa(){
        return Math.sqrt(getBase() * getBase() + getAltura() * getAltura());
    }
    
    //MÉTODO PARA DETERMINAR EL TIPO DE TRIÁNGULO
    public String tipoTriangulo(){
        if(getBase() == getAltura() && getBase() == calcularHipotenusa()){
            return "Equilatero";
        }else if(getBase() == getAltura() || getBase() == calcularHipotenusa() || getAltura() == calcularHipotenusa()){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }
}
