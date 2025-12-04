/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero{
    //ATRIBUTO
    private int NumeroDeHuevos;
    //CONSTRUCTORES
    //por defecto
    public Ornitorrinco(){
        this.NumeroDeHuevos = 0;
    }    
    //parametrizado
    public Ornitorrinco(String nombre, String sexo,String color, int edad){
    super();
    this.NumeroDeHuevos = 0;
    }
    
    private int GetNumeroDeHuevos(){
        return NumeroDeHuevos;
    }
    
    private void SetNumeroDeHuevos(int NumeroDeHuevos){
        this.NumeroDeHuevos = NumeroDeHuevos;
    }
        
    @Override
    public String toString(){
        return "Numero de Huevos"+ this.NumeroDeHuevos;
    }
    
   
    
}
