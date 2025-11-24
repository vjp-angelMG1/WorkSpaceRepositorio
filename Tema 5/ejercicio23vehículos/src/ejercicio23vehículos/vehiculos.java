/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23vehículos;

/**
 *
 * @author USUARIO
 */
public class vehiculos {
    
    public String matricula;
    public String modelo;
    public int potenciaCV;
    
    //Constructor por defecto
    public vehiculos(){ 
    this.matricula="";
    this.modelo="";
    this.potenciaCV= 0;
    }

    public vehiculos(String matricula , String modelo , int potenciaCV){
    this.matricula=matricula;
    this.modelo=modelo;
    this.potenciaCV=potenciaCV;
    }
    //GETTERS Y SETTERS
    public String getMatricula(){
    return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getModulo(){
    return this.modelo;
    }   

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getPotenciaCV(){
    return this.potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV){
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString(){
        return "El vehículo tiene como matrícula: " + matricula + " , como modelo: "+ modelo+ " , " + potenciaCV+ " CV de potencia.";
    }
}
