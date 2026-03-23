/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *• Ejercicio 16.- Realiza un programa en JAVA, orientado a objetos, donde el usuario
introduzca el nombre y la nota de un alumno (número entero entre 0 y 10) y se
escribirá su calificación según el valor de la nota ingresada:
• 0 a 4 = Suspenso.
• 5 a 6 = Bien.
• 7 a 8 = Notable.
• 9 a 10 = Sobresaliente.
• Nota: Se le avisará al usuario de un error en caso de que la nota que nos introduzca
no esté entre 0 y 10.
• Para ello tendrás una clase Alumno con los atributos nombre y nota. En una clase
Test crea 3 objetos y los métodos que consideres necesarios (cuantos más mejor).
Intenta que el método main sea lo más pequeño posible.

 * @author Angel
 */
public class Ejercicio16 {

    public static void main(String[] args) { //creo metodo principal main ejecutable
        Scanner entrada = new Scanner(System.in);  

        System.out.print("Nombre del alumno 1: "); //escribo el nombre del alumno
        String nombre1 = entrada.nextLine(); //guardo en la variable String el nombre1
        System.out.print("Nota (0 a 10): "); //escribo la nota de 0 a 10
        int nota1 = entrada.nextInt(); //guardo en la variable int de nota1 
 
        Alumno alumno1 = new Alumno(nombre1, nota1); //creo objeto alumno uno con el constructor parametrizado

        System.out.print("Nombre del alumno 2: "); //escribo el nombre del alumno
        String nombre2 = entrada.nextLine(); //guardo en la variable String el nombre2
        System.out.print("Nota (0 a 10): "); //escribo la nota de 0 a 10
        int nota2 = entrada.nextInt(); //guardo en la variable int de nota2

        Alumno alumno2 = new Alumno(nombre2, nota2); //creo objeto alumno dos con el constructor parametrizado

 
        System.out.print("Nombre del alumno 3: "); //escribo el nombre del alumno
        String nombre3 = entrada.nextLine(); //guardo en la variable String el nombre3
        System.out.print("Nota (0 a 10): ");//escribo la nota de 0 a 10
        int nota3 = entrada.nextInt(); //guardo en la variable int de nota3

        Alumno alumno3 = new Alumno(nombre3, nota3); //creo objeto alumno tres con el constructor parametrizado

       
        alumno1.mostrar(); //llamo a los metodos mostrar desde cada objeto para que me diga sus caracteristicas
        alumno2.mostrar();
        alumno3.mostrar();

       
        System.out.println(alumno1.toString()); //impirmo por pantalla el metodo tostring llamado por cada objeto que me muestra sus caracteristicas al ser un metodo return se puede realizar con un sout
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        
        
        
        
    }
       
}
