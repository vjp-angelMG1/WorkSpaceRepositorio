/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.angel_montero_gregorio;

/**
 *
 * @author alumno
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable {
    
        //Atributos
    private double potencia;
    private double fuerza;
  
   //CONSTRUCTORES 
   //parametrizado
   public CiclistaEscalador(){
       super();
       this.potencia = 0.0;
       this.fuerza = 0;
   
    
   }
   //por defecto
    public CiclistaEscalador (String nombre,int energia,boolean estaEscapando,double KmAmeta,int numeroDeBidones,double velocidad, int niveldeHidratacion,double potencia,double fuerza){
        super();
        this.potencia = potencia;
        this.fuerza = fuerza;

    }     
    
    //GETERRS Y SETTERS
    
    public double GetPotencia(){
        return potencia ;
    }
    
    public void SetNombre(double potencia){
        this.potencia = potencia;
    }
    
    public double GetFuerza(){
        return fuerza ;
    }
    
    public void SetFuerza(double fuerza){
        this.fuerza = fuerza;
    }
    

    //Métodos
    @Override
    public void Comer(){
    if (this.velocidad>20, +=30){
        System.out.println("El escalador acaba de tomar un gel su energia ahora es"+ this.energia);
    }else{
                System.out.println("No a tomado nada");
    }
    
    @Override
    public void Beber(){
        this.nivelDeHidratacion(GetNivelDeHidratacion+10);
        System.out.println("El escalador se ha hidratado")
        
    }
    
    //Método ToString
    @Override 
    Public String toString(){
    return this.potencia + "potencia" + this.fuerza + "fuerza";
    
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
