/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7transistor;

/**
 *
 * @author USUARIO
 */
public class Radio implements ControlRemoto {
    //Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructores
    
    public Radio() {
        encendido = false;
        emisora = 80.0f;
        volumen = 15;
    }
    //parametrizado
    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    
    //Getters/Setters--MENOS LOS DE ENCENDIDO--
    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Mostrar
    public void mostrarInformacion() {
        System.out.println("Radio encendida: " + encendido);
        System.out.println("Emisora actual: " + emisora);
        System.out.println("Volumen actual: " + volumen);
    }
    
    //Métodos
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("La radio se ha encendido");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La radio se apagara");
            encendido = false;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            emisora = canal;
            System.out.println("Emisora cambiada a: " + emisora);
        }
    }
    
}

