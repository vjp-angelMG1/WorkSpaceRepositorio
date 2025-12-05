/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06libro;

/**
 * * Para probar el programa, implementa una clase Test en la que
 * instancies un objeto de cada clase creada anteriormente y
 * probar los métodos de cada objeto.
 * 
 * Despues, utiliza el polimorfismo para crear cada uno de
 * los objetos a partir de la interfaz Transformable y prueba los
 * métodos implementados nuevamente.
 *
 * @author Angel
 */
public class Ejercicio06Libro {

    //Método para probar TODAS las funcionalidades de cualquier objeto Transformable
    
    public static void probarFuncionalidad(Transformable objeto){
        
        // 1-CONCATENAR
        System.out.println("Cadenas concatenadas: " + objeto.concatenarTodo());
        // 2-INICIALES
        System.out.println("Iniciales: " + objeto.obtenerIniciales());
        // 3-CONTAR VOCALES
        objeto.contarVocales(); //el método imprime directamente
        // 4-OBTENER CADENA MAS LARGA
        System.out.println("Cadena más larga: " + objeto.obtenerCadenaMasLarga());
        // 5-BUSCAR CADENA (ejemplo de búsqueda)
        String busqueda = "va";
        System.out.println("¿Contiene '" + busqueda + "'? " + 
                objeto.buscarCadena(busqueda));
    }
    public static void main(String[] args) {
        
         //Creamos los objetos, primero sin polimorfismo
        
        Libro libro1 = new Libro("Reinos olvidados ", " R.A. Salvatore ", " Fantasía");
        Persona persona1 = new Persona("Pepito ", " Salvador Martínez ", " Salva");
        
        System.out.println(libro1.toString());
        probarFuncionalidad(libro1);
        System.out.println(persona1.toString());
        probarFuncionalidad(persona1);
        
        //Creamos los objetos usando el polimorfismo
        
        //Declaramos una variable del tipo de la Interfaz
        Transformable objetoTransformable;
        
        //objetoTransformable guarda un libro
        objetoTransformable = new Libro("The Witcher ", " Andrzej Sapkowski ", " Fantasía");
        probarFuncionalidad(objetoTransformable);
        objetoTransformable = new Persona("Pablito ", " Clavó un Clavito", " Clavero");
        probarFuncionalidad(objetoTransformable);
        

        
    }
    
}
