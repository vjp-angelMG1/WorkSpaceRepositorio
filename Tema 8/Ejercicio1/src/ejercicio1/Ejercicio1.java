/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Notas[] asignaturas = new Notas[6];//creo array de objetos

        Notas programacion = new Notas("Programación", 4); //Instanciar un objeto y creo la clase
        for (int i = 0; i < asignaturas.length; i++){
        
        }

        asignaturas[0].setNombre("Programación");
        asignaturas[1].setNombre("Lenguajes de Marca");
        asignaturas[2].setNombre("Bases de Datos");
        asignaturas[3].setNombre("Entorno de Desarrollo");
        asignaturas[4].setNombre("Sistemas Informaticos");
        asignaturas[5].setNombre("Formación y Orientación Laboral");

    }

    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Notas: ");
        return entrada.nextFloat();
    }

    public static float calcularNotaMedia(){
    for (int=0; i< asigntauras.length; i++){
    
    }
    
}