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
        
        Rueda rueda1 = new Rueda("Hierro",20);
        Rueda rueda2 = new Rueda("Acero",40);
        
        rueda1.mostrarRueda();
        rueda2.mostrarRueda();
        
        System.out.println("mostrar rueda 1"+rueda1.toString());   
        System.out.println("mostrar rueda 2"+rueda2.toString());
        
        Coche coche1 = new Coche();
        
        coche1.setMarca("Renault");
        coche1.setModelo("Megane");
        coche1.mostrarCoche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
    }
    
}
