/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 * * *• Ejercicio 24.- Se plantea desarrollar un programa Java que permita la gestión de una empresa
agroalimentaria que trabaja con tres tipos de productos: productos frescos, productos refrigerados y
productos congelados.
• Todos los productos llevan esta información común: fecha de caducidad y número de lote.
• A su vez, cada tipo de producto lleva alguna información específica:
• i. Los productos frescos deben llevar la fecha de envasado y el país de origen.
• ii. Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria.
• iii.Los productos congelados deben llevar la temperatura de congelación recomendada.
• Crear el código de las clases Java implementando una relación de herencia desde la superclase
Producto hasta las subclases ProductoFresco, ProductoRefrigerado y ProductoCongelado.
• Cada clase debe disponer de constructor y permitir establecer (set) y recuperar (get) el valor de sus
atributos y tener un método que permita mostrar la información del objeto.
• Crear una clase Test con el método main donde se cree un objeto de cada tipo y se muestren los
datos de cada uno de los objetos creados.

 * @author Angel
 */
public class Congelados extends Producto{
    //Atributos
    private double temperaturaDeCongelacionRecomendada;
    //CONSTRUCTORES
    //por defecto
    public Congelados(){
    super();
    this.temperaturaDeCongelacionRecomendada = 0.0;
    }
    //parametrizado
    public Congelados(int fechaDeCaducidad, int numeroDeLote,double temperaturaDeCongelacionRecomendada){
        super(fechaDeCaducidad,numeroDeLote);
        this.temperaturaDeCongelacionRecomendada = temperaturaDeCongelacionRecomendada;
    }
    //Getters y Setters

    public double getTemperaturaDeCongelacionRecomendada() {
        return temperaturaDeCongelacionRecomendada;
    }

    public void setTemperaturaDeCongelacionRecomendada(double temperaturaDeCongelacionRecomendada) {
        this.temperaturaDeCongelacionRecomendada = temperaturaDeCongelacionRecomendada;
    }
    //metodo mostrar
    public void mostrarCongelados(){
        this.temperaturaDeCongelacionRecomendada = temperaturaDeCongelacionRecomendada;
    }
    //Metodo ToString
    @Override
    public String toString() {
        return super.toString()+". Congelados{" + "temperaturaDeCongelacionRecomendada=" + temperaturaDeCongelacionRecomendada + '}';
    }
    
    
}