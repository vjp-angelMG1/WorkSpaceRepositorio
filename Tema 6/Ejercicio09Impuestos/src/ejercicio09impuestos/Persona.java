/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09impuestos;

/**
 *
 * @author USUARIO
 */
public class Persona implements Gravable {
    //Atributos
    private String dni;
    private double ingresosAnuales;
    //Constructores
    //Constructor por defecto
    public Persona(){
        dni = "";
        ingresosAnuales = 0;  
    }
    //Constructor parametrizado
    public Persona(String dni,double ingresosAnuales){
       this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }
    //Getters y Setters
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public double getIngresosAnuales(){
        return ingresosAnuales;
    }
     public void setIngresosAnuales(double ingresosAnuales){
         this.ingresosAnuales = ingresosAnuales;
         
    }
    //Mostrar
     public void mostrarDatos() {
         System.out.println("--PERSONA--");
         System.out.println("DNI: " + dni);
         System.out.println("Ingresos anuales: " + ingresosAnuales + "Euros");
         System.out.println("IRPF a pagar: " + calcularImpuesto() + "euros");
     }    
    //Mostrar
    @Override
    public double calcularImpuesto(){
        double impuesto = 0;
        //Hasta 12.450 € un 19 %
        if (ingresosAnuales <= 12450) {
            impuesto = ingresosAnuales * 0.19;
        //De 12.450 € a 20.200 € un 24 %
        } else if (ingresosAnuales <= 20200) {
            impuesto = ingresosAnuales * 0.24;
        //De 20.200 € a 35.200 € un 30 %
        } else if (ingresosAnuales <= 35200) {
            impuesto = ingresosAnuales * 0.30;
        //De 35.200 € a 60.000 € un 37 €
        } else if (ingresosAnuales <= 60000) {
            impuesto = ingresosAnuales * 0.37;
        //De 60.000 € a 300.000 € un 45 %
        } else if (ingresosAnuales <= 300000) {
            impuesto = ingresosAnuales * 0.45;
        //Más de 300.000 € un 47 %
        } else {
            impuesto = ingresosAnuales * 0.47;
        }
        //Devolver el impuesto calculado
        return impuesto;   
    }
    //Mostrar toString cadena legible
    @Override
    public String toString(){
        return "DNI: " + dni  + ", Ingresos anuales: " + ingresosAnuales + ", IRPF a pagar: " + calcularImpuesto();
    }
}
     
