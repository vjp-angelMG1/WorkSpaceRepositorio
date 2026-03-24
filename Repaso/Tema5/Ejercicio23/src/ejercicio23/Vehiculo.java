/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author Angel
 */
public class Vehiculo {

    //ATRIBUTOS
    private String matricula;
    private String modelo;
    private int potencia;
    //CONSTRUCTORES
    //por defecto
    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.potencia = 0;
    }
    //parametrizado
    public Vehiculo(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public void mostrarVehiculo(){
        System.out.println("Matricula :" +this.matricula);
        System.out.println("Modelo :"+this.modelo);
        System.out.println("Potencia :"+this.potencia);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }
}
