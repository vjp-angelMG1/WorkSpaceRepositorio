/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23vehículos;

/**
 *
 * @author USUARIO
 */
public class taxi extends vehiculos {
        private int licencia;
   
    //Constructor por defecto
    public taxi(){
    super();
    this.licencia= 123;
    }
    
    public taxi(String matricula, String modelo , int potenciaCV , int licencia){
    super(matricula, modelo , potenciaCV);
    this.licencia=licencia;
    }
    //GET Y SET
    public int getLicencia(){
    return this.licencia=licencia;
    }

    public void setLicencia(int licencia){
        this.licencia = licencia;
    }
    
    @Override
    public String toString(){
        return super.toString()+" y es un TAXI con numero de licencia: " +this.licencia; 
    }
}
