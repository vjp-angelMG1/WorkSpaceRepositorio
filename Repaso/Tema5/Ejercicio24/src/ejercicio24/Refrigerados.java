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
public class Refrigerados extends Producto{
    //Atributos
    private int codigoDeSupervisionAlimentaria;
    //CONSTRUCTORES 
    //por defecto
    public Refrigerados(){
        super();
        this.codigoDeSupervisionAlimentaria = 0;
    }
    //parametrizado
    public Refrigerados(int fechaDeCaducidad,int numeroDeLote,int codigoDeSupervisionAlimentaria){
        super(fechaDeCaducidad,numeroDeLote);
        this.codigoDeSupervisionAlimentaria = codigoDeSupervisionAlimentaria;
    }
    //GETTERS Y SETTERS

    public int getCodigoDeSupervisionAlimentaria() {
        return codigoDeSupervisionAlimentaria;
    }

    public void setCodigoDeSupervisionAlimentaria(int codigoDeSupervisionAlimentaria) {
        this.codigoDeSupervisionAlimentaria = codigoDeSupervisionAlimentaria;
    }
    //metodo de mostrar refrigerados
    public void mostrarRefrigerados(){
        mostrarProducto();
        System.out.println("codigo de supervision alimentaria "+this.codigoDeSupervisionAlimentaria);
    }
    //metodo toString
    @Override
    public String toString() {
        return super.toString()+". Refrigerados{" + "codigoDeSupervisionAlimentaria=" + codigoDeSupervisionAlimentaria + '}';
    }
    
}
