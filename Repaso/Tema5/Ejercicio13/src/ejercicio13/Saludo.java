/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Angel
 */
public class Saludo {

    // ATRIBUTO
    private String frase;

    // Constructor por defecto
    public Saludo() {
        this.frase = "Hola, que tal"; // valor por defecto
    }

    // Constructor parametrizado
    public Saludo(String frase) {
        this.frase = frase;
    }

    //Getters y Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void imprimir() {  //metodo para imprimir la frase una vez
        System.out.println(frase); //imprimo la frase del constructor
    }

    // Método que imprime la frase N veces usando un bucle
    public void imprimirVariasVeces(int veces) { //metodo que imprime la frase varias veces con parametro
        for (int i = 0; i < veces; i++) { //bucle for para repetir las veces
            imprimir(); // reutilizo el metodo para que imprima varias veces
        }
    }

    public void mostrar() { //metodo que muestra la informacion completa del objeto
        System.out.println(this.toString()); // imprimo por pantalla el string
    }

    // TO STRING
    @Override
    public String toString() {
        return "Saludo{" + "frase='" + frase + '\'' + '}';
    }
}

