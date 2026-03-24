/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 * *• Ejercicio 15.- Diseña una clase Dirección con los atributos calle,
 * número, piso y ciudad. A continuación, diseña una clase Empleado con los
 * atributos nombre (de tipo String), salario (de tipo int) y dirección (de tipo
 * Dirección). • Para probar la funcionalidad de las clases creadas crea una
 * clase Test donde crees 3 direcciones y luego crea tres empleados,
 * asignándoles una de las direcciones anteriormente creadas. Por último, crea
 * un método que muestre los datos de cada empleado creado: EMPLEADO 1: Nombre:
 * XXX Salario: XXX Dirección: Calle:XXX Número: XXX Puerta: XXX Ciudad: XXX
 * EMPLEADO 2: Nombre: …………..
 *
 * @author Angel
 */
public class Empleado {

    //ATRIBUTOS
    private String nombre;
    private int salario;
    private Direccion direccion;
    //CONSTRUCTOR POR DEFECTO
    public Empleado() {
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    //CONSTRUCTOR PARAMETRIZADO
    public Empleado(String nombre, int salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    //GETTERS Y SETTERS
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
    //METODO MOSTRAR
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario: " + this.salario);
        this.direccion.mostrarDireccion(); //muestro direccion del objeto de la clase direccion
    }
    //METODO TOSTRING
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion + '}';
    }
    
}
