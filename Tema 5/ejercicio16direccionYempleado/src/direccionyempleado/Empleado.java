/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package direccionyempleado;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    // Atributos
    private String nombre;
    private int salario;
    private Direccion direccion;

    // Constructor por defecto
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion(); // Dirección vacía por defecto
    }

    // Constructor parametrizado
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // toString para mostrar información del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario + ", Dirección: " + direccion.toString();
    }

    
}
