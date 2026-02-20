/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;

/**
 *Escribe un sencillo programa en Java en el que utilices los 17 métodos vistos
 * en clase para la manipulación de cadenas (Strings) y vayas mostrando sus
 * resultados: 
 * •toUpperCase()
 * •hasCode
 * •equals y equalsIgnoreCase
 * •compareTo 
 * •valueOf. 
 * •toCharArray. 
 * •length() 
 * •concat(cadena2) 
 * •charAt (indice) 
 * •substring (desde, hasta) 
 * •indexOf (…)
 * •lastIndexOf (…) 
 * •endsWith ( texto) 
 * •startsWith ( texto) 
 * •replace (carácter1, carácter2) 
 * •replaceAll ( cadena1, cadena2) 
 * •toLowerCase ( ) 
 * •split (patrón)
 * 
 * 
 * @author Ángel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String nombre = "Pablo"; //creo variable String

        //para convertirlo en Mayusculas toUpperCase
        String nombreMayuscula = nombre.toUpperCase(); //guardo en el objeto nombreMayuscula el nombre de la variable toda en mayusculas
        System.out.println(nombreMayuscula);

        //en este caso utilizando hasCode convierto todo el texto en numeros atraves del codigo ASCII
        System.out.println(nombre.hashCode());

        //equals tiene en cuenta todo 
        System.out.println(nombre.equals(nombreMayuscula));
        //equalsIgnoreCase no tiene encuenta las mayusculas
        System.out.println(nombre.equalsIgnoreCase(nombreMayuscula));

        //compareTo hace la comparacion de la longuitud de ambas cadenas si da 0 la primera es mayor o son iguales si no la otra cadena es mayor 
        System.out.println(nombre.compareTo(nombreMayuscula));
        //IgnoreCase ignora las diferentes mayusculas
        System.out.println(nombre.compareToIgnoreCase(nombreMayuscula));

        //valuesOf cambia el tipo de dato a String
        short numero = 67;
        System.out.println("edad como string = " + String.valueOf(numero) + 10); //en caso de añadirle si le añado otra cosa despues se añadira como String y no se le suma al  numero original 

        System.out.println("");

        //toCharArray convierte cadenas en arrays
        String cadena = "esto es una cadena";
        char[] cadenaArray = cadena.toCharArray();

        System.out.println(Arrays.toString(cadenaArray));

        //para medir la longuitud de la cadena utilizamos length
        System.out.println(nombre.length());

        //para concatenar dos cadenas utilizo concat
        System.out.println(nombre.concat(nombreMayuscula));

        //substring extrae una subcadena de la cadena original
        System.out.println(nombre.substring(0, 2));

        //con charArt obtenego el caracter  del indice señalado
        System.out.println(nombre.charAt(0));

        System.out.println("");
        //para obtener el indice del caracter o subcadena que le pasemos
       //si no tiene la palabra salda negativo
        System.out.println("Indice de E: " + nombre.indexOf("K"));
        System.out.println("Indice de fr: " + nombre.indexOf("ina")); //devuelve el indice en  el que empieza esas palabras

       
        System.out.println("");

      
        //startsWith para comprobar si una cadena empieza o termina por una subcadena indicada
        System.out.println("nombre empieza por pa:" + nombre.startsWith("lo"));
        
        //reemplaza todas las  concurrencias por otro replaceAll
        //para remplazar una expresion regular  replace
        System.out.println("cadena.replaceAll(hewOr, caracter2)");
        String numeroCuenta = "ES42 1424 1267 72 12624890";
        System.out.println(numeroCuenta.replaceAll("\\e", "*"));
         System.out.println(numeroCuenta.replace("\\e", "*"));

        System.out.println("");

        //convertir de mayusculas a minusculas
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());

        //split lo usamos para dividir un String por el patron que le pasemos por parametro
       
        String[] d = numeroCuenta.split("");
        System.out.println("Arrays.toString(r)");
    }
    
}
