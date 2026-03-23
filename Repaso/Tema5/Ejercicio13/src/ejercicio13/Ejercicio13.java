/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *• Ejercicio 13.- Crea un programa JAVA orientado a
objetos que, utilizando bucles, escriba "Hola, que tal"
cinco veces. Para ello tendrás una clase “Saludo” con un
atributo “frase” de tipo String.
• Realiza el ejercicio a tu gusto, con los métodos que
consideres necesarios (cuantos más mejor). Intenta que
el método main sea pequeño.
* 
 * @author Angel
 */
public class Ejercicio13 {

    public static void main(String[] args) { //metodo main para imprimir saludo varias veces 

        Saludo saludo = new Saludo(); //creo un objeto Saludo con frase por defecto

        saludo.mostrar(); //muestro la informacion del objeto llamando al metodo de la clase mostrar

        saludo.imprimirVariasVeces(5); //muesto por pantalla la frase 5 veces usando el metodo imprimir Veces
    }
    
    
}
