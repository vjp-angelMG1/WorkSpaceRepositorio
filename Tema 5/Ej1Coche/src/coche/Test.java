/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

/**
 *
 * @author USUARIO
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Creamos los objetos que utilizaremos en el main (miCoche y cochePadre)
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        //Establecemos la marca y los modelos de los coches
        miCoche.establecerMarca("Seat");
        miCoche.establecerModelo("Toledo");
        miCoche.establecerColor("Blanco");

        cochePadre.establecerMarca("Fiat");
        cochePadre.establecerModelo("Punto");
        cochePadre.establecerColor("Gris");

        //Arrancamos los coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        //Aceleramos 5 veces miCoche
        System.out.println("Aceleramos y frenamos miCoche");
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }
        //Frenamos 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }
        //Aceleramos 3 veces cochePadre
        System.out.println("Aceleramos cochePadre");
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }
        //Apagamos cochePadre
        cochePadre.apagarCoche();
        
        //Mostramos el estado de miCoche y cochePadre
        System.out.println("Estado de miCoche: ");
        miCoche.mostrarEstado();
        
        System.out.println("Estado de cochePadre: ");
        cochePadre.mostrarEstado();
    }
}
    
    

