/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *• Ejercicio 19.- Desarrolle una aplicación en Java que determine el sueldo bruto para
cada uno de los tres empleados de una empresa. La empresa paga la tarifa normal
en las primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en
todas las horas trabajadas que excedan de 40.
• El programa creará 3 objetos (uno para cada empleado) y se le pedirá al usuario
que rellene la información para cada empleado en el constructor.
• Por cada empleado se almacenará su nombre, el número de horas que trabajó, y la
tarifa que cobra por una hora de trabajo.
• Para probar la clase Empleado, crea una clase Test con un método que determine
y muestre el sueldo bruto de cada empleado.
• Ejemplo:S
Pepe trabajó 42 horas, cobra 20 euros la hora por lo que le corresponde un sueldo de 860 euros.

 * @author Angel
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(Empleado.pedirNombre(), Empleado.pedirHoras(), Empleado.pedirTarifa()); //creo 3 objetos empleados llamando a sus datos atraves de la clase Empleado
        Empleado empleado2 = new Empleado(Empleado.pedirNombre(), Empleado.pedirHoras(), Empleado.pedirTarifa());
        Empleado empleado3 = new Empleado(Empleado.pedirNombre(), Empleado.pedirHoras(), Empleado.pedirTarifa());

        Empleado.mostrarSueldo(empleado1); //muestro el sueldo de cada empleado llamando al metodo mostrar
        Empleado.mostrarSueldo(empleado2);
        Empleado.mostrarSueldo(empleado3);
        
        System.out.println("Empleado 1 :"+empleado1.toString()); //otra manera de mostrarlo con To
        System.out.println("Empleado 2 :"+empleado2.toString());
        System.out.println("Empleado 3 :"+empleado3.toString());
    }
}

    

