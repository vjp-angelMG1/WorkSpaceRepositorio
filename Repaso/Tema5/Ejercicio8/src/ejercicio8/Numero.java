/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *Ejercicio 08.- Realiza un programa en JAVA, orientado a
objetos, en el que crees una clase llamada Numero que
contendrá un único atributo privado, llamado valor, de tipo
entero.
• Para probar el funcionamiento de la clase Numero, crea una
nueva clase llamada Test donde le pidas al usuario un
número por teclado. Luego, crea un objeto, siendo el
número introducido por el usuario el valor del atributo valor.
Posteriormente, le pasarás el objeto a un método que le dirá
al usuario si el número introducido es par o impar.
 * @author Angel
 */
public class Numero {
    
    //ATRIBUTOS
    private int numero;
    
    public Numero() {
        this.numero = 0;
    }
    public Numero(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean esPar() { //metodo para comprobar si es par o no
        return numero % 2 == 0; // devuelvo el numero si la division del numero entre 2 es igual a 0
    }
    public void mostarNumero(){
        System.out.println("El numero es "+numero);
    }
    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }
    
    
}
