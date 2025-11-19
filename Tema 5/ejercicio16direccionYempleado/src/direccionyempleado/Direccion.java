/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package direccionyempleado;

/**
 *
 * @author USUARIO
 */
public class Direccion {
        // Atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;

    // Constructor por defecto
    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }

    // Constructor parametrizado
    public Direccion(String calle, int numero, int piso, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }

    // Getters y Setters
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

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Método toString para mostrar la dirección
    @Override
    public String toString() {
        return calle + ", " + numero + "º " + piso + ", " + ciudad;
    }
}

