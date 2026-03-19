/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *• Ejercicio 05.- Crea un programa con dos mapas distintos: TreeMap
y LinkedHashMap. Inserta en ambos los meses de un año del revés
asociándoles a cada uno su correspondiente número entero ([12,
Diciembre], [11, Noviembre], [10, Octubre], … [1, Enero]) .
Posteriormente recorre los conjuntos mostrando su contenido.
Estudia sus diferencias.
• Pista: Necesitarás un vector de String para almacenar los meses.
* 
 * @author Ángel
 */
public class Ejercicio5 {

        public static void main(String[] args) { //creo metodo pirncipal main ejecutable

        String[] mesesDeUnAnio = {"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre"}; //Creo un array o vector con los meses que tiene un año
       
        Map<Integer, String> mapaEnlazado = new LinkedHashMap<>(); //creo el mapa LinkedHashMap que tiene un orden a la hora de meter los meses
        Map<Integer, String> mapaArbol = new TreeMap<>(); //creo el mapa TreeMap que ordena los meses segun el valor asociado al mes de mayor a menor
        

        for (int i = 11; i >= 0; i--) { //creo bucle for para recorrer los meses de mayor a menor segun el valor de su numero hasta enero que es el 1
            int numeroDelMes; //Declaro las variables
            String nombreDelMes;
            numeroDelMes = i + 1; // Inicializo la variable para que vaya descendiendo en funcion del bucle for
            nombreDelMes = mesesDeUnAnio[i]; //guardo en la variable el nombre del mes correspondiente a su numero
            
            mapaEnlazado.put(numeroDelMes, nombreDelMes); //en el mapa enlazado utilizo put para guardar las variables en los mapas 
            mapaArbol.put(numeroDelMes, nombreDelMes); //en el mapa arbol utilizo put para guardar tambien las variables en los mapas 
            
        }
        
 
        System.out.println("El LinkedHashMap tiene el orden de mayor a menor que contiene : "); //imprimo por pantalla el recorrido del mapa descendente
        mostrarElMapa(mapaEnlazado); //llamo al metodo para que me muestre el contenido del mapa enlazado 
        
        
        System.out.println("El Treemap tiene un orden natural que contiene : "); //imprimo por pantalla el recorrido del mapa ascendente
        mostrarElMapa(mapaArbol); // llamo al metodo para que me muestre el contenido del mapa Arbol
        

    }

    public static void mostrarElMapa(Map<Integer, String> mapa){ //creo metodo void para me muestre los parametros y recorra el mapa con las clave
        // Obtenemos el conjunto de claves con KeySet y lo recorremos
        for (Integer contenido : mapa.keySet()) { //creo bucle for para obtener el conjunto del contenido con KeySet
            System.out.println("numero " + contenido + " es igual a " + mapa.get(contenido)); //imprimo por pantalla el valor que tiene el mes utilixando el get
        }
    }


}
    

