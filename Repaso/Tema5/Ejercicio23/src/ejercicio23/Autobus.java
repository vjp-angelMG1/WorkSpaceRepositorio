/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author Angel
 */
public class Autobus extends Vehiculo{
    //ATRIBUTOS
    private int numeroPlazas;
    //CONSTRUCTOR 
    //por defecto
    public Autobus(){
    super(); //llamo a los atributos de la clase padre 
    this.numeroPlazas = 0;
    }
    //parametrizado
    public Autobus(String matricula,String modelo,int potencia,int numeroPlazas){
        super(matricula,modelo,potencia);
        this.numeroPlazas = numeroPlazas;
    }
    //Getters y Setters
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    //Metodo mostrar
    public void mostrarAutobus(){
        mostrarVehiculo();
        System.out.println("Numero de Plazas : "+this.numeroPlazas);
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString()+"Autobus{" + "numeroPlazas=" + numeroPlazas + '}';
    }
}
