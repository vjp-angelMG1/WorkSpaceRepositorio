/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25test;

/**
 *
 * @author USUARIO
 */
public class Portatil extends Ordenador { //Clase que tiene como herencia la clase ordenador

    // ATRIBUTOS
    private String marca;
    private double tamanoPantalla;
    private double peso;

    // CONSTRUCTOR POR DEFECTO
    public Portatil() {
        super(); // llama al constructor por defecto de Ordenador
        this.marca = "";
        this.tamanoPantalla = 0.0;
        this.peso = 0.0;
    }

    // COSTRUCTOR PARAMETRIZADO
    public Portatil(int mr, int cdd, String mp, String mtg,double p, String m, double tp, double ps) {

        super(mr, cdd, mp, mtg, p);
        this.marca = m;
        this.tamanoPantalla = tp;
        this.peso = ps;
    }

    // GETERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tp) {
        this.tamanoPantalla = tp;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double p) {
        this.peso = p;
    }

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + 
               ", Marca: " + marca + 
               ", Tamaño Pantalla: " + tamanoPantalla + " pulgadas" +
               ", Peso: " + peso + " kg";
    
    }
}
