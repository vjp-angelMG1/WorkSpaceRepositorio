/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
• Ejercicio 04.- Crea un programa con dos conjuntos distintos:
HashSet y LinkedHashSet. Inserta en ambos los meses de un año.
Posteriormente recorre los conjuntos mostrando su contenido.
Estudia sus diferencias.
• Pista: Necesitarás un vector de String para almacenar los meses.
 * @author Ángel
 */
public class Ejercicio4 {
    
    public static void main(String[] args) { //metodo principal main ejecutable
        
        String[]mesesDeUnAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}; //Creo un array o vector con los meses del año de tipo String
        
 
        Set<String> conjLinked = new LinkedHashSet<>(); //Creo conjunto Linked es ordenado en orden de llegada y se utiliza para una lista que es es enrazada 
        
        Set<String> conjHash = new HashSet<>();  //Creo conjunto HAshSet que esta mas desordeando pero es mas rápido
        

        
        for (String mes : mesesDeUnAnio) { //creo bucle for para recorrer los meses y añadir los meses a los dos conjunto
            conjLinked.add(mes); 
            conjHash.add(mes);
        }
        

         System.out.println(" El contenido de Linkedhasheset"); //imprimo por pantalla para ver el contenido del linkedhasheset
        mostrarConjunto(conjLinked); //llamo al metodo para que me muestre el contenido 
        
        System.out.println("El contenido del hashset"); //imprimo por pantalla para ver el contenido del hashset 
        mostrarConjunto(conjHash); //llamo al metodo para que se muestre el contenido
        
      
        System.out.println("Linkedhashset muestra los meses en orden"+", Hashset mezcla todos los meses de manera desordenada"); //imprimo por pantalla las diferencias entre uno y otro
    }
        /**
     * Método para recorrer y mostrar cualquier conjunto con un for each
     * 
     * @param conjunto 
     */
    public static void mostrarConjunto(Set<String>conj){ //metodo que no devuelve nada al ser void que y que solo muestra los parametros en este caso conj
        for (String componente : conj) { //bucle for para recorrer todos los conj
            System.out.println(componente + " "); //imprimo por por pantalla cualquier conj
        }
        System.out.println(""); //creo salto de linea
    }
}