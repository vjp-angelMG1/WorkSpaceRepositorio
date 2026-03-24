/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Angel
 */
public class Direccion {
    //ATRIBUTOS
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;
    //CONSTRUCTOR POR DEFECTO 
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = "";
        this.ciudad = "";

    }
    //CONSTRUCTOR PARAMETRIZADO 
    public Direccion(String calle, int numero, String piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    //GETTERS Y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //MÉTODO MOSTRAR DIRECCION
    public void mostrarDireccion() {
        System.out.println("Calle: " + this.calle);
        System.out.println("Número: " + this.numero);
        System.out.println("Piso: " + this.piso);
        System.out.println("Ciudad: " + this.ciudad);
    }
    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
}
