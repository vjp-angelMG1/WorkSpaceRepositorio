/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 * *• Ejercicio 24.- Se plantea desarrollar un programa Java que permita la gestión de una empresa
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
public class Producto {
    private int fechaDeCaducidad;
    private int numeroDeLote;
    
    public Producto(){
    this.fechaDeCaducidad = 0;
    this.numeroDeLote = 0;
    }
    
    public Producto(int fechaDeCaducidad, int numeroDeLote){
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }

    public int getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(int fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
    
    public void mostrarProducto(){
        System.out.println("fecha de caducidad :"+this.fechaDeCaducidad);
        System.out.println("numero de lote :"+this.numeroDeLote);
    }

    @Override
    public String toString() {
        return "Producto{" + "fechaDeCaducidad=" + fechaDeCaducidad + ", numeroDeLote=" + numeroDeLote + '}';
    }
    
}
