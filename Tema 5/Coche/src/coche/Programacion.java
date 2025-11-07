/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coche;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Programacion {
    
    public static void main(String[] args) {
        //1. Instancio un objeto del tipo que he creado
        //1.1. Con consstructor parametrizado y estableciendo valores con setters
        Scanner entrada = new Scanner(System.in);
        Coche miCoche = new Coche();
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        // 1.2. Con constructor parametrizado, inicializando los atributos
        //con los valores pasados por parámetro
        Coche tuCoche = new Coche("Michelin", "Baja", 3 );
        System.out.println(tuCoche.toString());
        
        //Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
        
        
    }
}
