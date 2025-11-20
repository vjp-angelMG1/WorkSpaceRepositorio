/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23vehículos;

/**
 *
 * @author USUARIO
 */
public class autobus extends vehiculos {
    
        public int numeroPlazas;
    
    //Constructor por defecto
    public autobus(){
    super();
    this.numeroPlazas= 60;
    }
        
    public autobus(String matricula, String modelo , int potenciaCV , int numeroPlazas){
    super(matricula, modelo , potenciaCV);
    this.numeroPlazas=numeroPlazas;
    }
    //GET Y SET
    public int getNumeroPlazas(){
    return this.numeroPlazas=numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas=numeroPlazas;
    }
    
    @Override
    public String toString(){
        return super.toString()+" y es un AUTOBÚS con " + this.numeroPlazas+ " plazas";
    
    }
}
