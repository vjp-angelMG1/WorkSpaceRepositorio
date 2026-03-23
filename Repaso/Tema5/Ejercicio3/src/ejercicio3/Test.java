/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *• Ejercicio 03.- Diseña una clase Rueda que contenga los
siguientes atributos privados:
• material (de tipo cadena)
• pulgadas (de tipo entero)
• La clase Rueda contendrá los siguientes métodos públicos:
• establecerMaterial
• establecerPulgadas.
• obtenerMaterial.
• obtenerPulgadas.
* Luego, diseña una clase Coche que contenga los siguientes atributos privados:
• marca (de tipo cadena)
• modelo (de tipo cadena)
• ruedas (objeto de tipo Rueda)
• La clase Coche contendrá los siguientes métodos públicos:
• establecerMarca
• establecerModelo.
• obtenerMarca.
• obtenerModelo.
• establecerRueda.
• obtenerRueda.
• Para probar el funcionamiento de las clases creadas, crea otra clase
llamada Test (dentro del mismo paquete) que contenga el método
main, donde:
• Se creen 2 objetos de la clase Rueda: rueda1 y rueda2.
• Establece el material y el tamaño, primero en el objeto rueda1 y luego en rueda2.
• Muestra los datos (material y tamaño) de las dos ruedas creados.
• Crea 3 objetos de la clase Coche: coche1, coche2 y coche3.
• Establece la marca y el modelo de los 3 coches.
• Establece las ruedas1 para el coche1 y el coche2, y ruedas2 para el coche3.
• Muestra los datos de los coches creados (marca, modelo, material de su rueda y
tamaño de su rueda.

 * @author Ángel
 * 
 */
public class Test {

    public static void main(String[] args) {
        
        Rueda rueda1 = new Rueda("Hierro",20); //creo dos objetos ruedas con parametros
        Rueda rueda2 = new Rueda("Acero",40);
        
        rueda1.mostrarRueda(); //muestro las ruedas
        rueda2.mostrarRueda();
        
        System.out.println("mostrar rueda 1"+rueda1.toString());    //muestro las ruedas con el toString opcional
        System.out.println("mostrar rueda 2"+rueda2.toString());
        
        Coche coche1 = new Coche(); //creo tres objetos,establezco la marca y el modelo con set y muestro cada coche 
        
        coche1.setMarca("Renault"); 
        coche1.setModelo("Megane");
        
        
        Coche coche2 = new Coche();
        coche2.setMarca("Skoda");
        coche2.setModelo("Fabia");
       
        
        Coche coche3 = new Coche();
        coche3.setMarca("Opel");
        coche3.setModelo("Astra");
        
        
        coche1.setRueda(rueda1); //establezco la rueda 1 para el coche 1
        coche1.mostrarCoche();
        
        coche2.setRueda(rueda1); //establezco la rueda 1 para el coche 2
        coche2.mostrarCoche();
        
        coche3.setRueda(rueda2); //establezco la rueda 3 para el coche 3
        coche3.mostrarCoche();
        
        System.out.println(coche1.toString()); //imprimo por pantalla el toString de cada coche para que me muestre todos los atributos de ambas clases
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());
    }
    
}
