/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.angel_montero_gregorio;

/**
 *
 * @author alumno
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable {
    
    
    /Atributos
    private double aceleracion;
  
   //CONSTRUCTORES 
   //parametrizado
   public CiclistaSprinter(){
       super();
       this.aceleracion = 0.0;
     
   
    
   }
   //por defecto
    public CiclistaSprinter (String nombre,int energia,boolean estaEscapando,double KmAmeta,int numeroDeBidones,double velocidad, int niveldeHidratacion,double aceleracion){
        super();
        this.aceleracion = aceleracion;


    }     
    
    //GETERRS Y SETTERS
    
    public double GetAceleracion(){
        return aceleracion ;
    }
    
    public void SetAceleracion(double aceleracion){
        this.aceleracion = aceleracion;
    }
    
        

    //Métodos
    public void Comer(){}
    
    public void Beber(){}
    
    //Método ToString
    @Override 
    Public String toString(){
    return super()+this.potencia + "potencia" + this.fuerza + "fuerza";
    
    }


    
}

    @Override
    public void sprintar() {
       
    }
    @Override
    public void atacar() {
   
    }
    @Override
    public float recuperar() {
        
    }
    
}
