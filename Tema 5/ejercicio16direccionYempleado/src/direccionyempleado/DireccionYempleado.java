/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package direccionyempleado;

/**
 *
 * @author USUARIO
 */
public class DireccionYempleado {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // 1. Crear las 3 direcciones
        Direccion d1 = new Direccion("Gran Via", 120, 3, "Madrid");
        Direccion d2 = new Direccion("Avenida Europa", 45, 1, "Barcelona");
        Direccion d3 = new Direccion("Calle Mayor", 10, 2, "Sevilla");

        // 2. Crear los 3 empleados
        Empleado e1 = new Empleado("Carlos López", 1800, d1);
        Empleado e2 = new Empleado("Ana Martínez", 2000, d2);
        Empleado e3 = new Empleado("Jorge Ramírez", 2500, d3);

        // 3. Mostrar los datos
        mostrarEmpleado(e1, 1);
        mostrarEmpleado(e2, 2);
        mostrarEmpleado(e3, 3);
    }

    // Método para mostrar los datos del empleado con el formato que pide el ejercicio
    public static void mostrarEmpleado(Empleado empleado, int numero) {

        System.out.println("EMPLEADO " + numero + ":");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Dirección:");
        System.out.println("Calle: " + empleado.getDireccion().getCalle());
        System.out.println("Número: " + empleado.getDireccion().getNumero());
        System.out.println("Puerta: " + empleado.getDireccion().getPiso());
        System.out.println("Ciudad: " + empleado.getDireccion().getCiudad());
        System.out.println();
    }
}

    
    

