/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19empleado;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    //Atributos
    private String nombre;
    private double horasTrabajadas;
    private double tarifaHora;
    
    //Constructores
    public Empleado(String nombre, double horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    //Metodo para calcular el sueldo
    public double calcularSueldo(){
        double sueldo;
        if (horasTrabajadas <= 40){
            sueldo = horasTrabajadas * tarifaHora;
        }
        else{
            double horasHorario = 40;
            double horasExtras = horasTrabajadas - 40;
            sueldo = (horasHorario * tarifaHora) + (horasExtras * tarifaHora * 1.5);
        }
        return sueldo;
    }
    
    //Mostrar empleado
    public void mostrarEmpleado(){
        double sueldo = calcularSueldo();
        System.out.println(nombre + " trabajo " + horasTrabajadas + " horas, cobra " + tarifaHora + " euros/hora y su sueldo es de " + sueldo + " euros");
    }
    
    //Metodo crear empleado
    public static Empleado crearEmpleado(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del empleado:");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce el numero de horas trabajadas:");
        double horas = entrada.nextDouble();
        
        System.out.println("Introduce la tarifa por horas:");
        double tarifa = entrada.nextDouble();
        
        return new Empleado(nombre, horas, tarifa);
    
    }
}