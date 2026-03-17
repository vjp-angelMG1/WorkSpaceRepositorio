/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasclases;

/**
 *
 * @author Ángel
 */
public class Coche {
   
    //Atributos
    private String marca;
    private String modelo;
    private int aniosAntiguedad;
    
    
    //Constructores
    //Por defecto
    public Coche(){
        this.marca = "";
        this.modelo = "";
        this.aniosAntiguedad = 0;
    }
    //Parametrizado
    public Coche(String marca, String modelo, int aniosAntiguedad) {
        this.marca = marca;
        this.modelo = modelo;
        this.aniosAntiguedad = aniosAntiguedad;
    }
    //
    public Coche(String marca){
        this.marca = marca;
        this.modelo = "";
        this.aniosAntiguedad = 0;
    }
    //Getters / Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
    //toString / mostrarCoche
    public void mostrarCoche() {
        System.out.println("Marca: " + this.marca );
        System.out.println("Modelo: " + this.modelo );
        System.out.println("Anios Antiguedad: " + this.aniosAntiguedad);
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", aniosAntiguedad=" + aniosAntiguedad + '}'; //devuelve los atributos muestra el valor de todos los atributos de la clase
    }

    //Otros métodos...
    public boolean esAntiguo(){
       
        if(aniosAntiguedad > 15){
            return true;
        } else {
            return false;
        } 
    }
    
    public void aumentarAntiguedad(int aniosExtra){
        this.aniosAntiguedad = this.aniosAntiguedad + aniosExtra;
    }
}
