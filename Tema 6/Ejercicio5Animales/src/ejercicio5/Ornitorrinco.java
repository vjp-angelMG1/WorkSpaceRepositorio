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
    private int numeroDeHuevos;
    //CONSTRUCTORES
    //por defecto
    public Ornitorrinco(){
        numeroDeHuevos = 0;
    }    
    //parametrizado
    public Ornitorrinco(String nombre, String sexo,String color, int edad){
    super();
    this.numeroDeHuevos = numeroDeHuevos;
    }
    
   
    
    private int GetNumeroDeHuevos(){
        return numeroDeHuevos;
    }
    
    private void SetNumeroDeHuevos(int NumeroDeHuevos){
        this.numeroDeHuevos = numeroDeHuevos;
    }
    //METODOS
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }
    
    @Override
    public void ponerHuevo(){
        numeroDeHuevos++;
    }
    
    @Override
    public void incubarHuevo(){
        numeroDeHuevos--;
    }
    @Override
    public void mostrarNumHuevos(){
        System.out.println(numeroDeHuevos);
    }
    
    //TO STRING
    @Override
    public String toString(){
        return super.toString()+ "Numero de Huevos"+ this.numeroDeHuevos;
    }
    
   
    
}
