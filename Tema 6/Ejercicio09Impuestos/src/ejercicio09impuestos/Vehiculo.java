/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09impuestos;

/**
 *
 * @author USUARIO
 */
public class Vehiculo implements Gravable{
    //Atributo
    private int cc;
    private String matricula;
    private String dniPropietario;
    
    //Constructores
    public Vehiculo(){
        cc = 0;
        matricula = "";
        dniPropietario = "";
    }
    
    public Vehiculo(int cc, String matricula, String dniPropietario) {
        this.cc = cc;
        this.matricula = matricula;
        this.dniPropietario = dniPropietario;
    }
    
    //Getters/Setters
    public int getCc(){
        return cc;
    }
    public void setCc(int cc){
        this.cc = cc;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getDniPropietario(){
        return dniPropietario;
    }
    public void setDniPropietario(String dniPropietario){
        this.dniPropietario = dniPropietario;
    }
    
    //Mostrar
    public void mostrarDatos() {
        System.out.println("--VEHICULO--");
        System.out.println("Matricula: " + matricula);
        System.out.println("Cilindrada: " + cc + "cc");
        System.out.println("Propietario (DNI): " + dniPropietario);
        System.out.println("Impuesto de circulancion: " + calcularImpuesto() + " euros" );
    }
    
    //Método de la interfaz Gravable
    @Override
    public double calcularImpuesto() {
        //Menos de 1.000 cc. Tarifa mínima de alrededor de 12 euros
        if (cc < 1000) {
            return 12;
        //1.001 - 1.499 cc. Tarifa de 34 euros
        } else if (cc <= 1499) {
            return 34;
        //1.500 - 1.999 cc. Tarifa de 71 euros
        } else if (cc <= 1999) {
            return 71;
        //2.000 - 2.999 cc. Tarifa de 122 euros
        } else if (cc <= 2999) {
           return 122;
        //Más de 3.000 cc. Tarifa de 152 euros
        } else {
            return 152;
        }
    }
    @Override //Mostrar toString cadena legible 
    public String toString(){
        return "Cilidranda es : " + cc + "cc" + " la matricula es" + matricula + "El DNI :" + dniPropietario;
    }
}

