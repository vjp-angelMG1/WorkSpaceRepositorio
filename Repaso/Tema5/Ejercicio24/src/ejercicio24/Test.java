/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

/**
 *• Ejercicio 24.- Se plantea desarrollar un programa Java que permita la gestión de una empresa
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
public class Test {

    public static void main(String[] args) { //metodo principal main ejecutable
        
        Frescos frescos1 = new Frescos(2027,23,2020,"Thailandia"); //creo un objeto de cada subclase con el constructor parametrizado
        Refrigerados refrigerados1 = new Refrigerados(2028,38,304);
        Congelados congelados1 = new Congelados(2024,62,13.4);
        
        System.out.println("El producto frescos1 tiene : ");
        frescos1.mostrarFrescos(); //muestro los productos de cada objeto con el metodo mostrar
        System.out.println("El producto refrigerados1 tiene : ");
        refrigerados1.mostrarRefrigerados();
        System.out.println("El producto congelados1 tiene : ");
        congelados1.mostrarCongelados();
        
        System.out.println("Frescos1 : "+frescos1.toString());//muestro los productos de cada objeto con el metodo Tostring
        System.out.println("Refrigerados1 : "+refrigerados1.toString());
        System.out.println("Congelados1 : "+congelados1.toString());
    }
}
