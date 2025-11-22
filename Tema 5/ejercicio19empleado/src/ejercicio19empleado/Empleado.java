/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19empleado;

import java.util.Scanner;

/**
 *  Clase que representa a un empleado, con información como su nombre,
 * horas trabajadas, tarifa por hora y métodos para calcular su sueldo.
 * @author USUARIO
 */
public class Empleado {
    //Atributos
    private String nombre;
    private double horasTrabajadas;
    private double tarifaHora;
    
    //Constructores para inicializar los atributos de los empleados
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
    
    //Metodo para calcular el sueldo del empleado 
    public double calcularSueldo(){
        double sueldo;
        if (horasTrabajadas <= 40){ //condicional si trabaja hasta 40 horas se considera normal
            sueldo = horasTrabajadas * tarifaHora;
        }
        else{ //si se trabaja mas de 40 horas las horas extras se pagan al 150%
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