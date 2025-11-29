/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4animal;

/**
 *
 * @author alumno
 */
public abstract class Animal {

    /**
     * @param args the command line arguments
     */
    //ATRIBUTOS
       private String nombre;
       private int edad;
       private double peso;
    //CONSTRUCTORES
    //Por defecto
    public Animal(){
    this.nombre= "";
    this.edad=0;
    this.peso=0;
    }
    // Parametrizado
    public Animal (String nombre,int edad,double peso){
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }
    //GETERS Y SETTERS
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;  
    }
    
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;    
    }
    public  double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    //MÉTODOS
    public abstract void sonido();
    public abstract void alimentacion();
    public abstract void habitat();
    public abstract void nombreCientifico();
    
    //MÉTODO NO ABSTRACTO PARA MOSTRAR MEJOR TODO
    public void mostrarTodo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad + " años");
    System.out.println("Peso: " + peso + " Kg");
    System.out.print("Sonido: "); sonido();
    System.out.print("Alimentación: "); alimentacion();
    System.out.print("Hábitat: "); habitat();
    System.out.print("Nombre científico: "); nombreCientifico();
    System.out.println("--------------------------------------");
    }
 
    @Override
    public String toString(){
       return this.nombre + "tiene" + this.edad + "años y pesa" + this.peso + "Kg";
    }
}
