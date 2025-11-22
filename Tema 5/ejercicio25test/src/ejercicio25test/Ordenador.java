/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25test;

/**
 *
 * @author USUARIO
 */
public class Ordenador {
    //ATRIBUTOS
    private int memoriaRAM;
    private int capacidadDiscoDuro;
    private String modeloProcesador;
    private String modeloTarjetaGrafica;
    private double precio;
    
    //CONSTRUCTORES
    //POR DEFECTO
    public Ordenador (){
        this.memoriaRAM = 0;
        this.capacidadDiscoDuro = 0;
        this.modeloProcesador = "";
        this.modeloTarjetaGrafica = "";
        this.precio = 0.0;
    }
    //PARAMETRIZADO
    public Ordenador(int mram, int cdd, String mp, String mtg, double p){
        this.memoriaRAM = mram;
        this.capacidadDiscoDuro = cdd;
        this.modeloProcesador = mp;
        this.modeloTarjetaGrafica = mtg;
        this.precio = p;
    }
    //GETTERS y SETTERS
    public int getMemoriaRAM(){
        return memoriaRAM;
    }
    public void setMemoriaRAM(int mram) {
        this.memoriaRAM = mram;
    }
    
    public int getCapacidadDiscoDuro(){
        return capacidadDiscoDuro;
    }
    
    public void setCapacidadDiscoDuro(int cdd){
        this.capacidadDiscoDuro = cdd;
    }
    
    public String getModeloProcesador(){
        return modeloProcesador;
    }
    
    public void setModeloProcesador(String mp) {
        this.modeloProcesador = mp;
    }
    
    public String getModeloTarjetaGrafica() {
        return modeloTarjetaGrafica;
    }
    
    public void setModeloTarjetaGrafica(String mtg) {
        this.modeloTarjetaGrafica = mtg;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double p){
        this.precio = p;
    }
    
    // TO STRING 
    @Override //para mostrar el objeto de forma legible
    public String toString() {
        return "Memoria RAM: " + memoriaRAM + " GB, Capacidad Disco: " + capacidadDiscoDuro + " GB,Procesador: " + modeloProcesador
                + " Tarjeta Gráfica: " + modeloTarjetaGrafica + ", Precio: " + precio + " €";
    }
    
}
