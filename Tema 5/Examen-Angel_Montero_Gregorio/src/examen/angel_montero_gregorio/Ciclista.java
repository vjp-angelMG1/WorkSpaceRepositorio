/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.angel_montero_gregorio;

/**
 *
 * @author alumno
 */
public abstract class Ciclista{
   
    //Atributos
    private String nombre;
    private int energia;
    private boolean estaEscapando;
    private double kmAmeta;
    private int numeroDeBidones;
    private double velocidad;
    private int nivelDeHidratacion;
    private final static int numeroDeCiclistas = 0 ;
   //CONSTRUCTORES 
   //parametrizado
   public Ciclista(){
       this.nombre = "";
       this.energia = 50;
       this.estaEscapando = true;
       this.kmAmeta = 120.0;
       this.numeroDeBidones = 2;
       this.velocidad = 0.0;
       this.nivelDeHidratacion = 50;
    
   }
   //por defecto
    public Ciclista (String nombre,int energia,boolean estaEscapando,double KmAmeta,int numeroDeBidones,double velocidad, int niveldeHidratacion){
    
        this.nombre = nombre;
        this.energia = energia;
        this.estaEscapando = estaEscapando;
        this.kmAmeta = kmAmeta;
        this.numeroDeBidones = numeroDeBidones;
        this.velocidad = velocidad;
        this.nivelDeHidratacion = nivelDeHidratacion;
    }     
    
    //GETERRS Y SETTERS
    
    public String GetNombre(){
        return nombre;
    }
    
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int GetEnergia(){
        return energia;
    }
    
    public void SetEnergia(int energia){
        this.energia = energia;
    }
    public boolean GetEstaEscapando(){
        return estaEscapando;
    }
    public void SetEstaEscapando(boolean estaEscapando){
        this.estaEscapando = estaEscapando;
    }
    public double GetKmAmeta(){
        return kmAmeta;
    }
    public void SetKmAmeta(double kmAmeta){
        this.kmAmeta = kmAmeta;
    }
    public int GetNumeroDeBidones(){
        return numeroDeBidones;
    }
    public void SetNumeroDeBidones(int numeroDeBidones){    
    this.numeroDeBidones = numeroDeBidones;
    }
    public double GetVelocidad(){
        return velocidad;
    }
    public void SetVelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public int GetNivelDeHidratacion(){
        return nivelDeHidratacion;
    }
    public void SetNivelDeHidratacion(int nivelDeHidratacion){
        this.nivelDeHidratacion = nivelDeHidratacion;
    }

    //Métodos
    @Override
    public void cogerBidones(){
        int i = 0;
    if (i>=10);{
        numeroDeBidones++;
    
    }else(){
            System.out.println("No puedes coger bidones a menos de 10 km de meta")
                    
    }
    @Override
    public void tirarbidon(){
    this.numeroDeBidones (Get.numerodeBidones)-1);
    } 
   
   
    public void Comer(){}
    public void Beber(){}
    
    //Método ToString
    @Override 
    Public String toString(){
    return this.nombre + "energia" + this.energia + "estaescapando" + this.estaEscapando + "kilometros a meta" + this.kmAmeta + "numero de bidones" + this.numeroDeBidones + "velocidad" + this.velocidad + "Nivel de Hidratacion" + this.nivelDeHidratacion;
    
    }
    
}
