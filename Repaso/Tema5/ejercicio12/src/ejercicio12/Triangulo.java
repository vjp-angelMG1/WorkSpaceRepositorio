/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Ángel
 */
public class Triangulo {

    private float cateto1;
    private float cateto2;

    public Triangulo() {

        this.cateto1 = 0;
        this.cateto2 = 0;
    }

    public Triangulo(float cateto1, float cateto2) {

        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public float getCateto1() {
        return cateto1;
    }

    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

    public float getCateto2() {
        return cateto2;
    }

    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public void mostrarNota() {

        System.out.println("El cateto 1 es " + cateto1 + " y el cateto 2 es: " + cateto2);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }

}
