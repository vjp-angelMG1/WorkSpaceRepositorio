/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Empleado {

    //ATRIBUTOS
    private String nombre;
    private int horas;
    private double tarifa;
    private double salario;
    //Constructor por defecto

    public Empleado() {
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0.0;
        this.salario = 0.0;
    }
    // Constructor parametrizado

    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
        this.salario = 0.0; // inicialmente 0, se calcula después
    }

    // Getters y Setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static String pedirNombre() {
        Scanner entradaNombre = new java.util.Scanner(System.in);
        System.out.print("Nombre empleado : ");
        return entradaNombre.nextLine();
    }

    public static int pedirHoras() {
        Scanner entradaHoras = new java.util.Scanner(System.in);
        System.out.print("Horas de trabajo: ");
        int horas = entradaHoras.nextInt();
        return horas;
    }

    public static double pedirTarifa() {
        Scanner entradaTarifa = new java.util.Scanner(System.in);
        System.out.print("Tarifa por cada hora: ");
        double tarifa = entradaTarifa.nextDouble();
        return tarifa;
    }

    public static void mostrarSueldo(Empleado empleado) {
        int horas = empleado.getHoras(); //guardo en la variable las horas del empleado pidiendole las horas
        double tarifa = empleado.getTarifa(); //guardo la tarifa en variable obteniendo la tarifa
        double sueldo; //declaro otra variable para el suledo

        if (horas <= 40) { //condicional si las horas son menor o igual a 40 
            sueldo = horas * tarifa; // hago el pago normal
        } else { //si no 
            sueldo = 40 * tarifa; // 40 horas por la tarifa
            sueldo += (horas - 40) * tarifa * 1.5; // calculo de las horas extras en las que añado al sueldo el resto de las 40 horas por la tarifa por la tarifa y media que paga la empresa
        }

        System.out.println("El salario del  " + empleado.getNombre() + " es " + sueldo + "€"); //imprimo por pantalla el sueldo actual
    }

    //metodo toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + ", salario=" + salario + '}';
    }

}
