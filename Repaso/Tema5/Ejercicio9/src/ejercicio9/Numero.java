/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *• Ejercicio 09.- Realiza un programa en JAVA,
ORIENTADO A OBJETOS, que lea tres números e
imprima por pantalla el mayor de ellos.
• Realiza el ejercicio a tu gusto, con los métodos que
consideres necesarios (cuantos más mejor).
• Pista: Necesitarás crear 3 objetos de una clase “Numero”
con un atributo llamado “valor”.
* 
 * @author Ángel
 */
public class Numero {
    
    private int valor; // atributo privado
    
    //Constructor por defecto
    public Numero(){
        valor = 0;
    }
    //Constructor parametrizado
    public Numero(int valor) { 
        this.valor = valor;
    }
    //Getters/Setters
    public int getValor() { 
        return valor;
    }
    
    public void mostrarValor(){
        System.out.println("El valor del numero es : "+valor);
    }
    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
    
}


    