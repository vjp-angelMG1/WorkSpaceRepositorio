/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7transistor;

/**
 *
 * @author USUARIO
 */
public class Television implements ControlRemoto {
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    
    //Constructores
    public Television() {
        encendido = false;
        canal = 1;
        volumen = 10;
    }

    public Television(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    //Getters/Setter--MENOS EL DE ENCENDIDO--
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    //Mostrar
    public void mostrarInformacion() {
        System.out.println("Televisor encendido: " + encendido);
        System.out.println("Canal actual: " + canal);
        System.out.println("Volumen actual: " + volumen);
    }
    
    //Métodos
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("La TV se ha encendido. Canal actual: " + canal);
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("La TV se apagara en 10s");
            
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal; //casting cambiar de tipo
            System.out.println("Canal cambiado a: " + this.canal);
        }
    }
}
