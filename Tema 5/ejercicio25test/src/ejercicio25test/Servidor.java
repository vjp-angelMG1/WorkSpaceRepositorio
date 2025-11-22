/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25test;

/**
 *
 * @author USUARIO
 */
public class Servidor extends Ordenador{ //Clase heredada de ordenador
    //ATRIBUTOS
    private double tamanioMonitor;
    private String modeloTeclado;
    private String modeloRaton;
    
    //CONSTRUCTORES
    //SIN PARAMETROS
    public Servidor(){
        super(); //se utiliza para llamar a la clase Ordenador sin parámetros
        tamanioMonitor = 0;
        modeloTeclado = "";
        modeloRaton = "";
    }
    //PARAMETRIZADO
    public Servidor(int mram, int cdd, String mp, String mtg, double p,double tm, String mt, String mr){ //clase parametrizada con con los atributos de ordenador y servidor 
        super(mram, cdd, mp, mtg, p); //se utiliza para llamar a los parametros del constructor de la clase ordenador 
        tamanioMonitor = tm;
        modeloTeclado = mt;
        modeloRaton = mr;
    }
    
    //GETTERS Y SETTERS
    public double getTamanioMonitor(){
        return tamanioMonitor;
    }
    
    public void setTamanioMonitor(double tm){
        this.tamanioMonitor = tm;
    }
    
    public String getModeloTeclado(){
        return modeloTeclado;
    }
    
    public void setModeloTeclado(String mt){
        this.modeloTeclado = mt;
    }
    
    public String getModeloRaton(){
        return modeloRaton;
    }
    
    public void setModeloRaton(String mr){
        this.modeloRaton = mr;
    }
    
    
     // TO STRING
    @Override //para mostrar el texto de forma legible
    public String toString() {
                return super.toString() +
               ", Tamaño Monitor: " + tamanioMonitor +
               " pulgadas, Teclado: " + modeloTeclado +
               ", Ratón: " + modeloRaton; 
    }
    
}
