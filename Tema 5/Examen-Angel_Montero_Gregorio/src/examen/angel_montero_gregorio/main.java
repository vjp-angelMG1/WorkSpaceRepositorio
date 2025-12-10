/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.angel_montero_gregorio;

/**
 *
 * @author alumno
 */
public class main {

  
    public static void main(String[] args) {
        //Creo los objetos normales
        CiclistaEscalador escalador = new CiclistaEscalador("Perico",60,true,91.5,3,40.3,70);
        CiclistaSprinter sprinter = new CiclistaSprinter("Miguel",67,false,92.48,45.6,80);
        
        
        //Creo variable ciclista para almacenar datos creados previamente
        Ciclista ciclista;
        
        ciclista.toString();
        ciclista.Comer();
        ciclista.Beber();
        ciclista.toString();
        
        //Creo variable pedaleable para almacenar datos creados previamente
        Pedaleable pedaleable;
        pedaleable.toString();
        pedaleable.atacar();
        pedaleable.recuperar();
        pedaleable.sprintar();
        pedaleable.toString();
        
        
    }
    
}
