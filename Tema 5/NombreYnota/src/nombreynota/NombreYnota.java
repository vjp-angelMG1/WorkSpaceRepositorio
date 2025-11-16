/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombreynota;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class NombreYnota {

    /**
     * @param args the command line arguments
     */
        public static Alumno pedirNombreYNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduza el nombre del alumno:");
        String nom = entrada.nextLine();
        
        System.out.println("Nota");
        int not = entrada.nextInt();
        return new Alumno(nom, not);
    }
    
    
    public static void main(String[] args) {
             //CALIFICACIONES ALUMNO
        
            //Creamos los objetos de la clase Alumno asignando los parametros mediante un metodo 
            Alumno alumno1 = pedirNombreYNota(); 
            System.out.println(alumno1.mostrarCalificacion()); 
            Alumno alumno2 = pedirNombreYNota();
            System.out.println(alumno2.mostrarCalificacion());
            Alumno alumno3 = pedirNombreYNota();
            System.out.println(alumno3.mostrarCalificacion());
            
        
    }
    
}
