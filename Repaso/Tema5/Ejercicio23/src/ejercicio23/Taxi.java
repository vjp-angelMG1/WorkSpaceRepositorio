/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author Angel
 */
public class Taxi extends Vehiculo{
    
    //Atributos
    private int numeroLicencia;
    //Constructor por defecto
    public Taxi(){
    super();
    this.numeroLicencia = 0;
    }
    //Constructor parametrizado
    public Taxi (String matricula,String modelo,int potencia,int numeroLicencia){
        super(matricula,modelo,potencia);
        this.numeroLicencia = numeroLicencia;
    }
    //Getters y Setters
    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    //Metodo mostrar
    public void mostrarTaxi(){
        mostrarVehiculo(); //llamo al metodo padre desde la clase hija
        System.out.println("numero de licencia : "+this.numeroLicencia);
    }
    //Metodo ToString
    @Override
    public String toString() {
        return super.toString() +"Taxi{" + "numeroLicencia=" + numeroLicencia + '}'; //llamo el metodo de la clase padre
    }
    
}
