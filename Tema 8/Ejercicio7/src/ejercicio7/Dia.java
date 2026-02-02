/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Angel
 */
public class Dia {
    //Atributos

    private String nombreDia;
    private int temperatura;

    //COnstructores
    public Dia() {
        nombreDia = "";
        temperatura = 0;
    }

    public Dia(String nombre, int temperatura) {
        this.nombreDia = nombre;
        this.temperatura = temperatura;
    }

    //Getters
    public String getNombreDia() {
        return nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    //Setters
    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    //Mostrar datos de los objetos.
    public void mostrar(int numeroDia) {

        System.out.println(nombreDia + " dia " + numeroDia + ": " + temperatura
                + " grados");
    }

}
