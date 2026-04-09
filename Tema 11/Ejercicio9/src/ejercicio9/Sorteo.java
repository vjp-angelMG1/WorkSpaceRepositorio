/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.time.LocalDate; //importo clase para guardar la fecha del paquete time
import java.util.Arrays; //importo clase para los arrays en el paquete util
/**
 * *• Ejercicio 09.- El operador de loterías “TuLotero” desea gestionar
los sorteos que realiza a lo largo del año.
• Para tratar esta información, necesitaremos una clase Sorteo, cuyos
atributos serán la fecha del sorteo (será un LocalDate) y un vector
de 4 celdas con los números ganadores (aleatorios de 1 a 100).
• Los sorteos se organizarán en un .TreeMap, cuyas claves serán las
fechas del sorteo.
* • Facilitaremos las siguientes opciones al operador de loterías:
• Realizar sorteo (La fecha será la de hoy y los números ganadores serán
aleatorios entre 1 y 100).
• Repetir sorteo. Se eliminará el sorteo de hoy y se volverá a realizar el
sorteo.
• Mostrar sorteos del mes actual.
• Mostrar sorteo dada una fecha.
• Realizar sorteo por fecha (Pediremos una fecha y se realizará el sorteo de
esa fecha en concreto - comprobando, previamente, que no hay sorteo
en esa fecha).
• Mostrar todos los sorteos
* 
 * @author Angel
 */

public class Sorteo {
    // ATRIBUTOS
    private LocalDate fechaSorteo;
    private int[] ganadoresSorteo;
    
    // CONSTRUCTORES
    // Por defecto
    public Sorteo() {
        this.fechaSorteo = LocalDate.now();
        this.ganadoresSorteo = new int[4];
        
        for(int i = 0; i < ganadoresSorteo.length; i++) {
            ganadoresSorteo[i] = (int)(Math.random() * (100 - 1 + 1) + 1);
        }
    }
    // Parametrizado
    public Sorteo(LocalDate fecha, int[] ganadores) {
        this.fechaSorteo = fecha;
        this.ganadoresSorteo = ganadores;
    }
    
    // GETTERS Y SETTERS
    public LocalDate getFecha() {
        return fechaSorteo;
    }

    public void setFecha(LocalDate fecha) {
        this.fechaSorteo = fecha;
    }

    public int[] getGanadores() {
        return ganadoresSorteo;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadoresSorteo = ganadores;
    }
    //metodo mostrar
    public void mostrarSorteo(){
        System.out.println("fecha del sorteo :"+this.fechaSorteo);
        System.out.println("ganadores del sorteo :"+this.ganadoresSorteo);
    }
    // metodo to String
    @Override
    public String toString() {
        return "Sorteo{" + "fecha=" + fechaSorteo + ", ganadores=" + Arrays.toString(ganadoresSorteo) + '}';
    }
    
}
